/*
 * Descripcion: pedir un dia de la semana y decirle que toca a primera hora
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dime un dia de la semana");
		String dia = teclado.nextLine().toLowerCase();
		
		switch (dia) {
		case "lunes" : System.out.println("A primera hora hay Matematicas");
		break;
		case "martes" : System.out.println("A primera hora hay Filosofia");
		break;
		case "miercoles" : System.out.println("A primera hora hay Gimnasia");
		break;
		case "jueves" : System.out.println("A primera hora hay Ingles");
		break;
		case "viernes" : System.out.println("A primera hora hay Lengua");
		break;
		default : {
			System.out.println("Dia de la semana incorrecto");
		}
		}

	}

}
