
package AccesoDB;

import Entidades.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Paciente_DB {

    private Connection con = null;

    public Paciente_DB() {

        con = Coneccion_DB.getConexion();

    }

    public void agregarPaciente(Paciente paciente) {
        String sql = "INSERT INTO paciente (dni, apellido, nombre, domicilio, celular, pesoActual, pesoDeseado, estado) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paciente.getdni());
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

}
