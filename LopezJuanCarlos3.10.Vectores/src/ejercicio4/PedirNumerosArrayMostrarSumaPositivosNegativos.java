/*
 * Descripcion: Pedir 10 numeros, almacenarlos en un array y mostrar por separado la suma
 * de todos los valores positivos y negativos.
 * Autor: Juan Carlos
 * Fecha: 23/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class PedirNumerosArrayMostrarSumaPositivosNegativos {
	

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int NUM = 10;
		int [] numeros = new int[NUM];
		double sumpositivos = 0;
		double sumnegativos = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dame un numero: ");
            numeros[i] = teclado.nextInt();
        }
		for (int n : numeros) {
			if (n > 0) {
				sumpositivos += n;
			} else if (n < 0) {
				sumnegativos +=n;
			}
		}
		 System.out.println("Suma de positivos: " + sumpositivos);
	     System.out.println("Suma de negativos: " + sumnegativos);

	     teclado.close();
	
    }

}