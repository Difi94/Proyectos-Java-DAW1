/*
 * Descripcion: Pedir valores y mostrar una secuencia a raiz de ellos
 * Autor: Juan Carlos
 * Fecha: 30/11/25
 */
package ejercicio13;

import java.util.Scanner;

public class SecuenciaAritmetica {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Pedimos los datos
        System.out.print("Introduce el valor inicial (V): ");
        int valorInicial = sc.nextInt();

        System.out.print("Introduce el incremento (I): ");
        int incremento = sc.nextInt();

        System.out.print("Introduce la cantidad de valores (N): ");
        int cantidad = sc.nextInt();

        // Creamos el array con tamaño N
        int[] secuencia = new int[cantidad];

        // Calculamos la secuencia aritmética
        for (int i = 0; i < cantidad; i++) {
            secuencia[i] = valorInicial + i * incremento;
        }

        // Mostramos la secuencia
        System.out.println("Secuencia aritmética generada:");
        for (int num : secuencia) {
            System.out.print(num + " ");
        }

        sc.close();
	}

}
