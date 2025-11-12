/*
 * Descripción: Crea un programa que cree una matriz de tamaño NxM (tamaño introducido por teclado) e
 * introduzca en ella NxM valores (también introducidos por teclado). Luego deberá recorrer la
 * matriz y al final mostrar por pantalla cuántos valores son mayores que cero, cuántos son
 * menores que cero y cuántos son igual a cero.
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio3;

import java.util.Scanner; // Importamos la clase Scanner para leer datos desde el teclado

public class MatrizDeTamanyoNxMRecorrerlaYcalcular {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // Objeto Scanner para leer entradas del usuario
        
        // --- PEDIR EL TAMAÑO DE LA MATRIZ ---
        System.out.print("Introduce el número de filas (N): ");
        int filas = sc.nextInt(); // Número de filas que tendrá la matriz
        
        System.out.print("Introduce el número de columnas (M): ");
        int columnas = sc.nextInt(); // Número de columnas que tendrá la matriz
        
        // --- CREAR LA MATRIZ ---
        int[][] matriz = new int[filas][columnas]; // Se crea la matriz de tamaño NxM
        
        // --- RELLENAR LA MATRIZ CON VALORES INTRODUCIDOS POR EL USUARIO ---
        System.out.println("\nIntroduce los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt(); // Se guarda el valor introducido
            }
        }
        
        // --- VARIABLES PARA CONTAR LOS TIPOS DE VALORES ---
        int mayores = 0; // Contará los números mayores que 0
        int menores = 0; // Contará los números menores que 0
        int iguales = 0; // Contará los números iguales a 0
        
        // --- RECORRER LA MATRIZ Y CONTAR ---
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz[i][j] > 0) {
                    mayores++;
                } else if (matriz[i][j] < 0) {
                    menores++;
                } else {
                    iguales++;
                }
            }
        }
        
        // --- MOSTRAR LOS RESULTADOS ---
        System.out.println("\nResultados:");
        System.out.println("Números mayores que 0: " + mayores);
        System.out.println("Números menores que 0: " + menores);
        System.out.println("Números iguales a 0: " + iguales);
        
        sc.close(); // Cerramos el Scanner para liberar recursos
    }
}
