package ejercicio2;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.InputMismatchException;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anio = 0, mes = 0, dia = 0;
        boolean valido = false;

        // ---------- PEDIR AÑO ----------
        do {
            try {
                System.out.print("Introduce el año de nacimiento (1900 - año actual): ");
                anio = sc.nextInt();
                int actual = LocalDate.now().getYear();

                if (anio >= 1900 && anio <= actual) {
                    valido = true;
                } else {
                    System.out.println("❌ El año debe estar entre 1900 y " + actual);
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Debes introducir un número entero.");
                sc.nextLine(); // limpiar buffer
            }
        } while (!valido);

        // ---------- PEDIR MES ----------
        valido = false;
        do {
            try {
                System.out.print("Introduce el mes de nacimiento (1-12): ");
                mes = sc.nextInt();

                if (mes >= 1 && mes <= 12) {
                    valido = true;
                } else {
                    System.out.println("❌ El mes debe estar entre 1 y 12.");
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Debes introducir un número entero.");
                sc.nextLine();
            }
        } while (!valido);

        // ---------- PEDIR DÍA ----------
        valido = false;
        do {
            try {
                System.out.print("Introduce el día de nacimiento: ");
                dia = sc.nextInt();

                // Validación usando LocalDate
                LocalDate.of(anio, mes, dia); // si es incorrecto lanzará excepción
                valido = true;

            } catch (InputMismatchException e) {
                System.out.println("❌ Debes introducir un número entero.");
                sc.nextLine();
            } catch (DateTimeException e) {
                System.out.println("❌ Día inválido para ese mes y año.");
            }
        } while (!valido);

        // ---------- FECHA DE NACIMIENTO ----------
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        DayOfWeek diaSemana = fechaNacimiento.getDayOfWeek();

        System.out.println("\nTu cumpleaños cayó en un " + diaSemana + ".");

        // ---------- RECORRER AÑOS ----------
        int actual = LocalDate.now().getYear();
        int contador = 0;

        System.out.println("\nAños en los que ha caído en el mismo día de la semana:");

        for (int year = anio; year <= actual; year++) {

            // evitar 29 de febrero en años no bisiestos
            if (mes == 2 && dia == 29 && !LocalDate.of(year, 1, 1).isLeapYear()) {
                continue; // saltar este año
            }

            LocalDate fecha;
            try {
                fecha = LocalDate.of(year, mes, dia);
            } catch (DateTimeException e) {
                continue;
            }

            if (fecha.getDayOfWeek().equals(diaSemana)) {
                contador++;
                System.out.println(" - " + fecha.format(java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy")));
            }
        }

        // ---------- RESULTADO ----------
        System.out.println("\nNúmero total de veces que ha caído en " + diaSemana + ": " + contador);
    }
}
