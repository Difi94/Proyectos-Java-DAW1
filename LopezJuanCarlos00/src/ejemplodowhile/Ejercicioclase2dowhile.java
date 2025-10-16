//pedir 2 numeros y mostrar los multiplos de 3 de un numero al otro
package ejemplodowhile;

import java.util.Scanner;

public class Ejercicioclase2dowhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int inicio;
		System.out.println("Inicio:");
		inicio = teclado.nextInt();
		int fin;
		System.out.println("Final:");
		fin = teclado.nextInt();
		int contador;
		
		if (inicio <= fin) { //cuenta incremental
			System.out.println("Multiplos de 3 desde " + inicio + " hasta " + fin);
			contador = inicio;
			do {
				if (contador % 3 == 0) {
					System.out.print(" " + contador);
				}
				System.out.print(" " + contador);
				contador = contador + 1;
			} while (contador <= fin);
		} else { //cuenta decremental
			System.out.println("Multiplos de 3 desde " + inicio + " hasta " + fin);
			contador = fin;
			do {
				if (contador % 3 == 0) {
					System.out.print(" " + contador);
				}
				System.out.print(" "+ contador);
				contador = contador - 1;
			} while (contador >= inicio);
		}
teclado.close();
	}

}
