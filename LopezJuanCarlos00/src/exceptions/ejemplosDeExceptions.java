/*
 * Descripcion
 * Autor
 * Fecha
 */
package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ejemplosDeExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un entero: ");
		int num;
		//boolean error = false;
		
		do {
			try {
				num = sc.nextInt();
			} catch (InputMismatchException exTipoDiferente) {
				//error = true;
				System.out.println("Te has equivocado, dame un entero");
				sc.next();
			}
		} while (!sc.hasNextInt());
		
		
		/* do {
			System.out.println("Dame un entero: ");
			int num = sc.nextInt();
		} while (!sc.hasNextInt()); {
			try {
				int num = sc.nextInt();
				
			} catch (InputMismatchException exTipoDiferente) {
				System.out.println("Te has equivocado");
			}
			*/
		}
		

	}
