/*
 * Descripcion: usando do while, solicitar valores positivos,
 * almacenar la suma de los valores y la cantidad de numeros introducidos,
 * el bucle tiene que parar cuando se introduzca un 0,
 * mostrar por pantalla la cantidad de numeros mayores que 0 introducidos asi como la media de ellos
 * Autor: Juan Carlos
 * Fecha: 15/10/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num;
		int suma = 0;
		int contador = 0;
		
		do {
			System.out.println("Dame un numero (0 para terminar):");
			num = teclado.nextInt();
			if (num > 0) {
				suma = num;
				contador++;
			}
		} while (num != 0); 
			if (contador > 0) {
				double media = suma / contador;
				System.out.println("Cantidad de nnmeros introducidos mayores que 0: " + contador);
				System.out.printf("Media: " + media);
			}
			
		
teclado.close();
	}

}
