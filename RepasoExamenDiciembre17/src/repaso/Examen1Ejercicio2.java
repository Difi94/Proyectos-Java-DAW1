/*
 * Descripcion: 
 * Autor: Juan Carlos
 * Fecha: 15/12/2025
 */
package repaso;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen1Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = 0;
        int fails = 0;
        boolean correct = false;

        do {
            System.out.println("Dime un año (entre 1801 y 2100) o -1 para salir:");
            try {
                year = sc.nextInt();

                if (year == -1) {
                    System.out.println("Cerrando programa");
                    break;
                }

                if (year < 1801 || year > 2100) {
                    fails++;
                    System.out.println("Año fuera de rango");
                } else {
                    correct = true;
                }

                if (fails == 3) {
                    System.out.println("Cerrando programa, has consumido el número máximo de intentos (3)");
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Introduce un número.");
                sc.next(); // limpiar buffer
                fails++;
            }

        } while (!correct);

        if (correct) {
        	
        	compararConActual(year);
            System.out.println(getSiglo(year));
        }

        sc.close();
    }

    public static String getSiglo(int year) {
        int siglo = (year - 1) / 100 + 1;
        return "Siglo " + aRomano(siglo);
    }

    private static String aRomano(int siglo) {
        String[] romano = {
            "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX",
            "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
            "XX", "XXI", "XXII"
        };
        return romano[siglo];
    }
    
    public static void compararConActual(int year) {
        int currentYear = java.time.Year.now().getValue();

        if (year == currentYear) {
            System.out.println("El año introducido coincide con el año actual (" + currentYear + ").");
        } else if (year < currentYear) {
            int diferencia = currentYear - year;
            System.out.println("El año es anterior al actual. Han pasado " + diferencia + " años.");
        } else {
            int diferencia = year - currentYear;
            System.out.println("El año es posterior al actual. Faltan " + diferencia + " años.");
        }
    }

}
