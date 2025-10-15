/*
 * Descripcion: pedimos al usuario un numero inicial y final, mostrar los números múltiplos de 5 entre esos numeros

 */
package ejemplofor;

import java.util.Scanner;

public class Ejerciciobuclefor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero inicial:");
		int inicial = teclado.nextInt();
		System.out.println("Dame un numero final:");
		int fin = teclado.nextInt();
		
		for (int contador = inicial; contador<=fin; contador++) {
			if (contador % 5 == 0) {
				System.out.println(contador + " es multiplo de 5");
			
		}

	}

	}
}