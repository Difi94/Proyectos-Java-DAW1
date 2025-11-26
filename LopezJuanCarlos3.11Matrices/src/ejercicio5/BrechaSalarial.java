/*
 * Descripción:
 * Programa para registrar sueldos de hombres y mujeres de una empresa y detectar
 * si existe brecha salarial entre ambos.
 * 
 * El programa pedirá por teclado el número de personas (N), luego para cada una
 * pedirá el género (0 para varón y 1 para mujer) y el sueldo.
 * 
 * Toda esta información se guardará en una única matriz.
 * Finalmente, mostrará el sueldo medio de hombres y mujeres.
 */

package ejercicio5;

import java.util.Scanner;

public class BrechaSalarial {

	public static void main(String[] args) {
		
		// Creamos el objeto Scanner para leer datos desde teclado
		Scanner sc = new Scanner(System.in);
		
		// Pedimos el número total de personas a registrar
		System.out.print("Ingrese el número de personas: ");
		int n = sc.nextInt();
		
		// Creamos una matriz de tamaño n x 2
		// Columna 0 -> género (0 = hombre, 1 = mujer)
		// Columna 1 -> sueldo
		double[][] datos = new double[n][2];
		
		// Bucle para llenar la matriz con la información de cada persona
		for (int i = 0; i < n; i++) {
			System.out.println("\nPersona " + (i + 1) + ":");
			
			// Pedimos el género
			System.out.print("Ingrese género (0 = hombre, 1 = mujer): ");
			datos[i][0] = sc.nextInt();
			
			// Pedimos el sueldo
			System.out.print("Ingrese sueldo: ");
			datos[i][1] = sc.nextDouble();
		}
		
		// Variables para acumular sueldos y contar personas de cada género
		double sumaHombres = 0;
		double sumaMujeres = 0;
		int contHombres = 0;
		int contMujeres = 0;
		
		// Recorremos la matriz para calcular totales
		for (int i = 0; i < n; i++) {
			if (datos[i][0] == 0) { // Es hombre
				sumaHombres += datos[i][1];
				contHombres++;
			} else if (datos[i][0] == 1) { // Es mujer
				sumaMujeres += datos[i][1];
				contMujeres++;
			}
		}
		
		// Calculamos promedios (evitando división por cero)
		double mediaHombres = (contHombres > 0) ? sumaHombres / contHombres : 0;
		double mediaMujeres = (contMujeres > 0) ? sumaMujeres / contMujeres : 0;
		
		// Mostramos resultados
		System.out.println("\n--- RESULTADOS ---");
		System.out.println("Sueldo medio de hombres: " + mediaHombres);
		System.out.println("Sueldo medio de mujeres: " + mediaMujeres);
		
		// Detectamos si hay brecha salarial
		if (mediaHombres > mediaMujeres) {
			System.out.println("Existe brecha salarial: los hombres ganan más en promedio.");
		} else if (mediaMujeres > mediaHombres) {
			System.out.println("Existe brecha salarial: las mujeres ganan más en promedio.");
		} else {
			System.out.println("No existe brecha salarial: ambos ganan lo mismo en promedio.");
		}
		
		// Cerramos el scanner
		sc.close();
	}
}
