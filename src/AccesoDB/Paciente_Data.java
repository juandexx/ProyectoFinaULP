package AccesoDB;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Paciente_Data {

    private Connection con = null;

    public Paciente_Data() {
        con = Coneccion_Data.getConexion();
    }

    public void agregarPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente (nombre, apellido, dni, edad, pesoActual, domicilio, celular, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setInt(4, paciente.getEdad());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setString(6, paciente.getDomicilio());
            ps.setInt(7, paciente.getCelular());
            ps.setBoolean(8, paciente.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                paciente.setIdPaciente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paciente agregado satisfactoriamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar Paciente. Reintente." + ex.getMessage());
        }
    }

    public void eliminarPaciente(int dni) {
        try {
            String sql = "UPDATE paciente SET estado = 0 WHERE dni = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Baja de paciente realizada correctamente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al intentar dar de Baja a Paciente");
        }
    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET nombre = ?, apellido = ?, dni = ?, edad = ?, pesoActual = ?, domicilio = ?, celular = ?, estado = ? WHERE idPaciente = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
             ps.setString(1, paciente.getNombre());
            ps.setString(2, paciente.getApellido());
            ps.setInt(3, paciente.getDni());
            ps.setInt(4, paciente.getEdad());
            ps.setDouble(5, paciente.getPesoActual());
            ps.setString(6, paciente.getDomicilio());
            ps.setInt(7, paciente.getCelular());
            ps.setBoolean(8, paciente.isEstado());
            ps.setInt(9, paciente.getIdPaciente());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se realizaron los cambios consultados, reintente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al paciente " + ex.getMessage());
        }
    }

    public Paciente buscarPaciente(int dni) {
        String sql = "SELECT idPaciente, dni,  apellido, nombre, edad, pesoActual, domicilio, celular, estado FROM paciente WHERE dni = ?";
        Paciente paciente = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setEdad(rs.getInt("edad"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setCelular(rs.getInt("celular"));
                paciente.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el paciente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a paciente " + ex.getMessage());
        }
        return paciente;
    }

    public List<Paciente> listarPacientes() {
        ArrayList<Paciente> pacientes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setIdPaciente(rs.getInt("idPaciente"));
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setCelular(rs.getInt("celular"));
                paciente.setEstado(rs.getBoolean("estado"));
                pacientes.add(paciente);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder Pacientes " + ex.getMessage());
        }
        return pacientes;
    }    
}
