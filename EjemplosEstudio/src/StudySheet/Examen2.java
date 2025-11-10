/*
 * Descripcion: ejemplos de
 * bucles (if, else-if, while, do-while, switch case, for)
 * arrays (vectores, matrices)
 * cadenas de caracteres
 * expresiones regulares
 * Autor: Juan Carlos
 * Faecha: 10/11/25
 */
package StudySheet;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examen2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // =======================
        // 1. CONDICIONALES
        // =======================
        System.out.println("=== CONDICIONALES ===");
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad < 13) {
            System.out.println("Eres un niño.");
        } else if (edad < 18) {
            System.out.println("Eres un adolescente.");
        } else {
            System.out.println("Eres un adulto.");
        }

        // =======================
        // 2. BUCLES
        // =======================
        System.out.println("\n=== BUCLES ===");

        // For: mostrar números del 1 al 5
        System.out.println("For loop (1 a 5):");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Número: " + i);
        }

        // While: cuenta regresiva
        System.out.println("\nWhile loop (cuenta regresiva desde 5):");
        int contador = 5;
        while (contador > 0) {
            System.out.println("Contador: " + contador);
            contador--;
        }

        // Do-While: ejecuta al menos una vez
        System.out.println("\nDo-While (introducir número mayor que 10):");
        int numero;
        do {
            System.out.print("Introduce un número mayor que 10: ");
            numero = sc.nextInt();
        } while (numero <= 10);
        System.out.println("Correcto!");

        // =======================
        // 3. SWITCH CASE
        // =======================
        System.out.println("\n=== SWITCH CASE ===");
        System.out.print("Elige un día (1-7): ");
        int dia = sc.nextInt();

        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido.");
        }

        // =======================
        // 4. ARRAYS (Vectores)
        // =======================
        System.out.println("\n=== ARRAYS (Vectores) ===");
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Elementos del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento [" + i + "] = " + numeros[i]);
        }

        // =======================
        // 5. MATRICES (Arrays 2D)
        // =======================
        System.out.println("\n=== MATRICES (2D) ===");
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
            };

        System.out.println("Elementos de la matriz:");
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz[fila].length; col++) {
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println();
        }

        // =======================
        // 6. CADENAS DE CARACTERES
        // =======================
        System.out.println("\n=== CADENAS DE CARACTERES ===");
        sc.nextLine(); // limpiar buffer
        System.out.print("Introduce tu nombre completo: ");
        String nombre = sc.nextLine();

        System.out.println("Tu nombre tiene " + nombre.length() + " caracteres.");
        System.out.println("En mayúsculas: " + nombre.toUpperCase());
        System.out.println("En minúsculas: " + nombre.toLowerCase());

        if (nombre.contains(" ")) {
            System.out.println("Tu nombre contiene al menos un espacio.");
        } else {
            System.out.println("Parece que introdujiste solo un nombre.");
        }

        // =======================
        // 7. EXPRESIONES REGULARES
        // =======================
        System.out.println("\n=== EXPRESIONES REGULARES ===");
        System.out.print("Introduce un correo electrónico: ");
        String correo = sc.nextLine();

        // Patrón de correo electrónico básico
        String regexCorreo = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regexCorreo);
        Matcher matcher = pattern.matcher(correo);

        if (matcher.matches()) {
            System.out.println("El correo es válido ✅");
        } else {
            System.out.println("El correo NO es válido ❌");
        }

        sc.close();

	}

}
