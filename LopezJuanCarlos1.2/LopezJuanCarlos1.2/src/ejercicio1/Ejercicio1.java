/*
 * Descripcion: Ejercicio 1 de la segunda practica
 * Autor: Juan Carlos
 * Fecha: 25/09/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Dime tus apellidos:");
		String apellidos = teclado.nextLine();
		
		System.out.println("Dime tu edad:");
		int edad = teclado.nextInt();
		teclado.nextLine();
		
		System.out.println("Dime tu direccion:");
		String direccion = teclado.nextLine();
		
		System.out.println("Dime tu altura:");
		double altura = teclado.nextDouble();
		
		System.out.println("Dime tu peso:");
		double peso = teclado.nextDouble();
		
		System.out.println("Nombre: "+ nombre + "\nApellidos: "+ apellidos + "\nEdad: " + edad + "\nDireccion: " + direccion + "\nAltura: " + altura + "\nPeso: " + peso);
		
        teclado.close();
	}

}
