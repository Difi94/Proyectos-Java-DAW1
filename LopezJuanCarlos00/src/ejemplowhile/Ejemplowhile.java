package ejemplowhile;

import java.util.Scanner;

public class Ejemplowhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num, suma = 0, contador;
		
		System.out.println("Introduce un numero:");
		num = teclado.nextInt();
		contador = 1;
		suma = num;
		
		while (num != 0 && contador <= 8) {
			System.out.println("Dame un numero:");
			num = teclado.nextInt();
			contador = contador +1; //contador, es igual que contador++
			suma = suma + num; //acumulador de valores
		}
		
		System.out.println("La suma es: " + suma);
		
		teclado.close();
		

	}

}
