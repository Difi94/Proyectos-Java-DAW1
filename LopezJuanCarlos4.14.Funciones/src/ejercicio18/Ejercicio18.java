/*
 * Descripcion: Calcular el DNI.
 * Autor: Juan Carlos
 * Fecha: 21/11/25
 */
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de tu DNI: ");
		int dni = sc.nextInt();
		
		System.out.println("La letra de tu DNI es: " + calculaDNI(dni));
		System.out.println("Tu DNI completo es: " + String.valueOf(dni) + calculaDNI(dni));
		
		sc.close();
		

	}
	//calcula la letra asociada al DNI dividiendo el numero del DNI entre las letras posibles del dni (23 contando la posicion 0) y el resto referencia a la posicion de la letra
	//si el resto es 0 nos dara la letra T
	public static char calculaDNI(int dni) {
		final String Letras_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letra = Letras_DNI.charAt(dni % Letras_DNI.length());
        return letra;
	}

}
