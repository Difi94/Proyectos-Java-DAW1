/*
 * Descripcion: comprobar si una terna de valores enteros (3 valores) se ajusta
 * a la ecuación de Pitágoras: x ² + y ² = z ². El programa solicita al usuario los valores x, y, z. Se
 * deberá crear una función a la que se le pase x, y, z y devuelva si son iguales o no.
 * Autor: Juan Carlos
 * Fecha: 21/11/25
 */
package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime X: ");
		int x = sc.nextInt();
		System.out.println("Dime Y: ");
		int y = sc.nextInt();
		System.out.println("Dime Z: ");
		int z = sc.nextInt();
		
		 if (sonIguales(x, y, z)) {
	            System.out.println("Los valores forman una terna.");
	        } else {
	            System.out.println("Los valores NO forman una terna.");
	        }
		 sc.close();

	}
	
	public static boolean sonIguales (int x, int y, int z) {
		return (x * x) + (y * y) == (z * z);
	}

}
