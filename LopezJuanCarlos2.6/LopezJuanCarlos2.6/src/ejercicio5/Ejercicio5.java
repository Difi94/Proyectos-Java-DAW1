/*
 * Descripcion: solicitar datos y mostrar una ficha mostrando todos los datos y la nota obtenida en formato numero y palabra
 * Autor: Juan Carlos
 * Fecha: 06/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

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
		} else if (nota == 9 || nota == 10) {
			nota2 = "(sobresaliente)";
		}
		
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Ciclo Formativo: " + ciclo);
		System.out.println("Nota academica: " + nota + " " + nota2);
			
		teclado.close();
		}

	}
