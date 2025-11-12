/*
 * Descripcion: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
 * y luego muestre la matriz por pantalla.
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio1;

public class Matriz5x5MostrarMatriz {

    public static void main(String[] args) {
        int[][] bidimensional = new int[5][5]; // 5 filas y 5 columnas
        int contador = 1;

        // Rellenar la matriz con los números del 1 al 25
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                bidimensional[fila][col] = contador;
                contador++;
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz 5x5 con los números del 1 al 25:");
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                System.out.printf("%3d ", bidimensional[fila][col]); // formato bonito
            }
            System.out.println(); // salto de línea al final de cada fila
        }
    }
}
