package Negocio;                  // Declara que este archivo pertenece al paquete "Negocio", organizando las clases por módulos.
import Util.Utilitario;           // Importa la clase Utilitario desde el paquete Util (posible clase de ayuda: validaciones, formatos, etc.).
import java.util.ArrayList;       // Importa ArrayList, implementación de lista redimensionable.
import java.util.List;            // Importa la interfaz List, para programar contra la abstracción.
import java.util.Scanner;         // Importa Scanner, para leer entrada desde consola.
public class MainEventos {        // Define la clase pública MainEventos, punto de entrada del programa.
    static List<Evento> listado = new ArrayList<>(); // Crea una lista estática de eventos, accesible desde toda la clase.
    static Scanner sc = new Scanner(System.in);      // Crea un Scanner estático para leer entradas de usuario en consola.
    public static void main (String[] args){         // Metodo main: punto de arranque de la aplicación.
        SistemaEventos sistema = new SistemaEventos();// Instancia el sistema de eventos.
        int opc;                                      // Declara una variable para opciones de menú (aún no usada).
        do {
            sistema.menu();
            opc = sistema.leerEntero("Seleccione una opción: ");
            switch(opc) {
                case 1:
                    //crearEventoCompleto();
                    System.out.println("1.Boda");
                    System.out.println("2.Grado");
                    System.out.println("3.Bautizo");
                    System.out.println("4.Quinceañera");
                    System.out.println(">> ");
                    int opc2 = sc.nextInt();
                    switch (opc2){
                        case 1:
                            sistema.crearBoda();
                            break;
                        case 2:
                            sistema.crearFiestaGraduacion();
                            break;
                        case 3:
                            sistema.crearBautizo();
                            break;
                        case 4:
                            sistema.crearQuinceanera();
                            break;
                    }
                    break;
                case 2:
                    sistema.gestionDeInvitados();
                    break;
                case 3:
                    sistema.gestionDeProveedores();
                    break;
                case 4:
                    sistema.buscarEventos();
                    break;
                case 5:
                    sistema.generarReportes();
                    break;
                case 0:
                    System.out.println("¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while(opc != 0);
    }
}
