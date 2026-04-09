package ejercicioForEach;

import java.util.Collection;

public class Operaciones {

    public static int[] calcularSuma(Collection<Integer> numeros) {
        int sumaPares = 0;
        int sumaImpares = 0;

        for (int i : numeros) {   // for-each
            if (i % 2 == 0) {
                sumaPares += i;
            } else {
                sumaImpares += i;
            }
        }

        return new int[]{sumaPares, sumaImpares};
    }
}