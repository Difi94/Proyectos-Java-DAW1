/*
 * Descripcion: Sumar independientemente los pares y los impares de los entre 100 y 200, mostrar las sumas
 * Autor: Juan Carlos
 */
package ejercicio11;

public class Ejercicio11 {

	public static void main(String[] args) {
		int sumaPares = 0;
        int sumaImpares = 0;

        //Recorremos los numeros del 100 al 200
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                sumaPares += i;// Si es par, lo añadimos a la suma de pares
            } else {
                sumaImpares += i;// Si es impar, lo añadimos a la suma de impares
            }
        }
        System.out.println("Suma de los numeros pares entre 100 y 200: " + sumaPares);
        System.out.println("Suma de los numeros impares entre 100 y 200: " + sumaImpares);
	}

}
