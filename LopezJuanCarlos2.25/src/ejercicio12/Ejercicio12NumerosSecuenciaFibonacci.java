/*
 * Descripcion: Escribe un programa que muestre los N primeros números de la secuencia de fibonacci.
La secuencia de fibonacci comienza por 1, 1, y a continuación cada valor es la suma de
los dos valores anteriores: 1, 1, 2, 3, 5, 8, 13… El valor N lo introduce el usuario
 */
package ejercicio12;

import java.util.Scanner;

public class Ejercicio12NumerosSecuenciaFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cuántos números de Fibonacci quieres mostrar: ");
        int N = sc.nextInt();

        int a = 1, b = 1;

        if (N <= 0) {
            System.out.println("Debes introducir un número mayor que 0.");
        } else if (N == 1) {
            System.out.println("Secuencia de Fibonacci: 1");
        } else {
            System.out.print("Secuencia de Fibonacci: " + a + " " + b);

            for (int i = 3; i <= N; i++) {
                int siguiente = a + b;
                System.out.print(" " + siguiente);
                a = b;
                b = siguiente;
            }
            System.out.println(); // Salto de línea al final
        }

        sc.close();

	}

}
