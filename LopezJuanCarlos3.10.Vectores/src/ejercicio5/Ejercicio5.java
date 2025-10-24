/*
 * Descripcion: Pedir diez numeros, almacenarlos en un array y recorrerlo para
 * calcular y mostrar la media.
 * Autor: Juan Carlos
 * Fecha: 24/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final int NUM = 10;
		int [] numeros = new int[NUM];
		int suma = 0;
		double media;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dame un numero: ");
            numeros[i] = teclado.nextInt();
		}
		for (int j = 0; j < numeros.length; j++) {
			suma += numeros[j];
		}
		media = (double) suma / numeros.length;
        System.out.println("La media de los numeros es: " + media);

        teclado.close();

	}

}
