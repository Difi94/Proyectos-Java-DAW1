/*
 * Descripcion: Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
 * todos los valores desde P hasta Q, y lo muestre por pantalla.
 * Autor: Juan Carlos
 * Fecha: 30/10/2025
 */
package ejercicio7;

import java.util.Scanner;

public class DarTamañoArrayMostrarPosiciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero: ");
		int p = sc.nextInt();
		System.out.println("Dame otro numero mayor que el anterior: ");
		int q = sc.nextInt();
		int size = (q - p) + 1;
		
		int[] array = new int [size];
		
		for (int i = 0; i < size; i++) {
			array[i] = p + i;
		}
		
		for (int valor : array) {
		    System.out.print(valor + " ");
		}
	}

}
