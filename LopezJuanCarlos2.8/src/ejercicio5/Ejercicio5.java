/*
 * Descripcion: pedir 10 numeros, mostrar la media de los numeros positivos, la de los numeros negativos y la cantidad de ceros
 * Autor: Juan Carlos
 * Fecha: 15/10/25
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

        int cantidadNumeros = 10;
        double contadorPositivos = 0;
        double contadorNegativos = 0;
        int contadorCeros = 0;
        double sumaPositivos = 0;
        double sumaNegativos = 0;

        for (int contador = 1; contador <= cantidadNumeros; contador++) {
            System.out.print("Introduce el numero " + contador + ":");
            int numero = teclado.nextInt();

            if (numero > 0) {
                sumaPositivos += numero;
                contadorPositivos++;
            } else if (numero < 0) {
                sumaNegativos += numero;
                contadorNegativos++;
            } else {
                contadorCeros++;
            }
        }

        if (contadorPositivos > 0) {
            double mediaPositivos = sumaPositivos / contadorPositivos;
            System.out.println("Media de los numeros positivos: " + mediaPositivos);
        } else {
            System.out.println("No se introducieron numeros positivos");
        }

        if (contadorNegativos > 0) {
            double mediaNegativos = sumaNegativos / contadorNegativos;
            System.out.println("Media de los números negativos: " + mediaNegativos);
        } else {
            System.out.println("No se ingresaron números negativos.");
        }

        System.out.println("Cantidad de ceros ingresados: " + contadorCeros);
        
        teclado.close();
    }
		
	}
