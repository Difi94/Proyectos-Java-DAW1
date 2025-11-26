/*
 * Descripción:
 * Crea un programa que genere una matriz de 10x10 e introduzca los valores de las
 * tablas de multiplicar del 1 al 10 (cada tabla en una fila).
 * Luego mostrará la matriz por pantalla.
 */

package ejercicio2;

public class MatrizConValores {

	public static void main(String[] args) {
		
		// Creamos una matriz (array bidimensional) de 10 filas y 10 columnas
		int[][] matriz = new int[10][10];
		
		// Rellenamos la matriz con las tablas de multiplicar del 1 al 10
		// La fila i representará la tabla del número (i + 1)
		for (int i = 0; i < 10; i++) { // Recorremos las filas
			for (int j = 0; j < 10; j++) { // Recorremos las columnas
				matriz[i][j] = (i + 1) * (j + 1); // Calculamos el valor correspondiente
			}
		}
		
		// Mostramos la matriz por pantalla
		System.out.println("Tablas de multiplicar del 1 al 10:\n");
		
		for (int i = 0; i < 10; i++) { // Recorremos las filas
			System.out.print("Tabla del " + (i + 1) + ": ");
			
			for (int j = 0; j < 10; j++) { // Recorremos las columnas
				// Mostramos cada valor separado por un tabulador para que quede alineado
				System.out.print(matriz[i][j] + "\t");
			}
			
			// Salto de línea al terminar cada fila
			System.out.println();
		}
	}
}
