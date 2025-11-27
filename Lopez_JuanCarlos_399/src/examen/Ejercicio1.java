/*
 * Descripcion: Pedir datos de una compra, calcular el descuento a aplicar y el importe total de la compra.
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package examen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre del producto: ");
		String producto = sc.nextLine();
		
		System.out.println("Número de unidades: ");
		int unidades = sc.nextInt();
		
		System.out.println("Precio por unidad: ");
		double precio = sc.nextDouble();
		
		int descuento = calculaDescuento(unidades);
		
		System.out.println("El nombre del producto es " + producto);
		System.out.println("Número de unidades compradas " + unidades);
		System.out.println("Se le concederá un descuento del " + descuento + "%.");
		System.out.println("El total del importe es de " + aplicaDescuento(unidades, precio));
		
		sc.close();
		
	}
	//calcula el precio de la compra aplicando el descuento
	public static double aplicaDescuento(int unidades, double precio) {
		if (unidades >=1 && unidades <= 10) {
			return (unidades * precio) / 0.05;
		} else if (unidades >= 11 && unidades <= 50) {
			return (unidades * precio) / 0.10;
		} else if (unidades >= 51 && unidades <= 100) {
			return (unidades * precio) / 0.15;
		} else {
			return precio;
		}
	}
	//calcula el descuento que se va a conceder
	public static int calculaDescuento (int unidades) {
		if (unidades >=1 && unidades <= 10) {
			return (int) (0.05 * 100);
		} else if (unidades >= 11 && unidades <= 50) {
			return (int) (0.10 * 100);
		} else if (unidades >= 51 && unidades <= 100) {
			return (int) (0.15 * 100);
		} else {
			return 20;
		}
	}
	
	

}
