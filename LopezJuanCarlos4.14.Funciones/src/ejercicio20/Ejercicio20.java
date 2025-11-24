/*
 * Descripcion: Pedir un numero y mostrar su tabla de multiplicar
 * Autor: Juan Carlos
 * Fecha: 24/11/25
 */
package ejercicio20;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un numero entero del 1 al 10: ");
		int numeroAmultiplicar = sc.nextInt();
		
		tablaDeMultiplicar(numeroAmultiplicar);
		
		sc.close();
	
	}
	
	public static void tablaDeMultiplicar(int a) {
		System.out.println("Tabla del " + a + ":");
	    for (int i = 1; i <= 10; i++) {
	        System.out.printf("%d x %d = %d%n", a, i, a * i);
	    }
	}

}
