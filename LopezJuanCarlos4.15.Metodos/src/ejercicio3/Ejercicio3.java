/*
 * Descripcion: Crea un método llamado indicaMesDias que devolverá una cadena de texto.
 * El método recibirá un valor entero.
 * Comprobará que el valor oscile entre 1 y 12 (ambos inclusive)
 * En caso contrario devolverá un mensaje indicando que el mes es incorrecto.
 * En caso de ser correcto devolverá un mensaje indicando el mes al que se refiere y el
 * número de días del mes: Ejemplo: " Enero, 31 días".
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime el numero del mes: ");
		int numeroMes = sc.nextInt();
		
		System.out.println("El " + numeroMes + " corresponde a " + indicaMesDias(numeroMes));
		
		sc.close();

	}
	
	public static String indicaMesDias (int a) {
		if (a < 1 || a > 12) {
			return "El numero del mes es incorrecto";
		} else {
			switch (a) {
			case 1: return " Enero, 31 días";
			
			case 2: return " Febrero, 28 días";
			
			case 3: return " Marzo, 31 días";
			
			case 4: return " Abril, 30 días";
			
			case 5: return " Mayo, 31 días";
			
			case 6: return " Junio, 30 días";
			
			case 7: return " Julio, 31 días";
			
			case 8: return " Agosto, 31 días";
			
			case 9: return " Septiempre, 30 días";
			
			case 10: return " Octubre, 31 días";
			
			case 11: return " Noviembre, 30 días";
			
			case 12: return " Diciembre, 31 días";
			
			default: return "El numero del mes no existe";
			}
		}
	}
}
