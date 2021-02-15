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
public class Cotizacion {
    
    //    Cotizacion
    
    private String CodigoCot;
    private String CServicio;
    private String CRepuestos;
    private String CedulaTec;
    private String NuSerie;

    public Cotizacion(String CodigoCot, String CServicio, String CRepuestos, String CedulaTec, String NuSerie) {
        this.CodigoCot = CodigoCot;
        this.CServicio = CServicio;
        this.CRepuestos = CRepuestos;
        this.CedulaTec = CedulaTec;
        this.NuSerie = NuSerie;
    }

    public Cotizacion(String CodigoCot) {
        this.CodigoCot = CodigoCot;
    }

    public String getCodigoCot() {
        return CodigoCot;
    }

    public void setCodigoCot(String CodigoCot) {
        this.CodigoCot = CodigoCot;
    }

    public String getCServicio() {
        return CServicio;
    }

    public void setCServicio(String CServicio) {
        this.CServicio = CServicio;
    }

    public String getCRepuestos() {
        return CRepuestos;
    }

    public void setCRepuestos(String CRepuestos) {
        this.CRepuestos = CRepuestos;
    }

    public String getCedulaTec() {
        return CedulaTec;
    }

    public void setCedulaTec(String CedulaTec) {
        this.CedulaTec = CedulaTec;
    }

    public String getNuSerie() {
        return NuSerie;
    }

    public void setNuSerie(String NuSerie) {
        this.NuSerie = NuSerie;
    }
    
    
    
    
    
}
