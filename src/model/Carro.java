package model;

public class Carro {
    
    private int id; 
    private String marca;
    private String modelo;
    private int año; // Cambiado a int
    private Double precio;
    private String color;
    private String tipoMotor;
    private String kilometraje;
    private String fechaIngresoo;
    private String placa;
    private int cantidad;
    private String colorAuto; // Renombrado para consistencia

    // Constructor actualizado
    public Carro(int id, String marca, String modelo, int año, Double precio, String color, String tipoMotor, String kilometraje, String fechaIngresoo, String placa, int cantidad, String colorAuto) {
        this.id = id; 
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.color = color;
        this.tipoMotor = tipoMotor;
        this.kilometraje = kilometraje;
        this.fechaIngresoo = fechaIngresoo;
        this.placa = placa;
        this.cantidad = cantidad;
        this.colorAuto = colorAuto; // Asignación del nuevo color
    }

    // Constructor adicional (si lo necesitas)
    public Carro(int cantidad, String marca, String modelo, int año, Double precio, String color, String tipoMotor, String kilometraje, String fechaIngresoo, String placa) {
        this.cantidad = cantidad;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
        this.color = color;
        this.tipoMotor = tipoMotor;
        this.kilometraje = kilometraje;
        this.fechaIngresoo = fechaIngresoo;
        this.placa = placa;
        // Si no necesitas id o color_auto, puedes omitirlos o establecer valores predeterminados
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() { // Cambiado a int
        return año;
    }

    public void setAño(int año) { // Cambiado a int
        this.año = año;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getFechaIngresoo() {
        return fechaIngresoo;
    }

    public void setFechaIngresoo(String fechaIngresoo) {
        this.fechaIngresoo = fechaIngresoo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id; 
    }

    public String getColorAuto() { // Renombrado para consistencia
        return colorAuto; // Getter para el nuevo color
    }

    public void setColorAuto(String colorAuto) { // Renombrado para consistencia
        this.colorAuto = colorAuto; 
    }
}
