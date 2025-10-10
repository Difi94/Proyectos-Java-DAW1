package ejemploswitch;

import java.util.Scanner;

public class Ejemploswitch1 {

	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);

	        System.out.println("Nota Academica:");
	        int nota = teclado.nextInt();

	        String nota2;

	        switch (nota) {
	            case 1, 2, 3, 4 -> nota2 = "insuficiente";
	            case 5 -> nota2 = "suficiente";
	            case 6 -> nota2 = "bien";
	            case 7, 8 -> nota2 = "notable";
	            case 9, 10 -> nota2 = "sobresaliente";
	            default -> nota2 = "Valor no valido";
	        }

	        if (nota2.equals("Valor no valido")) {
	            System.out.println("La nota no es valida");
	        } else {
	            System.out.println("Nota: " + nota2);
	        }
teclado.close();
	}

}
