/*
 * Descripción:
 * Programa para almacenar las notas de 4 alumnos (Alumno 1, Alumno 2, etc.)
 * en 5 asignaturas. El usuario introducirá las notas por teclado y
 * luego el programa mostrará la nota mínima, máxima y media de cada alumno.
 */

package ejercicio4;

import java.util.Scanner;

public class NotasDeAlumnosAsignaturas {

    public static void main(String[] args) {
        
        // Creamos un objeto Scanner para poder leer datos introducidos por el usuario
        Scanner sc = new Scanner(System.in);
        
        // Definimos constantes para el número de alumnos y asignaturas
        final int NUM_ALUMNOS = 4;
        final int NUM_ASIGNATURAS = 5;
        
        // Creamos una matriz (array bidimensional) para almacenar las notas
        // Cada fila representa un alumno y cada columna una asignatura
        double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];
        
        // Bucle para pedir las notas de cada alumno
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            System.out.println("Introduce las notas del Alumno " + (i + 1) + ":");
            
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                System.out.print("Nota de la asignatura " + (j + 1) + ": ");
                notas[i][j] = sc.nextDouble(); // Leemos la nota introducida
            }
            
            System.out.println(); // Línea en blanco para separar alumnos
        }
        
        // Bucle para calcular la nota mínima, máxima y media de cada alumno
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            double suma = 0;
            double notaMin = 10; // Asumimos nota máxima posible = 10
            double notaMax = 0;
            
            // Recorremos las asignaturas del alumno i
            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                double nota = notas[i][j];
                
                // Sumamos para calcular la media luego
                suma += nota;
                
                // Comprobamos si es la nota mínima
                if (nota < notaMin) {
                    notaMin = nota;
                }
                
                // Comprobamos si es la nota máxima
                if (nota > notaMax) {
                    notaMax = nota;
                }
            }
            
            // Calculamos la media
            double media = suma / NUM_ASIGNATURAS;
            
            // Mostramos los resultados del alumno
            System.out.println("Alumno " + (i + 1) + ":");
            System.out.println("Nota mínima: " + notaMin);
            System.out.println("Nota máxima: " + notaMax);
            System.out.println("Nota media: " + media);
            System.out.println("-------------------------");
        }
        
        // Cerramos el Scanner para liberar recursos
        sc.close();
    }
}

