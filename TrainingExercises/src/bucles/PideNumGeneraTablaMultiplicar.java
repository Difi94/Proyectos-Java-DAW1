/*
 * Descripcion: Pide un número y muestra su tabla de multiplicar del 1 al 10.
 */
package bucles;

import java.util.Scanner;

public class PideNumGeneraTablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
		    System.out.println(num + " x " + i + " = " + (num * i));
		}


	}

}
