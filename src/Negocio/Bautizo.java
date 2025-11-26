package Negocio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Bautizo extends Evento {
    private String nombreBebe;
    private String nombrePadrinos;
    private String iglesia;
    private String sacerdote;
    public Bautizo(String id, String nombreEvento, String fecha,
                   String lugar, int numInvitados, int numProveedores, String temaColor,
                   Organizador org, String nombreBebe, String nombrePadrinos, String iglesia, String sacerdote){
        super(id,nombreEvento,fecha,lugar,numInvitados,numProveedores, temaColor,org);
        this.nombreBebe = nombreBebe;
        this.nombrePadrinos = nombrePadrinos;
        this.iglesia = iglesia;
        this.sacerdote = sacerdote;
    }
    public String getIglesia() {
        return iglesia;
    }
    public void setIglesia(String iglesia) {
        this.iglesia = iglesia;
    }
    public String getNombreBebe() {
        return nombreBebe;
    }
    public void setNombreBebe(String nombreBebe) {
        this.nombreBebe = nombreBebe;
    }
    public String getNombrePadrinos() {
        return nombrePadrinos;
    }
    public void setNombrePadrinos(String nombrePadrinos) {
        this.nombrePadrinos = nombrePadrinos;
    }
    public String getSacerdote() {
        return sacerdote;
    }
    public void setSacerdote(String sacerdote) {
        this.sacerdote = sacerdote;
    }
    @Override
    public String toString() {
        return "Bautizo" +
                "\nNombre del Bautizo: " + getNombreEvento() +
                "\nNombre del bebe: " + nombreBebe +
                "\nNombre de los padrinos(True or False): " + iglesia +
                "\nSacerdote: '" + sacerdote;
    }
}
