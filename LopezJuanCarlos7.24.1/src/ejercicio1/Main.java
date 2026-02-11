package ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Objetos con constructor con parámetros
        Humano h1 = new Humano("Carlos", "Pérez");
        Ciudadano c1 = new Ciudadano("Ana", "López", "12345678A");
        Ciudadano c2 = new Ciudadano("Luis", "Martínez", "87654321B");

        //Uso del método getNombreCompleto
        System.out.println("=== INFORMACIÓN INICIAL ===");
        System.out.println("Humano: " + h1.getNombreCompleto());
        System.out.println("Ciudadano 1: " + c1.getNombreCompleto());
        System.out.println("Ciudadano 2: " + c2.getNombreCompleto());

        //Objeto con constructor sin parámetros
        Humano h2 = new Humano();

        System.out.println("\n=== OBJETO CONSTRUCTOR POR DEFECTO ===");
        System.out.println("Antes de modificar: " + h2.getNombreCompleto());

        //Petición de datos
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nuevo nombre: ");
        String nuevoNombre = sc.nextLine();

        System.out.print("Ingrese nuevo apellido: ");
        String nuevoApellido = sc.nextLine();

        //Modificación de atributos usando setters
        h2.setNombre(nuevoNombre);
        h2.setApellido(nuevoApellido);

        System.out.println("\nDespués de modificar: " + h2.getNombreCompleto());

        sc.close();
    }
}
