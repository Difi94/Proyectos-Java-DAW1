/*
 * Descripcion: números pares entre el 1 y el 200 sumando de 2 en 2.
 * Autor: Juan Carlos
 */
package ejercicio2;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println("Números pares entre 1 y 200:");

        // Inicia el contador en 2, ya que es el primer numero par
        for (int contador = 2; contador <= 200; contador += 2) {
            System.out.println(contador);
        }
	}

}
