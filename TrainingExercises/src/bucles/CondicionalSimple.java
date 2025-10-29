/*
 * Descripcion: Pide un número por teclado y muestra si es par o impar.
 */
package bucles;

import java.util.Scanner;

public class CondicionalSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
		    System.out.println("El número es par.");
		} else {
		    System.out.println("El número es impar.");
		}
		sc.close();


	}

}
