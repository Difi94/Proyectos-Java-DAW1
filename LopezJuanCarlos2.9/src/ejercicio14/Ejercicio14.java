/*
 * Descripcion: Pedir una cantidad de Euros y mostrar los billetes de cada tipo que seran necesarios.
 * Hay que indicar el minimo de billetes posible.
 * Autor: Juan Carlos
 */
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int euros;
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};

        System.out.println("Introduce una cantidad de Euros (multiplo de 5):");
        euros = teclado.nextInt();

        if (euros % 5 != 0 || euros <= 0) {
            System.out.println("La cantidad debe ser un multiplo de 5 y mayor que 0");
        } else {
            System.out.println("Desglose en billetes:");
            
            for (int billete : billetes) {
                int cantidadBilletes = euros / billete;
                if (cantidadBilletes > 0) {
                    System.out.println(cantidadBilletes + " billete(s) de " + billete + "€");
                    euros = euros % billete;
                }
            }
        }

        teclado.close();		

	}

}
