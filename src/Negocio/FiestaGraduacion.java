package Negocio;

import java.util.ArrayList;

public class FiestaGraduacion extends Evento {
    private String nombreGraduado;
    private String carrera;
    private String universidad;
    private String tipoCeremoniaAcademica;

    public FiestaGraduacion(String id, String nombreEvento, String fecha,
                            String lugar, int numIvitados, int numProveedores, String temaColor,
                            Organizador org, String nombreGraduado, String carrera, String universidad, String tipoCeremoniaAcademica){
        super(id,nombreEvento,fecha,lugar,numIvitados,numProveedores, temaColor,org);
        this.nombreGraduado = nombreGraduado;
        this.carrera = carrera;
        this.universidad = universidad;
        this.tipoCeremoniaAcademica = tipoCeremoniaAcademica;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getNombreGraduado() {
        return nombreGraduado;
    }
    public void setNombreGraduado(String nombreGraduado) {
        this.nombreGraduado = nombreGraduado;
    }
    public String getTipoCeremoniaAcademica() {
        return tipoCeremoniaAcademica;
    }
    public void setTipoCeremoniaAcademica(String tipoCeremoniaAcademica) {
        this.tipoCeremoniaAcademica = tipoCeremoniaAcademica;
    }
    public String getUniversidad() {
        return universidad;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
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
        return "Fiesta de Graduacion:" +
                "\nNombre del graduado: " + nombreGraduado +
                "\nCarrera: " + carrera +
                "\nUniversidad: " + universidad +
                "\nTipo de ceremonia: " + tipoCeremoniaAcademica;
    }
}
