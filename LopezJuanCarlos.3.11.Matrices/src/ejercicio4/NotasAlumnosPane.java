/*
 * Descripción: Programa para almacenar las notas de 4 alumnos (Alumno 1, Alumno 2, etc.)
 * y 5 asignaturas. El usuario introducirá las notas mediante JOptionPane y luego el programa
 * mostrará la nota mínima, máxima y media de cada alumno.
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio4;

import javax.swing.JOptionPane; // Importamos JOptionPane para usar ventanas gráficas

public class NotasAlumnosPane{

    public static void main(String[] args) {

        final int ALUMNOS = 4;      // Número de alumnos
        final int ASIGNATURAS = 5;  // Número de asignaturas por alumno

        // Creamos una matriz de 4 filas (alumnos) y 5 columnas (asignaturas)
        double[][] notas = new double[ALUMNOS][ASIGNATURAS];

        // --- PEDIR LAS NOTAS AL USUARIO USANDO JOPTIONPANE ---
        JOptionPane.showMessageDialog(null,
                "Introduce las notas de los alumnos (valores de 0 a 10)",
                "Entrada de datos", JOptionPane.INFORMATION_MESSAGE);

        for (int i = 0; i < ALUMNOS; i++) {
            for (int j = 0; j < ASIGNATURAS; j++) {
                boolean notaValida = false;
                double nota = 0;

                // Bucle para validar que la nota esté entre 0 y 10
                while (!notaValida) {
                    String input = JOptionPane.showInputDialog(
                            null,
                            "Alumno " + (i + 1) + " - Asignatura " + (j + 1) + ":\nIntroduce la nota (0 a 10):",
                            "Entrada de nota",
                            JOptionPane.QUESTION_MESSAGE);

                    if (input == null) { // Si el usuario pulsa "Cancelar"
                        JOptionPane.showMessageDialog(null, "Operación cancelada. El programa se cerrará.");
                        System.exit(0);
                    }

                    try {
                        nota = Double.parseDouble(input);
                        if (nota >= 0 && nota <= 10) {
                            notaValida = true;
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "La nota debe estar entre 0 y 10.",
                                    "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null,
                                "Por favor, introduce un número válido.",
                                "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

                notas[i][j] = nota; // Guardamos la nota validada
            }
        }

        // --- CALCULAR Y MOSTRAR RESULTADOS DE CADA ALUMNO ---
        StringBuilder resultado = new StringBuilder(); // Acumulará el texto para mostrar al final
        resultado.append("--- Resultados ---\n\n");

        for (int i = 0; i < ALUMNOS; i++) {
            double suma = 0;
            double minima = 10;
            double maxima = 0;

            for (int j = 0; j < ASIGNATURAS; j++) {
                double nota = notas[i][j];
                suma += nota;

                if (nota < minima) minima = nota;
                if (nota > maxima) maxima = nota;
            }

            double media = suma / ASIGNATURAS;

            resultado.append("Alumno ").append(i + 1).append(":\n");
            resultado.append(String.format("  Nota mínima: %.2f\n", minima));
            resultado.append(String.format("  Nota máxima: %.2f\n", maxima));
            resultado.append(String.format("  Nota media : %.2f\n\n", media));
        }

        // --- MOSTRAR RESULTADOS EN UNA SOLA VENTANA ---
        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultados finales", JOptionPane.INFORMATION_MESSAGE);

        // Fin del programa
        System.exit(0);
    }
}
