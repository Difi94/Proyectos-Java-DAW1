/*
 * Descripcion: Pedir el valor de la compra original y descontada
 *  y mostrar el % de descuento aplicado.
 * Autor: Juan Carlos
 * Fecha: 19/11/25
 */
package ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de la compra: ");
		int compra = sc.nextInt();
		System.out.println("Valor de la compra con el descuento ");
		int compraDescontada = sc.nextInt();
		
		double compraFinal = porcentajeDescuento(compra, compraDescontada);
		
		System.out.println("Tu compra ha recibido un descuento del " + compraFinal + "%");
		
		sc.close();
	}
	
	public static double porcentajeDescuento (double compra, double compraDescontada) {
		return (compra - compraDescontada);
	}

}
