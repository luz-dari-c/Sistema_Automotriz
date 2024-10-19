package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class UsuarioDAO {
    
    private Connection connect() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://localhost:3306/inventario_autos?characterEncoding=utf8";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Error en la conexion: " + e.getMessage());
        }
        return conn;
    }

   public Usuario getUsuario(String username, String password) {
    String sql = "SELECT id, nombre, apellido, identificacion, usuario, contraseña, correo_electronico FROM usuarios WHERE usuario = ? AND contraseña = ?";  
    try (Connection conn = this.connect();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet rs = pstmt.executeQuery();

        if (rs.next()) {
            int id = rs.getInt("id"); // Asegúrate de tener el campo 'id' en tu base de datos
            String nombre = rs.getString("nombre");
            String apellidos = rs.getString("apellido"); // Cambiado a 'apellido'
            String identificacion = rs.getString("identificacion");
            String correo = rs.getString("correo_electronico"); // Cambiado a 'correo_electronico'

            return new Usuario(id, nombre, apellidos, identificacion, username, password, correo);
        }
    } catch (SQLException e) {
        System.out.println("Error al obtener el usuario: " + e.getMessage());
    }
    return null; // Si no se encuentra, devuelve null
}


    public boolean authenticateUser(String username, String password) {
        // Este método ya no es necesario con la implementación de getUsuario
        return getUsuario(username, password) != null;
    }
}
