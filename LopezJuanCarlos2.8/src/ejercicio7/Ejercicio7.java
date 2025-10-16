/*
 * Descripcion: Calcular un numero aleatorio entre 0 y 50,
 *  pedir numeros indicando mayor o menor con respcto al numero aleatorio,
 *  el proceso acaba cuando el usuario acierta.
 * Autor: Juan Carlos
 * Fecha: 16/10/25
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int num = (int) (Math.random() * 51);
		
		System.out.println("Dime un numero entre 0 y 50:");
		int request = teclado.nextInt();
		
		while (request != num) {
			System.out.println("Dime otro numero entre 0 y 50:");
			request = teclado.nextInt();
			if (request < num) {
				System.out.println("El numero es mayor de " + request);
			} else if (request > num) {
				System.out.println("El numero es menor de " + request);
			} else {
				System.out.println("Acertaste!");
			}
		}
teclado.close();
	}

}
