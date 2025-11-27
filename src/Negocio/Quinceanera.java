package Negocio;
public class Quinceanera extends Evento { // Declara la clase Quinceanera como subclase de Evento (hereda atributos y métodos comunes).
    private String nombreCumpleanera; // Nombre de la quinceañera (la persona que cumple 15 años).
    private String cancionVals; // Canción que se usará para el vals.
    private String vestidoColor;// Color del vestido de la quinceañera.
    private int numChambelanes; // Número de chambelanes que acompañarán a la quinceañera.
    public Quinceanera(String id, String nombreEvento, String fecha,
                       String lugar, int numInvitados, int numProveedores, String temaColor,
                       Organizador org, String nombreCumpleanera, String cancionVals, String vestidoColor, int numChambelanes){
        // Constructor: inicializa todos los atributos, incluyendo los heredados de Evento.
        super(id,nombreEvento,fecha,lugar,numInvitados,numProveedores, temaColor, org);
        // Llama al constructor de la clase padre (Evento) para inicializar los campos comunes.
        this.nombreCumpleanera = nombreCumpleanera; // Asigna el nombre de la quinceañera.
        this.cancionVals = cancionVals;             // Asigna la canción del vals.
        this.vestidoColor = vestidoColor;           // Asigna el color del vestido.
        this.numChambelanes = numChambelanes;       // Asigna el número de chambelanes.
    }
    public String getCancionVals() {
        return cancionVals;
    }// Devuelve la canción del vals.
    public void setCancionVals(String cancionVals) {
        this.cancionVals = cancionVals;
    }// Permite modificar la canción del vals.
    public String getNombreCumpleanera() {
        return nombreCumpleanera;
    }// Devuelve el nombre de la quinceañera.
    public void setNombreCumpleanera(String nombreCumpleanera) {
        this.nombreCumpleanera = nombreCumpleanera;
    } // Permite modificar el nombre de la quinceañera.
    public int getNumChambelanes() {
        return numChambelanes;
    } // Devuelve el número de chambelanes.
    public void setNumChambelanes(int numChambelanes) {
        this.numChambelanes = numChambelanes;
    } // Permite modificar el número de chambelanes.
    public String getVestidoColor() {
        return vestidoColor;
    } // Devuelve el color del vestido.
    public void setVestidoColor(String vestidoColor) {
        this.vestidoColor = vestidoColor;
    } // Permite modificar el color del vestido.
    @Override  // Sobrescribe el metodo toString para mostrar los datos de la quinceañera en formato legible.
    public String toString() {
        return super.toString();
    }
}
