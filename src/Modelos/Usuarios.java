package Modelos;

public class Usuarios {
    
    private String cedula;
    private String celular;
    private String nombre;
    private String usuario;
    private String clave;
    private String estado;

    public Usuarios(String cedula, String celular, String nombre, String usuario, String clave, String estado) {
        this.cedula = cedula;
        this.celular = celular;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }

    public Usuarios(String cedula, String nombre, String usuario, String clave, String estado) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.estado = estado;
    }

    public Usuarios(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public Usuarios() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
