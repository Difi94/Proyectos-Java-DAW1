/*
 * Descripcion: Pedir 10 numeros, almacenarlos en un array  mostrar por separado la suma
 * de todos los valores positivos y negativos.
 * Autor: Juan Carlos
 * Fecha: 23/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int NUM = 10;
		int [] numeros = new int[NUM];
		double sumpositivos, sumnegativos;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dame un numero: ");
            numeros[i] = teclado.nextInt();
            if (numeros[i] > 0) {
            	sumpositivos = numeros[i];
            	if (numeros[i] < 0) {
            		sumnegativos = numeros [i];
            	}
            }
		} 
	}

}
