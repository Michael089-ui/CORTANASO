package Modelos;

public class FacturaServicio {
    
    private String factura;
    private String fecha;
    private String formapago;
    private String descripcion;
    private String valor;
    private String documento;
    private String cedula;
    private String ficha;
    private String diagnostico;
    private String cotizacion;

    public FacturaServicio(String factura, String fecha, String formapago, String descripcion, String valor, String documento, String cedula, String ficha, String diagnostico, String cotizacion) {
        this.factura = factura;
        this.fecha = fecha;
        this.formapago = formapago;
        this.descripcion = descripcion;
        this.valor = valor;
        this.documento = documento;
        this.cedula = cedula;
        this.ficha = ficha;
        this.diagnostico = diagnostico;
        this.cotizacion = cotizacion;
    }

    public FacturaServicio() {
    }

    public String getFactura() {
        return factura;
    }

    public void setFactura(String factura) {
        this.factura = factura;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFicha() {
        return ficha;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }
    
    
    
}
