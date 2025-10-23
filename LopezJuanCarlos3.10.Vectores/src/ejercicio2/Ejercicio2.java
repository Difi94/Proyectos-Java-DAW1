/*
 * Descripcion: pedir 10 numeros por teclado, almacenarlos en un array y mostrar la suma de todos los valores
 * Autor: Juan Carlos
 * Fecha: 23/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int NUM = 10; //inicializo una constante para el array
		int [] numeros = new int[NUM];
		int suma = 0; // inicializo la suma fuera del bucle
		
		for (int i = 0; i < numeros.length; i++) {
            System.out.print("Dame un numero: ");
            numeros[i] = teclado.nextInt();
            suma += numeros[i]; // acumulo directamente
        }

        System.out.println("La suma de todos los valores es: " + suma);

        teclado.close();

	}

}
