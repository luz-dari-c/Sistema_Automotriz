package model;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class Compra {
    private String nombreAuto;
    private BigDecimal precioAuto;
    private Timestamp fechaCompra; 
    private BigDecimal total;
    private int cantidad;
    private String nombreUsuario;  
    private String apellidoUsuario;
    private String identificacionUsuario; 
    private String placa;  
    private String color; 

    // Constructor principal
    public Compra(String nombreAuto, BigDecimal precioAuto, Timestamp fechaCompra, 
                  BigDecimal total, int cantidad, String nombreUsuario, 
                  String apellidoUsuario, String identificacionUsuario, 
                  String placa, String color) {
        this.nombreAuto = nombreAuto;
        this.precioAuto = precioAuto;
        this.fechaCompra = fechaCompra;
        this.total = total;
        this.cantidad = cantidad;
        this.nombreUsuario = nombreUsuario;   
        this.apellidoUsuario = apellidoUsuario;
        this.identificacionUsuario = identificacionUsuario;  
        this.placa = placa;  
        this.color = color;
    }

    // Otros constructores si son necesarios
    // Puedes agregar otros constructores según tus necesidades o eliminarlos si no se utilizan.

    // Getters
    public String getNombreAuto() {
        return nombreAuto;
    }

    public BigDecimal getPrecioAuto() {
        return precioAuto;
    }

    public Timestamp getFechaCompra() {
        return fechaCompra;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public String getIdentificacionUsuario() {
        return identificacionUsuario;
    }

    public String getPlaca() {
        return placa;  
    }

    public String getColor() {
        return color;
    }
}
