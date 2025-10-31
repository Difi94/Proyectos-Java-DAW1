/*
 * Descripcion: Crea un programa que cree dos arrays de enteros de tamaño 100. Luego introducirá en el
 * primer array todos los valores del 1 al 100. Por último, deberá copiar todos los valores del
 * primer array al segundo array en orden inverso, y mostrar ambos por pantalla.
 * Autor: Juan Carlos
 * Fecha: 31/10/25
 */
package ejercicio11;

public class CopiarContenidoArraysMostrarContenidos {

	public static void main(String[] args) {
		
		int[] arrayUno = new int[100];
        int[] arrayDos = new int[100];

        // Rellenar arrayUno con valores del 1 al 100
        for (int i = 0; i < arrayUno.length; i++) {
            arrayUno[i] = i + 1;
        }

        // Copiar en orden inverso al segundo array
        for (int i = 0; i < arrayUno.length; i++) {
            arrayDos[i] = arrayUno[arrayUno.length - 1 - i];
        }

        // Mostrar ambos arrays
        System.out.println("Array 1 (orden normal):");
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.print(arrayUno[i] + " ");
        }

        System.out.println("\n\nArray 2 (orden inverso):");
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.print(arrayDos[i] + " ");
        }

	}

}
