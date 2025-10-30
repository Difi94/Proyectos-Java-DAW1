/*
 * Descripcion:
 * Autor: Juan Carlos López Ponce
 * Fecha: 29/10/2025
 */
package JuanCarlosEjerciciosExamen;

import java.util.Scanner;

public class JuanCarlosEjercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int anio;
		
		System.out.println("Introduce un año (entre 1801 y 2100): ");
		anio = teclado.nextInt();
		
		if (anio < 1801 && anio > 2100) { //validacion del año
		}	
		do {
			System.out.println("El año no es válido");
			}
			
		while (anio >= 1801 && anio <= 2100);
		
		String siglo = " ";
		int anioSiglo = 0;
		
		boolean esPosterior = false;
		boolean esAnterior = false;
		boolean coincide = false;
		
		if (anio <= 1899) {
			esAnterior = true; //vemos si el siglo es anterior al actual
			anioSiglo = 2025 - anio; //calculamos los años que faltan
			siglo = "XIX";
		} else if (anio >= 1900 && anio < 1999) {
			esAnterior = true;
			anioSiglo = 2025 - anio;
			siglo = "XX";
		} else if (anio >= 2000 && anio < 2025) {
			esAnterior = true;
			anioSiglo = 2025 - anio;
			siglo = "XXI";
		} else if (anio == 2025) {
			coincide = true;
			anioSiglo = 2025;
			siglo = "XIX";
		} else if (anio > 2025 && anio <= 2100) {
			esPosterior = true;
			anioSiglo = 2100 - anio;
			siglo = "XIX";
		}
		
		if (esAnterior) {
			System.out.println("El año introducido es anterior al actual, han pasado " + anioSiglo + " años.");
			System.out.println("El año pertenece al siglo " + siglo);
		} else if (coincide) {
			System.out.println("El año introducido coincide con el actual");
			System.out.println("El año pertenece al siglo " + siglo);
		} else if (esPosterior) {
			System.out.println("El año introducido es posterior al actual, faltan " + anioSiglo + " años.");
			System.out.println("El año pertenece al siglo " + siglo);
		}
		
	}

}
