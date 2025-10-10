package ejemplowhile;

import java.util.Scanner;

public class Ejemplowhile2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
		int start, end, contador;
		 
	    System.out.println("Dame un numero inicial:");
	    start = teclado.nextInt();

	    System.out.println("Dame un numero final:");
	    end = teclado.nextInt();
	    
	    contador = start;

	    while (contador <= end) {
	    System.out.print(contador + " ");
	    contador++;
	    }

teclado.close();

	}

}
