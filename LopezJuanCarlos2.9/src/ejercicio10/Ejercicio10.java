/*
 * Descripcion:  secuencia de notas que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.
 * Autor: Juan Carlos
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int nota;
        boolean hayDiez = false;
		
		do {
            System.out.print("Dame una nota (-1 para terminar): ");
            nota = teclado.nextInt();
            
            if (nota == 10) {
                hayDiez = true;
            }
            
        } while (nota != -1);
        
        System.out.println("Gracias por introducir tus notas");
        
        if (hayDiez) {
            System.out.println("Has sacado un 10");
        } else {
            System.out.println("No hay ningun 10");
        }

        teclado.close();

	}

}
