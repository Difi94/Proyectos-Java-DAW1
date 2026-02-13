package ejercicio2;

import java.time.LocalDate;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Crear coche con valores válidos
        Coche coche1 = new Coche("1234 ABC", "Juan Pérez",
                LocalDate.of(2020, 5, 10));

        System.out.println(coche1);

        // testear valores no válidos
        try {
            Coche coche2 = new Coche("12A4 ABC", "", 
                    LocalDate.of(2022, 3, 15), -2000, -150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }

        // crear deportivo por método
        Deportivo deportivo = obtenerDeportivo();
        System.out.println("\nDeportivo creado:");
        System.out.println(deportivo);
    }

    public static Deportivo obtenerDeportivo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Matrícula (9999 AAA): ");
        String matricula = sc.nextLine();

        System.out.print("Nombre propietario: ");
        String propietario = sc.nextLine();

        System.out.print("Fecha matriculación (AAAA-MM-DD): ");
        LocalDate fecha = LocalDate.parse(sc.nextLine());

        System.out.print("Cilindrada: ");
        int cilindrada = sc.nextInt();

        System.out.print("Potencia: ");
        int potencia = sc.nextInt();
        sc.nextLine();

        System.out.print("Tracción (total/delantera): ");
        String traccion = sc.nextLine();

        return new Deportivo(matricula, propietario, fecha,
                cilindrada, potencia, traccion);
    }
}

