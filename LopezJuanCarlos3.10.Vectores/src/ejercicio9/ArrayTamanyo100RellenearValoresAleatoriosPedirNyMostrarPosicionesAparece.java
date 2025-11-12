/*
 * Descripcion: Crea un programa que cree un array de enteros de tamaño 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N. 
 * Autor:
 * Fecha: 
 */
package ejercicio9;

import java.util.Scanner;

public class ArrayTamanyo100RellenearValoresAleatoriosPedirNyMostrarPosicionesAparece {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        
        int[] array = new int[100];
        
        // Rellenar el array con números aleatorios del 1 al 10
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 10);
        }
        
        System.out.print("Dame un número entre 1 y 10: ");
        int num = sc.nextInt();
        
        boolean encontrado = false;
        System.out.print("El número " + num + " se encuentra en las posiciones: ");
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("El número " + num + " no se encuentra en el array.");
        } else {
            System.out.println(); // salto de línea final
        }

        sc.close();
	}

}
