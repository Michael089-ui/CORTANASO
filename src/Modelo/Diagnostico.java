/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author neyde
 */
public class Diagnostico {
    
    //    Diagnostico
    
    private String Codigodiag;
    private String Hardware;
    private String Software;
    private String Cedulat;
    private String NumeroSer;

    public Diagnostico(String Codigodiag, String Hardware, String Software, String Cedulat, String NumeroSer) {
        this.Codigodiag = Codigodiag;
        this.Hardware = Hardware;
        this.Software = Software;
        this.Cedulat = Cedulat;
        this.NumeroSer = NumeroSer;
    }

    public Diagnostico(String Codigodiag) {
        this.Codigodiag = Codigodiag;
    }

    public String getCodigodiag() {
        return Codigodiag;
    }

    public void setCodigodiag(String Codigodiag) {
        this.Codigodiag = Codigodiag;
    }

    public String getHardware() {
        return Hardware;
    }

    public void setHardware(String Hardware) {
        this.Hardware = Hardware;
    }

    public String getSoftware() {
        return Software;
    }

    public void setSoftware(String Software) {
        this.Software = Software;
    }

    public String getCedulat() {
        return Cedulat;
    }

    public void setCedulat(String Cedulat) {
        this.Cedulat = Cedulat;
    }

    public String getNumeroSer() {
        return NumeroSer;
    }

    public void setNumeroSer(String NumeroSer) {
        this.NumeroSer = NumeroSer;
    }
    
    
    
}
