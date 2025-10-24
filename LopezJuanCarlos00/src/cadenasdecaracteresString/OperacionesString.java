/*
 * 
 */
package cadenasdecaracteresString;

import java.util.Scanner;

public class OperacionesString {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String cadena;
		System.out.println("Dame una cadena de caracteres:");
		cadena = teclado.nextLine();
		
		// mostrar la longitud de la cadena
		// mostrar el primer caracter de la cadena
		// mostrar el ultimo caracter de la cadena
		// mostrar la segunda palabra de al cadena
		// mostrar la cadena con la primera letra y la ultima en mayuscula
		
		
        System.out.println(cadena.length()); // mostrar la longitud de la cadena
        
        if (cadena.length() > 0) {
            System.out.println(cadena.charAt(0)); // mostrar el primer caracter de la cadena
        }
        if (cadena.length() > 0) {
            System.out.println(cadena.charAt(cadena.length() - 1)); // mostrar el ultimo caracter de la cadena
        }
        String[] palabras = cadena.split(" ");
        if (palabras.length >= 2) {
            System.out.println(palabras[1]); // mostrar la segunda palabra de al cadena
        }
        if (cadena.length() >= 2) {
            String cadenaModificada = 
                cadena.substring(0, 1).toUpperCase() + 
                cadena.substring(1, cadena.length() - 1) + 
                cadena.substring(cadena.length() - 1).toUpperCase();
            System.out.println(cadenaModificada); // mostrar la cadena con la primera letra y la ultima en mayuscula
        }
        //primera letra en mayuscula de otra forma
        //char primeraLetra = cadena.charAt(0);
        //String pLetra = ""+primeraLetra;
        //pLetra = pLetra.toUpperCase();
        
        teclado.close();
		
		

	}

}
