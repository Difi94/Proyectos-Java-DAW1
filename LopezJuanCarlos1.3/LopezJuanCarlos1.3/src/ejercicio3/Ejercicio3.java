/*
 * Descripcion: pedir el valor de dos variables al usuario e intercambiar sus valores
 * Autor: Juan Carlos
 * Fecha: 01/10/25
 */

package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero: ");
		double num1 = teclado.nextDouble();
		
		System.out.println("Dame otro numero: ");
		double num2 = teclado.nextDouble();
		
		System.out.println("Antes del intercambio:");
        System.out.println("Primer numero " + num1);
        System.out.println("Segundo numero " + num2);
		
		double temp = num1;
	    num1 = num2;
	    num2 = temp;
		
	    System.out.println("Despues del intercambio:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
		
		teclado.close();

	}

}
