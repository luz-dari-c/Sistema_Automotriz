package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class carModified {
    public void modificarPrecioAuto(String modelo, double nuevoPrecio) {
        ConexionBD db = new ConexionBD(); 
        Connection con = null;  
        PreparedStatement pst = null;  
        
        String query = "UPDATE autos SET precio = ? WHERE modelo = ?";
        
        try {
            con = db.conectar();  
            if (con != null) {   
                pst = con.prepareStatement(query);  
                pst.setDouble(1, nuevoPrecio);  
                pst.setString(2, modelo);  
                int filasActualizadas = pst.executeUpdate();  
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "El precio del auto modelo " + modelo + " fue actualizado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún auto con el modelo " + modelo);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar el precio del auto: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
    
    
}


