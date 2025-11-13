/*
 * Descripcion: Realiza un programa que lea una frase por teclado e indique si la frase es un palíndromo o
 * no (ignorando espacios y sin diferenciar entre mayúsculas y minúsculas). Supondremos que
 * el usuario solo introducirá letras y espacios (ni comas, ni puntos, ni acentos, etc.). Un
 * palíndromo es un texto que se lee igual de izquierda a derecha que de derecha a izquierda.
 * Por ejemplo:
 * Amigo no gima
 * Dábale arroz a la zorra el abad
 * Amo la pacífica paloma
 * A man a plan a canal Panama
 * Autor: Juan Carlos
 * Fecha: 13/11/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una frase para comprobar si es un palíndromo (sólo letras y espacios): ");
        String frase = sc.nextLine().toLowerCase();

        //Elimino los espacios
        String fraseSinEspacios = frase.replace(" ", "");

        //Invierto la cadena
        String fraseInvertida = new StringBuilder(fraseSinEspacios).reverse().toString();

        //Compruebo si son iguales
        if (fraseSinEspacios.equals(fraseInvertida)) {
            System.out.println("La frase es un palíndromo.");
        } else {
            System.out.println("La frase no es un palíndromo.");
        }

        sc.close();
    }
}

