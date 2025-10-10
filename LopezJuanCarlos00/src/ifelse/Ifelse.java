package ifelse;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		int num1 = teclado.nextInt();
		
		if (num1 > 0) {
			System.out.println("El numero es positivo");
			if (num1 > 50) {
				System.out.println("Es mayor de 50");
			}
		
		} else {
			if (num1 == 0) {
				System.out.println("Cero");
			} else {
				System.out.println("Negativo");
			}
		}
		
		//se supone que el codigo funciona, modificarlo para que en el caso de que el num1>50 me lo diga
		
		teclado.close();
				

	}

}
