/*
 * Descripcion: Pedir diez numeros por teclado, almacenarlos en un array 
 * y luego recorrerlos para averiguar el maximo y minimo mostrandolos por pantalla
 * Autor: Juan Carlos
 * Fecha: 23/10/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int NUM = 10;
		int [] numeros = new int[NUM];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dame un numero: ");
            numeros[i] = teclado.nextInt();
		}
		
		int numMin = numeros[0];
		int numMax = numeros[0];
		
		for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numMax) {
                numMax = numeros[i];
            }
            if (numeros[i] < numMin) {
                numMin = numeros[i];
            }
        }
		
        System.out.println("Valor maximo: " + numMax);
        System.out.println("Valor minimo: " + numMin);

        teclado.close();

	}

}
