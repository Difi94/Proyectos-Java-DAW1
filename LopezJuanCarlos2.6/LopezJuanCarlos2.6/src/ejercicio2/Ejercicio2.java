/*
 * Descripcion: pedir nombre, edad y nota al usuario y mostrar en pantalla si cumple requisitos de admision (debe ser mayor de 18 y tener una nota minima de 7)
 * Autor: Juan Carlos
 * Fecha: 06/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Edad:");
		int edad = teclado.nextInt();
		
		System.out.println("Nota:");
		double nota = teclado.nextDouble();
		
		if (edad > 18 && nota > 7) {
			System.out.println(nombre + ", has sido admitid@ en el curso, cumples las condiciones requeridas." );
		} else {
			System.out.println(nombre + ", lo sentimos, no has sido admitid@ en el curso ya que no cumples los requisitos minimos.");
		}
teclado.close();
	}
}