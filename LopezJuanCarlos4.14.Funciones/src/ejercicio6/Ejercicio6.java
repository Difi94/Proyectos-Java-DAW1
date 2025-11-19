/*
 * Descripcion: Mostrar el IVA de unas compras usando una funcion.
 * Autor: Juan Carlos
 * Fecha: 14/11/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.println("Dime el primer precio: ");
		int precio1 = sc.nextInt();
		System.out.println("Dime el segundo precio: ");
		int precio2 = sc.nextInt();
		System.out.println("Dime el tercer precio: ");
		int precio3 = sc.nextInt();
		System.out.println("Dime el cuarto precio: ");
		int precio4 = sc.nextInt();
		System.out.println("Dime el quinto precio: ");
		int precio5 = sc.nextInt();
		
		double ivaPrecio1 = precioConIVA(precio1);
		double ivaPrecio2 = precioConIVA(precio2);
		double ivaPrecio3 = precioConIVA(precio3);
		double ivaPrecio4 = precioConIVA(precio4);
		double ivaPrecio5 = precioConIVA(precio5);
		
		System.out.println("El precio de la primera compra con IVA es: " + ivaPrecio1);
		System.out.println("El precio de la segunda compra con IVA es: " + ivaPrecio2);
		System.out.println("El precio de la tercera compra con IVA es: " + ivaPrecio3);
		System.out.println("El precio de la cuarta compra con IVA es: " + ivaPrecio4);
		System.out.println("El precio de la quinta compra con IVA es: " + ivaPrecio5);
		*/
		double[] precios = new double[5];
		
		for (int i = 0; i < precios.length; i++) {
            System.out.print("Dime el precio " + (i + 1) + ": ");
            precios[i] = sc.nextDouble();
        }
		
		for (int i = 0; i < precios.length; i++) {
	        double calculoIVA = precioConIVA(precios[i]);
	        System.out.println("El precio de la compra " + (i + 1) + " con IVA es: " + calculoIVA);
		}
		
		sc.close();
	}
	
	//calcula el iva
	public static double precioConIVA(double precio) {
		//return precio * (21.0 / 100.0);
		return precio + (precio * 0.21);
	}

}
