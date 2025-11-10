/*
 * Descripción: Programa para mostrar el ranking de puntuaciones de un torneo de
 * ajedrez con 8 jugadores. Se pide al usuario que introduzca las puntuaciones
 * (valores entre 1000 y 2800) y luego se muestran ordenadas de mayor a menor.
 * Autor: Juan Carlos
 * Fecha: 10/11/25
 */
package ejercicio19;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EjercicioPuntuaciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] puntuaciones = new Integer[8]; // Usamos Integer (no int) para poder usar Collections.reverseOrder()

        // Leer puntuaciones
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Introduce la puntuación del jugador " + (i + 1) + ": ");
            puntuaciones[i] = sc.nextInt();
        }

        // Ordenar en orden descendente
        Arrays.sort(puntuaciones, Collections.reverseOrder());

        // Mostrar resultados
        System.out.println("\n--- Ranking de puntuaciones ---");
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.println("Puesto " + (i + 1) + ": " + puntuaciones[i]);
        }

        sc.close();
    }
}

