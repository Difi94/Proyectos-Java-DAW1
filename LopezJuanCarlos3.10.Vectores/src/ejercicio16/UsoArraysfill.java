/*
 * Descripción: Crea un programa que cree un array de enteros e introduzca la siguiente secuencia de
 * valores: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, etc. hasta introducir 10 diez veces, y luego la
 * muestre por pantalla. En esta ocasión has de utilizar Arrays.fill().
 * Autor: Juan Carlos
 * Fecha: 06/11/25
 */
package ejercicio16;

import java.util.Arrays;

public class UsoArraysfill {

    public static void main(String[] args) {

        int[] resultado = generarSecuencia(10);

        System.out.println(Arrays.toString(resultado));
    }

    // Calcula el tamaño total del array llenándolo con la secuencia
    public static int[] generarSecuencia(int n) {
        int valores = 0;

        // Calculamos el tamaño total del array
        for (int i = 1; i <= n; i++) {
            valores += i;
        }

        int[] enteros = new int[valores];
        int indice = 0;

        // Llenamos el array con la secuencia usando Arrays.fill()
        for (int i = 1; i <= n; i++) {
            Arrays.fill(enteros, indice, indice + i, i);
            indice += i;
        }

        return enteros;
    }
}

