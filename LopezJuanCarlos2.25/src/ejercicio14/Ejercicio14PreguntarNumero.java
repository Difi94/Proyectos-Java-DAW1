/*
 * Descripcion: Escribe un programa que pregunte un número X al usuario y diga si es primo o no.
Un número es primo si solo es divisible por 1 y por él mismo.

 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14PreguntarNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false; // 0 y 1 no son primos
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break; // ya encontramos un divisor, no es primo
                }
            }
        }

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }

        sc.close();
	}

}
