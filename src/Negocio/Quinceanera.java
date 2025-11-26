package Negocio;

public class Quinceanera extends Evento {
    private String nombreCumpleanera;
    private String cancionVals;
    private String vestidoColor;
    private int numChambelanes;
    public Quinceanera(String id, String nombreEvento, String fecha,
                       String lugar, int numInvitados, int numProveedores, String temaColor,
                       Organizador org, String nombreCumpleanera, String cancionVals, String vestidoColor, int numChambelanes){
        super(id,nombreEvento,fecha,lugar,numInvitados,numProveedores, temaColor, org);
        this.nombreCumpleanera = nombreCumpleanera;
        this.cancionVals = cancionVals;
        this.vestidoColor = vestidoColor;
        this.numChambelanes = numChambelanes;
    }
    public String getCancionVals() {
        return cancionVals;
    }
    public void setCancionVals(String cancionVals) {
        this.cancionVals = cancionVals;
    }
    public String getNombreCumpleanera() {
        return nombreCumpleanera;
    }
    public void setNombreCumpleanera(String nombreCumpleanera) {
        this.nombreCumpleanera = nombreCumpleanera;
    }
    public int getNumChambelanes() {
        return numChambelanes;
    }
    public void setNumChambelanes(int numChambelanes) {
        this.numChambelanes = numChambelanes;
    }
    public String getVestidoColor() {
        return vestidoColor;
    }
    public void setVestidoColor(String vestidoColor) {
        this.vestidoColor = vestidoColor;
    }
    @Override
    public String toString() {
        return "Quinceanera" +
                "\nNombre de la quinceanera: " + nombreCumpleanera +
                "\nCancion del Vals: " + cancionVals +
                "\nColor del vestido: " + vestidoColor +
                "\nNumero de chambelanes: " + numChambelanes;
    }
}
