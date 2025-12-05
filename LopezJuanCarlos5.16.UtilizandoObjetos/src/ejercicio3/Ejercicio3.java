package ejercicio3;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//1
		LocalTime horaInicio = LocalTime.of(8, 0);
		
		int horaUsuario = -1;
		int minutoUsuario = -1;
		//2.1
		do {
			System.out.println("Dame una hora entre las 0 y 23: ");
			try {
				horaUsuario = sc.nextInt();
				if (horaUsuario < 0 || horaUsuario > 23) {
					System.out.println("La hora tiene que estar entre 0 y 23");
				}
			} catch (InputMismatchException ex1) {
				System.out.println("La hora no es valida tiene que estar entre 0 y 23");

			} catch (DateTimeException ex2) {
				System.out.println(ex2.getMessage());
			}
		} while (horaUsuario < 0 || horaUsuario > 23); {
			//2.2
			try {
				minutoUsuario = pideMinuto(horaUsuario);
				
			} catch (InputMismatchException ex1) {
				System.out.println("El minuto no es valido tiene que estar entre 0 y 59");
			} catch (DateTimeException ex2) {
				System.out.println(ex2.getMessage());
			}
			
		}
		//3
		LocalTime horaMinutoUsuario = LocalTime.of(horaUsuario, minutoUsuario);
		//System.out.println(horaMinutoUsuario);
		
		//4.1
		
		//System.out.println(horaInicio.compareTo(horaMinutoUsuario));
		
	}
	
	public static int pideMinuto (int hora) {
		Scanner sc = new Scanner (System.in);
		int minutoUsuario = -1;
		while (hora < 0 || hora > 23); {
			//2.2
			System.out.println("Dame un minuto entre  0 y 59: ");
			try {
				minutoUsuario = sc.nextInt();
				if (minutoUsuario < 0 || minutoUsuario > 59) {
					System.out.println("El minuto tiene que estar entre 0 y 59");
				}
			} catch (InputMismatchException ex11) {
				System.out.println("El minuto no es valido tiene que estar entre 0 y 59");
			} catch (DateTimeException ex21) {
				System.out.println(ex21.getMessage());
			}
		} return minutoUsuario;
	}

}
