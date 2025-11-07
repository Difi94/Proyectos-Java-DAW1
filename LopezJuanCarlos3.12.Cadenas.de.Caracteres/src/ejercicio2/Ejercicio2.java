/*
 * Descripcion: Pedir dos cadenas de texto e indicar si son iguales,
 * además de si son iguales sin diferenciar entre mayúsculas y minúsculas.
 * Autor: Juan Carlos
 * Fecha: 07/11/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena1;
		String cadena2;
		System.out.println("Dame una cadena de caracteres: ");
		cadena1 = teclado.nextLine();
		System.out.println("Dame otra cadena de caracteres: ");
		cadena2 = teclado.nextLine();
		
		if (cadena1.compareToIgnoreCase(cadena2) == 0) {
			System.out.println("Ambas cadenas son iguales (sin distinguir mayúsculas/minúsculas)");
		} else if (cadena1.compareToIgnoreCase(cadena2) < 0) {
			System.out.println("La primera cadena es lexicográficamente menor (ignorando mayúsculas/minúsculas)");
		} else {
			System.out.println("La primera cadena es lexicográficamente mayor (ignorando mayúsculas/minúsculas)");
		}

	}

}
