/*
 * Descripcion: Pedir un valor en kilometros y mostrarlo en millas
 * Autor: Juan Carlos
 * Fecha: 19/11/25
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un valor en kilometros: ");
		int kilometros = sc.nextInt();
		
		double millas = kilometrosAmillas(kilometros);
		
		System.out.println("La distancia en millas es: " + millas);
		
		sc.close();

	}
	
	public static double kilometrosAmillas(int a) {
		return a / 1.60934;
	}

}
