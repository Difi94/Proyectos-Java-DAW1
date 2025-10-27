/*
 * Descripcion: leer números hasta que se introduzca un 0, y mostrar
 *  si ha leído algún número negativo, cuantos positivos y cuantos negativos.
 * Autor: Juan Carlos
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
        int positivos = 0;
        int negativos = 0;
        boolean hayNegativo = false;
		
		do {
            System.out.print("Dame un numero (0 para terminar): ");
            num = teclado.nextInt();
            
            if (num > 0) {
                positivos++;
            } else if (num < 0) {
                negativos++;
                hayNegativo = true;
            }
            
        } while (num != 0);
        
        System.out.println("\nHas introducido " + positivos + " numeros positivos y " + negativos + " numeros negativos.");
        
        if (hayNegativo) {
            System.out.println("Se han introducido numeros negativos.");
        } else {
            System.out.println("No se han introducido numeros negativos.");
        }

        teclado.close();
    }

	}

