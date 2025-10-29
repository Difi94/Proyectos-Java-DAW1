/*
 * Descripcion: Realiza un programa que diga si un número introducido por teclado es par y/o divisible
entre 5.
 */
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9ParODivisible {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        
        boolean esPar = (numero % 2 == 0);
        boolean divisible5 = (numero % 5 == 0);
        
        if (esPar && divisible5) {
            System.out.println("El número es par y divisible entre 5.");
        } else if (esPar) {
            System.out.println("El número es par pero no es divisible entre 5.");
        } else if (divisible5) {
            System.out.println("El número es divisible entre 5 pero no es par.");
        } else {
            System.out.println("El número no es par ni divisible entre 5.");
        }

        sc.close();


	}

}
