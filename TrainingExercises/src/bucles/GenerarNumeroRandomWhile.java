/*
 * Descripcion: Generar un numero aleatorio entre 0 y 100, guiar al usuario para que de con el
 * y mostrar por pantalla cuando acierte y su numero de intentos.
 */
package bucles;

import java.util.Scanner;

public class GenerarNumeroRandomWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int aleatorio=(int)(Math.random()*100)+1;  //numero aleatorio entre 1 y 100 (el +1 es porque sino queda en 99 al descartar decimales por el casting a int)
		
		int intentos=0; //guardamos el numero de intentos
		int numeroUsuario=0; //numero que nos da el user
		
		while(aleatorio!=numeroUsuario) {
			
			intentos++; //vamos almacenando el numero de intentos de 1 en 1
			
			System.out.println("Introduce un numero entre 1 y 100");
			
			numeroUsuario=teclado.nextInt();
			
			if(aleatorio>numeroUsuario) {
				System.out.println("Es mas alto");
			} else if (aleatorio<numeroUsuario) {
				System.out.println("Es mas bajo");
			}
				
		}
		
		System.out.println("Acertaste! Tu numero de intentos es: " + intentos);
		
		teclado.close();

	}

}
