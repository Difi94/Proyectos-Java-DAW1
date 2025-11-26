/*
 * Descripcion: Crea un método posicionJugador. Este método recibe como parámetro un número entero y
 * devuelve una cadena de texto.
 * Comprobaremos que el número se encuentra entre 1 y 16, en caso contrario devolveremos un
 * mensaje: Número introducido incorrecto.
 * El programa asigna una posición en un hipotético campo de juego en función del número
 * recibido:
 * 1-Portero,
 * del 2 al 5 defensas,
 * 6 al 8 centrocampistas,
 * del 9 al 11 delanteros,
 * del 12 al 16 suplentes.
 * El programa pedirá el nombre al usuario de forma que el mensaje sea:
 * Luis, con el dorsal 8 juega el próximo partido como centrocampista.
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Como te llamas: ");
		String jugador = sc.nextLine();
		System.out.println("Introduce tu dorsal del equipo: ");
		int dorsal = sc.nextInt();
		
		if (posicionJugador(dorsal).equals("Numero equivocado")) {
			System.out.println(posicionJugador(dorsal));
		} else {
			System.out.println(jugador + ", con dorsal " + dorsal + " juega el proximo partido como " + posicionJugador(dorsal));
		}
		
		sc.close();

	}
	
	public static String posicionJugador(int dorsal) {
		if (dorsal <1 || dorsal > 16) {
			return "Numero equivocado";
		}
		switch (dorsal) {
		case 1: return "Portero";
		case 2, 3, 4 , 5: return "Defensa";
		case 6, 7, 8: return "Centrocampista";
		case 9, 10, 11: return "Delantero";
		case 12, 13, 14, 15, 16: return "Suplente";
		default: return "Numero equivocado";
		}
	}

}
