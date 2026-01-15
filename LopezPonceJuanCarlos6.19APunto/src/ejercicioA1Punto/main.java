package ejercicioA1Punto;

import ejercicioA1Punto.punto;

public class main {

	public static void main(String[] args) {
		
		punto p1 = new Punto();
		punto p2 = new Punto();
		punto p3 = new Punto();
		
		System.out.println("(" + p1.x + "," + p1.y + ")");
		
		p1.x = 5;
		p1.y = 10;
		
		System.out.println("(" + p1.x + "," + p1.y + ")");

	}

}
