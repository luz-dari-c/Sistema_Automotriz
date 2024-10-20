
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
    private String Placa;
    private String color; 
    private String tipoMotor;

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
        return Placa;
    }

    public String getColor() {
        return color;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

   
    public Compra(String nombreAuto, BigDecimal precioAuto, Timestamp fechaCompra, BigDecimal total, int cantidad, String nombreUsuario, String apellidoUsuario, String identificacionUsuario, String Placa, String color, String TipoMotor) {
        this.nombreAuto = nombreAuto;
        this.precioAuto = precioAuto;
        this.fechaCompra = fechaCompra;
        this.total = total;
        this.cantidad = cantidad;
        this.nombreUsuario = nombreUsuario;   
        this.apellidoUsuario = apellidoUsuario;
        this.identificacionUsuario = identificacionUsuario;  
        this.Placa = Placa;
        this.color = color;
        this.tipoMotor = TipoMotor;
    }
}