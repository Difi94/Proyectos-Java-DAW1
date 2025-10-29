/*
 * Descripcion: Escribe un programa que dada una cantidad de euros que el usuario introduce por teclado
(múltiplo de 5 €) mostrará los billetes de cada tipo que serán necesarios para alcanzar
dicha cantidad (utilizando billetes de 500, 200, 100, 50, 20, 10 y 5). Hay que indicar el
mínimo de billetes posible.
Por ejemplo, si el usuario introduce 145 el programa indicará que será necesario 1 billete
de 100 €, 2 billetes de 20 € y 1 billete de 5 € (no será válido por ejemplo 29 billetes de 5,
que, aunque sume 145 €, no es el mínimo número de billetes posible).

 */
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15Billetes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una cantidad de euros (múltiplo de 5): ");
        int cantidad = sc.nextInt();

        if (cantidad % 5 != 0) {
            System.out.println("La cantidad debe ser múltiplo de 5.");
            sc.close();
            return;
        }

        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        int[] cantidadBilletes = new int[billetes.length];

        int restante = cantidad;

        for (int i = 0; i < billetes.length; i++) {
            cantidadBilletes[i] = restante / billetes[i]; // número de billetes de este tipo
            restante = restante % billetes[i];           // lo que queda por repartir
        }

        System.out.println("Se necesitan los siguientes billetes:");

        for (int i = 0; i < billetes.length; i++) {
            if (cantidadBilletes[i] > 0) {
                System.out.println(cantidadBilletes[i] + " billete(s) de " + billetes[i] + " €");
            }
        }

        sc.close();

	}

}
