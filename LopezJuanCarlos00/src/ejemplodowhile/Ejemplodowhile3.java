package ejemplodowhile;

import java.util.Scanner;

public class Ejemplodowhile3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int inicio;
		System.out.println("Inicio:");
		inicio = teclado.nextInt();
		int fin;
		System.out.println("Final:");
		fin = teclado.nextInt();
		int contador;
		
		if (inicio <= fin) {
			System.out.println("Secuencia creciente desde " + inicio + " hasta" + fin);
			contador = inicio;
			do {
				System.out.print(" "+ contador);
				contador = contador + 1;
			} while (contador <= fin);
		} else {
			System.out.println("Secuencia decreciente desde " + inicio + " hasta" + fin);
			contador = fin;
			do {
				System.out.print(" "+ contador);
				contador = contador - 1;
			} while (contador >= inicio);
		}
teclado.close();
	}

}
