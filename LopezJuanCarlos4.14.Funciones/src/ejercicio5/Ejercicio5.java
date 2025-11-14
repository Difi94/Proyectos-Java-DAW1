/*
 * Descripcion: Convertir de millas a km usando una funcion.
 * Autor: Juan Carlos
 * Fecha: 14/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un valor en millas: ");
		int dMillas = sc.nextInt();
		
		double kilometros = millasAkilometros(dMillas);
		
		System.out.println("La distancia en kilometros es: " + kilometros);
		
		sc.close();

	}
	
	public static double millasAkilometros(int millas) {
		//double km = millas * 1.60934;
		//return km;
		return millas * 1.60934;
	}

}
