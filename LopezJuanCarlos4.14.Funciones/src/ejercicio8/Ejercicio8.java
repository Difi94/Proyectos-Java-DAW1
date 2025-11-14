/*
 * Descripcion: Calcular el sumatorio, productorio y valor intermedio entre 1 y N usando funciones.
 * Autor: Juan Carlos
 * Fecha: 14/11/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero entero: ");
		int n = sc.nextInt();
		
		System.out.println("El sumatorio de " + n + " es " + sumatorioDe(n) + " el productorio " + productorioDe(n) + " y el intermedio es " + intermedioDe(n));
		
		sc.close();

	}
	
	public static int sumatorioDe (int n) {
		int suma = 0;
		for (int i = 1; i <= n; i++) {
			suma += i;
		}
		
		return suma;
	}
	
	public static int productorioDe (int n) {
		int producto = 1;
		
	    for (int i = 1; i <= n; i++) {
	        producto *= i;
	    }
	    return producto;
	}
	
	public static double intermedioDe (int n) {
		return (1 + n) / 2.0;
	}
	
}
