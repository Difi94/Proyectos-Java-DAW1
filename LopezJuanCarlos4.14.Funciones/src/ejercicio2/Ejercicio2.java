/*
 * Descripcion: Escribe un programa que pida la edad por teclado y muestre por pantalla si eres mayor de edad
 * o no. Implementa y utiliza la función:
 * boolean esMayorEdad(int a) // Devuelve verdadero si a>=18, falso en caso contrario
 * Autor: Juan Carlos
 * Fecha: 13/11/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		
		boolean esMayor = esMayorEdad(edad);
		
		if (!esMayor) {
			System.out.println("Eres menor de edad.");
		} else {
			System.out.println("Eres mayor de edad.");
		}
		

	}
	
	public static boolean esMayorEdad (int edad) {
		return edad >= 18;
		}
	}