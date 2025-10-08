package ifelse;

import java.util.Scanner;

public class Ejercicioifelse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime tu nota (entre 0 y 10):");
		double nota = teclado.nextDouble();
		
		if (nota > 10) {
			System.out.println("Valor incorrecto, vuelve a introducirlo");
			if (nota < 0) {
				System.out.println("Valor incorrecto, vuelve a introducirlo");
				if (nota > 5) {
					System.out.println("Aprobado");
				}
			}
			
		} else {
			System.out.println("Estas suspenso");
		}
		
        teclado.close();
	}


}
