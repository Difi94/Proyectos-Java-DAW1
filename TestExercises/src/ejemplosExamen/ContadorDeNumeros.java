/*
 * Muestra todos los números del 1 al 20 usando un bucle for.
 * for (int i = 1; i <= 20; i++) → empieza en 1, se repite mientras i sea ≤ 20, y va sumando 1 cada vez.

System.out.print() muestra en la misma línea (sin salto).
 */
package ejemplosExamen;

import java.util.Scanner;

public class ContadorDeNumeros {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }

	}

}
