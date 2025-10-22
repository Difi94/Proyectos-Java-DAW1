/*
 * Descripcion: solicitar un valor, almacenarlo como double y aplicar funciones de la clase Math mostrando por pantalla ceil, floor y round explicando el resultado
 * Autor: Juan Carlos
 * Fecha: 03/10/25
 */

package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dame un numero:");
		double valor = teclado.nextDouble();
		
		
		System.out.println("Ceil devuelve el valor mas pequeño posible que sea mayor o igual al valor introducido " + Math.ceil(valor));
		
		System.out.println("Floor devuelve el valor mas alto posible que sea mayor o igual al valor introducido " + Math.floor(valor));
		
		System.out.println("Round devuelve el valor en mas cercano al introducido " + Math.round(valor));
		
		teclado.close();

	}

}
