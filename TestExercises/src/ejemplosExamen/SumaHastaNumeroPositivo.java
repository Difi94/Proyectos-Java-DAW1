/*
 * Descripcion: Pide números al usuario hasta que introduzca un número negativo.
El programa mostrará la suma de todos los números positivos introducidos.
 */
package ejemplosExamen;

import java.util.Scanner;

public class SumaHastaNumeroPositivo {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int suma = 0;
	        int numero;

	        do {
	            System.out.print("Introduce un número (negativo para salir): ");
	            numero = sc.nextInt();
	            if (numero >= 0) {
	                suma += numero;
	            }
	        } while (numero >= 0);

	        System.out.println("La suma de los números positivos es: " + suma);

	}

}
