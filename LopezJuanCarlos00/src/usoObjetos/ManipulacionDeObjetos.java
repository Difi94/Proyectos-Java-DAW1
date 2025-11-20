package usoObjetos;

import java.awt.Rectangle;

public class ManipulacionDeObjetos {

	public static void main(String[] args) {
		Rectangle r1; //declaracion de objeto
		r1 = new Rectangle(); //instanciacion del objeto
		
		System.out.println(r1.toString());
		
		r1.x = 10;
		
		System.out.println(r1.toString());
		
		

	}

}
