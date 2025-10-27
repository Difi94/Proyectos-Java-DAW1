/*
 * Descripcion: numeros desde al 1 hasta N
 * Autor: Juan Carlos
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero positivo: ");
        int num = teclado.nextInt();

        if (num < 1) {
            System.out.println("Numero erroneo, introduce un numero entero positivo.");
        } else {
            System.out.println("Numeros del 1 hasta " + num + ":");
            for (int contador = 1; contador <= num; contador++) {
                System.out.println(contador);
            }
        }
        
teclado.close();

	}

}
