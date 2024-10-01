
package controller; 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ConexionBD;


public class carsController {
    
    
     public boolean registroCarro(String marca, String modelo, String año, String precio, String color, String tipoMotor, String fechaIngreso, String kilometraje, String placa) {
       ConexionBD bd = new ConexionBD();   
         
       boolean registrado = false;
       
       try{
           String sql = "INSERT INTO autos (marca, modelo, año, precio, color, tipo_motor, fecha_ingreso, Kilometraje, placa) VALUES (?,?,?,?,?,?,?,?,?)";
            Connection cn = bd.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, marca);
            pst.setString(2, modelo);
            pst.setString(3, año);
            pst.setString(4, precio);
            pst.setString(5, color);
            pst.setString(6, tipoMotor);
            pst.setString(7, fechaIngreso);
            pst.setString(8, kilometraje);
            pst.setString(9, placa);
            

        int filasAfectadas = pst.executeUpdate();

        if (filasAfectadas > 0) {
            registrado = true;
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }

    return registrado;
         
         
         
     }
    
      
       
    
}
