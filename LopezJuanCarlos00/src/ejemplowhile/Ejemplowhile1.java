/*
 * Descripcion: Escribe un programa que solicite dos números por teclado (inicio y fin, donde inicio debería ser menor o igual que fin) y muestre por pantalla todos los números que van desde inicio hasta fin, todos en una misma línea.
 */
package ejemplowhile;

import java.util.Scanner;

public class Ejemplowhile1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, start, end;
		
		System.out.println("Dame un numero inicial:");
		start = teclado.nextInt();
		
		System.out.println("Dame un numero final:");
		end = teclado.nextInt();
		
		num = 0; //contador
		
		while (num < end) {
			num = start++;
		}
		System.out.println("Secuencia de numeros de Inicio a fin: " + num);
		
teclado.close();
	}

}
