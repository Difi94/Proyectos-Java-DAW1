/*
 * Descripcion: Pedir una cadena de texto y
 * mostrar cada palabra en una linea distinta.
 * Autor: Juan Carlos
 * Fecha: 07/11/25
 */
package ejercicio1;

import java.util.Scanner;

public class EachWordDifLine {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		System.out.println("Dame una cadena de caracteres:");
		cadena = teclado.nextLine();
		
		String[] palabras = cadena.split(" ");
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}

		teclado.close();
	}

}
