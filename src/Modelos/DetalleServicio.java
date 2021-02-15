package Modelos;

public class DetalleServicio {
    
    private String serie;
    private String precio;
    private String factura;

    public DetalleServicio(String serie, String precio, String factura) {
        this.serie = serie;
        this.precio = precio;
        this.factura = factura;
    }

    public DetalleServicio() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
    }
    
}
