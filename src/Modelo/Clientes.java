/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Clientes {
    
    //    Cliente
    
    private String Documento;
    private String Nombre;
    private String Celular;
    private String Direccion;

    public Clientes() {
    }

    public Clientes(String Documento) {
        this.Documento = Documento;
    }
       
    public Clientes(String Documento, String Nombre, String Celular, String Direccion) {
        this.Documento = Documento;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direccion = Direccion;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    
    
    
}
