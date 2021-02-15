package Modelos;

public class DetalleVenta {
 
    private String serie;
    private String codigo;
    private String preciocompra;

    public DetalleVenta(String serie, String codigo, String preciocompra) {
        this.serie = serie;
        this.codigo = codigo;
        this.preciocompra = preciocompra;
    }

    public DetalleVenta() {
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(String preciocompra) {
        this.preciocompra = preciocompra;
    }
    
    
    
}
