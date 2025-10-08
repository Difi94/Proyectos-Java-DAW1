/*
 * Descripcion: transformar pesetas en euros y viceversa
 * Autor: Juan Carlos
 * Fecha: 01/10/25
 */

package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Euros a convertir: ");
		double euros = teclado.nextDouble();
		double pesetas = euros * 166.386;
		
		System.out.println(euros + " euros son " + pesetas + " pesetas");
		
		System.out.println("Pesetas a convertir: ");
		double pesetas1 = teclado.nextDouble();
		double euros1 = pesetas / 166.386;
		
		System.out.println(pesetas1 + " pesetas son " + euros1 + " euros");
		
		teclado.close();
		

	}

}
