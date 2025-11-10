/*
 * Descripcion: Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
 * distintas opciones:
 * a. Mostrar valores.
 * b. Introducir valor.
 * c. Salir.
 * La opción ‘a’ mostrará todos los valores por pantalla. 
 * La opción ‘b’ pedirá un valor V y una posición P, luego escribirá V en la posición P del array. 
 * El menú se repetirá indefinidamente hasta que el usuario elija la opción ‘c’ que terminará el programa.
 */
package ejercicio12;

import java.util.Scanner;

public class MenuConOpciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arrayenteros = new int[10]; // Array de 10 enteros inicializado con 0 por defecto
        String opcion;

        // Bucle infinito hasta que el usuario elija 'c'
        do {
            System.out.println("\n----- MENÚ -----");
            System.out.println("a. Mostrar valores");
            System.out.println("b. Introducir valor");
            System.out.println("c. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextLine();

            switch (opcion.toLowerCase()) {
                case "a":
                    System.out.println("Valores actuales del array:");
                    for (int i = 0; i < arrayenteros.length; i++) {
                        System.out.println("Posición " + i + ": " + arrayenteros[i]);
                    }
                    break;

                case "b":
                    System.out.print("Introduce la posición (0-9): ");
                    int posicion = sc.nextInt();

                    if (posicion < 0 || posicion >= arrayenteros.length) {
                        System.out.println("Posición inválida. Debe estar entre 0 y 9.");
                        sc.nextLine(); // Limpiar buffer
                        break;
                    }

                    System.out.print("Introduce el valor: ");
                    int valor = sc.nextInt();
                    arrayenteros[posicion] = valor;
                    System.out.println("Valor asignado correctamente.");
                    sc.nextLine(); // Limpiar buffer
                    break;

                case "c":
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (!opcion.equalsIgnoreCase("c"));

        sc.close();
    }
}