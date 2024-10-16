package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionBD {

    private static Connection con = null;
    
    private static final String URL = "jdbc:mysql://localhost:3306/inventario_autos?characterEncoding=utf8";
    private static final String USER = "root"; 
    private static final String PASS = "";     

    public static Connection conectar() {
        Connection con = null; 
        try {
            con = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión establecida con éxito.");
        } catch (SQLException e) {
         
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();  
        }
        return con;
    }
    
    // Método adicional para verificar la conexión
    public static boolean verificarConexion() {
        try (Connection con = conectar()) {
            return con != null;
        } catch (SQLException e) {
            return false;
        }
    }
}
