package AccesoDB;

import Entidades.Dieta;
import Entidades.Paciente;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Dieta_Data {

    private Connection con;
    private Paciente paciente;

    public Dieta_Data() {
        con = Coneccion_Data.getConexion();
    }

    public void agregarDieta(Dieta dieta) {
        String sql = "INSERT INTO dieta (nombre, idPaciente, pesoInicial, pesoFinal, fechaInicial, fechaFinal, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, dieta.getIdPaciente());
            ps.setDouble(3, dieta.getPesoActual());
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setBoolean(7, dieta.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dieta.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear dieta" + ex.getMessage());
        }
    }

    public void eliminarPaciente(int idDieta) {
        try {
            String sql = "UPDATE dieta SET estado = 0 WHERE idDieta = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idDieta);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Dieta eliminada");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se logró eliminar dieta");
        }
    }

    public void modificarPaciente(Dieta dieta) {
        String sql = "UPDATE dieta SET nombre = ?, idPaciente= ?, pesoInicial = ?, pesoFinal = ?, fechaInicial = ?, fechaFinal = ?, estado = ? WHERE idDieta = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dieta.getNombre());
            ps.setInt(2, paciente.getIdPaciente());
            ps.setDouble(3, paciente.getPesoActual());
            ps.setDouble(4, dieta.getPesoFinal());
            ps.setDate(5, Date.valueOf(dieta.getFechaInicial()));
            ps.setDate(6, Date.valueOf(dieta.getFechaFinal()));
            ps.setBoolean(7, dieta.isEstado());
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

    public Dieta buscarDieta(String nombre) {
        String sql = "SELECT idDieta, nombre, idPaciente, pesoInicial, pesoFinal, fechaInicial, fechaFinal, estado FROM dieta WHERE nombre = ?";
        Dieta dieta = new Dieta();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                dieta.setNombre(rs.getString("nombre"));
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setIdPaciente(rs.getInt("idPaciente"));
                dieta.setPesoActual(rs.getDouble("pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setEstado(rs.getBoolean("estado"));
                JOptionPane.showMessageDialog(null, "Dieta encontrada");
            } else {
                JOptionPane.showMessageDialog(null, "No existe la Dieta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Dieta" + ex.getMessage());
        }
        return dieta;
    }

    public List<Dieta> getDietasVigentes() {
        ArrayList<Dieta> listaDietasVigentes = new ArrayList<>();
        String sql = "SELECT * FROM dieta WHERE fechaFinal >= CURRENT_DATE";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setIdPaciente(rs.getInt("idPaciente"));
                dieta.setPesoActual(rs.getDouble("pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setEstado(rs.getBoolean("estado"));
                listaDietasVigentes.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Dieta " + ex.getMessage());
        }
        return listaDietasVigentes;
    }
    
    public List<Dieta> getDietasVencidas() {
        ArrayList<Dieta> listaDietasVencidas = new ArrayList<>();
        String sql = "SELECT * FROM dieta WHERE fechaFinal < CURRENT_DATE";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Dieta dieta = new Dieta();
                dieta.setIdDieta(rs.getInt("idDieta"));
                dieta.setNombre(rs.getString("nombre"));
                dieta.setIdPaciente(rs.getInt("idPaciente"));
                dieta.setPesoActual(rs.getDouble("pesoInicial"));
                dieta.setPesoFinal(rs.getDouble("pesoFinal"));
                dieta.setFechaInicial(rs.getDate("fechaInicial").toLocalDate());
                dieta.setFechaFinal(rs.getDate("fechaFinal").toLocalDate());
                dieta.setEstado(rs.getBoolean("estado"));
                listaDietasVencidas.add(dieta);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Dieta " + ex.getMessage());
        }
        return listaDietasVencidas;
    }
}
