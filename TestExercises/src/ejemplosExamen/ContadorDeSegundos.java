/*
 * Descripcion: Escribe un programa que muestre una cuenta de segundos del 1 al 5, con una pausa de un segundo entre cada número.
Cuando termine, mostrará el mensaje "¡Tiempo terminado!".
 */
package ejemplosExamen;

public class ContadorDeSegundos {

	public static void main(String[] args) {
		try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i + " segundo(s)...");
                Thread.sleep(1000); // pausa de 1 segundo
            }
            System.out.println("¡Tiempo terminado!");
        } catch (InterruptedException e) {
            System.out.println("Error en el temporizador.");
        }

	}

}
