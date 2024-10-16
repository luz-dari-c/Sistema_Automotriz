/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
