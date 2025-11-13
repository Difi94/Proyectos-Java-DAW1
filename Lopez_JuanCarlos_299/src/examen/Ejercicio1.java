/*
 * Descripcion: Múltiplos de 3 y 5 entre N y M.
 * Autor: Juan Carlos
 * Fecha: 12/11/25
 */
package examen;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Dame un numero (N): ");
        int n = sc.nextInt();

        System.out.print("Dame otro numero (M): ");
        int m = sc.nextInt();

        //Valido que N sea menor que M
        if (n >= m) {
            System.out.println("Error: N debe ser menor que M.");
            sc.close();
            return; //salimos del programa
        }

        boolean encontrado = false; //para saber si se encontró algún múltiplo

        System.out.println("\nMúltiplos de 3 y 5 entre " + n + " y " + m + ":");

        for (int i = n; i <= m; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.print(i + " ");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay múltiplos de 3 ni de 5 en ese rango.");
        } else {
            System.out.println(); //salto de línea final
        }

        sc.close();
    }
}
