/*
 * Descripcion: ecuación de segundo grado (del tipo ax2 + bx + c = 0).
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el valor de a: ");
        double a = sc.nextDouble();
        
        System.out.print("Introduce el valor de b: ");
        double b = sc.nextDouble();
        
        System.out.print("Introduce el valor de c: ");
        double c = sc.nextDouble();
        
        if (a == 0) {
            System.out.println("No es una ecuación de segundo grado.");
        } else {
            double discriminante = b * b - 4 * a * c;
            
            if (discriminante > 0) {
                double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("La ecuación tiene dos soluciones reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            } else if (discriminante == 0) {
                double x = -b / (2 * a);
                System.out.println("La ecuación tiene una solución real:");
                System.out.println("x = " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
        }
        
        sc.close();

	}

}
