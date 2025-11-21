/*
 * Descripcion: pedir numeros enteros hasta que se introduzca el 0, diciendo para
 * cada numero si es primo o no. el 1 no es primo por convenio.
 * Autor: Juan Carlos
 * Fecha: 20/11/25
 */
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Dame un numero entero: ");
		
		number = sc.nextInt();
		
		while (number != 0) {
			if (esPrimo(number)) {
                System.out.println(number + " es primo");
            } else {
                System.out.println(number + " no es primo");
            }
            System.out.println("Dame un número entero: ");
            number = sc.nextInt();
		}

	}
	
	public static boolean esPrimo(int a) {
		if (a <= 1) {
            return false; 
        }

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
	}

}
