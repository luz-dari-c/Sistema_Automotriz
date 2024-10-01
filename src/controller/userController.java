package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ConexionBD;
public class userController {

    
    public boolean registroUsuario(String gmail, String name, String lastName, String id, String user, String pass) {
        ConexionBD bd = new ConexionBD();
       
        boolean registrado = false;
        
        try{
           String sql = "INSERT INTO usuarios (correo_electronico, nombre, apellido, identificacion, usuario, contraseña) VALUES (?,?,?,?,?,?)";
            Connection cn = bd.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, gmail);
            pst.setString(2, name);
            pst.setString(3, lastName);
            pst.setString(4, id);
            pst.setString(5, user);
            pst.setString(6, pass);

        int filasAfectadas = pst.executeUpdate();

        if (filasAfectadas > 0) {
            registrado = true;
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error: " + e);
    }

    return registrado  = true;
}
    
    
}