package Modelos;

public class Servicio {
    
    private String codigo;
    private String fecha;
    private String estado;
    private String serie;

    public Servicio(String codigo, String fecha, String estado, String serie) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.estado = estado;
        this.serie = serie;
    }

    public Servicio() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    
    
}
