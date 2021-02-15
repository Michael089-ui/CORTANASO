/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Fichatecnica {
    
    //    Ficha técnica
    
    private String Nficha;
    private String Numserie;
    private String Marca;
    private String Soperativo;
    private String Procesador;
    private String Ram;
    private String Rom;
    private String Perifericos;

    public Fichatecnica(String Nficha, String Numserie, String Marca, String Soperativo, String Procesador, String Ram, String Rom, String Perifericos) {
        this.Nficha = Nficha;
        this.Numserie = Numserie;
        this.Marca = Marca;
        this.Soperativo = Soperativo;
        this.Procesador = Procesador;
        this.Ram = Ram;
        this.Rom = Rom;
        this.Perifericos = Perifericos;
    }

    public String getNficha() {
        return Nficha;
    }

    public void setNficha(String Nficha) {
        this.Nficha = Nficha;
    }

    public String getNumserie() {
        return Numserie;
    }

    public void setNumserie(String Numserie) {
        this.Numserie = Numserie;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getSoperativo() {
        return Soperativo;
    }

    public void setSoperativo(String Soperativo) {
        this.Soperativo = Soperativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getRom() {
        return Rom;
    }

    public void setRom(String Rom) {
        this.Rom = Rom;
    }

    public String getPerifericos() {
        return Perifericos;
    }

    public void setPerifericos(String Perifericos) {
        this.Perifericos = Perifericos;
    }
    
    
    
}
