/*
 * Descripcion: Escribe un programa que pida un número entero al usuario (int) y luego muestre la suma
de sus cifras. Por ejemplo, dado el número 35 su suma es 8, dado el número 719 su suma
es 17, y dado el 1002 su suma es 3.
 */
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16SumaDeCifras {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        int suma = 0;
        int n = Math.abs(numero); // para manejar números negativos

        while (n > 0) {
            suma += n % 10; // sumamos la última cifra
            n = n / 10;     // eliminamos la última cifra
        }

        System.out.println("La suma de las cifras es: " + suma);

        sc.close();

	}

}
