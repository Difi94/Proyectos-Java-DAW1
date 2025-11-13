/*
 * Descripcion: Crea un programa que muestre por pantalla cuantas vocales de cada tipo hay (cuantas ‘a’,
 * cuantas ‘e’, etc.) en una frase introducida por teclado. No se debe diferenciar entre
 * mayúsculas y minúsculas. Por ejemplo dada la frase “Mi mama me mima” dirá que hay:
 * Nº de A's: 3
 * Nº de E's: 1
 * Nº de I's: 2
 * Nº de O's: 0
 * Nº de U's: 0
 * Autor: Juan Carlos
 * Fecha: 13/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4Correccion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Contadores de cada vocal
        int a = 0, e = 0, i = 0, o = 0, u = 0;

        System.out.print("Dame una frase: ");
        String frase = sc.nextLine().toLowerCase();

        // Recorremos la frase y contamos las vocales
        for (int j = 0; j < frase.length(); j++) {
            char c = frase.charAt(j);
            switch (c) {
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
            }
        }

        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);

        sc.close();
    }
}
