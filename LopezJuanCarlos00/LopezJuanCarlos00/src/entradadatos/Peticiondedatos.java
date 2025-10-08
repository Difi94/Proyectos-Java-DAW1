/*
 * 
 */
package entradadatos;

import java.util.Scanner;

public class Peticiondedatos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int edadAlumno;
		System.out.print("Dame tu edad:");
		edadAlumno = teclado.nextInt();
		System.out.println("La edad es: " + edadAlumno);
		
		teclado.nextLine(); // despues de pedir valor numero y antes de pedir cadena de caracteres
		String nombreAlumno;
		System.out.println("Dime tu nombre: ");
		nombreAlumno = teclado.nextLine();
		System.out.println("Tu nombre es: " + nombreAlumno);
		
		System.out.println("Dime tu peso: ");
		double pesoAlumno;
		pesoAlumno = teclado.nextDouble();
		System.out.println("Tu peso es: " + pesoAlumno);
		
	}

}
