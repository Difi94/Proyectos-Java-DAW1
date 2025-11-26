/*
 * Descripcion: Comparar si dos nombres son iguales
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime un nombre: ");
		String nombre1 = sc.nextLine().toLowerCase();
		
		System.out.println("Dime otro nombre: ");
		String nombre2 = sc.nextLine().toLowerCase();
		
		if (comparaNombres(nombre1,nombre2)) {
			System.out.println("Los dos nombres son iguales.");
		} else {
			System.out.println("Los nombres son diferentes");
		}
		
		sc.close();

	}
	
	public static boolean comparaNombres (String a, String b) {
		if (a.equals(b)) {
			return true;
		} else {
			return false;
		}
	}

}
