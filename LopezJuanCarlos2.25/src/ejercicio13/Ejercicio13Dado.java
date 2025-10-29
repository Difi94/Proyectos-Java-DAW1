/*
 * Descripcion: Escribe un programa que tire un dado de 6 caras 100 veces y luego muestre el nº y % de
veces que ha salido cada número.
 */
package ejercicio13;

import java.util.Random;

public class Ejercicio13Dado {

	public static void main(String[] args) {
		Random rand = new Random();
        int[] contador = new int[6]; // índice 0 → cara 1, índice 5 → cara 6
        int totalTiradas = 100;

        // Tiramos el dado 100 veces
        for (int i = 0; i < totalTiradas; i++) {
            int tirada = rand.nextInt(6) + 1; // 1 a 6
            contador[tirada - 1]++; // sumamos al contador correspondiente
        }

        // Mostramos resultados
        System.out.println("Resultados de 100 tiradas:");
        for (int i = 0; i < 6; i++) {
            int veces = contador[i];
            double porcentaje = (veces * 100.0) / totalTiradas;
            System.out.printf("Número %d: %d veces (%.2f%%)\n", i + 1, veces, porcentaje);
        }

	}

}
