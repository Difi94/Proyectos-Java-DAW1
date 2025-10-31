/*
 * Descripcion: Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas.
Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. Luego
mostrará la altura media, máxima y mínima así como cuántas personas miden por encima y
por debajo de la media.
 */
package ejercicio10;

import java.util.Scanner;

public class CalculosConArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numero de personas
		System.out.println("Dame un numero de personas: ");
		int n = sc.nextInt();
		
		double[] personas = new double [n]; //inicialización del array
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println("Introduce la altura de la persona " + (i + 1) + " (en metros): "); //Pedimos la altura de cada persona
            personas[i] = sc.nextDouble();
		}
		
		//Calculamos suma, máxima y mínima
        double suma = 0;
        double max = personas[0];
        double min = personas[0];
        
        for (int i = 0; i < n; i++) {
            suma += personas[i];
            if (personas[i] > max) max = personas[i];
            if (personas[i] < min) min = personas[i];
        }
        
        //calculo de la media
        double media = suma / n;

        //cuántos están por encima y por debajo de la media
        int encima = 0;
        int debajo = 0;
        
        for (int i = 0; i < n; i++) {
            if (personas[i] > media) {
                encima++;
            } else if (personas[i] < media) {
                debajo++;
            }
        }

        // Mostrar resultados
        System.out.println("\nResultados:");
        System.out.printf("Altura media: %.2f m%n", media);
        System.out.printf("Altura máxima: %.2f m%n", max);
        System.out.printf("Altura mínima: %.2f m%n", min);
        System.out.println("Personas por encima de la media: " + encima);
        System.out.println("Personas por debajo de la media: " + debajo);

        sc.close();
	}

}
