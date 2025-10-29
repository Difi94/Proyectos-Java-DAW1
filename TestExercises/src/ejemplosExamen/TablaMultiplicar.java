/*
 * Descripcion: Pide un número del 1 al 10 y muestra su tabla de multiplicar.
 * Se repite el bucle 10 veces.

Cada iteración muestra la multiplicación del número introducido por i.
 */
package ejemplosExamen;

import java.util.Scanner;

public class TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número (1-10): ");
        int num = sc.nextInt();

        System.out.println("Tabla de multiplicar del " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

	}

}
