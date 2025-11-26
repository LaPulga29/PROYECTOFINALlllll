package Negocio;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Boda extends Evento {
    private String nombreNovios;
    private String tipoCeremonia;
    private String menuCena;
    private boolean tienePadrinos;
    private String cancionPrimerBaile;
    public Boda(String id, String nombreEvento, String fecha,
                String lugar, int numInvitados, int numProveedores, String temaColor,
                Organizador org, String cancionPrimerBaile,
                String menuCena, String nombreNovios, boolean tienePadrinos, String tipoCeremonia) {
        super(id, nombreEvento, fecha, lugar, numInvitados, numProveedores, temaColor, org);
        this.cancionPrimerBaile = cancionPrimerBaile;
        this.menuCena = menuCena;
        this.nombreNovios = nombreNovios;
        this.tienePadrinos = tienePadrinos;
        this.tipoCeremonia = tipoCeremonia;
    }

    public String getCancionPrimerBaile() {
        return cancionPrimerBaile;
    }
    public void setCancionPrimerBaile(String cancionPrimerBaile) {
        this.cancionPrimerBaile = cancionPrimerBaile;
    }
    public String getMenuCena() {
        return menuCena;
    }
    public void setMenuCena(String menuCena) {
        this.menuCena = menuCena;
    }
    public String getNombreNovios() {
        return nombreNovios;
    }
    public void setNombreNovios(String nombreNovios) {
        this.nombreNovios = nombreNovios;
    }
    public boolean isTienePadrinos() {
        return tienePadrinos;
    }
    public void setTienePadrinos(boolean tienePadrinos) {
        this.tienePadrinos = tienePadrinos;
    }
    public String getTipoCeremonia() {
        return tipoCeremonia;
    }
    public void setTipoCeremonia(String tipoCeremonia) {
        this.tipoCeremonia = tipoCeremonia;
    }
    public void agregarInvitados(ArrayList<Invitado> invitados){
        setInvitados(invitados);
    }
    public void eliminarInvitado(Invitado invitado){
        for (Invitado invitado1 : getInvitados()){
            if (invitado1.getNombreInv().equals(invitado.getNombreInv())){
                getInvitados().remove(invitado1);
            }
        }
    }
    @Override
    public String toString() {
        return "Boda" +
                "\nNombre de la boda :" + getNombreEvento() +
                "\nCancion de entrada: '" + cancionPrimerBaile +
                "\nNombre de los novios: " + nombreNovios +
                "\nTipo de ceremonia: " + tipoCeremonia +
                "\nMenu Principal: " + menuCena +
                "\nTiene padrinos? (True or False)"+ tienePadrinos;
    }
}
