package AccesoDB;

import Entidades.Comida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Comida_Data {

    private Connection con = null;

    public Comida_Data() {
        con = Coneccion_Data.getConexion();
    }

    public void agregarComida(Comida comida) {
        String sql = "INSERT INTO comida (nombre, detalle, cantCalorias, estado) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setDouble(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                comida.setIdComida(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Comida agregada satisfactoriamente.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al agregar Comida. Reintente." + ex.getMessage());
        }
    }

    public void eliminarComida(int idComida) {
        try {
            String sql = "UPDATE comida SET estado = 0 WHERE idComida = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idComida);
            int fila = ps.executeUpdate();
            if (fila == 1) {
                JOptionPane.showMessageDialog(null, "Comida borrada correctamente");
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al intentar borrar Comida");
        }
    }

    public void modificarComida(Comida comida) {
        String sql = "UPDATE comida SET nombre=?, detalle=?, cantCalorias=?, estado=? WHERE idComida = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, comida.getNombre());
            ps.setString(2, comida.getDetalle());
            ps.setDouble(3, comida.getCantCalorias());
            ps.setBoolean(4, comida.isEstado());
            ps.setInt(5, comida.getIdComida());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Comida inexistente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a comida" + ex.getMessage());
        }
    }

    public Comida buscarComida(String nombre) {
        String sql = "SELECT idComida, nombre, detalle, cantCalorias, estado FROM comida WHERE nombre = ?";
        Comida comida = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el Menú");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder al Menú" + ex.getMessage());
        }
        return comida;
    }

    public ArrayList<Comida> getComidas() {
        ArrayList<Comida> listaComidas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM comida WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
                listaComidas.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Comida" + ex.getMessage());
        }
        return listaComidas;
    }
    
    public ArrayList<Comida> busqXcalorias(int cantCalorias) {
        ArrayList<Comida> xCalorias = new ArrayList<>();
        try {
            String sql = "SELECT * FROM comida WHERE cantCalorias >= ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantCalorias);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Comida comida = new Comida();
                comida.setIdComida(rs.getInt("idComida"));
                comida.setNombre(rs.getString("nombre"));
                comida.setDetalle(rs.getString("detalle"));
                comida.setCantCalorias(rs.getInt("cantCalorias"));
                comida.setEstado(rs.getBoolean("estado"));
                xCalorias.add(comida);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a Comida" + ex.getMessage());
        }
        return xCalorias;
    }    
}
