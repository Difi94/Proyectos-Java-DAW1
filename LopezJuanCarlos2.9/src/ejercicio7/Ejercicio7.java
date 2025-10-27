/*
 * Descripcion: leer 10 números y mostrar cuantos son positivos y negativos
 * Autor
 * Fecha
 */
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num = 0;
		int positivos = 0;
		int negativos = 0;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Escribe un numero (no nulo):");
			num = teclado.nextInt();
			if (num > 0) {
				positivos++;
			} else {
				negativos++;
			}
		}
		
		System.out.println("Has introducido: " + positivos + " numeros positivos y " + negativos + " numeros negativos");
        teclado.close();
	}

}
