/*
 * Descripcion: Comprobar si un numero es positivo, negativo o cero utilizando una funcion.
 * Autor: Juan Carlos
 * Fecha: 14/11/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero entero: ");
		int numero = sc.nextInt();
		
		int signo = dimeSigno(numero);
		
		/*if (signo < 0) {
			System.out.println("El numero es negativo.");
		} else if (signo == 0) {
			System.out.println("El numero es cero.");
		} else if (signo > 0) {
			System.out.println("El numero es positivo.");
		} */
		
		switch (signo) {
	    case -1 -> System.out.println("El numero es negativo.");
	    case 0  -> System.out.println("El numero es cero.");
	    case 1  -> System.out.println("El numero es positivo.");
	    }
		
		sc.close();

	}
	
	public static int dimeSigno(int a) {
	/*	int signo = 0;
		
		if (a < 0) {
			signo = -1;
		} else if (a == 0) {
			signo = 0;
		} else if (a > 0) {
			signo = 1;
		}
		
		return signo; */
		
		if (a < 0) return -1;
	    if (a == 0) return 0;
	    return 1;
	}
	

}
