/*
 * Descripcion: Crea un método llamado productosDescuento que devolverá un valor double. Recibirá como
 * parámetros tres valores (double precio, int cantidad, int descuento).
 * El método calculará el precio a pagar, multiplicando la cantidad de productos por el precio, y
 * aplicando el descuento (en porcentaje) correspondiente.
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nombre del producto que compra: ");
		String nombreProducto = sc.nextLine();
		
		System.out.println("Precio de cada producto: ");
		double precioCompra = sc.nextDouble();
		
		System.out.println("Cantidad de la compra: ");
		int cantidadCompra = sc.nextInt();
		
		int descuentoCompra = (int) (0.20 * 100);
		
		System.out.println("Usted ha adquirido " + cantidadCompra + " productos de " + nombreProducto + ", a un precio de " + precioCompra + "€ la unidad\n"
		+ "El precio a pagar es " + precioCompra*cantidadCompra + "€, pero al aplicarle el descuento del " + descuentoCompra +
		"% el precio final a pagar es de: " + productosDescuento(precioCompra, cantidadCompra, descuentoCompra) + "€."); 
		
		System.out.printf("El precio final a pagar es: %.2f €\n",
		        productosDescuento(precioCompra, cantidadCompra, descuentoCompra));

		sc.close();

	}
	//aplica el descuento a la compra
	public static double productosDescuento (double precio, int cantidad, int descuento) {
		double total = cantidad * precio;
	    double descuentoAplicado = total * descuento / 100;
	    return total - descuentoAplicado;
	}

}
