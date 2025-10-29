package ejercicio11;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenadosConArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] numeros = new int[3];

        System.out.print("Introduce el primer número: ");
        numeros[0] = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        numeros[1] = sc.nextInt();

        System.out.print("Introduce el tercer número: ");
        numeros[2] = sc.nextInt();

        Arrays.sort(numeros);

        System.out.println("Los números ordenados son: " 
            + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        sc.close();

	}

}
