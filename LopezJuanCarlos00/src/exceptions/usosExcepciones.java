package exceptions;

import java.util.*;

public class usosExcepciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un entero:");
		int entero;
		boolean error = false;
		
		do {
			try {
				sc.close();
				entero = sc.nextInt();
				error = false;
			} catch (InputMismatchException exTipoDiferente) {
				error = true;
				System.out.println("Te has equivocado, dame el entero");
				sc.nextLine();
				entero = 0;
			} catch (RuntimeException ex1) {
				error = true;
				System.out.println("Ocurrio un error");
				sc.nextLine();
				entero = 0;
			}
		} while (error == true);
		
		System.out.println("El numero es : " + entero);

	}

}
