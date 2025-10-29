/*
 * Descripcion: Pide un número entero positivo y muestra cuántas cifras tiene.
 */
package ejemplosExamenExtendido;

import java.util.Scanner;

public class ContadorDeDigitos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número positivo: ");
        int num = sc.nextInt();

        int contador = 0;

        if (num == 0) {
            contador = 1;
        } else {
            while (num > 0) {
                num = num / 10; // eliminar la última cifra
                contador++;
            }
        }

        System.out.println("El número tiene " + contador + " cifra(s).");

	}

}
