package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class userModified {

    // Método para modificar los datos del usuario
    public void modificarDatosUsuario(String identificacion, String contraseñaActual, String nuevoNombre, String nuevoApellido, String nuevoUsuario, String nuevaContraseña, String nuevoCorreo) {
        ConexionBD db = new ConexionBD();
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    String queryVerificacion = "SELECT contraseña FROM usuarios WHERE identificacion = ?";
    StringBuilder queryActualizacion = new StringBuilder("UPDATE usuarios SET ");
    ArrayList<Object> parameters = new ArrayList<>(); // Para almacenar los parámetros

    try {
        con = db.conectar();
        if (con != null) {
            pst = con.prepareStatement(queryVerificacion);
            pst.setString(1, identificacion);
            rs = pst.executeQuery();

            if (rs.next()) {
                String contraseñaBD = rs.getString("contraseña");

                if (!contraseñaActual.equals(contraseñaBD)) {
                    JOptionPane.showMessageDialog(null, "La contraseña actual es incorrecta.");
                    return;
                }

                // Agregar solo los campos que han sido modificados
                if (!nuevoNombre.isEmpty()) {
                    queryActualizacion.append("nombre = ?, ");
                    parameters.add(nuevoNombre);
                }
                if (!nuevoApellido.isEmpty()) {
                    queryActualizacion.append("apellido = ?, ");
                    parameters.add(nuevoApellido);
                }
                if (!nuevoUsuario.isEmpty()) {
                    queryActualizacion.append("usuario = ?, ");
                    parameters.add(nuevoUsuario);
                }
                if (!nuevoCorreo.isEmpty()) {
                    queryActualizacion.append("correo_electronico = ?, ");
                    parameters.add(nuevoCorreo);
                }
                
                // Verificar si se quiere cambiar la contraseña
                if (!nuevaContraseña.isEmpty()) {
                    // Verificar que la nueva contraseña sea diferente de la actual
                    if (nuevaContraseña.equals(contraseñaBD)) {
                        JOptionPane.showMessageDialog(null, "La nueva contraseña debe ser diferente de la contraseña actual.");
                        return; // Detiene la ejecución si la nueva contraseña es igual
                    }
                    queryActualizacion.append("contraseña = ?, ");
                    parameters.add(nuevaContraseña);
                }

                // Si no se hicieron cambios, notificar al usuario
                if (parameters.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No se realizaron cambios en los datos del usuario.");
                    return;
                }

                // Eliminar la última coma y espacio
                queryActualizacion.setLength(queryActualizacion.length() - 2);
                queryActualizacion.append(" WHERE identificacion = ?");
                parameters.add(identificacion); // Agregar la identificación al final

                // Preparar la declaración con la consulta dinámica
                pst = con.prepareStatement(queryActualizacion.toString());

                // Asignar los parámetros a la declaración
                for (int i = 0; i < parameters.size(); i++) {
                    pst.setObject(i + 1, parameters.get(i));
                }

                int filasActualizadas = pst.executeUpdate();
                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(null, "Los datos del usuario con identificación " + identificacion + " fueron actualizados correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con la identificación " + identificacion);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró ningún usuario con la identificación " + identificacion);
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al modificar los datos del usuario: " + e.getMessage());
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pst != null) {
                pst.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage());
        }
    }
}
}
