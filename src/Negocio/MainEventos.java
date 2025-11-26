package Negocio;
import Util.Utilitario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MainEventos {
    static List<Evento> listado = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){
        SistemaEventos sistema = new SistemaEventos();
        int opc;
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
                    System.out.println("Seleccione el evento en el que desea agregar invitados: ");
                    sistema.mostrarEventoss();
                    System.out.println(">> ");
                    int num = sc.nextInt();
                    sistema.crearListaInvitados(Utilitario.eventos.get(num));
                    break;
                case 3:
                    System.out.println("Seleccione el evento que desea gestionar los proveedores:");
                    sistema.mostrarEventoss(); // lista resumida
                    System.out.print(">> ");
                    int num1 = sc.nextInt();
                    sistema.crearListaProveedores(Utilitario.eventos.get(num1));
                    break;
                case 4:
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
