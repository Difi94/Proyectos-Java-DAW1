/*
 * Descripcion: calcular y escribir la suma y el producto de los 10 primeros numeros naturales.
 * Autor: Juan Carlos
 */
package ejercicio9;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int suma = 0;
        int producto = 1;
        final int LIMITE = 10;

        for (int i = 1; i <= LIMITE; i++) {
            suma += i;
            producto *= i;
        }

        System.out.println("La suma de los 10 primeros numeros naturales es: " + suma);
        System.out.println("El producto de los 10 primeros numeros naturales es: " + producto);
    }
		
}
