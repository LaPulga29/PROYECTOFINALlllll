package Negocio;                       // Indica que la clase pertenece al paquete Negocio
import java.util.ArrayList;            // Importa la clase ArrayList para manejar listas dinámicas
public class Evento {                  // Define la clase Evento (superclase para Boda, Bautizo, etc.)
    private String id;                 // Identificador único del evento
    private String nombreEvento;       // Nombre del evento (ej. "Boda de Ana y Luis")
    private String fecha;              // Fecha del evento
    private String lugar;              // Lugar donde se realiza el evento
    private int numInvitados;          // Número de invitados contemplados
    private int numProveedores;        // Número de proveedores contemplados
    private String temaColor;          // Tema de color del evento
    private Organizador org;           // Organizador del evento
    private Invitado inv;              // Un invitado individual (atributo auxiliar)
    private ArrayList<Invitado> invitados;   // Lista completa de invitados
    private ArrayList<Proveedor> proveedores; // Lista completa de proveedores
    // Constructor: inicializa los atributos principales del evento
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
    // Métodos getter y setter para acceder y modificar atributos
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public Invitado getInv() { return inv; }
    public void setInv(Invitado inv) { this.inv = inv; }
    public ArrayList<Invitado> getInvitados() { return invitados; }
    public void setInvitados(ArrayList<Invitado> invitados) { this.invitados = invitados; }
    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }
    public String getNombreEvento() { return nombreEvento; }
    public void setNombreEvento(String nombreEvento) { this.nombreEvento = nombreEvento; }
    public int getNumInvitados() { return numInvitados; }
    public void setNumInvitados(int numInvitados) { this.numInvitados = numInvitados; }
    public int getNumProveedores() { return numProveedores; }
    public Organizador getOrg() { return org; }
    public void setOrg(Organizador org) { this.org = org; }
    public ArrayList<Proveedor> getProveedores() { return proveedores; }
    public void setProveedores(ArrayList<Proveedor> proveedores) { this.proveedores = proveedores; }
    public String getTemaColor() { return temaColor; }
    public void setTemaColor(String temaColor) { this.temaColor = temaColor; }
    // Metodo para asignar lista de invitados
    public void agregarInvitados(ArrayList<Invitado> invitados){
        setInvitados(invitados);
    }
    // Metodo para eliminar un invitado de la lista comparando por nombre
    public void eliminarInvitado(Invitado invitado){
        for (Invitado invitado1 : getInvitados()){ // Bucle for-each: recorre la lista de invitados del evento obtenida con getInvitados().
            if (invitado1.getNombreInv().equals(invitado.getNombreInv())){
                // Condición: compara el nombre del invitado actual con el nombre del invitado recibido por parámetro usando equals (comparación exacta).
                getInvitados().remove(invitado1);
                // Si coincide, elimina de la lista al invitado actual.
            }
        }
    }
    @Override
    public String toString() {         // Sobrescribe el metodo toString heredado de Object
        return super.toString();       // Llama al toString de la clase padre (Object), que devuelve "Evento@hash"
    }
}
