/*
 * Descripcion: Pide una contraseña hasta que el usuario introduzca “java123”.
 * Se usa do { ... } while(...) para repetir al menos una vez.

.equals() compara cadenas (no usar == con strings).

El bucle se repite mientras la contraseña no sea “java123”.
 */
package ejemplosExamen;

import java.util.Scanner;

public class Contrasenia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String contrasena;

        do {
            System.out.print("Introduce la contraseña: ");
            contrasena = sc.nextLine();

            if (!contrasena.equals("java123")) {
                System.out.println("Contraseña incorrecta.");
            }
        } while (!contrasena.equals("java123"));

        System.out.println("¡Contraseña correcta! Acceso permitido.");

	}

}
