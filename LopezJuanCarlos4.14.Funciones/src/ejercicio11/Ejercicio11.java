/*
 * Descripcion: Escribir una tabla de multiplicar de un numero introducido por teclado.
 * Autor: Juan Carlos
 * Fecha: 17/11/25
 */
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un numero para mostrar su tabala de multiplicar: ");
		int numeroAmultiplicar = sc.nextInt();
		
		System.out.println(tablaMultiplicar(numeroAmultiplicar));
		
		sc.close();

	}
	
	public static String tablaMultiplicar(int a) {
	/*	StringBuilder tabla = new StringBuilder();
		for (int i = 1; i <= 10; i++) {
			int resultado = a * i;
			tabla.append(a).append(" * ").append(i).append(" = ").append(resultado).append("\n");
		}
		
		return tabla.toString(); */
		
		String tabla = "";
	    for (int i = 1; i <= 10; i++) {
	        tabla += a + " * " + i + " = " + (a * i) + "\n";
	    }
	    return tabla;
	}

}
