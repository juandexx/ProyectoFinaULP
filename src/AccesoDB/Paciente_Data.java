package AccesoDB;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Paciente_Data {

    private Connection con = null;

    public Paciente_Data() {
        con = Coneccion_Data.getConexion();
    }

    public void agregarPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente (dni, apellido, nombre, domicilio, celular, pesoActual, pesoDeseado, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getApellido());
            ps.setString(3, paciente.getNombre());
            ps.setString(4, paciente.getDomicilio());
            ps.setInt(5, paciente.getCelular());
            ps.setDouble(6, paciente.getPesoActual());
            ps.setDouble(7, paciente.getPesoDeseado());
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
                JOptionPane.showMessageDialog(null, "Baja realizada de paciente realizada correctamente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al intentar dar de Baja a Paciente");
        }
    }

    public void modificarPaciente(Paciente paciente) {
        String sql = "UPDATE paciente SET dni = ?, apellido = ?, nombre = ?, domicilio = ?, celular = ?, pesoActual = ?, pesoDeseado = ?, estado = ? WHERE dni = ?";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, paciente.getDni());
            ps.setString(2, paciente.getNombre());
            ps.setString(3, paciente.getApellido());
            ps.setString(4, paciente.getDomicilio());
            ps.setInt(5, paciente.getCelular());
            ps.setDouble(6, paciente.getPesoActual());
            ps.setDouble(7, paciente.getPesoDeseado());
            ps.setBoolean(8, paciente.isEstado());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El alumno no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
    }

   /* public void buscarPaciente(int dni) {
        String sql = "SELECT dni,  apellido, nombre, domicilio, celular, pesoActual, pesoDeseado, estado FROM paciente WHERE dni = ?";
        Paciente paciente = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                paciente = new Paciente();
                paciente.setDni(rs.getInt("dni"));
                paciente.setApellido(rs.getString("apellido"));
                paciente.setNombre(rs.getString("nombre"));
                paciente.setDomicilio(rs.getString("domicilio"));
                paciente.setCelular(rs.getInt("celular"));
                paciente.setPesoActual(rs.getDouble("pesoActual"));
                paciente.setPesoActual(rs.getDouble("pesoDeseado"));
                paciente.setEstado(true);
            } else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno " + ex.getMessage());
        }
        return paciente;
    }*/
}
