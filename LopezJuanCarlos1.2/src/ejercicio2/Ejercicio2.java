/*
 * Descripcion: Ejercicio 2 de la segunda practica en Java"
 * Autor: Juan Carlos
 * Fecha: 25/09/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nombre del equipo: ");
		String equipo = teclado.nextLine();
		
		System.out.println("Fecha de la fundacion: ");
		int fundacion = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Nombre del estadio: ");
		String estadio = teclado.nextLine();
		
		System.out.println("Nombre del capitan: ");
		String capitan = teclado.nextLine();
		
		System.out.println("Nombre del Equipo: " + equipo + "\n Fundado en: " + fundacion + "\n Estadio: " + estadio + "\n Capitan: " + capitan);
		
		teclado.close();
		
		
	}

}
