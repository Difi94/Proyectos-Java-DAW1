/*
 * Descripcion: Crear un array, sumar el contenido de sus valores y hacer la media.
 * Autor: Juan Carlos
 * Fecha: 19/11/25
 */
package ejercicio15;

import java.util.Arrays;

public class Ejercicio15 {

	public static void main(String[] args) {
		int[] numbers = new int[50];
		
		for (int i = 0; i < numbers.length ; i++) {
			numbers[i] = 50 + i;
		}
		System.out.println(Arrays.toString(numbers));
		System.out.println(suma(numbers));
		System.out.println(media(numbers));

	}
	//suma los valores del contenido del array
	public static int suma (int numbers[]) {
		int suma = 0;
		for (int i = 0; i < numbers.length; i++) {
		    suma += numbers[i];
		}
		return suma;
	}
	//calcula la media
	public static double media(int numbers[]) {
		return suma(numbers) / numbers.length;
	}
	

}
