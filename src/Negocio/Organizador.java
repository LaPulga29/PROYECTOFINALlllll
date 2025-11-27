package Negocio; // Define el paquete donde se encuentra la clase Organizador, útil para organizar el proyecto.
public class Organizador {  // Declara la clase Organizador, que representa a la persona encargada de organizar un evento.
    private String idOrganizador;
    private String nombreOrg;
    private String especialidad;
    private int experienciaAnios;
    private String contactoOrg; // Información de contacto del organizador (teléfono, correo, etc.).
    public Organizador(String idOrganizador, String nombreOrg, String especialidad, int experienciaAnios, String contactoOrg) {
        // Constructor: inicializa todos los atributos al crear un objeto Organizador.
        this.idOrganizador = idOrganizador;
        this.nombreOrg = nombreOrg;
        this.especialidad = especialidad;
        this.experienciaAnios = experienciaAnios;
        this.contactoOrg = contactoOrg;
    }
    public String getContactoOrg() {
        return contactoOrg;
    }
    public void setContacto(String contactoOrg) {
        this.contactoOrg = contactoOrg;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getExperienciaAnios() {
        return experienciaAnios;
    }
    // Devuelve los años de experiencia del organizador.
    public void setExperienciaAnios(int experienciaAnios) {
        this.experienciaAnios = experienciaAnios;
    }
    public String getIdOrganizador() {
        return idOrganizador;
    }
    public void setIdOrganizador(String idOrganizador) {
        this.idOrganizador = idOrganizador;
    }
    public String getNombreOrg() {
        return nombreOrg;
    }
    public void setNombreOrg(String nombre) {
        this.nombreOrg = nombreOrg; //
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
