package model;

import java.util.HashSet;
import java.util.Random;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PlacaCarro {
    private static HashSet<String> placasExistentes = new HashSet<>(); 

    public static String generarPlacaUnica() {
        String nuevaPlaca;
        do {
            nuevaPlaca = generarPlacaAleatoria();
        } while (placasExistentes.contains(nuevaPlaca)); 

        placasExistentes.add(nuevaPlaca); 
        return nuevaPlaca;
    }

    private static String generarPlacaAleatoria() {
        Random random = new Random();
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numeros = "0123456789";

        StringBuilder placa = new StringBuilder();
        placa.append(letras.charAt(random.nextInt(letras.length())));
        placa.append(letras.charAt(random.nextInt(letras.length()))); 
        placa.append(letras.charAt(random.nextInt(letras.length()))); 
        placa.append("-"); 
        placa.append(numeros.charAt(random.nextInt(numeros.length()))); 
        placa.append(numeros.charAt(random.nextInt(numeros.length()))); 
        placa.append(numeros.charAt(random.nextInt(numeros.length()))); 

        return placa.toString();
    }

  
    public static void cargarPlacasExistentes() {
        String url = "jdbc:mysql://localhost:3306/inventario_autos"; 
        String usuario = "user"; 
        String contraseña = " "; 

        String sql = "SELECT placa FROM autos";

        try (Connection conn = DriverManager.getConnection(url, usuario, contraseña);
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

           
            placasExistentes.clear();

           
            while (rs.next()) {
                placasExistentes.add(rs.getString("placa"));
            }

            System.out.println("Placas existentes cargadas: " + placasExistentes);
        } catch (SQLException e) {
            e.printStackTrace(); 
        }
    }


    public static HashSet<String> getPlacasExistentes() {
        return placasExistentes;
    }
}
