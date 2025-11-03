/*
 * Descripcion: Pedir dos valores N y M y luego cree un array de tamaño N 
 * que contenga M en todas sus posiciones. Luego muestra el array por pantalla.
 * Autor: Juan Carlos
 * Fecha: 03/11/25
 */
package ejercicio15;

import java.util.Scanner;

public class PedirTamañoContenido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        // Pedimos el tamaño del array
        System.out.print("Dame un número para el tamaño del array (N): ");
        int tamanyo = sc.nextInt();
        
        // Creamos el array
        int[] array = new int[tamanyo];
        
        // Pedimos el valor que se repetirá en todas las posiciones
        System.out.print("Dame un número para rellenar el array (M): ");
        int contenido = sc.nextInt();
        
        // Llenamos el array con ese valor
        for (int i = 0; i < array.length; i++) {
            array[i] = contenido;
        }
        
        // Mostramos el array por pantalla
        System.out.println("Contenido del array:");
        for (int valor : array) {
            System.out.print(valor + " ");
        }

        sc.close();
	}

}
