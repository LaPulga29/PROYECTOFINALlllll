package Negocio;
import java.util.ArrayList;

public class Evento {
    private String id;
    private String nombreEvento;
    private String fecha;
    private String lugar;
    private int numInvitados;
    private int numProveedores;
    private String temaColor;
    private Organizador org;
    private Invitado inv;
    private ArrayList<Invitado> invitados;
    private ArrayList<Proveedor> proveedores;

    public Evento(String id, String nombreEvento, String fecha, String lugar, int numInvitados, int numProveedores, String temaColor, Organizador org) {
        this.id = id;
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.lugar = lugar;
        this.numInvitados = numInvitados;
        this.numProveedores = numProveedores;
        this.temaColor = temaColor;
        this.org = org;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Invitado getInv() {
        return inv;
    }
    public void setInv(Invitado inv) {
        this.inv = inv;
    }
    public ArrayList<Invitado> getInvitados() {
        return invitados;
    }
    public void setInvitados(ArrayList<Invitado> invitados) {
        this.invitados = invitados;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getNombreEvento() {
        return nombreEvento;
    }
    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }
    public int getNumInvitados() {
        return numInvitados;
    }
    public int getNumProveedores(){
        return numProveedores;
    }
    public void setNumInvitados(int numInvitados) {
        this.numInvitados = numInvitados;
    }

    public Organizador getOrg() {
        return org;
    }
    public void setOrg(Organizador org) {
        this.org = org;
    }
    public ArrayList<Proveedor> getProveedores() {
        return proveedores;
    }
    public void setProveedores(ArrayList<Proveedor> proveedores) {
        this.proveedores = proveedores;
    }
    public String getTemaColor() {
        return temaColor;
    }
    public void setTemaColor(String temaColor) {
        this.temaColor = temaColor;
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
        return super.toString();
    }
}