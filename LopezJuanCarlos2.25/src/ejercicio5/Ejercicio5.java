/*
 * Descripcion: ecuación de primer grado (del tipo ax+ b = 0).

 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        } else {
            double x = -b / a;
            System.out.println("La solución es x = " + x);
        }
        
        sc.close();
	}

}
