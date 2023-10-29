package AccesoDB;

import Entidades.Historial;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Historial_Data {

    private Connection con = null;

    public Historial_Data() {
        con = Coneccion_Data.getConexion();
    }

    public ArrayList<Historial> getPesos(int idPaciente) {
        ArrayList<Historial> listaPesos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM historial WHERE idPaciente = ?";            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPaciente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Historial historial = new Historial();
                historial.setIdHistorial(rs.getInt("idHistorial"));
                historial.setIdPaciente(rs.getInt("idPaciente"));
                historial.setFechaRegistro(rs.getDate("fechaRegistro").toLocalDate());
                historial.setPeso(rs.getDouble("peso"));
                listaPesos.add(historial);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener Historial" + ex.getMessage());
        }
        return listaPesos;
    }
}
