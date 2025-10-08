package ifelse;

import java.util.Scanner;

public class anidados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
        double nota = teclado.nextDouble();
		
		if (nota >= 0 && nota <= 10) {
			System.out.println("Aprobado");
		} else {
			System.out.println("Suspenso");
		}
		
	} else {
		System.out.println("Nota erronea");
	}

}
