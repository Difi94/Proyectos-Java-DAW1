package ejercicio2;

import java.time.LocalDate;
import java.util.*;

public class Main {

    static LinkedList<Contacto> agenda = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        generarContactosAleatorios();

        int opcion;
        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    ingresarContacto();
                    break;
                case 2:
                    consultarContacto();
                    break;
                case 3:
                    mostrarOrdenados();
                    break;
                case 4:
                    buscarPorAnio();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 0);
    }

    // ---------------- MENÚ ----------------
    static void mostrarMenu() {
        System.out.println("\n--- AGENDA ---");
        System.out.println("1. Ingresar contacto");
        System.out.println("2. Consultar por nombre");
        System.out.println("3. Mostrar contactos ordenados");
        System.out.println("4. Buscar por año de nacimiento");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    // ---------------- OPCIÓN A ----------------
    static void ingresarContacto() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        String telefono;
        do {
            System.out.print("Teléfono: ");
            telefono = sc.nextLine();
        } while (telefonoExiste(telefono));

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Año nacimiento: ");
        int anio = sc.nextInt();
        System.out.print("Mes: ");
        int mes = sc.nextInt();
        System.out.print("Día: ");
        int dia = sc.nextInt();
        sc.nextLine();

        LocalDate fecha = LocalDate.of(anio, mes, dia);

        agenda.add(new Contacto(nombre, telefono, email, fecha));
    }

    // ---------------- VALIDACIÓN ----------------
    static boolean telefonoExiste(String telefono) {
        for (Contacto c : agenda) {
            if (c.getTelefono().equals(telefono)) {
                System.out.println("Teléfono ya existe, intenta otro.");
                return true;
            }
        }
        return false;
    }

    // ---------------- OPCIÓN B ----------------
    static void consultarContacto() {
        System.out.print("Introduce nombre: ");
        String nombre = sc.nextLine();

        boolean encontrado = false;

        for (Contacto c : agenda) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("\n" + c);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró el contacto.");
        }
    }

    // ---------------- OPCIÓN C ----------------
    static void mostrarOrdenados() {
        List<Contacto> copia = new ArrayList<>(agenda);

        copia.sort(Comparator.comparing(Contacto::getNombre));

        for (Contacto c : copia) {
            System.out.println("\n" + c);
        }
    }

    // ---------------- OPCIÓN D ----------------
    static void buscarPorAnio() {
        System.out.print("Introduce año: ");
        int anio = sc.nextInt();

        boolean encontrado = false;

        for (Contacto c : agenda) {
            if (c.getFechaNacimiento().getYear() == anio) {
                System.out.println("\n" + c);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay contactos en ese año.");
        }
    }

    // ---------------- GENERACIÓN ALEATORIA ----------------
    static void generarContactosAleatorios() {
        String[] nombres = {"Ana", "Luis", "Carlos", "Marta", "Sofía", "Pedro", "Lucía", "Jorge"};
        int cantidad = rand.nextInt(11) + 20; // 20 a 30

        for (int i = 0; i < cantidad; i++) {

            String nombre = nombres[rand.nextInt(nombres.length)] + i;

            String telefono;
            do {
                telefono = "6" + (10000000 + rand.nextInt(90000000));
            } while (telefonoExiste(telefono));

            String email = nombre.toLowerCase() + "@mail.com";

            int anio = 1980 + rand.nextInt(30);
            int mes = 1 + rand.nextInt(12);
            int dia = 1 + rand.nextInt(28);

            LocalDate fecha = LocalDate.of(anio, mes, dia);

            agenda.add(new Contacto(nombre, telefono, email, fecha));
        }
    }
}
