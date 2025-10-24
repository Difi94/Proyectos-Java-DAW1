/*
 * Descripcion: Pedir dos valores N y M, crear un array de tamaño N, escribir M en todas sus posiciones
 * y mostrarlo
 * Autor: Juan Carlos
 * Fecha: 24/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el tamaño del array (N): ");
        int N = teclado.nextInt();

        System.out.print("Introduce el valor a rellenar (M): ");
        int M = teclado.nextInt();

        // Crear el array con tamaño N
        int[] lista = new int[N];

        // Rellenar todas las posiciones con M
        for (int i = 0; i < lista.length; i++) {
            lista[i] = M;
        }

        // Mostrar el array
        System.out.println("Contenido del array:");
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Posición " + i + ": " + lista[i]);
        }

        teclado.close();

	}

}
