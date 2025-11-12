/*
 * Descripción: Programa para registrar sueldos de hombres y mujeres de una empresa
 * y detectar si existe brecha salarial entre ambos.
 * El programa pedirá por teclado la información de N personas (valor introducido por el usuario).
 * Para cada persona, pedirá su género (0 = hombre, 1 = mujer) y su sueldo.
 * Esta información se almacenará en una única matriz.
 * Luego se mostrará por pantalla el sueldo medio de cada género.
 * Autor: Juan Carlos
 * Fecha: 11/11/25
 */
package ejercicio5;

import java.util.Scanner; // Necesario para leer datos del usuario

public class BrechaSalarial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --- PEDIR NÚMERO DE PERSONAS ---
        System.out.print("Introduce el número de personas: ");
        int n = sc.nextInt(); // Número total de personas en la empresa

        // --- CREAR MATRIZ ---
        // La matriz tendrá N filas y 2 columnas:
        // Columna 0 → género (0 = hombre, 1 = mujer)
        // Columna 1 → sueldo
        double[][] datos = new double[n][2];

        // --- RELLENAR MATRIZ CON DATOS INTRODUCIDOS POR EL USUARIO ---
        System.out.println("\nIntroduce los datos de cada persona:");
        for (int i = 0; i < n; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");

            // Pedir género
            System.out.print("  Género (0 = hombre, 1 = mujer): ");
            datos[i][0] = sc.nextInt();

            // Validar que el género sea 0 o 1
            while (datos[i][0] != 0 && datos[i][0] != 1) {
                System.out.print("  Valor no válido. Introduce 0 (hombre) o 1 (mujer): ");
                datos[i][0] = sc.nextInt();
            }

            // Pedir sueldo
            System.out.print("  Sueldo (€): ");
            datos[i][1] = sc.nextDouble();
        }

        // --- VARIABLES PARA CÁLCULOS ---
        double sumaHombres = 0;
        double sumaMujeres = 0;
        int contadorHombres = 0;
        int contadorMujeres = 0;

        // --- RECORRER LA MATRIZ PARA CALCULAR SUMAS Y CONTADORES ---
        for (int i = 0; i < n; i++) {
            if (datos[i][0] == 0) { // Hombre
                sumaHombres += datos[i][1];
                contadorHombres++;
            } else { // Mujer
                sumaMujeres += datos[i][1];
                contadorMujeres++;
            }
        }

        // --- CALCULAR PROMEDIOS ---
        double mediaHombres = 0;
        double mediaMujeres = 0;

        if (contadorHombres > 0) {
            mediaHombres = sumaHombres / contadorHombres;
        }
        if (contadorMujeres > 0) {
            mediaMujeres = sumaMujeres / contadorMujeres;
        }

        // --- MOSTRAR RESULTADOS ---
        System.out.println("\n--- RESULTADOS ---");
        if (contadorHombres > 0)
            System.out.printf("Sueldo medio de los hombres: %.2f €\n", mediaHombres);
        else
            System.out.println("No hay hombres registrados.");

        if (contadorMujeres > 0)
            System.out.printf("Sueldo medio de las mujeres: %.2f €\n", mediaMujeres);
        else
            System.out.println("No hay mujeres registradas.");

        // --- DETECTAR BRECHA SALARIAL ---
        if (contadorHombres > 0 && contadorMujeres > 0) {
            System.out.println();
            if (mediaHombres > mediaMujeres) {
                System.out.printf("💡 Existe brecha salarial: los hombres ganan en promedio %.2f € más.\n",
                        mediaHombres - mediaMujeres);
            } else if (mediaMujeres > mediaHombres) {
                System.out.printf("💡 Existe brecha salarial: las mujeres ganan en promedio %.2f € más.\n",
                        mediaMujeres - mediaHombres);
            } else {
                System.out.println("✅ No existe brecha salarial: ambos géneros tienen el mismo sueldo medio.");
            }
        }

        sc.close(); // Cerramos el Scanner
    }
}
