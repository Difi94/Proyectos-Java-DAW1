/*
 * Descripcion:
 */
package ejemploExpresionesRegulares;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ComparaCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String posibleDni;
		
		//Generamos el patrón
		Pattern patron = Pattern.compile("[0-9]{8}[A-Z]");
		
		System.out.println("Dame el DNI: ");
		posibleDni = sc.nextLine();
		
		//Comparamos el texto con el dni introducido
		Matcher texto = patron.matcher(posibleDni);
		
		//comprobamos que el texto haga match con el patron
		if (texto.matches()) {
			System.out.println("El DNI tiene forma correcta.");
		} else {
			System.out.println("El DNI no tiene forma correcta.");
		}
		
	}

}
