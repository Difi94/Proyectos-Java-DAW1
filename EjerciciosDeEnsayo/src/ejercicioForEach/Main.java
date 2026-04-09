package ejercicioForEach;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<Integer> numeros = new HashSet<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        int[] resultado = Operaciones.calcularSuma(numeros);

        System.out.println("Suma de pares: " + resultado[0]);
        System.out.println("Suma de impares: " + resultado[1]);
    }
}
