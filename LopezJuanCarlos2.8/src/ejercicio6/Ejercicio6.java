/*
 * Descripcion: Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo
 * Autor: Juan Carlos
 * Fecha: 16/10/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		int num = teclado.nextInt();
		
		while (num > 0) {
			double cuadrado = num*num;
			System.out.println("Dame otro numero:");
			num = teclado.nextInt();
			System.out.println("El cuadrado de " + num + " es " + cuadrado);
		}
		
		System.out.println("Has introducido un numero negativo, finalizando programa");
		
teclado.close();
	}

}
