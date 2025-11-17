/*
 * Descripcion: Pedir 3 valores y que nos diga cual es el mas pequeño usando 1 (añadi una extension para probar
 * funciones)
 * funcion a la que se le pasen 2 valores.
 * Autor: Juan Carlos
 * Fecha: 17/11/25
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int [3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Dame un número: ");
			numeros[i] = sc.nextInt();
		}
		
		int minimo1 = minimoDe(numeros[0], numeros[1]);
		int minimoFinal = minimoDe(minimo1, numeros[2]);
		int mayor1 = maximoDe(numeros[0], numeros[1]);
		int mayorFinal = maximoDe(mayor1, numeros[2]);
		int mediaFinal = mediaDe(minimoFinal, mayorFinal);
		
		System.out.println("El numero menor es: " + minimoFinal);
		System.out.println("El numero mayor es: " + mayorFinal);
		System.out.println("La media de " + minimoFinal + " y " + mayorFinal + " es : " + mediaFinal);
		
		sc.close();

	}
	//devuelve el minimo
	public static int minimoDe(int a, int b) {
		int menor = Math.min(a, b);
		return menor;
	}
	
	//devuelve el maximo
	public static int maximoDe(int a, int b) {
		int mayor = Math.max(a, b);
		return mayor;
	}
	
	//devuelve la media
	public static int mediaDe(int a, int b) {
		int media = (a+b) / 2;
		return media;
	}

}
