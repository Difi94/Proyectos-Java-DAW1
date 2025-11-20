/*
 * Descripcion: crear un array del tamaño introducido por teclado y rellenarlo con valores
 * aleatorios.
 * Autor: Juan Carlos
 * Fecha: 20/11/25
 */
package ejercicio16;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la lista: ");
		int[] lista = new int[sc.nextInt()];
		
		valores(lista);
		
		System.out.println(Arrays.toString(lista));
		
		sc.close();

	}
	
	public static void valores (int[] lista) {
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int) (Math.random()*999);
		}
	}

}
