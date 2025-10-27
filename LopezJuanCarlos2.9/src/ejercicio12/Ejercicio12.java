/*
 * Descripcion:A elevado a B (A^B) sin usar el operador de potencia (^)
 * Autor: Juan Carlos
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        int numA, numB;
        int resultado = 1;

        System.out.print("Introduce el valor de A: ");
        numA = teclado.nextInt();

        System.out.print("Introduce el valor de B: ");
        numB = teclado.nextInt();

        //Calculo de A^B
        if (numB == 0) {
            resultado = 1; //cualquier numero elevado a 0 es 1
        } else if (numB > 0) {
            for (int i = 1; i <= numB; i++) {
                resultado *= numA;
            }
        } else { 
            //Si B es negativo, calculamos el reciproco
            double potencia = 1.0;
            for (int i = 1; i <= Math.abs(numB); i++) {
                potencia *= numA;
            }
            System.out.println(numA + "^" + numB + " = " + (1.0 / potencia));
            teclado.close();
        }

        System.out.println(numA + "^" + numB + " = " + resultado);

        teclado.close();
		

	}

}
