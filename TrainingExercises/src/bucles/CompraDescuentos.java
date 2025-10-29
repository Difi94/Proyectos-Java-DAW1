/*
 * Descripcion: "Escribe un programa que calcule el precio final de una compra en un supermercado.
El usuario introducirá el precio total inicial de la compra y el número de artículos adquiridos.
Si el usuario ha comprado más de 10 artículos, se aplicará un descuento del 5% sobre el total.
Además, si el precio inicial supera los 100 €, se aplicará un descuento adicional de 10% (este descuento se calcula después del primero si corresponde).
Finalmente, habrá que sumar un 21% de IVA al precio resultante.
El programa deberá mostrar el precio final a pagar."
 */
package bucles;

import java.util.Scanner;

public class CompraDescuentos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//calculo del precio de una compra con sus descuentos
		//usuario introduce: precio total inicial de la compra, numero de articulos
		//variables articulos, compra
		//if articulos > 10; compraDescuento5 = compra - (compra * 0.05);
		//if compra > 100; compraDescuento10 = compraDescuento5 - (compraDescuento5 * 0.10);
		//IVA21% precioFinal = compraDescuento10 + (compraDescuento10 * 0.21);
		//mostrar precio final
		
		System.out.println("Dime el número de artículos comprados:");
        int articulos = teclado.nextInt();

        System.out.println("Dime el total inicial de la compra:");
        double compra = teclado.nextDouble();

        double precioConDescuentos = compra;

        // Descuento del 5%
        if (articulos > 10) {
            precioConDescuentos = precioConDescuentos - (precioConDescuentos * 0.05);
        }

        // Descuento adicional del 10%
        if (compra > 100) {
            precioConDescuentos = precioConDescuentos - (precioConDescuentos * 0.10);
        }

        // Aplicar IVA del 21%
        double precioFinal = precioConDescuentos + (precioConDescuentos * 0.21);

        System.out.printf("El precio final de tu compra es: " + precioFinal);

        teclado.close();
		
		

	}

}
