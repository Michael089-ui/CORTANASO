package Modelos;

public class ProductoVenta {
    
    private String serie;
    private String disponibilidad;

    public ProductoVenta(String serie, String disponibilidad) {
        this.serie = serie;
        this.disponibilidad = disponibilidad;
    }

    public ProductoVenta() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    
    
}
