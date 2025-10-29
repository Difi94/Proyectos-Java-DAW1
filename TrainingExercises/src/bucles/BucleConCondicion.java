/*
 * Descripcion: Pide números hasta que el usuario introduzca un número negativo.
 */
package bucles;

import java.util.Scanner;

public class BucleConCondicion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
		    System.out.print("Introduce un número (negativo para salir): ");
		    n = sc.nextInt();
		} while (n >= 0);

		System.out.println("Programa terminado.");


	}

}
