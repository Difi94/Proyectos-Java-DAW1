/*
 * Descripcion: un array de tamaño 30 y lo rellene con valores aleatorios entre 0
y 9 (utiliza Math.random()*10). Luego ordena los valores del array y los mostrará por
pantalla
 * Autor: Juan Carlos
 * Fecha: 06/11/25
 */
package ejercicio18;

import java.util.Arrays;

public class CrearArrayValoresMathrandomYOrdenar {

	public static void main(String[] args) {
		
		int[] numeros = new int [30];
		
		// Rellenar con números aleatorios del 0 al 9
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random() * 10);

		}
		
		// Mostrar el array original
        System.out.println("Array original:");
        System.out.println(Arrays.toString(numeros));

        // Ordenar el array
        Arrays.sort(numeros);

        // Mostrar el array ordenado
        System.out.println("\nArray ordenado:");
        System.out.println(Arrays.toString(numeros));
		

	}

}
