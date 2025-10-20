/*
 * Descripcion:
 * Autor: Juan Carlos
 * Fecha: 20/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce tu nota de Bases de Datos:");
		double notabdd = teclado.nextDouble();
		
		System.out.println("Introduce tu nota de Programacion:");
		double notaprog = teclado.nextDouble();
		
		System.out.println("Introduce tu nota de Lenguaje de Marcas :");
		double notamarkup = teclado.nextDouble();
		
		System.out.println("Introduce tu nota de Sistemas Informaticos :");
		double notasistemas = teclado.nextDouble();
		
		double notamedia = (notabdd + notaprog + notamarkup + notasistemas) / 4;
		System.out.println("Tu nota media es de: " + notamedia);
		System.out.println("Tu nota redondeada hacia arriba es: " + Math.ceil(notamedia));
		System.out.println("Tu nota redondeada hacia abajo es: " + Math.floor(notamedia));
		
		
		if (notamedia > 8) {
			System.out.println("Felicidades, puedes acceder a los estudios superiores.");
		} if (notamedia < 8) {
			System.out.println("Lo sentimos, tu calificacion media no es suficiente para acceder a los estudios deseados.");
		}
		
teclado.close();
	}

}
