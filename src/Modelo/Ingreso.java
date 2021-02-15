
package Modelo;

public class Ingreso {
    
    private String numserie;
    private String vendedor;
    private String descrip;
    private String dispon;
    private String precio;

    public Ingreso() {
    }

    public Ingreso(String numserie) {
        this.numserie = numserie;
    }

    public Ingreso(String numserie, String vendedor, String descrip, String dispon, String precio) {
        this.numserie = numserie;
        this.vendedor = vendedor;
        this.descrip = descrip;
        this.dispon = dispon;
        this.precio = precio;
    }

    public String getDispon() {
        return dispon;
    }

    public void setDispon(String dispon) {
        this.dispon = dispon;
    }

    public String getNumserie() {
        return numserie;
    }

    public void setNumserie(String numserie) {
        this.numserie = numserie;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    
    
    
}
