/*
 * Descripcion: Muestra todos los números múltiplos de 3 entre 1 y 100, ambos incluidos.
Después, muestra cuántos hay en total.
 */
package ejemplosExamenExtendido;

public class MultiplosDe3 {

	public static void main(String[] args) {
		int contador = 0;

        System.out.println("Múltiplos de 3 entre 1 y 100:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
                contador++;
            }
        }
        System.out.println("\nTotal de múltiplos de 3: " + contador);

	}

}
