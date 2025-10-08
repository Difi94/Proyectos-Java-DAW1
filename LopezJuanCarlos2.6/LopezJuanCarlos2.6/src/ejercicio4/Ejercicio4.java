/*
 * Descripcion: pedir una serie de datos al usuario, dependiendo de si el numero supera 300 mostrar una ficha felicitando y dando un vale descuento y si no, una de consolacion, ambas con todos los datos.
 * Autor: Juan Carlos
 * Fecha: 06/1/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca sus apellidos:");
		String apellidos = teclado.nextLine();
		
		System.out.println("Introduzca el valor del primer importe gastado:");
		double importeGastado1 = teclado.nextDouble();
		
		System.out.println("Introduzca el valor del segundo importe gastado:");
		double importeGastado2 = teclado.nextDouble();
		
		System.out.println("Introduzca el valor del tercer importe gastado:");
		double importeGastado3 = teclado.nextDouble();
		
		System.out.println("Introduzca el valor del cuarto importe gastado:");
		double importeGastado4 = teclado.nextDouble();
		
		double importeTotal = importeGastado1 + importeGastado2 + importeGastado3 + importeGastado4;
		
		double importeMedia = importeTotal /4;
		
		if (importeTotal >= 300) {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Importe Gastado1 " + importeGastado1);
			System.out.println("Importe Gastado2 " + importeGastado2);
			System.out.println("Importe Gastado3 " + importeGastado3);
			System.out.println("Importe Gastado4 " + importeGastado4);
			
			
			System.out.println("Importe Medio: " + importeMedia);
			
			System.out.println("Felicidades tus compras superan los 300€ este mes, se le otorgara un vale de descuento de 50€");
		} else {
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellidos: " + apellidos);
			System.out.println("Importe Gastado1 " + importeGastado1);
			System.out.println("Importe Gastado2 " + importeGastado2);
			System.out.println("Importe Gastado3 " + importeGastado3);
			System.out.println("Importe Gastado4 " + importeGastado4);
			
			
			System.out.println("Importe Medio: " + importeMedia);
			
			System.out.println("Lo sentimos pero sus compras no han alcanzado los 300€ este mes, no dispone de descuento");
		}
teclado.close();
	}

}
