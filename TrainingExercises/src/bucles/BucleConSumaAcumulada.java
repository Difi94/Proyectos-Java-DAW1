/*
 * Descripcion: Pide 5 números y muestra la suma total.
 */
package bucles;

import java.util.Scanner;

public class BucleConSumaAcumulada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		for (int i = 1; i <= 5; i++) {
		    System.out.print("Introduce número " + i + ": ");
		    int n = sc.nextInt();
		    suma += n;
		}
		System.out.println("La suma total es: " + suma);


	}

}
