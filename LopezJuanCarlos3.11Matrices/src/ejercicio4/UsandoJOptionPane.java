/*
 * Descripción:
 * Programa que almacena las notas de 4 alumnos (Alumno 1, Alumno 2, etc.)
 * en 5 asignaturas. El usuario introduce las notas mediante paneles (JOptionPane)
 * y luego se muestran, también por panel, la nota mínima, máxima y media de cada alumno.
 */

package ejercicio4;

import javax.swing.JOptionPane; // Importamos la clase para usar cuadros de diálogo

public class UsandoJOptionPane {

    public static void main(String[] args) {

        // Definimos constantes para el número de alumnos y asignaturas
        final int NUM_ALUMNOS = 4;
        final int NUM_ASIGNATURAS = 5;

        // Creamos una matriz para almacenar las notas
        double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

        // Bucle para pedir las notas de cada alumno
        for (int i = 0; i < NUM_ALUMNOS; i++) {
            // Mostramos un mensaje inicial
            JOptionPane.showMessageDialog(null, "Introduce las notas del Alumno " + (i + 1));

            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                boolean notaValida = false;
                double nota = 0;

                // Repetimos hasta que se introduzca una nota válida
                while (!notaValida) {
                    try {
                        // Solicitamos la nota mediante un panel de entrada
                        String input = JOptionPane.showInputDialog(
                                null,
                                "Introduce la nota de la Asignatura " + (j + 1) + " (0 a 10):"
                        );

                        // Si el usuario pulsa "Cancelar", salimos del programa
                        if (input == null) {
                            JOptionPane.showMessageDialog(null, "Programa cancelado.");
                            System.exit(0);
                        }

                        // Convertimos el texto introducido a número
                        nota = Double.parseDouble(input);

                        // Validamos que esté entre 0 y 10
                        if (nota >= 0 && nota <= 10) {
                            notaValida = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Error: La nota debe estar entre 0 y 10.");
                        }

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Error: Debes introducir un número válido.");
                    }
                }

                // Guardamos la nota válida en la matriz
                notas[i][j] = nota;
            }
        }

        // Bucle para calcular y mostrar resultados de cada alumno
        StringBuilder resultado = new StringBuilder(); // Para acumular el texto del resumen final

        for (int i = 0; i < NUM_ALUMNOS; i++) {
            double suma = 0;
            double notaMin = 10;
            double notaMax = 0;

            for (int j = 0; j < NUM_ASIGNATURAS; j++) {
                double nota = notas[i][j];
                suma += nota;

                if (nota < notaMin) notaMin = nota;
                if (nota > notaMax) notaMax = nota;
            }

            double media = suma / NUM_ASIGNATURAS;

            // Agregamos los resultados al texto final
            resultado.append("Alumno ").append(i + 1).append(":\n")
                    .append(" - Nota mínima: ").append(notaMin).append("\n")
                    .append(" - Nota máxima: ").append(notaMax).append("\n")
                    .append(" - Nota media: ").append(String.format("%.2f", media)).append("\n\n");
        }

        // Mostramos el resultado en un único panel
        JOptionPane.showMessageDialog(null, resultado.toString(), "Resultados Finales", JOptionPane.INFORMATION_MESSAGE);
    }
}
