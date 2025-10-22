/*
 * Descripcion: pedir dos numeros comprobar cual es mayor o si son iguales y mostrarlo
 * Autor: Juan Carlos
 * Fecha: 06/10/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Dame un numero:");
		int num1 = teclado.nextInt();
		
		System.out.println("Dame otro numero:");
		int num2 = teclado.nextInt();
		
		if (num1 > num2) {
			System.out.println("El primer numero " + num1 + " es mayor que el segundo " + num2);
			
		}
		if (num1 < num2) {
			System.out.println("El segundo numero " + num2 + " es mayor que el primero " + num1);
		} else {
			System.out.println("Los dos numeros son iguales");
		}
		
		teclado.close();
		
		
		

	}

}
