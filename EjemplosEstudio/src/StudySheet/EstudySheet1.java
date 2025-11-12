package StudySheet;

public class EstudySheet1 {

	public static void main(String[] args) {
		// ==============================
        // 🔹 CONDICIONALES (if, else if, else)
        // ==============================
        int x = 10, y = 20; // Declaración de variables

        // Estructura condicional básica
        if (x > y) {
            System.out.println("x es mayor que y");
        } else if (x == y) {
            System.out.println("x y y son iguales");
        } else {
            System.out.println("y es mayor que x");
        }

        // Operador ternario: versión corta del if/else
        String resultado = (x > y) ? "x mayor" : "y mayor";
        System.out.println(resultado);

        // ==============================
        // 🔹 BUCLES
        // ==============================

        // BUCLE FOR: se ejecuta un número determinado de veces
        System.out.println("\nBucle for:");
        for (int i = 0; i < 5; i++) { // i empieza en 0 y aumenta hasta 4
            System.out.println("i = " + i);
        }

        // BUCLE WHILE: se ejecuta mientras la condición sea verdadera
        System.out.println("\nBucle while:");
        int contador = 0;
        while (contador < 3) {
            System.out.println("contador = " + contador);
            contador++; // importante incrementar o puede quedar infinito
        }

        // BUCLE DO-WHILE: ejecuta al menos una vez, aunque la condición sea falsa
        System.out.println("\nBucle do-while:");
        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 3);

        // ==============================
        // 🔹 ARRAYS (VECTORES)
        // ==============================

        // Declarar e inicializar un array
        int[] numeros = {10, 20, 30, 40, 50};

        // Recorrer array con un bucle for normal
        System.out.println("\nRecorrer un array con for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        // Recorrer array con for-each (más simple)
        System.out.println("\nRecorrer un array con for-each:");
        for (int num : numeros) { // num toma el valor de cada elemento
            System.out.println(num);
        }

        // Modificar un elemento del array
        numeros[2] = 99; // cambia el tercer elemento (índice 2)

        // ==============================
        // 🔹 MATRICES (ARRAYS 2D)
        // ==============================

        // Declarar e inicializar una matriz (array bidimensional)
        int[][] matriz = {
            {1, 2, 3},  // Fila 0
            {4, 5, 6},  // Fila 1
            {7, 8, 9}   // Fila 2
        };

        // Recorrer la matriz con bucles anidados
        System.out.println("\nRecorrer una matriz:");
        for (int fila = 0; fila < matriz.length; fila++) { // filas
            for (int col = 0; col < matriz[fila].length; col++) { // columnas
                System.out.print(matriz[fila][col] + " ");
            }
            System.out.println(); // salto de línea al terminar cada fila
        }

        // Ejemplo: suma de todos los elementos de la matriz
        int suma = 0;
        for (int[] fila : matriz) {      // recorre cada fila
            for (int valor : fila) {     // recorre cada valor de la fila
                suma += valor;
            }
        }
        System.out.println("\nSuma de todos los elementos: " + suma);

        // ==============================
        // 🔹 MÉTODOS
        // ==============================

        // Llamar a un método que devuelve un valor
        int resultadoSuma = sumar(5, 7);
        System.out.println("\nSuma usando método: " + resultadoSuma);
    }

    // Método estático que recibe dos enteros y devuelve su suma
    static int sumar(int a, int b) {
        return a + b;

	}

}
