package model;

import java.math.BigDecimal;
import java.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Timestamp;

public class carroDAO {

    public List<Carro> obtenerCarros() {
        List<Carro> cars = new ArrayList<>();
        String sql = "SELECT marca, modelo, año, precio, color, tipo_motor, fecha_ingreso, kilometraje, placa, cantidad, color_auto FROM autos"; // Agregamos color_auto

        try (Connection con = ConexionBD.conectar(); PreparedStatement pstmt = con.prepareStatement(sql); ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                // Ejemplo de valores que podrían estar en tu ResultSet
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String año = rs.getString("año"); // Asegúrate de que este es String
                Double precio = rs.getDouble("precio");
                String color = rs.getString("color");
                String tipoMotor = rs.getString("tipo_motor");
                String kilometraje = rs.getString("kilometraje");
                String fechaIngresoo = rs.getString("fecha_ingreso");
                String placa = rs.getString("placa");
                int cantidad = rs.getInt("cantidad");
                String colorAuto = rs.getString("color_auto");
                int id = rs.getInt("id"); // Asegúrate de que "id" es la columna correcta en la base de datos

// Ahora creas el objeto Carro
                Carro carr = new Carro(id, marca, modelo, año, precio, color, tipoMotor, kilometraje, fechaIngresoo, placa, cantidad, colorAuto);

                cars.add(carr);
            }

        } catch (SQLException e) {
            System.err.println("Error al obtener autos: " + e.getMessage());
        }

        return cars;
    }

    public void disminuirCantidadCarro(String modelo) {
        String sql = "UPDATE autos SET cantidad = cantidad - 1 WHERE modelo = ? AND cantidad > 0";

        try (Connection con = ConexionBD.conectar(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, modelo);
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                System.out.println("Cantidad de autos del modelo " + modelo + " disminuida en 1.");
            } else {
                System.out.println("No se encontró el auto con el modelo: " + modelo + " o ya no hay unidades disponibles.");
                JOptionPane.showMessageDialog(null, "No se encontró el auto o ya no hay unidades disponibles.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException e) {
            System.err.println("Error al disminuir la cantidad de autos: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al disminuir la cantidad de autos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void aumentarCantidad(String modelo) {
        String sql = "UPDATE autos SET cantidad = cantidad + 1 WHERE modelo = ?";

        try (Connection con = ConexionBD.conectar(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, modelo);
            int affectedRows = pstmt.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Cantidad de autos del modelo " + modelo + " aumentada en 1.");
            } else {
                System.out.println("No se encontró el auto con el modelo: " + modelo + " .");
            }

        } catch (SQLException e) {
            System.err.println("Error al aumentar la cantidad de autos: " + e.getMessage());
        }
    }

    public void ventacarro(String nombreAuto, double precio, int idUsuario, int idAuto) {
        String nombreUsuario = null;
        String identificacion = null;
        String placaGenerada = PlacaCarro.generarPlacaUnica();
        String TipoMotor = null;
        String Color = null;
        String colorAuto = null; // Nuevo atributo para almacenar el color

        String queryUsuario = "SELECT nombre, identificacion FROM usuarios WHERE id = ?";

        try (Connection con = ConexionBD.conectar(); PreparedStatement psUsuario = con.prepareStatement(queryUsuario)) {
            psUsuario.setInt(1, idUsuario);
            ResultSet rsUsuario = psUsuario.executeQuery();

            if (rsUsuario.next()) {
                nombreUsuario = rsUsuario.getString("nombre");
                identificacion = rsUsuario.getString("identificacion");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String queryCarro = "SELECT tipo_motor, color, color_auto FROM autos WHERE id_auto = ?"; // Modificado para incluir color_auto

        try (Connection con = ConexionBD.conectar(); PreparedStatement psCarro = con.prepareStatement(queryCarro)) {
            psCarro.setInt(1, idAuto);
            ResultSet rsCarro = psCarro.executeQuery();

            if (rsCarro.next()) {
                TipoMotor = rsCarro.getString("tipo_motor");
                Color = rsCarro.getString("color");
                colorAuto = rsCarro.getString("color_auto"); // Obtener color_auto
                System.out.println("Tipo de motor recuperado: " + TipoMotor);
                System.out.println("Color recuperado: " + Color);
            } else {
                System.err.println("No se encontró el carro con el id: " + idAuto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        String query = "INSERT INTO compras (nombre_auto, precio_auto, id_usuario, id_auto, fecha_compra, total, cantidad, nombre_usuario, identificacion, placa, tipo_motor, color_auto) VALUES (?, ?, ?, ?, NOW(), ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, nombreAuto);
            ps.setDouble(2, precio);
            ps.setInt(3, idUsuario);
            ps.setInt(4, idAuto);
            ps.setDouble(5, precio);
            ps.setInt(6, 1);
            ps.setString(7, nombreUsuario);
            ps.setString(8, identificacion);
            ps.setString(9, placaGenerada);
            ps.setString(10, TipoMotor);
            ps.setString(11, colorAuto); // Guardar color_auto en la compra
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void registrarCompra(int id_usuario, int id_auto, String nombre_auto, double precio_auto, double total, int cantidad, String placa) {
        String sql = "INSERT INTO compras (nombre_auto, precio_auto, id_usuario, id_auto, fecha_compra, total, cantidad, placa) VALUES (?, ?, ?, ?, NOW(), ?, ?, ?)";

        try (Connection con = ConexionBD.conectar(); PreparedStatement pstmt = con.prepareStatement(sql)) {
            pstmt.setString(1, nombre_auto);
            pstmt.setDouble(2, precio_auto);
            pstmt.setInt(3, id_usuario);
            pstmt.setInt(4, id_auto);
            pstmt.setDouble(5, total);
            pstmt.setInt(6, cantidad);
            pstmt.setString(7, placa);

            String mensajeRegistro = "Registrando compra: id_usuario=" + id_usuario + ", id_auto=" + id_auto + ", nombre_auto=" + nombre_auto + ", precio_auto=" + precio_auto + ", total=" + total + ", cantidad=" + cantidad + ", placa=" + placa;
            JOptionPane.showMessageDialog(null, mensajeRegistro, "Registro de Compra", JOptionPane.INFORMATION_MESSAGE);

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Compra registrada exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException e) {
            String errorMessage = "Error al registrar la compra: " + e.getMessage() + "\nCódigo SQLState: " + e.getSQLState() + "\nCódigo de Error: " + e.getErrorCode();
            JOptionPane.showMessageDialog(null, errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean actualizarCantidadCarro(int idAuto, int nuevaCantidad) throws SQLException {
        boolean actualizado = false;
        Connection con = null;
        PreparedStatement ps = null;

        try {
            con = ConexionBD.conectar();
            String query = "UPDATE autos SET cantidad = ? WHERE id_auto = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, nuevaCantidad);
            ps.setInt(2, idAuto);
            int filasAfectadas = ps.executeUpdate();

            if (filasAfectadas > 0) {
                actualizado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de actualización: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return actualizado;
    }

    public List<Compra> obtenerComprasPorUsuario(int idUsuario) {
        List<Compra> compras = new ArrayList<>();
        String query = "SELECT c.id, c.nombre_auto, c.precio_auto, u.identificacion, c.fecha_compra "
                + "FROM compras c "
                + "JOIN usuarios u ON c.id_usuario = u.id_usuario "
                + "WHERE u.id_usuario = ?";

        try (Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // Crear el objeto Compra y añadirlo a la lista
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción según sea necesario
        }

        return compras;
    }

    public List<String> obtenerColoresPorModelo(int idModelo) {
        List<String> colores = new ArrayList<>();
        String query = "SELECT color FROM modelo_colores WHERE id_auto = ?";

        try (Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(query)) {

            ps.setInt(1, idModelo);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                colores.add(rs.getString("color"));
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción según sea necesario
        }

        return colores;
    }

    public void realizarCompra(int idModelo, String colorElegido, String nombreAuto, BigDecimal precioAuto, int idUsuario, Timestamp fechaCompra, BigDecimal total, int cantidad, String placa) {
        String query = "INSERT INTO compras (nombre_auto, color_auto, id_usuario, id_auto, fecha_compra, total, cantidad, placa) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = ConexionBD.conectar(); PreparedStatement ps = con.prepareStatement(query)) {

            ps.setString(1, nombreAuto);
            ps.setString(2, colorElegido);
            ps.setInt(3, idUsuario); // Asegúrate de tener el id del usuario
            ps.setInt(4, idModelo);   // Pasar el id del modelo
            ps.setTimestamp(5, fechaCompra);
            ps.setBigDecimal(6, total);
            ps.setInt(7, cantidad);
            ps.setString(8, placa);

            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(); // Manejar la excepción según sea necesario
        }
    }

    public List<Compra> obtenerAutosVendidos() throws SQLException {
        List<Compra> compras = new ArrayList<>();
        String query = """
        SELECT c.nombre_auto, c.precio_auto, c.fecha_compra, c.color_auto, c.total, c.cantidad, u.nombre, u.apellido, u.identificacion, c.placa
        FROM compras c
        JOIN usuarios u ON c.id_usuario = u.id
    """;

        try (Connection con = ConexionBD.conectar(); 
     PreparedStatement ps = con.prepareStatement(query); 
     ResultSet rs = ps.executeQuery()) {

    List<Compra> compras = new ArrayList<>(); // Asegúrate de inicializar la lista de compras

    while (rs.next()) {
        int id = rs.getInt("id"); // Este es el id de la compra, no del carro
        String nombreAuto = rs.getString("nombre_auto");
        BigDecimal precioAuto = BigDecimal.valueOf(rs.getDouble("precio_auto")); // Usar BigDecimal
        int idUsuario = rs.getInt("id_usuario"); // id del usuario que compró
        int idAuto = rs.getInt("id_auto"); // id del carro comprado
        Timestamp fechaCompra = rs.getTimestamp("fecha_compra"); // Cambiar a Timestamp
        BigDecimal total = BigDecimal.valueOf(rs.getDouble("total")); // Usar BigDecimal
        int cantidad = rs.getInt("cantidad");
        String nombreUsuario = rs.getString("nombre_usuario");
        String identificacion = rs.getString("identificacion");
        String placa = rs.getString("placa");
        String colorAuto = rs.getString("color_auto");

        Compra compra = new Compra(
            id,               // ID de la compra
            nombreAuto,      // Nombre del auto
            precioAuto,      // Precio del auto
            fechaCompra,     // Fecha de compra (cambiar a Timestamp)
            total,           // Total de la compra
            cantidad,        // Cantidad comprada
            nombreUsuario,   // Nombre del usuario
            apellidoUsuario,  // Necesitarás este valor desde el ResultSet
            identificacion,  // Identificación del usuario
            placa,           // Placa del auto
            colorAuto        // Color del auto
        );
        compras.add(compra);
    }
}

return compras;


}
    

