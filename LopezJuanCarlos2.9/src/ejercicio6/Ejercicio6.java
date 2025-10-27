/*
 * Descripcion: leer 5 números y mostrar un mensaje de si ha leído algún número negativo o no
 * Autor: Juan Carlos
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);

	        boolean negativo = false;
	        double num;

	        System.out.println("Dame 5 numeros no nulos:");

	        for (int contador = 1; contador <= 5; contador++) {
	            System.out.print("Número " + contador + ": ");
	            num = teclado.nextDouble();

	            // Validar que no sea nulo
	            while (num == 0) {
	                System.out.print("El numero no puede ser 0, ingrese otro: ");
	                num = teclado.nextDouble();
	            }

	            // Verificar si es negativo
	            if (num < 0) {
	                negativo = true;
	            }
	        }

	        if (negativo) {
	            System.out.println("Se han leido numeros negativos.");
	        } else {
	            System.out.println("No se han leido numeros negativos.");
	        }

	        teclado.close();
		}
	
}
