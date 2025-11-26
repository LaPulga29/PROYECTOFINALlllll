package Negocio;

public class Organizador {
    private String idOrganizador;
    private String nombreOrg;
    private String especialidad;
    private int experienciaAnios;
    private String contactoOrg;

    public Organizador(String idOrganizador, String nombreOrg, String especialidad, int experienciaAnios, String contactoOrg) {
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
        this.nombreOrg = nombreOrg;
    }

    @Override
    public String toString() {
        return "\nID del organizador: "+idOrganizador+"\nNombre: "+nombreOrg+"\nEspecialidad: "+especialidad+"\nAños de experiecia: "+experienciaAnios+"\nContacto:"+contactoOrg;
    }
}
