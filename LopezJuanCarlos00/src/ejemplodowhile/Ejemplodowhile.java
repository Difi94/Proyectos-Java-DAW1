package ejemplodowhile;

import java.util.Scanner;

public class Ejemplodowhile {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 
		int numero, suma = 0;
		int contador = 0;
	    
	    
	    do {
	    	System.out.println("Dame un numero (0 para terminar):");
	    	numero = teclado.nextInt();
	    	if (numero != 0) {
	    		contador = contador + 1;
	    	}
	    	suma = suma + numero;
	   
	    } while (numero != 0); {
	    	
	    System.out.println("La suma es: " + suma);
	    System.out.println("Has sumado: " + contador + " numeros");
	    }

teclado.close();

	}

}
