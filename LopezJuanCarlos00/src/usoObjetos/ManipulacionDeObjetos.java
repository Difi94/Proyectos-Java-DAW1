package usoObjetos;

import java.awt.Rectangle;

public class ManipulacionDeObjetos {

	public static void main(String[] args) {
		Rectangle r1, r2; //declaracion de objeto
		r1 = new Rectangle(); //instanciacion del objeto
		
		System.out.println(r1.toString());
		
		r1.x = 10;
		
		System.out.println(r1.toString());
		
		r2 = r1; //r2 apunta a r1, solo existe 1 objeto
		
		System.out.println(r2.toString());
		
		r2.x = 20;
		
		System.out.println("El contenido de r1 es: " + r1.toString());
		
		r1.setLocation(50, 50);
		//r1.resize(10, 10); deprecated
		r1.setSize(10, 10);
		System.out.println(r2);
		System.out.println(r1.getX());

	}

}
