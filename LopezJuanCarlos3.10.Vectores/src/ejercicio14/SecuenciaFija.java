/*
 * Descripcion: Array de secuencia 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la muestre por pantalla.
 * Autor: Juan Carlos
 * Fecha: 03/11/25
 */
package ejercicio14;

public class SecuenciaFija {

	public static void main(String[] args) {
		
		int valores = 0;

        // Calculamos el tamaño total del array (valores)
        for (int i = 1; i <= 10; i++) {
            valores += i;
        }

        int[] enteros = new int[valores];

        int indice = 0;

        // Llenamos el array con la secuencia
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                enteros[indice] = i;
                indice++;
            }
        }

        // Mostramos el array por pantalla
        for (int num : enteros) {
            System.out.print(num + " ");
        }

	}

}
