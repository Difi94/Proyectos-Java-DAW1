/*
 * Descripcion: "Escribe un programa que pida al usuario un número entero positivo
 *  y muestre por pantalla todos los números primos desde 1 hasta ese número.
Para cada número, el programa debe comprobar mediante un bucle si es primo o no.
Finalmente, indicará cuántos números primos se han encontrado."
 */
package bucles;

import java.util.Scanner;

public class Primos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un número entero positivo:");
        int num = teclado.nextInt();
        int contadorPrimos = 0;

        // Recorremos desde 2 hasta el número introducido
        for (int i = 2; i <= num; i++) {
            boolean esPrimo = true;

            // Comprobamos si i es primo
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    //break; // Si ya no es primo, terminamos el bucle interno
                }
            }

            // Si es primo, lo mostramos y contamos
            if (esPrimo) {
                System.out.print(i + " ");
                contadorPrimos++;
            }
        }

        // Salto de línea y mostramos número total de primos
        System.out.println("\nTotal de números primos encontrados: " + contadorPrimos);

        teclado.close();
		
		
	}

}
