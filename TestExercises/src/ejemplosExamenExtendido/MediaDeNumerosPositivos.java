/*
 * Descripcion: Pide números por teclado hasta que el usuario introduzca uno negativo.
Al final, muestra la media de los números positivos introducidos.
 */
package ejemplosExamenExtendido;

import java.util.Scanner;

public class MediaDeNumerosPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        do {
            System.out.print("Introduce un número (negativo para salir): ");
            numero = sc.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

	}

}
