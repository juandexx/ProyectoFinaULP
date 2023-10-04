package AccesoDB;

import Entidades.Dieta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Dieta_Data {

    private Connection con;

    public Dieta_Data() {
        con = Coneccion_Data.getConexion();
    }
    
  /*  public void agregarDieta(Dieta dieta){
        String sql = "Insert INTO dieta (idPaciente, idComida, fechaInicial, fechaFinal, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                dieta.setIddieta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Dieta creada");
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Dieta_Data.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/
  }
