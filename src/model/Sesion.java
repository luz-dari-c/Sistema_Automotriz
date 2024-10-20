
package model;


public class Sesion {
    private static usuarios usuarioActual; 

    public static void iniciarSesion(usuarios usuario) {
        usuarioActual = usuario; 
    }

    public static usuarios getUsuarioActual() {
        return usuarioActual; 
    }

    public static void cerrarSesion() {
        usuarioActual = null;
    }
}
