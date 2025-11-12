/*
 * Descripcion: pedir diez números reales por teclado, los almacene en un array, y luego muestre todos sus valores
 * Autor: Juan Carlos
 * Fecha: 23/10/25
 */
package ejercicio1;

import java.util.Scanner;

public class PedirNumerosAlmacenarlosArrayMostrarValores {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int NUM = 10;
		int [] numeros = new int[NUM];
		for (int valor = 0; valor < numeros.length; valor++) { 
			numeros[valor] = 0; // inicializamos a cero todas las posiciones
		} for (int valor = 0; valor < numeros.length ; valor++) {
			System.out.println("Dame un numero real:");
			numeros[valor] = teclado.nextInt();
			System.out.println("El valor de la posicion " + valor + " es: " + numeros[valor]);
		}
		
teclado.close();
	}

}
