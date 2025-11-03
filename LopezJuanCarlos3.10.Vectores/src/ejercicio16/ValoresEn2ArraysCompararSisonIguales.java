/*
 * Descripcion: Pedir valores, dividirlos en 2 arrays y compararlos, diciendo si son iguales o no
 * Autor: Juan Carlos
 * Fecha: 03/11/25
 */
package ejercicio16;

import java.util.Scanner;
import java.util.Arrays;

public class ValoresEn2ArraysCompararSisonIguales {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array1 = new int[10];
        int[] array2 = new int[10];
        int[] valores = new int[20];

        // Pedir los 20 valores
        System.out.println("Introduce 20 valores enteros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        // Guardar los 10 primeros en array1 y los 10 últimos en array2
        for (int i = 0; i < 10; i++) {
            array1[i] = valores[i];
            array2[i] = valores[i + 10];
        }

        // Mostrar los dos arrays
        System.out.println("Primer array: " + Arrays.toString(array1));
        System.out.println("Segundo array: " + Arrays.toString(array2));

        // Comparar ambos arrays
        if (Arrays.equals(array1, array2)) {
            System.out.println("Los dos arrays son iguales.");
        } else {
            System.out.println("Los dos arrays son diferentes.");
        }

        sc.close();
    }
}
