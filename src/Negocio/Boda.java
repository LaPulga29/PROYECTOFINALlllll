package Negocio;                       // Indica que la clase pertenece al paquete Negocio
import java.util.ArrayList;            // Importa la clase ArrayList para manejar listas dinámicas
import java.util.List;                 // Importa la interfaz List (no usada directamente aquí)
import java.util.Scanner;              // Importa Scanner (no usado en esta clase, pero disponible)
public class Boda extends Evento {     // Define la clase Boda que hereda de Evento
    private String nombreNovios;       // Nombre de los novios
    private double presupuestoComida;  // Presupuesto destinado a la comida
    private double presupuestoSalon;   // Presupuesto destinado al salón
    private double presupuestoMeseros; // Presupuesto destinado a los meseros
    private String tipoCeremonia;      // Tipo de ceremonia (civil, religiosa, etc.)
    private String menuCena;           // Menú principal de la cena
    private boolean tienePadrinos;     // Indica si la boda tiene padrinos
    private String cancionPrimerBaile; // Canción del primer baile
    // Constructor de la clase Boda
    public Boda(String id, String nombreEvento, String fecha,
                String lugar, int numInvitados, int numProveedores, String temaColor,
                Organizador org, double presupuestoComida, double presupuestoMeseros, double presupuestoSalon, String cancionPrimerBaile,
                String menuCena, String nombreNovios, boolean tienePadrinos, String tipoCeremonia) {
        super(id, nombreEvento, fecha, lugar, numInvitados, numProveedores, temaColor, org); // Llama al constructor de Evento
        this.cancionPrimerBaile = cancionPrimerBaile; // Asigna la canción del primer baile
        this.menuCena = menuCena;                     // Asigna el menú de la cena
        this.nombreNovios = nombreNovios;             // Asigna el nombre de los novios
        this.tienePadrinos = tienePadrinos;           // Asigna si tiene padrinos
        this.tipoCeremonia = tipoCeremonia;           // Asigna el tipo de ceremonia
        this.presupuestoComida = presupuestoComida;   // Asigna el presupuesto de comida
        this.presupuestoMeseros = presupuestoMeseros; // Asigna el presupuesto de meseros
        this.presupuestoSalon = presupuestoSalon;     // Asigna el presupuesto del salón
    }
    // Métodos getter y setter para cada atributo
    public String getCancionPrimerBaile() { return cancionPrimerBaile; }
    public void setCancionPrimerBaile(String cancionPrimerBaile) { this.cancionPrimerBaile = cancionPrimerBaile; }
    public String getMenuCena() { return menuCena; }
    public void setMenuCena(String menuCena) { this.menuCena = menuCena; }
    public String getNombreNovios() { return nombreNovios; }
    public void setNombreNovios(String nombreNovios) { this.nombreNovios = nombreNovios; }
    public boolean isTienePadrinos() { return tienePadrinos; }
    public void setTienePadrinos(boolean tienePadrinos) { this.tienePadrinos = tienePadrinos; }
    public String getTipoCeremonia() { return tipoCeremonia; }
    public void setTipoCeremonia(String tipoCeremonia) { this.tipoCeremonia = tipoCeremonia; }
    public double getPresupuestoComida() { return presupuestoComida; }
    public void setPresupuestoComida(double presupuestoComida) { this.presupuestoComida = presupuestoComida; }
    public double getPresupuestoMeseros() { return presupuestoMeseros; }
    public void setPresupuestoMeseros(double presupuestoMeseros) { this.presupuestoMeseros = presupuestoMeseros; }
    public double getPresupuestoSalon() { return presupuestoSalon; }
    public void setPresupuestoSalon(double presupuestoSalon) { this.presupuestoSalon = presupuestoSalon; }
    // Métodos para manejar invitados
    public void agregarInvitados(ArrayList<Invitado> invitados){
        setInvitados(invitados); // Usa el setter de Evento para asignar la lista de invitados
    }
    public void eliminarInvitado(Invitado invitado){
        for (Invitado invitado1 : getInvitados()){ // Recorre la lista de invitados
            if (invitado1.getNombreInv().equals(invitado.getNombreInv())){ // Compara por nombre
                getInvitados().remove(invitado1); // Elimina si coincide
            }
        }
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
