/*
 * Descripcion:el usuario "piensa" un número del 1 al 100 y lo adivinamos
 * Autor: Juan Carlos
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int min = 1;
		int max = 100;
		int intento;
		String respuesta;
		boolean adivinado = false;
		
		System.out.println("Piensa un numero del 1 al 100");
		System.out.println("Cuando estes ready pulsa enter");
		teclado.nextLine();
		
		while (!adivinado && min<= max) {
			intento = (min + max) / 2;
			System.out.println("Es " + intento + " tu numero?");
			System.out.println("Responde mayor, menor o igual");
			respuesta = teclado.nextLine();
			switch (respuesta) {
			case "mayor": min = intento++;
			break;
			case "menor": max = intento--;
			break;
			case "igual": adivinado = true;
			System.out.println("He adivinado tu numero " + intento);
			break;
			default: System.out.println("Responde con mayor, menor o igual");
			}
		}
		if (!adivinado) {
			System.out.println("Volvamos a intentarlo");
		}
		teclado.close();

	}

}
