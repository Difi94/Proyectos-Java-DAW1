/*
 * Descripcion:
 * Autor:
 * Fecha:
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca sus apellidos:");
		String apellidos = teclado.nextLine();
		
		System.out.println("Introduce tu edad:");
		int edad = teclado.nextInt();
		
		System.out.println("Salario deseado:");
		int salario = teclado.nextInt();
		
		if (edad > 45 || salario > 30000) {
			System.out.println("Su salario deseado, " + salario + " y su edad " + edad + " superan nuestros margenes deseados, lo sentimos pero no cumple nuestro perfil");
		} else if (edad <45 && salario < 30000) {
			System.out.println("Años de experiencia:");
			int exp = teclado.nextInt();
			
			System.out.println("Proyectos trabajados anteriormente: ");
			String proyectos = teclado.nextLine();
		} if (exp >= 2 && proyectos >= 3) {
			
		}
		

	}

}
