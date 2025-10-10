package ejemploswitch;

import java.util.Scanner;

public class Ejemploswitch {

	public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
		
		
		System.out.println("Nota Academica:");
		int nota = teclado.nextInt();
		
		String nota2;
		
		switch (nota) {
		case 1, 2, 3, 4: {
			nota2 = "insuficiente";
		    break;
		}
		case 5: {
			nota2 = "suficiente";
			break;
		}
		case 6: {
			nota2 = "bien";
			break;
		}	
	    case 7, 8: {
			nota2 = "notable";
			break;
	    }		
		case 9, 10: {
			nota2 = "sobresaliente";
			break;
		}	
			default: {
				nota2 = "Valor no valido";
			}		
				
			if (nota2.equals("Valor no valido")) {
				System.out.println("La notano es valida");
			} else {
			System.out.println("Nota: " + nota2);
			}
	}

}
}
