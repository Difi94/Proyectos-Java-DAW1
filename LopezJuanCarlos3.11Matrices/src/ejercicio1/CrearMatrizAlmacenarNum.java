/*
 * Descripcion: Crea un programa que cree una matriz de tamaño 5x5 que almacene los números del 1 al 25
 * y luego muestre la matriz por pantalla.
 */
package ejercicio1;

public class CrearMatrizAlmacenarNum {

	public static void main(String[] args) {
		 // Creamos una matriz de 5 filas por 5 columnas (tipo int)
        int[][] matriz = new int[5][5];

        // Variable para ir guardando los números del 1 al 25
        int numero = 1;

        // Recorremos las filas de la matriz
        for (int i = 0; i < 5; i++) {
            // Recorremos las columnas de la matriz
            for (int j = 0; j < 5; j++) {
                // Asignamos el valor actual de "numero" a la posición [i][j]
                matriz[i][j] = numero;

                // Incrementamos el número para la siguiente posición
                numero++;
            }
        }

        // Mostramos la matriz por pantalla
        System.out.println("Matriz 5x5 con números del 1 al 25:");

        // Recorremos nuevamente la matriz para mostrar sus valores
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // Imprimimos cada elemento con un espacio para que quede ordenado
                System.out.print(matriz[i][j] + "\t");
            }
            // Al terminar una fila, hacemos un salto de línea
            System.out.println();
        }

	}

}
