package ejemplofor;

import java.util.Scanner;

public class Ejemplobuclefor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero");
		int numero = teclado.nextInt();
		
		for (int contador=10; contador >=1; contador--) {
			System.out.println(numero + " multiplicado por " + contador + " = " + numero*contador);
		}
		

	}

}
