/*
 * Descripcion: 
 * Autor: Juan Carlos
 * Fecha: 12/11/25
 */
package examen;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int[][] numAleatorios = new int[2][20];
        int sumaPares = 0;
        int contadorPares = 0;

        //Genero e imprimo los números alineados por columnas
        System.out.println("=== Números generados ===");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 20; j++) {
                numAleatorios[i][j] = (int) (Math.random() * 51);

                //Alineo las columnas con un ancho fijo de 4 espacios
                System.out.printf("%4d", numAleatorios[i][j]);

                //Calculo la suma de posiciones pares
                int posicion = i * 20 + j; // posición general de 0 a 39
                if (posicion % 2 == 0) {
                    sumaPares += numAleatorios[i][j];
                    contadorPares++;
                }
            }
            System.out.println();
        }

        //Calculo la media de los números pares
        double mediaPares = (double) sumaPares / contadorPares;

        //Muestro la media
        System.out.printf("%nMedia de los valores en posiciones pares: %.2f%n", mediaPares);

        //Valores impares por debajo de la media
        System.out.println("Valores en posiciones impares por debajo de la media:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 20; j++) {
                int posicion = i * 20 + j;
                if (posicion % 2 != 0 && numAleatorios[i][j] < mediaPares) {
                    System.out.printf("Posición %2d → %2d%n", posicion, numAleatorios[i][j]);
                }
            }
        }
    }
}

