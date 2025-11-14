/*
 * Descripcion: Conseguir el area y perimetro de un rectangulo usando funciones.
 * Autor: Juan Carlos
 * Fecha: 14/11/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el ancho del rectangulo: ");
		double ancho = sc.nextDouble();
		System.out.println("Dime el alto del rectangulo: ");
		double alto = sc.nextDouble();
		
		System.out.println("El area del rectangulo es " + area(ancho,alto) + " y el perimetro es " + perimetro(ancho,alto));
		System.out.println("El area del rectangulo es " + String.format("%.2f", area(ancho, alto)) +
                " y el perimetro es " + String.format("%.2f", perimetro(ancho, alto)));

		sc.close();

	}
	
	public static double area(double ancho, double alto) {
		return ancho * alto;
	}
	
	public static double perimetro(double ancho, double alto) {
		return 2 * (ancho + alto);
	}

}
