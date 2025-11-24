package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            opcion = menu();//muestra el menu

            switch (opcion) {

                case 1: {
                    double radio = pideRadio(sc);
                    System.out.println("Circunferencia = " + circunferencia(radio));
                    break;
                }

                case 2: {
                    double radio = pideRadio(sc);
                    System.out.println("Área = " + area(radio));
                    break;
                }

                case 3: {
                    double radio = pideRadio(sc);
                    System.out.println("Volumen = " + volumen(radio));
                    break;
                }

                case 4: {
                    double radio = pideRadio(sc);
                    System.out.println("Circunferencia = " + circunferencia(radio));
                    System.out.println("Área = " + area(radio));
                    System.out.println("Volumen = " + volumen(radio));
                    break;
                }

                case 5:
                    System.out.println("Cerrando el programa");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        sc.close();
    }
    
    //devuelve la opcion del menu
    public static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n----- MENÚ -----");
        System.out.println("1. Circunferencia");
        System.out.println("2. Área");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        System.out.print("Elige una opción: ");
        return sc.nextInt();
    }

    //devuelve el radio
    public static double pideRadio(Scanner sc) {
        System.out.print("Introduce el radio: ");
        return sc.nextDouble();
    }
    

    //devuelve la circunferencia del radio
    public static double circunferencia(double a) {
        return 2 * Math.PI * a;
    }
    
    //devuelve el area
    public static double area(double a) {
        return Math.PI * a * a;
    }
     
    //devuelve el volumen
    public static double volumen(double a) {
        return (4.0 / 3.0) * Math.PI * Math.pow(a, 3);
    }
}
