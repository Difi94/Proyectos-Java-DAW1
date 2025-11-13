/*
 * Descripcion: Escribe un programa que pida dos números reales por teclado y muestre por pantalla el
 * resultado de multiplicarlos. Implementa y utiliza la función:
 * double multiplica(double a, double b) // Devuelve la multiplicación de dos números
 * Autor: Juan Carlos
 * Fecha: 13/11/25
 */
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dame un número: ");
        double a = sc.nextDouble();
        
        System.out.print("Dame otro número: ");
        double b = sc.nextDouble();
        
        double resultado = multiplica(a, b);
        System.out.println("El resultado de la multiplicación es: " + resultado);
        
        sc.close();
    }
    
    //Devuelve la multiplicación de dos números reales
    public static double multiplica(double a, double b) {
        return a * b;
    }
}
