package Negocio; // Define el paquete donde vive esta clase, útil para organizar el proyecto.
import java.util.ArrayList; // Importa la clase ArrayList para manejar listas dinámicas de invitados.

public class FiestaGraduacion extends Evento { // Declara la clase FiestaGraduacion como una subclase de Evento (herencia).
    private String nombreGraduado;
    private String carrera;
    private String universidad;
    private String tipoCeremoniaAcademica; // Tipo de ceremonia (ej. presencial, virtual, privada, pública).
    public FiestaGraduacion(String id, String nombreEvento, String fecha,
                            String lugar, int numIvitados, int numProveedores, String temaColor,
                            Organizador org, String nombreGraduado, String carrera, String universidad, String tipoCeremoniaAcademica){
        // Constructor que inicializa todos los atributos, incluyendo los heredados desde Evento.
        super(id,nombreEvento,fecha,lugar,numIvitados,numProveedores, temaColor,org);
        // Llama al constructor de la clase padre (Evento) para inicializar los campos comunes.
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
    // Metodo que asigna una lista de invitados al evento usando el setter heredado.
    public void eliminarInvitado(Invitado invitado){
        for (Invitado invitado1 : getInvitados()){
            if (invitado1.getNombreInv().equals(invitado.getNombreInv())){
                getInvitados().remove(invitado1);
            }
        }
    }
    // Metodo que recorre la lista de invitados y elimina al que tenga el mismo nombre que el recibido.

}