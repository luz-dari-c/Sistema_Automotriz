package model;

<<<<<<< HEAD:src/model/usuarios.java
public class usuarios {
=======
public class Usuario {
>>>>>>> modificarInformacion:src/model/Usuario.java
    private int id; 
    private String nombre;
    private String apellidos;
    private String identificacion;
    private String user;
    private String contraseña;
    private String correo;

<<<<<<< HEAD:src/model/usuarios.java
    public usuarios(int id, String nombre, String apellidos, String identificacion, String user, String contraseña, String correo) {
=======
    public Usuario(int id, String nombre, String apellidos, String identificacion, String user, String contraseña, String correo) {
>>>>>>> modificarInformacion:src/model/Usuario.java
        this.id = id; 
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificacion = identificacion;
        this.user = user;
        this.contraseña = contraseña;
        this.correo = correo;
    }

<<<<<<< HEAD:src/model/usuarios.java
=======
   
>>>>>>> modificarInformacion:src/model/Usuario.java
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
