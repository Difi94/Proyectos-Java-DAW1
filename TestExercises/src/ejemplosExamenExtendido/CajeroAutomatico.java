/*
 * Descripcion: Crea un programa que simule un cajero automático.
El usuario empieza con un saldo de 1000 € y puede elegir entre:
 */
package ejemplosExamenExtendido;

import java.util.Scanner;

public class CajeroAutomatico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double saldo = 1000;
        int opcion;

        do {
            System.out.println("\n--- MENÚ CAJERO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tu saldo actual es: " + saldo + " €");
                    break;
                case 2:
                    System.out.print("Cantidad a ingresar: ");
                    double ingreso = sc.nextDouble();
                    saldo += ingreso;
                    System.out.println("Has ingresado " + ingreso + " €. Nuevo saldo: " + saldo);
                    break;
                case 3:
                    System.out.print("Cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Has retirado " + retiro + " €. Nuevo saldo: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

	}

}
