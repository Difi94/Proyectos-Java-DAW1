/*
 * Descripción: Crea un programa que cree una matriz de 10x10 e introduzca los valores
 * de las tablas de multiplicar del 1 al 10 (cada tabla en una fila).
 * Luego mostrará la matriz por pantalla.
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio2;

public class Matrix10x10TablaMultiplicar {

    public static void main(String[] args) {
        
        // Declaramos una matriz bidimensional de tamaño 10x10
        // Cada fila representará una tabla de multiplicar (del 1 al 10)
        int[][] tablas = new int[10][10];
        
        // Rellenar la matriz con las tablas de multiplicar
        for (int fila = 0; fila < 10; fila++) { // recorre las filas
            for (int col = 0; col < 10; col++) { // recorre las columnas
                // Como las tablas van del 1 al 10, usamos (fila + 1) y (col + 1)
                tablas[fila][col] = (fila + 1) * (col + 1);
            }
        }

        // Mostrar la matriz por pantalla
        System.out.println("Tablas de multiplicar del 1 al 10:");
        
        // Recorremos de nuevo la matriz para imprimirla
        for (int fila = 0; fila < 10; fila++) {
            System.out.print("Tabla del " + (fila + 1) + ": ");
            for (int col = 0; col < 10; col++) {
                // %4d da formato para que los números queden alineados
                System.out.printf("%4d", tablas[fila][col]);
            }
            System.out.println(); // salto de línea al terminar cada fila
        }
    }
}

