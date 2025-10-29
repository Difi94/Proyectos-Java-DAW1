/*
 * Descripcion: Realiza un minicuestionario con 10 preguntas tipo test sobre el módulo Sistemas
 * Informáticos que se imparte en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida.
 */
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8CuestionarioTipoTest {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int puntos = 0;
        String respuesta;

        System.out.println("Cuestionario de Sistemas Informáticos");
        System.out.println("Escribe la letra correcta (a, b o c)\n");

        // Pregunta 1
        System.out.println("1. ¿Qué es el sistema operativo?");
        System.out.println("a) Hardware del ordenador");
        System.out.println("b) Programa que gestiona el hardware");
        System.out.println("c) Un videojuego");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("b")) {
            puntos++;
        }

        // Pregunta 2
        System.out.println("2. ¿Qué significa CPU?");
        System.out.println("a) Unidad Central de Procesamiento");
        System.out.println("b) Tarjeta gráfica");
        System.out.println("c) Memoria RAM");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("a")) {
            puntos++;
        }

        // Pregunta 3
        System.out.println("3. ¿Qué es la RAM?");
        System.out.println("a) Memoria permanente");
        System.out.println("b) Memoria volátil");
        System.out.println("c) Un disco duro");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("b")) {
            puntos++;
        }

        // Pregunta 4
        System.out.println("4. ¿Cuál es un dispositivo de salida?");
        System.out.println("a) Teclado");
        System.out.println("b) Ratón");
        System.out.println("c) Monitor");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("c")) {
            puntos++;
        }

        // Pregunta 5
        System.out.println("5. ¿Qué tipo de software es Microsoft Word?");
        System.out.println("a) Sistema operativo");
        System.out.println("b) Aplicación ofimática");
        System.out.println("c) Controlador de dispositivo");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("b")) {
            puntos++;
        }

        // Pregunta 6
        System.out.println("6. ¿Qué formato pertenece a un archivo ejecutable?");
        System.out.println("a) .exe");
        System.out.println("b) .jpg");
        System.out.println("c) .mp3");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("a")) {
            puntos++;
        }

        // Pregunta 7
        System.out.println("7. ¿Qué red abarca una gran área geográfica?");
        System.out.println("a) LAN");
        System.out.println("b) WAN");
        System.out.println("c) PAN");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("b")) {
            puntos++;
        }

        // Pregunta 8
        System.out.println("8. ¿Qué dispositivo almacena datos permanentemente?");
        System.out.println("a) Memoria RAM");
        System.out.println("b) Disco duro");
        System.out.println("c) Procesador");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("b")) {
            puntos++;
        }

        // Pregunta 9
        System.out.println("9. ¿Qué protocolo se usa en Internet?");
        System.out.println("a) HTTP");
        System.out.println("b) VGA");
        System.out.println("c) USB");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("a")) {
            puntos++;
        }

        // Pregunta 10
        System.out.println("10. ¿Qué es Linux?");
        System.out.println("a) Una marca de móviles");
        System.out.println("b) Un sistema operativo libre");
        System.out.println("c) Un virus informático");
        respuesta = teclado.nextLine();
        if (respuesta.equalsIgnoreCase("b")) {
            puntos++;
        }

        // Resultado final
        System.out.println("\nHas obtenido " + puntos + " puntos de 10.");

        teclado.close();
    }
}
