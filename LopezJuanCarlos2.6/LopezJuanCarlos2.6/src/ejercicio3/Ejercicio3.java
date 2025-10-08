/*
 * Descripcion: pedir la edad al usuario y si es mayor de edad decirle que esta admitido en los estudios, pero si es menor decirle que no tiene la edad necesaria
 * Autor: Juan Carlos
 * Fecha: 06/10/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu edad:");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		if (edad < 18) {
			System.out.println("No tienes la edad requerida para realizar los estudios");
		} else {
			System.out.println("Introduce tu Nombre:");
			String nombre = teclado.nextLine();
			
			System.out.println("Apellidos:");
			String apellidos = teclado.nextLine();
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Edad: " + edad);
			
			System.out.println("Has sido admitid@");
		}
teclado.close();
	}
}
