/*
 * Descripción: Programa para almacenar las notas de 4 alumnos (Alumno 1, Alumno 2, etc.)
 * y 5 asignaturas. El usuario introducirá las notas por teclado y luego el programa
 * mostrará la nota mínima, máxima y media de cada alumno.
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio4;

import java.util.Scanner; // Importamos Scanner para leer datos del teclado

public class NotasAlumnos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer entradas

        final int ALUMNOS = 4;      // Número de alumnos
        final int ASIGNATURAS = 5;  // Número de asignaturas por alumno

        // Creamos una matriz de 4 filas (alumnos) y 5 columnas (asignaturas)
        double[][] notas = new double[ALUMNOS][ASIGNATURAS];

        // --- PEDIR LAS NOTAS AL USUARIO ---
        System.out.println("Introduce las notas de los alumnos (valores de 0 a 10):");
        for (int i = 0; i < ALUMNOS; i++) {
            System.out.println("\nAlumno " + (i + 1) + ":");
            for (int j = 0; j < ASIGNATURAS; j++) {
                System.out.print("  Nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble(); // Guardamos la nota introducida
            }
        }

        // --- CALCULAR Y MOSTRAR MÍNIMA, MÁXIMA Y MEDIA DE CADA ALUMNO ---
        System.out.println("\n--- Resultados ---");

        for (int i = 0; i < ALUMNOS; i++) {
            double suma = 0;                // Acumulador para calcular la media
            double minima = 10;             // Inicializamos la nota mínima con el valor máximo posible
            double maxima = 0;              // Inicializamos la nota máxima con el valor mínimo posible

            // Recorremos las notas del alumno i
            for (int j = 0; j < ASIGNATURAS; j++) {
                double nota = notas[i][j];
                suma += nota;                // Sumamos para calcular la media más tarde

                if (nota < minima) {         // Comprobamos si es la nota mínima
                    minima = nota;
                }
                if (nota > maxima) {         // Comprobamos si es la nota máxima
                    maxima = nota;
                }
            }

            double media = suma / ASIGNATURAS; // Calculamos la media

            // Mostramos los resultados del alumno actual
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.printf("  Nota mínima: %.2f\n", minima);
            System.out.printf("  Nota máxima: %.2f\n", maxima);
            System.out.printf("  Nota media : %.2f\n\n", media);
        }

        sc.close(); // Cerramos el Scanner para liberar recursos
    }
}
