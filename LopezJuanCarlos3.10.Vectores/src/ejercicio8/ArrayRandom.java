/*
 * Descripcion: array con 100 números reales aleatorios entre 0.0 y 1.0,
 * utilizando Math.random(), y luego le pida al usuario un valor real R. Por último, mostrará
 * cuántos valores del array son igual o superiores a R.
 * Autor: Juan Carlos
 * Fecha: 30/10/2025
 */
package ejercicio8;

import java.util.Scanner;

public class ArrayRandom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // 1. Crear un array de 100 números reales
        double[] array = new double[100];

        // 2. Rellenar el array con números aleatorios entre 0.0 y 1.0
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random(); // genera un número entre 0.0 y 1.0
        }

        System.out.print("Introduce un valor real R (entre 0.0 y 1.0): ");
        double R = sc.nextDouble();

        // 4. Contar cuántos valores son >= R
        int contador = 0;
        for (double valor : array) {
            if (valor >= R) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " valores mayores o iguales que " + R);

        sc.close();

	}

}
