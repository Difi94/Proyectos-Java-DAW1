/*
 * Descripcion:  leer un número positivo N y calcule y visualice su factorial N! Siendo el factorial
 * Autor:
 * Fecha:
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un numero entero positivo: ");
        int n = teclado.nextInt();
        long factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "! = " + factorial);
        
teclado.close();        
    }

	

}
