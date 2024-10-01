/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class carDelete {

    public void eliminarAuto(String inputPlacaAutoEliminar) {
        ConexionBD db = new ConexionBD(); 
        Connection con = null;  // Definino la conexion por que aja, si no no me sale
        PreparedStatement pst = null;  //Preparo :)
        
        String query = "DELETE FROM autos WHERE placa = ?";
        
        try {
            con = db.conectar();  // Obtengo la conexion 
            if (con != null) {   
                pst = con.prepareStatement(query);  
                pst.setString(1, inputPlacaAutoEliminar);  
                int filasEliminadas = pst.executeUpdate();  
                if (filasEliminadas > 0) {
                    
                    JOptionPane.showMessageDialog(null, "El auto con placa " + inputPlacaAutoEliminar + " fue eliminado correctamente.");
                  
                } else {
                    JOptionPane.showMessageDialog(null,"No se encontró ningún auto con la placa " + inputPlacaAutoEliminar);
                    
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro al eliminar el auto: " + e.getMessage());

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
