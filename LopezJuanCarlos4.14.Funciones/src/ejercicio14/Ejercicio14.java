/*
 * Descripcion: Pedir un caracter y el numero de veces a repetir
 * mostrarlo en forma de piramide.
 * Autor: Juan Carlos
 * Fecha: 19/11/25
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un caracter: ");
		String caracter = sc.nextLine();
		System.out.println("Número de veces a repetirlo: ");
		int repeticion = sc.nextInt();
		
		dibuja(caracter, repeticion);
		
		sc.close();
		
	}
	
	public static void dibuja(String caracter, int repeticion) {
		
		for (int i = 1; i <= repeticion; i++) {
			int numCaracteres = 2 * i - 1;
	        int espacios = repeticion - i;
	        System.out.println(" ".repeat(espacios) + caracter.repeat(numCaracteres));
		}
	}

}
