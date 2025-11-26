package Negocio;

public class Proveedor {
    // private String idProveedor;
    private String servicio;
    private String contacto;
    private double costo;
    private boolean contratado;

    public Proveedor(String servicio, String contacto, double costo, boolean contratado){

        this.servicio = servicio;
        this.contacto = contacto;
        this.costo = costo;
        this.contratado = contratado;
    }

    public boolean getContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }


    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public String toString() {
        return "\nServicio: "+servicio+"\nContacto: "+contacto+"\nCosto: "+costo+"\nFue contratado?: "+contratado;
    }
}
