package Negocio;
import Util.Utilitario;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaEventos {
    Scanner sc = new Scanner(System.in);
    void crearBoda() { // REPETIR
        ArrayList<Invitado> invitados = new ArrayList<>();
        ArrayList<Proveedor> proveedor = new ArrayList<>();
        String id = String.valueOf(Utilitario.id++);
        System.out.println("\n=== CREAR NUEVA BODA ===");
        System.out.print("Nombre de la boda: ");
        String nombreEvento = sc.nextLine();

        System.out.print("Fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        System.out.print("Lugar: ");
        String lugar = sc.nextLine();

        System.out.print("Tema de color: ");
        String temaColor = sc.nextLine();

        int numInvitados = leerEntero("Número de invitados: ");

        System.out.println("\nDATOS DE LA BODA:");
        System.out.println("Ingrese el nombre de la cancion de entrada: ");
        String cancionPrimerBaile = sc.nextLine();
        System.out.println("Ingrese el menu de la noche: ");
        String menuCena = sc.nextLine();
        System.out.println("Ingrese el nombre de los novios:");
        String nombreNovios = sc.nextLine();
        System.out.println("Tiene padrinos (true or false)?");
        boolean tienePadrinos = sc.nextLine().equals("Si") ? true : false;
        System.out.println("Ingrese el tipo de ceremonia: ");
        String tipoCeremonia = sc.nextLine();

        // Datos del organizador (se ingresan por consola)
        System.out.println("\n--- DATOS DEL ORGANIZADOR ---");
        System.out.print("ID organizador: ");
        String idOrg = sc.nextLine();
        System.out.print("Nombre organizador: ");
        String nombreOrg = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        int experiencia = leerEntero("Años de experiencia: ");
        System.out.print("Contacto organizador: ");
        String contactoOrg = sc.nextLine();
        Organizador org = new Organizador(idOrg, nombreOrg, especialidad, experiencia, contactoOrg);
        int numProveedor = leerEntero("Número de proveedores: ");

        Boda boda = new Boda(id, nombreEvento, fecha,
                lugar, numInvitados,numProveedor, temaColor,
                org, cancionPrimerBaile,
                menuCena, nombreNovios, tienePadrinos, tipoCeremonia);
        Utilitario.eventos.add(boda);

    } // HASTA AQUI BODA

    public void crearListaInvitados(Evento evento){ // AUN NO SE USA
        ArrayList<Invitado> invitados = new ArrayList<>();
        for (int i = 0; i < evento.getNumInvitados(); i++) {
            System.out.println("\n--- DATOS DEL INVITADO  ---");
            System.out.print("ID invitado: ");
            String idInv = sc.nextLine();
            System.out.print("Nombre invitado: ");
            String nombreInv = sc.nextLine();
            System.out.print("Relación: ");
            String relacion = sc.nextLine();
            System.out.print("Mesa asignada: ");
            String mesaAsignada = sc.nextLine();
            Invitado inv = new Invitado(idInv, nombreInv, relacion, mesaAsignada);
            invitados.add(inv);
        }
        evento.setInvitados(invitados);
    }

    public void crearListaProveedores(Evento evento){ // NO REPETIR
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        for (int i = 0; i < evento.getNumProveedores(); i++) {
            System.out.println("\n--- DATOS DEL PROVEEDOR ---");
            System.out.print("ID proveedor: ");
            String idProv = sc.nextLine();
            System.out.print("Servicio: ");
            String servicio = sc.nextLine();
            System.out.print("Contacto proveedor: ");
            String contactoProv = sc.nextLine();
            double costo = leerDouble("Costo: $");
            boolean contratado = true; // Siempre true porque se está contratando
            Proveedor prov = new Proveedor(idProv, servicio, costo, contratado);
            proveedores.add(prov);
        }
        evento.setProveedores(proveedores);
    }

    void crearBautizo() { // REPETIR
        ArrayList<Invitado> invitados = new ArrayList<>();
        ArrayList<Proveedor> proveedor = new ArrayList<>();
        String id = String.valueOf(Utilitario.id++);
        System.out.println("\n=== CREAR NUEVO BAUTIZO ===");
        System.out.print("Nombre del bautizo: ");
        String nombreEvento = sc.nextLine();

        System.out.print("Fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        System.out.print("Lugar: ");
        String lugar = sc.nextLine();

        System.out.print("Tema de color: ");
        String temaColor = sc.nextLine();

        int numInvitados = leerEntero("Número de invitados: ");

        System.out.println("\nDATOS DEL BAUTIZO:"); //AQUI ME QUEDE
        System.out.println("\nIngrese el nombre del bebe: ");
        String nombreBebe = sc.nextLine();
        System.out.println("\nIngrese el nombre de los padrinos: ");
        String nombrePadrinos = sc.nextLine();
        System.out.println("Ingrese el nombre de la iglesia");
        String iglesia = sc.nextLine();
        System.out.println("Ingrese el nombre del sacerdote");
        String sacerdote = sc.nextLine();

        // Datos del organizador (se ingresan por consola)
        System.out.println("\n--- DATOS DEL ORGANIZADOR ---");
        System.out.print("ID organizador: ");
        String idOrg = sc.nextLine();
        System.out.print("Nombre organizador: ");
        String nombreOrg = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        int experiencia = leerEntero("Años de experiencia: ");
        System.out.print("Contacto organizador: ");
        String contactoOrg = sc.nextLine();
        Organizador org = new Organizador(idOrg, nombreOrg, especialidad, experiencia, contactoOrg);
        int numProveedor = leerEntero("Número de proveedores: ");

        Bautizo bautizo = new Bautizo(id, nombreEvento, fecha,
                lugar, numInvitados,numProveedor, temaColor,
                org, nombreBebe, nombrePadrinos, iglesia, sacerdote);
        Utilitario.eventos.add(bautizo);

    } // HASTA AQUI BODA

    void crearFiestaGraduacion() { // REPETIR
        ArrayList<Invitado> invitados = new ArrayList<>();
        ArrayList<Proveedor> proveedor = new ArrayList<>();
        String id = String.valueOf(Utilitario.id++);
        System.out.println("\n=== CREAR NUEVA GRADUACION ===");

        System.out.print("Nombre de la graduacion: ");
        String nombreEvento = sc.nextLine();

        System.out.print("Fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        System.out.print("Lugar: ");
        String lugar = sc.nextLine();

        System.out.print("Tema de color: ");
        String temaColor = sc.nextLine();

        int numInvitados = leerEntero("Número de invitados: ");

        System.out.println("\nDATOS DE LA GRADUACION:");
        System.out.println("\nIngrese el nombre del graduado: ");
        String nombreGraduado = sc.nextLine();
        System.out.println("\nIngrese la carrera del graduado: ");
        String carrera = sc.nextLine();
        System.out.println("Ingrese la universidad:");
        String universidad = sc.nextLine();
        System.out.println("Ingrese el tipo de ceremonia: ");
        String tipoCeremoniaAcademica = sc.nextLine();

        // Datos del organizador (se ingresan por consola)
        System.out.println("\n--- DATOS DEL ORGANIZADOR ---");
        System.out.print("ID organizador: ");
        String idOrg = sc.nextLine();
        System.out.print("Nombre organizador: ");
        String nombreOrg = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        int experiencia = leerEntero("Años de experiencia: ");
        System.out.print("Contacto organizador: ");
        String contactoOrg = sc.nextLine();
        Organizador org = new Organizador(idOrg, nombreOrg, especialidad, experiencia, contactoOrg);
        int numProveedor = leerEntero("Número de proveedores: ");

        FiestaGraduacion graduacion = new FiestaGraduacion(id, nombreEvento, fecha,
                lugar, numInvitados,numProveedor, temaColor,
                org, nombreGraduado,
                carrera, universidad, tipoCeremoniaAcademica);
        Utilitario.eventos.add(graduacion);

    } // HASTA AQUI GRADUACION

    void crearQuinceanera() { // REPETIR
        ArrayList<Invitado> invitados = new ArrayList<>();
        ArrayList<Proveedor> proveedor = new ArrayList<>();
        String id = String.valueOf(Utilitario.id++);
        System.out.println("\n=== CREAR NUEVA QUINCEAÑERA ===");

        System.out.print("Nombre de la quinceranera: ");
        String nombreEvento = sc.nextLine();

        System.out.print("Fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();

        System.out.print("Lugar: ");
        String lugar = sc.nextLine();

        System.out.print("Tema de color: ");
        String temaColor = sc.nextLine();

        int numInvitados = leerEntero("Número de invitados: ");

        System.out.println("\nDATOS DE LA QUINCEAÑERA:");
        System.out.println("\nIngrese el nombre de la cumpleañera: ");
        String nombreCumpleanera = sc.nextLine();
        System.out.println("\nIngrese el nombre de la cancion para el Vals: ");
        String cancionVals = sc.nextLine();
        System.out.println("Ingrese el color del vestido:");
        String vestidoColor = sc.nextLine();
        int numChambelanes = leerEntero("Ingrese el  numero de chambelanes:");

        // Datos del organizador (se ingresan por consola)
        System.out.println("\n--- DATOS DEL ORGANIZADOR ---");
        System.out.print("ID organizador: ");
        String idOrg = sc.nextLine();
        System.out.print("Nombre organizador: ");
        String nombreOrg = sc.nextLine();
        System.out.print("Especialidad: ");
        String especialidad = sc.nextLine();
        int experiencia = leerEntero("Años de experiencia: ");
        System.out.print("Contacto organizador: ");
        String contactoOrg = sc.nextLine();
        Organizador org = new Organizador(idOrg, nombreOrg, especialidad, experiencia, contactoOrg);
        int numProveedores = leerEntero("Número de proveedores: ");

        Quinceanera quinceanera = new Quinceanera(id, nombreEvento, fecha,
                lugar, numInvitados,numProveedores, temaColor,
                org, nombreCumpleanera,
                cancionVals, vestidoColor, numChambelanes);
        Utilitario.eventos.add(quinceanera);

    } // HASTA AQUI QUINCEANERA
    public void mostrarEventos(){ // PRUEBA
        int i=0;
        for (Evento evento : Utilitario.eventos){
        }
    }

    public void mostrarEventoss() {
        System.out.println("\n=== LISTA DE EVENTOS REGISTRADOS ===");
        if (Utilitario.eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        int i = 0;
        for (Evento evento : Utilitario.eventos) {
            System.out.println(i +". " + evento.getNombreEvento());
            i++;
        }
    }

    public void generarReportes() {
        System.out.println("\n=== REPORTES DE EVENTOS ===");

        if (Utilitario.eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        for (Evento evento : Utilitario.eventos) {
            System.out.println("\n-----------------------------------");
            System.out.println("ID: " + evento.getId());
            System.out.println("Nombre: " + evento.getNombreEvento());
            System.out.println("Fecha: " + evento.getFecha());
            System.out.println("Lugar: " + evento.getLugar());
            System.out.println("Tema de color: " + evento.getTemaColor());
            System.out.println("Organizador: " + evento.getOrg().getNombreOrg() +
                    " (" + evento.getOrg().getEspecialidad() + ")");
            System.out.println("Número de invitados: " + evento.getNumInvitados());

            // Mostrar invitados si existen
            if (evento.getInvitados() != null && !evento.getInvitados().isEmpty()) {
                System.out.println("Lista de invitados:");
                for (Invitado inv : evento.getInvitados()) {
                    System.out.println(" - " + inv.getNombreInv() + " (" + inv.getRelacion() + ")");
                }
            } else {
                System.out.println("No se han registrado invitados.");
            }

            // Mostrar proveedores si existen
            if (evento.getProveedores() != null && !evento.getProveedores().isEmpty()) {
                System.out.println("Lista de proveedores:");
                for (Proveedor prov : evento.getProveedores()) {
                    System.out.println(" - " + prov.getServicio() + " | $" + prov.getCosto());
                }
            } else {
                System.out.println("No se han registrado proveedores.");
            }
        }
        System.out.println("\n=== FIN DEL REPORTE ===");
    }


    // MÉTODOS AUXILIARES
    int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    double leerDouble(String mensaje) {
        System.out.print(mensaje);
        double numero = sc.nextDouble();
        sc.nextLine();
        return numero;
    }

    boolean leerBoolean(String mensaje) {
        System.out.print(mensaje);
        boolean valor = sc.nextBoolean();
        sc.nextLine();
        return valor;
    }

     void menu() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("    SISTEMA EVENTOS - MÓDULO 1 INTEGRADO");
        System.out.println("=".repeat(50));
        System.out.println("1. Crear evento");
        System.out.println("2. Gestionar Invitados por evento"); //aparte
        System.out.println("3. Gestionar Proveedores por evento");
        System.out.println("4. Generar reportes de eventos");
        System.out.println("0. Salir");
        System.out.println("-".repeat(50));
    }
}
