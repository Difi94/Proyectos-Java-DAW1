/*
 * Descripcion: Comprobar el menor de 2 numeros usando una funcion.
 * Autor: Juan Carlos
 * Fecha: 14/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dame un numero entero: ");
		int num1 = sc.nextInt();
		
		System.out.println("Dame otro numero entero: ");
		int num2 = sc.nextInt();
		
		int menor = minimo(num1, num2);
		
		System.out.println("El menor de los dos es " + menor);
		
		sc.close();
		
	}
	
	public static int minimo (int a, int b) {
		int menor = Math.min(a, b);
		return menor;
	}

}
