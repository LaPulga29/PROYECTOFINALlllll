package Negocio;                       // Declara el paquete donde vive esta clase
import java.util.ArrayList;            // Importación (no usada aquí directamente, pero disponible)
import java.util.List;                 // Importación (no usada aquí directamente, pero disponible)
import java.util.Scanner;              // Importación (no usada aquí directamente, pero disponible)
public class Bautizo extends Evento {  // Define la clase Bautizo que hereda de Evento
    private String nombreBebe;         // Atributo: nombre del bebé bautizado
    private String nombrePadrinos;     // Atributo: nombres de los padrinos
    private String iglesia;            // Atributo: iglesia donde se realiza el bautizo
    private String sacerdote;          // Atributo: nombre del sacerdote que oficia
    public Bautizo(String id, String nombreEvento, String fecha,        // Constructor con parámetros
                   String lugar, int numInvitados, int numProveedores, String temaColor,
                   Organizador org, String nombreBebe, String nombrePadrinos, String iglesia, String sacerdote){
        super(id,nombreEvento,fecha,lugar,numInvitados,numProveedores, temaColor,org); // Llama al constructor de Evento
        this.nombreBebe = nombreBebe;             // Asigna el nombre del bebé al atributo de la clase
        this.nombrePadrinos = nombrePadrinos;     // Asigna los padrinos al atributo de la clase
        this.iglesia = iglesia;                   // Asigna la iglesia al atributo de la clase
        this.sacerdote = sacerdote;               // Asigna el sacerdote al atributo de la clase
    }
    public String getIglesia() {       // Getter: devuelve la iglesia
        return iglesia;                // Retorna el valor del atributo iglesia
    }
    public void setIglesia(String iglesia) { // Setter: actualiza la iglesia
        this.iglesia = iglesia;              // Asigna el nuevo valor al atributo iglesia
    }
    public String getNombreBebe() {   // Getter: devuelve el nombre del bebé
        return nombreBebe;            // Retorna el valor del atributo nombreBebe
    }
    public void setNombreBebe(String nombreBebe) { // Setter: actualiza el nombre del bebé
        this.nombreBebe = nombreBebe;              // Asigna el nuevo valor al atributo nombreBebe
    }
    public String getNombrePadrinos() { // Getter: devuelve los nombres de los padrinos
        return nombrePadrinos;          // Retorna el valor del atributo nombrePadrinos
    }
    public void setNombrePadrinos(String nombrePadrinos) { // Setter: actualiza los padrinos
        this.nombrePadrinos = nombrePadrinos;              // Asigna el nuevo valor al atributo nombrePadrinos
    }
    public String getSacerdote() {   // Getter: devuelve el nombre del sacerdote
        return sacerdote;            // Retorna el valor del atributo sacerdote
    }
    public void setSacerdote(String sacerdote) { // Setter: actualiza el sacerdote
        this.sacerdote = sacerdote;              // Asigna el nuevo valor al atributo sacerdote
    }
    @Override
    public String toString() {        // Sobrescribe toString para representación en texto
        return super.toString();      // Delegación: usa la representación textual de Evento
    }
}
