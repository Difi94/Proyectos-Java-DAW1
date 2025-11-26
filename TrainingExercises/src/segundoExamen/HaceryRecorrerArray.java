package segundoExamen;

import java.util.Scanner;

public class HaceryRecorrerArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int [10];
		
		for (int i = 0; i < numeros.length; i++) {
		System.out.println("Introduce un numero: ");
		numeros [i] = sc.nextInt();
		}
		for (int elementos : numeros) System.out.print(elementos + "  ");
	}

}
