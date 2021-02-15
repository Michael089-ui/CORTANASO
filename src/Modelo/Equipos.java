
package Modelo;

public class Equipos {
    
    //    Equipo
    
    private String Nserie;
    private String imagen;
    private String Docuequipo;

    public Equipos(String Nserie, String imagen, String Docuequipo) {
        this.Nserie = Nserie;
        this.imagen = imagen;
        this.Docuequipo = Docuequipo;
    }

    public Equipos(String Nserie) {
        this.Nserie = Nserie;
    }

    public Equipos() {
    }
    
    public String getNserie() {
        return Nserie;
    }

    public void setNserie(String Nserie) {
        this.Nserie = Nserie;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDocuequipo() {
        return Docuequipo;
    }

    public void setDocuequipo(String Docuequipo) {
        this.Docuequipo = Docuequipo;
    }
    
    
    
}
