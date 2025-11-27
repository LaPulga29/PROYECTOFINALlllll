package Negocio;
import Util.Utilitario; // Importa la clase Utilitario, que contiene la lista global de eventos
import java.util.ArrayList; // Importa ArrayList para manejar listas dinámicas de invitados y proveedores.
import java.util.Scanner; // Importa Scanner para leer datos desde la consola.

public class SistemaEventos {
    Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer entradas del usuario desde la consola.
    // ---------------- CREACIÓN DE EVENTOS ----------------
    void crearBoda() {
        // Inicializa listas vacías de invitados y proveedores
        String id = String.valueOf(Utilitario.id++); // Genera un ID único para la boda usando el contador global de Utilitario.
        System.out.println("\n=== CREAR NUEVA BODA ===");
        System.out.print("Nombre de la boda: ");
        String nombreEvento = sc.nextLine();
        System.out.print("Fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();
        System.out.print("Lugar: ");
        String lugar = sc.nextLine();
        System.out.print("Tema de color: ");
        String temaColor = sc.nextLine();
        int numInvitados = leerEntero("Número de invitados contemplados: ");
        System.out.print("Presupuesto para comida: $");
        double presupuestoComida = sc.nextDouble();
        System.out.print("Presupuesto para catering: $");
        double presupuestoCatering = sc.nextDouble();
        System.out.print("Presupuesto para salón: $");
        double presupuestoSalon = sc.nextDouble();

        System.out.println("\nDATOS ADICIONALES DE LA BODA:");
        sc.nextLine();  // Limpia el buffer después de leer números.
        System.out.println("Ingrese el nombre de la cancion de entrada: ");
        String cancionPrimerBaile = sc.nextLine();
        System.out.println("Ingrese preferencias para el menu de la noche: ");
        String menuCena = sc.nextLine();
        System.out.println("Ingrese el nombre de los novios:");
        String nombreNovios = sc.nextLine();
        System.out.println("Tiene padrinos (true or false)?");
        boolean tienePadrinos = sc.nextLine().equals("Si") ? true : false; // Pide si tiene padrinos y convierte la respuesta en booleano.
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
        // Crea el objeto organizador con los datos ingresados.
        int numProveedor = 0;

        Boda boda = new Boda(id, nombreEvento, fecha,
                lugar, numInvitados, numProveedor, temaColor,
                org, presupuestoComida,
                presupuestoCatering, presupuestoSalon, cancionPrimerBaile,
                menuCena, nombreNovios, tienePadrinos, tipoCeremonia);
        // Crea el objeto Boda con todos los datos recopilados.
        Utilitario.eventos.add(boda); // Agrega la boda a la lista global de eventos.
    } // HASTA AQUI BODA

    void crearBautizo() { // REPETIR
        String id = String.valueOf(Utilitario.id++); // id
        System.out.println("\n=== CREAR NUEVO BAUTIZO ===");
        System.out.print("Nombre del bautizo: ");
        String nombreEvento = sc.nextLine();
        System.out.print("Fecha (dd/mm/aaaa): ");
        String fecha = sc.nextLine();
        System.out.print("Lugar: ");
        String lugar = sc.nextLine();
        System.out.print("Tema de color: ");
        String temaColor = sc.nextLine();
        int numInvitados = leerEntero("Número de invitados contemplado: ");
        System.out.print("Presupuesto para comida: $");
        double presupuestoComida = sc.nextDouble();
        System.out.print("Presupuesto para catering: $");
        double presupuestoCatering = sc.nextDouble();
        System.out.print("Presupuesto para salón: $");
        double presupuestoSalon = sc.nextDouble();

        System.out.println("\nDATOS ADICIONALES DEL BAUTIZO:");
        sc.nextLine();
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
        Organizador org = new Organizador(idOrg, nombreOrg, especialidad, experiencia, contactoOrg); // crea el objeto organizador
        int numProveedor = 0;
        Bautizo bautizo = new Bautizo(id, nombreEvento, fecha,
                lugar, numInvitados,numProveedor, temaColor,
                org, nombreBebe, nombrePadrinos, iglesia, sacerdote);// Crea el objeto Bautizo con todos los datos recopilados.
        Utilitario.eventos.add(bautizo); // agrega la lista al evento
    } // HASTA AQUI BAUTIZO


    void crearFiestaGraduacion() { // REPETIR
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
        System.out.print("Presupuesto para comida: $");
        double presupuestoComida = sc.nextDouble();
        System.out.print("Presupuesto para catering: $");
        double presupuestoCatering = sc.nextDouble();
        System.out.print("Presupuesto para salón: $");
        double presupuestoSalon = sc.nextDouble();


        System.out.println("\nDATOS ADICIONALES DE LA GRADUACION:");
        sc.nextLine();
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
        int numProveedor =0;

        FiestaGraduacion graduacion = new FiestaGraduacion(id, nombreEvento, fecha,
                lugar, numInvitados,numProveedor, temaColor,
                org, nombreGraduado,
                carrera, universidad, tipoCeremoniaAcademica);
        Utilitario.eventos.add(graduacion);
    } // HASTA AQUI GRADUACION


    void crearQuinceanera() { // REPETIR
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
        System.out.print("Presupuesto para comida: $");
        double presupuestoComida = sc.nextDouble();
        System.out.print("Presupuesto para catering: $");
        double presupuestoCatering = sc.nextDouble();
        System.out.print("Presupuesto para salón: $");
        double presupuestoSalon = sc.nextDouble();

        System.out.println("\nDATOS ADICIONALES DE LA QUINCEANERA:");
        sc.nextLine();
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

    public void crearListaInvitados(Evento evento){ // AUN NO SE USA
        ArrayList<Invitado> invitados = new ArrayList<>(); // Inicializa lista de invitados.
        for (int i = 0; i < evento.getNumInvitados(); i++) { // Itera según el número de invitados contemplados.
            System.out.println("\n--- DATOS DEL INVITADO  ---");
            System.out.print("ID invitado: ");
            String idInv = sc.nextLine();
            System.out.print("Nombre invitado: ");
            String nombreInv = sc.nextLine();
            System.out.print("Relación: ");
            String relacion = sc.nextLine();
            System.out.print("Mesa asignada: ");
            String mesaAsignada = sc.nextLine();
            Invitado inv = new Invitado(idInv, nombreInv, relacion, mesaAsignada);// Crea el objeto Invitado.
            invitados.add(inv); // Lo agrega a la lista.
        }
        evento.setInvitados(invitados); // Asigna la lista al evento.
    }

    public void crearListaProveedores(Evento evento){ // NO REPETIR
        ArrayList<Proveedor> proveedores = new ArrayList<>(); // Inicializa lista de proveedores.
        for (int i = 0; i < evento.getNumProveedores(); i++) { // Itera según el número de proveedores contemplados.
            System.out.println("\n--- DATOS DEL PROVEEDOR ---");
            System.out.print("ID proveedor: ");
            String idProv = sc.nextLine();
            System.out.print("Servicio: ");
            String servicio = sc.nextLine();
            System.out.print("Contacto proveedor: ");
            String contactoProv = sc.nextLine();
            double costo = leerDouble("Costo: $");
            boolean contratado = true; // Siempre true porque se está contratando
            Proveedor prov = new Proveedor(idProv, servicio, costo, contratado); // Crea el objeto Proveedor.
            proveedores.add(prov);  // Lo agrega a la lista.
        }
        evento.setProveedores(proveedores); // Asigna la lista al evento.
    }

    public void gestionDeInvitados() {
        System.out.println("Seleccione el evento que desea gestionar:");
        mostrarEventoss();
        System.out.print(">> ");
        int numEvento = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        if (numEvento >= 0 && numEvento < Utilitario.eventos.size()) {
            Evento eventoSeleccionado = Utilitario.eventos.get(numEvento); // evento seleccionado puede apuntar a cualquier objeto que herede de Evento
            // Obtiene el evento seleccionado según el índice.

            System.out.println("\n--- GESTIÓN DE INVITADOS ---");
            System.out.println("1. Agregar invitado");
            System.out.println("2. Buscar invitado por nombre");
            System.out.println("3. Buscar invitado por mesa asignada");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    // Mostrar número contemplado
                    System.out.println("Han sido contemplados " + eventoSeleccionado.getNumInvitados() + " invitados.");
                    System.out.print("¿Cuántos quieres agregar ahora?: ");
                    int cantidad = sc.nextInt();
                    sc.nextLine();

                    if (eventoSeleccionado.getInvitados() == null) { //llama al metodo get de la case invitado y ve si no apunta a nada
                        eventoSeleccionado.setInvitados(new ArrayList<>()); //se inicializa con una nueva lista vacia
                    }

                    for (int i = 0; i < cantidad; i++) {
                        System.out.println("\n--- Invitado " + (i + 1) + " ---");
                        System.out.print("ID del invitado: ");
                        String idInv = sc.nextLine();
                        System.out.print("Nombre del invitado: ");
                        String nombreInv = sc.nextLine();
                        System.out.print("Relación con el anfitrión: ");
                        String relacion = sc.nextLine();
                        System.out.print("Mesa asignada: ");
                        String mesa = sc.nextLine();
                        System.out.print("¿Confirmó asistencia? (true/false): ");
                        boolean asistencia = sc.nextBoolean();
                        sc.nextLine();

                        Invitado nuevoInvitado = new Invitado(idInv, nombreInv, relacion, mesa); //crea el objeto con datos recopilados
                        eventoSeleccionado.getInvitados().add(nuevoInvitado); //lo guarda en el evento seleccionado como nuevo invitado
                    }
                    System.out.println("Se agregaron " + cantidad + " invitados al evento.");
                    break;

                case 2:
                    System.out.print("Ingrese el nombre del invitado: ");
                    String nombreBuscar = sc.nextLine();
                    boolean encontrado = false;
                    if (eventoSeleccionado.getInvitados() != null) {
                        for (Invitado inv : eventoSeleccionado.getInvitados()) {
                            if (inv.getNombreInv().equals(nombreBuscar)) { // sin equalsIgnoreCase
                                System.out.println("Invitado encontrado: " + inv.getNombreInv() +
                                        " | Mesa: " + inv.getMesaAsignada());
                                encontrado = true;
                            }
                        }
                    }
                    if (!encontrado) {
                        System.out.println("Invitado no encontrado.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la mesa asignada: ");
                    String mesaBuscar = sc.nextLine();
                    boolean hallado = false;
                    if (eventoSeleccionado.getInvitados() != null) {
                        for (Invitado inv : eventoSeleccionado.getInvitados()) {
                            if (inv.getMesaAsignada().equals(mesaBuscar)) { // sin equalsIgnoreCase
                                System.out.println("Invitado en mesa " + mesaBuscar + ": " + inv.getNombreInv());
                                hallado = true;
                            }
                        }
                    }
                    if (!hallado) {
                        System.out.println("No se encontraron invitados en esa mesa.");
                    }
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } else {
            System.out.println("Número de evento inválido.");
        }
    } //HASTA AQUI GESTION DE INVITADOS


    public void gestionDeProveedores() {
        System.out.println("Seleccione el evento que desea gestionar (la lista inicia en 0):");
        mostrarEventoss();
        System.out.print(">> ");
        int numEvento = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        if (numEvento < 0 || numEvento >= Utilitario.eventos.size()) {
            System.out.println("Número de evento inválido.");
            return;
        }

        Evento eventoSeleccionado = Utilitario.eventos.get(numEvento);

        // Asegurar lista inicializada
        if (eventoSeleccionado.getProveedores() == null) { //llama al metodo get de la case proveedor y ve si no apunta a nada
            eventoSeleccionado.setProveedores(new ArrayList<>()); // se inicializa con una lista vacia
            // Asegura que la lista de proveedores esté inicializada.
        }

        System.out.println("\n--- GESTIÓN DE PROVEEDORES ---");
        System.out.println("Proveedores contemplados: " + eventoSeleccionado.getNumProveedores());
        System.out.println("Proveedores registrados actualmente: " + eventoSeleccionado.getProveedores().size());
        System.out.println("1. Agregar proveedor");
        System.out.println("2. Buscar proveedor por servicio");
        System.out.println("3. Buscar proveedor por precio");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("¿Cuántos proveedores quieres agregar ahora?: ");
                int cantidad = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < cantidad; i++) {
                    System.out.println("\n--- Proveedor " + (i + 1) + " ---");
                    System.out.print("ID proveedor: ");
                    String idProv = sc.nextLine();
                    System.out.print("Servicio: ");
                    String servicio = sc.nextLine();
                    System.out.print("Contacto proveedor: ");
                    String contactoProv = sc.nextLine();
                    System.out.print("Costo: $");
                    double costo = sc.nextDouble();
                    sc.nextLine();

                    Proveedor nuevoProveedor = new Proveedor( servicio, contactoProv, costo, true);
                    eventoSeleccionado.getProveedores().add(nuevoProveedor);
                }
                System.out.println("Se agregaron " + cantidad + " proveedor(es).");
                break;

            case 2:
                if (eventoSeleccionado.getProveedores().isEmpty()) {
                    System.out.println("No hay proveedores registrados para buscar.");
                    break;
                }
                System.out.print("Ingrese el servicio a buscar: ");
                String servicioBuscar = sc.nextLine();
                boolean encontrado = false;

                for (Proveedor prov : eventoSeleccionado.getProveedores()) {
                    if (prov.getServicio().equals(servicioBuscar)) {
                        System.out.println("Proveedor encontrado: " + prov.getServicio() +
                                " | Contacto: " + prov.getContacto() +
                                " | Costo: $" + prov.getCosto());
                        encontrado = true;
                    }
                }
                if (!encontrado) {
                    System.out.println("Proveedor no encontrado.");
                }
                break;
            case 3:
                if (eventoSeleccionado.getProveedores().isEmpty()) {
                    System.out.println("No hay proveedores registrados para buscar.");
                    break;
                }
                System.out.print("Ingrese el costo a buscar: $");
                double precioBuscar = sc.nextDouble();
                sc.nextLine();
                boolean hallado = false;
                for (Proveedor prov : eventoSeleccionado.getProveedores()) {
                    if (prov.getCosto() == precioBuscar) {
                        System.out.println("Proveedor con costo $" + precioBuscar + ": " + prov.getContacto() +
                                " | Contacto: " + prov.getServicio());
                        hallado = true;
                    }
                }
                if (!hallado) {
                    System.out.println("No se encontraron proveedores con ese precio.");
                }
                break;

            default:
                System.out.println("Opción inválida.");
        }
    } // HASTA AQUI GESTION DE PROVEEEDORES

    public void buscarEventos() {
        System.out.println("\n--- BÚSQUEDA DE EVENTOS ---");
        System.out.println("1. Buscar por tipo de evento");
        System.out.println("2. Buscar por fecha");
        System.out.println("3. Buscar por lugar");
        System.out.print("Seleccione una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el tipo de evento (Boda, Bautizo, Graduacion, Quinceañera): ");
                String tipoBuscar = sc.nextLine();
                boolean encontradoTipo = false; // Pide el tipo de evento y prepara un boolean para saber si se encuentra.
                for (Evento evento : Utilitario.eventos) { // Recorre todos los eventos registrados.
                    if (evento.getClass().getSimpleName().equalsIgnoreCase(tipoBuscar)) { // Compara el nombre de la clase del evento con lo ingresado
                        // getclass devuelve la clase real del objeto en tiempo de ejecución.
                        // getsimple Devuelve el nombre simple de la clase, sin el paquete.
                        //Compara el nombre de la clase con la cadena que ingresó el usuario,
                        System.out.println("Evento encontrado: " + evento.getNombreEvento() +
                                " | Fecha: " + evento.getFecha() +
                                " | Lugar: " + evento.getLugar());
                        encontradoTipo = true;
                    }
                }
                if (!encontradoTipo) { //si no se encontro ningun evento
                    System.out.println("No se encontraron eventos de tipo " + tipoBuscar);
                }
                break;

            case 2:
                System.out.print("Ingrese la fecha (dd/mm/aaaa): ");
                String fechaBuscar = sc.nextLine();
                boolean encontradoFecha = false;
                for (Evento evento : Utilitario.eventos) {  // Recorre todos los eventos registrados.
                    if (evento.getFecha().equals(fechaBuscar)) {
                        // getFecha devuelve la fecha del evento en forma de String.
                        // equals Es un metodo de la clase String que compara el contenido textual de dos cadenas.
                        // Si la fecha del evento es igual a la fecha que el usuario escribió
                        System.out.println("Evento encontrado: " + evento.getNombreEvento() +
                                " | Tipo: " + evento.getClass().getSimpleName() +
                                " | Lugar: " + evento.getLugar());
                        encontradoFecha = true;
                    }
                }
                if (!encontradoFecha) { //si no se encuentra
                    System.out.println("No se encontraron eventos en la fecha " + fechaBuscar);
                }
                break;

            case 3:
                System.out.print("Ingrese el lugar: ");
                String lugarBuscar = sc.nextLine();
                boolean encontradoLugar = false;
                for (Evento evento : Utilitario.eventos) {
                    if (evento.getLugar().equalsIgnoreCase(lugarBuscar)) {
                        System.out.println("Evento encontrado: " + evento.getNombreEvento() +
                                " | Tipo: " + evento.getClass().getSimpleName() +
                                " | Fecha: " + evento.getFecha());
                        encontradoLugar = true;
                    }
                }
                if (!encontradoLugar) {
                    System.out.println("No se encontraron eventos en el lugar " + lugarBuscar);
                }
                break;

            default:
                System.out.println("Opción inválida.");
        }
    } // HASTA AQUI BUSCAR EVENTOS

    public void mostrarEventoss() {
        System.out.println("\n=== LISTA DE EVENTOS REGISTRADOS ===");
        if (Utilitario.eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        int i = 0;
        for (Evento evento : Utilitario.eventos) { //recorre la lista
            System.out.println(i +". " + evento.getNombreEvento());
            // Imprime el índice seguido del nombre del evento (para que el usuario seleccione por número).
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
        System.out.print(mensaje);// Metodo auxiliar para leer un entero desde consola con mensaje previo.
        int numero = sc.nextInt();
        sc.nextLine();
        return numero;
    }

    double leerDouble(String mensaje) {
        System.out.print(mensaje);
        double numero = sc.nextDouble();
        sc.nextLine();
        return numero; // Devuelve el número leído.
    }

    boolean leerBoolean(String mensaje) {
        System.out.print(mensaje);
        boolean valor = sc.nextBoolean();
        sc.nextLine();
        return valor;
    }

     void menu() {
        System.out.println("    SISTEMA EVENTOS - MÓDULO 1 INTEGRADO");
        System.out.println("=".repeat(50));
        System.out.println("1. Crear evento");
        System.out.println("2. Gestionar Invitados por evento"); //aparte
        System.out.println("3. Gestionar Proveedores por evento");
         System.out.println("5.Busque de eventos");
        System.out.println("5. Generar reportes de eventos");
        System.out.println("0. Salir");
    }
}
