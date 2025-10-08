/*
 * Descripcion: como funciona el operador condicional
 * Nombre: Juan Carlos
 * Fecha: 26/09/25
 */
package operadoresbase;

import java.util.Scanner;

public class Ejemplooperadorcondicional {
	
	public enum Estaciones {PRIMAVERA, VERANO, OTOÑO, INVIERNO};

	public static void main(String[] args) {
	/*	Scanner teclado = new Scanner(System.in);
		
		//trabajando con los strings
		String nombre;
		System.out.println("Dime tu nombre: ");
		nombre = teclado.nextLine();
		int longitud = nombre.length();
		System.out.println("Numero de caracteres: " + longitud);
		
		String nombreMayuscula;
		nombreMayuscula = nombre.toUpperCase();
		System.out.println(nombreMayuscula);
		
		System.out.println("En minuscula es: " + nombre.toLowerCase());
		
		boolean esPepe;
		nombre = nombre.toLowerCase();
		esPepe = nombre.equals("pepe");
		System.out.println(esPepe);
	*/	
		
		//ejemplo de tipos enumerados
		Estaciones estacionActual = Estaciones.OTOÑO;
        Estaciones estacionSiguiente = Estaciones.INVIERNO;
        
        System.out.println("Ahora estamos en: " + estacionActual);
        System.out.println("La proxima estacion es: " + estacionSiguiente); 
		
/*
 		
 
		//trabajando con el operador condicional
		int edad;
		System.out.println("Dime tu edad: ");
		edad = teclado.nextInt();
		
		String mayorEdad;
		mayorEdad = (edad > 18) ? "Eres mayor de edad" : "Eres menor de edad";
		System.out.println(mayorEdad);
*/
	}

}
