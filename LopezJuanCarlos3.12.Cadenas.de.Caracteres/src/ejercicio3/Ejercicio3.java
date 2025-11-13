/*
 * Descripcion: Crea un programa que pida por teclado tres cadenas de texto: nombre y dos apellidos.
 * Luego mostrará un código de usuario (en mayúsculas) formado por la concatenación de
 * las tres primeras letras de cada uno de ellos. Por ejemplo si se introduce “Lionel”, “Tarazón” y
 * “Alcocer” mostrará “LIOTARALC”
 * Autor: Juan Carlos
 * Fecha: 13/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre;
		String primerApellido;
		String segundoApellido;
		
		System.out.println("Dime tu nombre: ");
		nombre = sc.nextLine();
		
		System.out.println("Dime tu primer apellido: ");
		primerApellido = sc.nextLine();
		
		System.out.println("Dime tu segundo apellido: ");
		segundoApellido = sc.nextLine();
		
		System.out.println(nombre.substring(0,3).toUpperCase()
				+ primerApellido.substring(0,3).toUpperCase()
				+ segundoApellido.substring(0,3).toUpperCase());
	}

}
