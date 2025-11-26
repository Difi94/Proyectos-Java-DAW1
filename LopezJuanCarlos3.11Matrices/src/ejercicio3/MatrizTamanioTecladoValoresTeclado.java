/*
 * Descripción:
 * Programa que crea una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduce en ella NxM valores (también introducidos por teclado). Luego recorre la
 * matriz y muestra por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son iguales a cero.
 */

package ejercicio3;

import java.util.Scanner; // Importamos Scanner para leer datos desde el teclado

public class MatrizTamanioTecladoValoresTeclado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer entrada del usuario
        
        // 1️ Pedir tamaño de la matriz
        System.out.print("Introduce el número de filas (N): ");
        int N = sc.nextInt(); // Número de filas
        
        System.out.print("Introduce el número de columnas (M): ");
        int M = sc.nextInt(); // Número de columnas
        
        // 2️ Crear la matriz
        int[][] matriz = new int[N][M];
        
        // 3️ Rellenar la matriz con valores introducidos por el usuario
        System.out.println("Introduce los valores de la matriz:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt(); // Leer valor para cada posición
            }
        }
        
        // 4️ Inicializar contadores
        int mayores = 0; // Contará los números mayores que 0
        int menores = 0; // Contará los números menores que 0
        int ceros = 0;   // Contará los ceros
        
        // 5️ Recorrer la matriz para contar los valores
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matriz[i][j] > 0) {
                    mayores++;
                } else if (matriz[i][j] < 0) {
                    menores++;
                } else {
                    ceros++;
                }
            }
        }
        
        // 6️ Mostrar resultados
        System.out.println("\nResultados:");
        System.out.println("Números mayores que 0: " + mayores);
        System.out.println("Números menores que 0: " + menores);
        System.out.println("Números iguales a 0: " + ceros);
        
        sc.close(); // Cerramos el Scanner
    }
}
