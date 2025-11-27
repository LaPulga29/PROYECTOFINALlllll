package Negocio;
public class Proveedor {
    private String servicio;
    private String contacto;
    private double costo;
    private boolean contratado; // Indica si el proveedor fue contratado (true) o no (false).
    public Proveedor(String servicio, String contacto, double costo, boolean contratado){
        // Constructor: inicializa los atributos al crear un objeto Proveedor.
        this.servicio = servicio;       // Asigna el servicio.
        this.contacto = contacto;       // Asigna el contacto.
        this.costo = costo;             // Asigna el costo.
        this.contratado = contratado;   // Asigna el estado de contratación.
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
    // Permite modificar el servicio del proveedor.
    public boolean isContratado() {
        return contratado;
    }


}
