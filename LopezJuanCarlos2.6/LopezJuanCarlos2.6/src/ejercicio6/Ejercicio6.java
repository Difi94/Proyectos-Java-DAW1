/*
 * Descripcion: mismo ejercicio que el anterior pero añadimos validacion de datos y una calificacion extra "matricula de honor"
 * Autor: Juan Carlos
 * Fecha: 08/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduce tu nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca sus apellidos");
		String apellidos = teclado.nextLine();
		
		System.out.println("Ciclo formativo al que perteneces:");
		String ciclo = teclado.nextLine();
		
		System.out.println("Nota Academica:");
		int nota = teclado.nextInt();
		
		String nota2 = " ";
		
		if (nota < 0 || nota > 10) {
			System.out.println("Nota erronea, vuelve a introducirla");
		} else if (nota <5) {
			nota2 = "(insuficiente)";
		} else if (nota == 5) {
			nota2 = "(suficiente)";
		} else if (nota == 6) {
			nota2 = "(bien)";
		} else if (nota == 7 || nota == 8) {
			nota2 = "(notable)";
		} else if (nota == 9) {
			nota2 = "(sobresaliente)";
		} else if (nota == 10) {
			nota2 = "(matricula de honor)";
		}
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + ciclo);
		System.out.println("Nota academica: " + nota + " " + nota2);
			
		teclado.close();

	}

}
