/*
 * Descripcion: Aplicacion de los conceptos estudiados para pedir una serie de datos y mostrar una ficha que los conforme
 * relacionada al senderismo.
 * Autor: Juan Carlos
 * Fecha: 16/10/25
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Introduce tu nombre:");
		String name = teclado.nextLine();
		
		System.out.println("Introduce tus apellidos:");
		String surname = teclado.nextLine();
		
		System.out.println("Introduce tu edad:");
		int age = teclado.nextInt();
		
		while (age < 17 && age > 45) {
			System.out.println("Edad incorrecta");
			System.out.println("Vuelve a introducir tu edad:");
			age = teclado.nextInt();
		}
		
		System.out.println("Numero de rutas de senderismo que has realizado:");
		int routes = teclado.nextInt();
		
		System.out.println("Distancia de la ultima ruta que realizaste (en km):");
		double distance = teclado.nextDouble();
		
		teclado.nextLine(); // Limpiar buffer

        //Datos de las 5 caminatas
        double[] distancias = new double[5];
        int[] participantes = new int[5];
        String[] ciudades = new String[5];

        for (int caminatas = 0; caminatas < 5; caminatas++) {
            System.out.println("\nCaminata #" + (caminatas + 1));

            System.out.print("Distancia (km): ");
            distancias[caminatas] = teclado.nextDouble();

            System.out.print("Número de participantes: ");
            participantes[caminatas] = teclado.nextInt();
            teclado.nextLine(); // Limpiar buffer

            System.out.print("Ciudad: ");
            ciudades[caminatas] = teclado.nextLine();
        }

        //Calcular distancia media
        double sumaDistancias = 0;
        for (double d : distancias) {
            sumaDistancias += d;
        }
        double distanciaMedia = sumaDistancias / 5;

        //Calcular distancia mas larga y ciudad asociada
        double distanciaMax = distancias[0];
        String ciudadMax = ciudades[0];

        for (int i = 1; i < 5; i++) {
            if (distancias[i] > distanciaMax) {
                distanciaMax = distancias[i];
                ciudadMax = ciudades[i];
            }
        }

        System.out.println("\n---------------------------------------------------------");
        System.out.println("Nombre: " + name + " " + surname);
        System.out.println("Edad: " + age);
        System.out.println("Numero de rutas realizadas: " + routes);
        System.out.printf("Distancia media (5 ultimas rutas): %.2f km\n", distanciaMedia);
        System.out.printf("Distancia mas larga de las ultimas 5 rutas: %.2f km\n", distanciaMax);
        System.out.println("Ciudad de la ruta mas larga: " + ciudadMax);
        System.out.println("---------------------------------------------------------");
        
        teclado.close();
		        
	}

}
