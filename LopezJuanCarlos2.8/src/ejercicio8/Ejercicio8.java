/*
 * Descripcion: Aplicacion de los conceptos estudiados para pedir una serie de datos y mostrar una ficha que los conforme
 * relacionada al senderismo.
 * Autor: Juan Carlos
 * Fecha: 16/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre:");
		String name = teclado.nextLine();
		
		System.out.println("Introduce tus apellidos:");
		String surname = teclado.nextLine();
		
		System.out.println("Introduce tu edad:");
		int age = teclado.nextInt();
		
		while (age < 17 || age > 45) {
			System.out.println("Edad incorrecta");
			System.out.println("Vuelve a introducir tu edad:");
			age = teclado.nextInt();
		}
		
		System.out.println("Numero de rutas de senderismo que has realizado:");
		int routes = teclado.nextInt();
		
		System.out.println("Distancia de la ultima ruta que realizaste (en km):");
		double distance = teclado.nextDouble();
		
		
	}

}
