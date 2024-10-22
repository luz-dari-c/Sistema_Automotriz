package controller;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.ConexionBD;
import model.Carro;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class carsController {

    public boolean registroCarro(String marca, String modelo, String año, String precio, String color, String tipoMotor, String fechaIngreso, String kilometraje, String nuevaPlaca) {
        ConexionBD bd = new ConexionBD();

        boolean registrado = false;

        try {
            String sql = "INSERT INTO autos (marca, modelo, año, precio, color, tipo_motor, fecha_ingreso, Kilometraje, placa) VALUES (?,?,?,?,?,?,?,?,?)";
            Connection cn = bd.conectar();
            PreparedStatement pst = cn.prepareStatement(sql);
            pst.setString(1, marca);
            pst.setString(2, modelo);
            pst.setString(3, año);
            pst.setBigDecimal(4, new BigDecimal(precio));
            pst.setString(5, color);
            pst.setString(6, tipoMotor);
            pst.setString(7, fechaIngreso);
            pst.setString(8, kilometraje);
            pst.setString(9, nuevaPlaca);

            int filasAfectadas = pst.executeUpdate();
            if (filasAfectadas > 0) {
                registrado = true;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }

        return registrado;

    }

   public Carro obtenerDatosCarro(String modeloCarro) {
    Carro carro = null;
    try {
        // Conexión a la base de datos
        ConexionBD bd = new ConexionBD();
        Connection conn = bd.conectar(); // Usa tu clase de conexión aquí
        String sql = "SELECT * FROM autos WHERE modelo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, modeloCarro);
        ResultSet rs = stmt.executeQuery();

        // Si se encuentra el carro, almacenar sus datos
        if (rs.next()) {
            carro = new Carro(
                rs.getInt("id_auto"),
                rs.getString("marca"),
                rs.getString("modelo"),
                rs.getInt("año"),
                rs.getDouble("precio"),
                rs.getString("color"),
                rs.getString("tipo_motor"),
                rs.getString("kilometraje"),
                rs.getString("fecha_ingreso"),
                rs.getString("placa"),
                rs.getInt("cantidad"),
                rs.getString("colorAuto") // Verifica que este campo exista en la base de datos
            );
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el carro");
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    }
    return carro;
}

    public double obtenerPrecioCarroDesdeBD(String placaCarro) throws SQLException {
        double precio = 0.0;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/inventario_autos", "root", "");
        String query = "SELECT precio FROM autos WHERE placa = ?";
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, placaCarro);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            precio = rs.getDouble("precio");
        }
        rs.close();
        ps.close();
        con.close();
        return precio;
    }
}
