
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class carSearch {
    
    public boolean carroEncontrado(String placa, String modelo){ 
        ConexionBD db = new ConexionBD();
        boolean encontrado = false;
        
        try{
            Connection cn = db.conectar();
            String sql = "SELECT carro,  FROM autos WHERE carro = ?";
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, placa);
            pst.setString(2, modelo);
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                encontrado = true;
            }
        
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: " + e);
        
        }
        return encontrado;
      
   }
    
}    


