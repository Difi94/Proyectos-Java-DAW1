package exceptions;

import java.util.*;

public class ejemploExcepciones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int entero = 0;
        boolean error;

        System.out.println("Dame un entero:");

        do {
            try {
                entero = sc.nextInt();
                error = false;
                sc.close();
            } catch (InputMismatchException exTipoDiferente) {
                error = true;
                System.out.println("Te has equivocado, dame un entero:");
                sc.nextLine(); //limpiar el buffer
            } catch (RuntimeException ex1) {
                error = true;
                System.out.println("Ocurrió un error");
                sc.nextLine();
            }
        } while (error);

        System.out.println("El número es: " + entero);

        sc.close();
    }
}
