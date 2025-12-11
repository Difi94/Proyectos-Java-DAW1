package ejercicio1;

import libtarea3.Dado;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		//1
		int puntuacionMax = (int)(Math.random() * (60 - 30 + 1)) + 30;
		
		//2
		Dado jugador1 = null;
	    Dado jugador2 = null;
	    Dado jugador3 = null;
	    
		try {
			
			jugador1 = new Dado(6);
		} catch (IllegalArgumentException ex1) {
			System.out.println(ex1.getMessage());
		}
		
		try {
			
			jugador2 = new Dado(6);
		} catch (IllegalArgumentException ex11) {
			System.out.println(ex11.getMessage());
		}
		
		try {
			
			jugador3 = new Dado(6);
		} catch (IllegalArgumentException ex12) {
			System.out.println(ex12.getMessage());
		}
		
		//3
		int puntuacionTotal = 0;
		int[][] lanzamientos = new int [20][3];
		int contadorLanzamientos = 0;

		
	}
	
}
