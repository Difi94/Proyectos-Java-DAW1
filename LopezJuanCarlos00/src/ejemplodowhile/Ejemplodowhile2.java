package ejemplodowhile;

import java.util.Scanner;

public class Ejemplodowhile2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int start, end, contador = 0;
		
		
		do {
			System.out.println("Dame un numero inicial:");
			start = teclado.nextInt();
			System.out.println("Dame un numero final:");
			end = teclado.nextInt();
			contador = start;
		} while (contador != end); {
			System.out.println(contador + " ");
			contador++;
		} if (end > start) {
			System.out.println(contador + " ");
			contador--;
		}
teclado.close();
	}

}
