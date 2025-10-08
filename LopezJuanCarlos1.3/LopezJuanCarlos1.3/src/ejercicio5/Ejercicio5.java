package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		double num1 = teclado.nextDouble();
		System.out.println("Dame otro numero");
		double num2 = teclado.nextDouble();

		System.out.println("El mayor es " + Math.max(num1, num2));
		System.out.println(num1 + "elevado a " + num2 + " igual a " + Math.pow(num1, num2));
		System.out.println("La raiz cuadrada de: " + num1 + " es: " + Math.sqrt(num1));
		double random = Math.random() * Math.abs(num2);
        System.out.println("Un numero aleatorio entre 0 y " + Math.abs(num2) + " es: " + random);
		
		teclado.close();

	}

}
