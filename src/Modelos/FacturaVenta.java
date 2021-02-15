package Modelos;

public class FacturaVenta {
    
    private String codigo;
    private String fecha;
    private String formapago;
    private String valor;
    private String documento;
    private String nombre;
    private String celular;

    public FacturaVenta(String codigo, String fecha, String formapago, String valor, String documento, String nombre, String celular) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.formapago = formapago;
        this.valor = valor;
        this.documento = documento;
        this.nombre = nombre;
        this.celular = celular;
    }

    public FacturaVenta() {
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

    public String getFormapago() {
        return formapago;
    }

    public void setFormapago(String formapago) {
        this.formapago = formapago;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
}
