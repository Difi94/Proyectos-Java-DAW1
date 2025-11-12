/*
 * Descripción: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
 * y luego muestre la matriz por pantalla.
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio1;

public class Ejercicio1Detallado {

    public static void main(String[] args) {
        // Se declara una matriz (array bidimensional) de tipo entero de 5 filas y 5 columnas.
        int[][] bidimensional = new int[5][5];
        
        // Variable contador que servirá para ir almacenando los números del 1 al 25.
        int contador = 1;

        // Rellenar la matriz con los números del 1 al 25
        // Bucle externo/padre: recorre las filas (de 0 a 4)
        for (int fila = 0; fila < 5; fila++) {
            // Bucle interno/hijo: recorre las columnas (de 0 a 4)
            for (int col = 0; col < 5; col++) {
                // Se asigna el valor del contador a la posición [fila][col]
                bidimensional[fila][col] = contador;
                // Se incrementa el contador para el siguiente número
                contador++;
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Matriz 5x5 con los números del 1 al 25:");
        
        // Se vuelve a recorrer la matriz para imprimir sus valores
        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                // %3d indica que cada número ocupará al menos 3 espacios, alineando la salida en columnas
                System.out.printf("%3d ", bidimensional[fila][col]);
            }
            // Salto de línea después de imprimir cada fila
            System.out.println();
        }
    }
}
