/*
 * Descripcion: Pide 5 números y muestra la suma total.
 * Se usa una variable suma acumuladora.

En cada vuelta del bucle for, se lee un número y se añade a suma.
 */
package ejemplosExamen;

import java.util.Scanner;

public class SumaDeNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Introduce número " + i + ": ");
            int n = sc.nextInt();
            suma += n; // suma = suma + n
        }

        System.out.println("La suma total es: " + suma);

	}

}
