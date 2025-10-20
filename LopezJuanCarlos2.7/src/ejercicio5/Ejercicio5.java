/*
 * 
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		double num1 = teclado.nextDouble();
		
		System.out.println("Dame otro numero:");
		double num2 = teclado.nextDouble();
		
		System.out.println("Indique la operacion que quiere realizar (Inserte un numero):");
		System.out.println("(1) Suma");
		System.out.println("(2) Resta");
		System.out.println("(3) Multiplicacion");
		System.out.println("(4) Division");
		double operacion = teclado.nextDouble();
		
		if (operacion == 1) {
			operacion = num1 + num2;
			System.out.println("La suma de " + num1 + " y " + num2 + " es: " + operacion);
		} if (operacion == 2) {
			operacion = num1 - num2;
			System.out.println("La resta de " + num1 + " y " + num2 + " es: " + operacion);
		} if (operacion == 3) {
			operacion = num1 * num2;
			System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + operacion);
		} if (operacion == 4) {
			operacion = num1 / num2;
			System.out.println("La division de " + num1 + " y " + num2 + " es: " + operacion);
		}
	}

}
