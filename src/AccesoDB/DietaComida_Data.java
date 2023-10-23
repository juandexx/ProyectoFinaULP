package AccesoDB;

import Entidades.DietaComida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DietaComida_Data {

    private Connection con;

    public DietaComida_Data() {
        con = Coneccion_Data.getConexion();
    }

    public void agregarDietaComida(DietaComida dietacomida) {
        String sql = "INSERT INTO dietacomida (idDietaComida, idDieta, idComida, horario, estado) VALUES (?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dietacomida.getIdDietaComida());
            ps.setInt(2, dietacomida.getIdDieta());
            ps.setInt(3, dietacomida.getIdComida());
            ps.setString(4, dietacomida.getHorario().toString());
            ps.setBoolean(5, dietacomida.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dietacomida.setIdDieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Creación de Dieta correcta");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear dieta" + ex.getMessage());
        }
    }
}
