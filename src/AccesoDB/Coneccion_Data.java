
package AccesoDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Coneccion_Data {

    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String DB = "nutricionista";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    private static Connection connection;
    private Coneccion_Data() {
    }
    public static Connection getConexion() {
        if (connection == null) {
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);
                //JOptionPane.showMessageDialog(null, "conectado");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "error al conectarse a la BD " + ex.getMessage());
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error al cargar los Drivers" + ex.getMessage());
            }
        }
        return connection;
    }
}
