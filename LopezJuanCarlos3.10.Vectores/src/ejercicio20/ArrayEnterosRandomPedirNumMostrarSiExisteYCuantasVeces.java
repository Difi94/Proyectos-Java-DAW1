/*
 * Descripcion: Crea un programa que cree un array de tamaño 1000 y lo rellene con valores enteros
 * aleatorios entre 0 y 99 (utiliza Math.random()*100). Luego pedirá por teclado un valor N y se
 * mostrará por pantalla si N existe en el array, además de cuantas veces.
 *
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio20;

import java.util.Scanner;

public class ArrayEnterosRandomPedirNumMostrarSiExisteYCuantasVeces {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mil = new int[1000];

        // Rellenar el array con valores aleatorios entre 0 y 99
        for (int i = 0; i < mil.length; i++) {
            mil[i] = (int) (Math.random() * 100);
        }

        System.out.print("Introduce un número para ver si existe en el vector: ");
        int numCheck = sc.nextInt();

        // Contar cuántas veces aparece el número
        int veces = contarOcurrencias(mil, numCheck);

        if (veces > 0) {
            System.out.println("El número " + numCheck + " existe en el array y aparece " + veces + " veces.");
        } else {
            System.out.println("El número " + numCheck + " no se encuentra en el array.");
        }

        sc.close();
    }

    // Método para contar cuántas veces aparece un número en un array
    public static int contarOcurrencias(int[] array, int numeroABuscar) {
        int contador = 0;
        for (int numero : array) {
            if (numero == numeroABuscar) {
                contador++;
            }
        }
        return contador;
    }
}

