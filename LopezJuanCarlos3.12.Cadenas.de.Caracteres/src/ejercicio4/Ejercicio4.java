/*
 * Descripcion: Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
 * cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
 * mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
 * Nº de A's: 3
 * Nº de E's: 1Nº de I's: 2
 * Nº de O's: 0
 * Nº de U's: 0
 * Autor: Juan Carlos
 * Fecha: 13/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String vocalesEncontradas = "";
		
		System.out.println("Dame una frase: ");
		String frase = sc.nextLine().toLowerCase();
		
		for (int i = 0; i < frase.length(); i++) {
			char vocal = frase.charAt(i);
			
			if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
				vocalesEncontradas += vocal;
			}
		}
		
		System.out.println("Las vocales del string son: " + vocalesEncontradas);
		
		

	}

}
