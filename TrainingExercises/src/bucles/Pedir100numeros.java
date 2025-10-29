/*
 * Descripcion: leer 100 números y luego muestre un mensaje si ha leído algún numero negativo o no,
 *  indicando cuantos han sido positivos y cuantos negativos
 *   y termine cuando se introduzca un 0
 */
package bucles;

import java.util.Scanner;

public class Pedir100numeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        int positivos = 0;
        int negativos = 0;
        int contador = 0;
        int numero;

        System.out.println("Introduce números (hasta 100). Escribe 0 para terminar:");

        while (contador < 100) {
            numero = teclado.nextInt();

            if (numero >= 0) {
                positivos++;
            } else {
                negativos++;
            }

            contador++;
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

        if (negativos > 0) {
            System.out.println("Se ha leído al menos un número negativo.");
        } else {
            System.out.println("No se ha leído ningún número negativo.");
        }

        teclado.close();

	}

}
