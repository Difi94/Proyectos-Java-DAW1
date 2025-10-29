/*
 * Pide un número entero y muestra si es par o impar.
 * % devuelve el resto de una división.

Si numero % 2 == 0, el número es divisible por 2 → par.

Si no, es impar.
 */
package ejemplosExamen;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

	}

}
