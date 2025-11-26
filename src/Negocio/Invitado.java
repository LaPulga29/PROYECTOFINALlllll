package Negocio;
public class Invitado {
    private String idInvitado;
    private String nombreInv;
    private String relacion;
    private boolean confAsistencia;
    private String mesaAsignada;
    public Invitado(String idInvitado, String nombreInv, String relacion, String mesaAsignada){
        this.idInvitado = idInvitado;
        this.nombreInv = nombreInv;
        this.relacion = relacion;
        this.mesaAsignada = mesaAsignada;
    }
    public String getIdInvitado() {
        return idInvitado;
    }
    public void setIdInvitado(String idInvitado) {
        this.idInvitado = idInvitado;
    }
    public String getMesaAsignada() {
        return mesaAsignada;
    }
    public void setMesaAsignada(String mesaAsignada) {
        this.mesaAsignada = mesaAsignada;
    }
    public String getNombreInv() {
        return nombreInv;
    }
    public void setNombreInv(String nombreInv) {
        this.nombreInv = nombreInv;
    }
    public String getRelacion() {
        return relacion;
    }
    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }
    @Override
    public String toString() {
        return "\nID del invitado: "+idInvitado+"\nNombre: "+nombreInv+"\nRelacion: "+relacion+confAsistencia+"Mesa asignada: "+mesaAsignada;
    }
}
