package ejercicio1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Atleta> atletas = new ArrayList<>();
        Random rand = new Random();

        // Generar entre 20 y 30 atletas
        int cantidad = rand.nextInt(11) + 20; // 20 a 30

        for (int i = 0; i < cantidad; i++) {
            String nombre = "Atleta" + (i + 1);
            int edad = rand.nextInt(30) + 10; // 10 a 39 años
            double altura = 1.4 + (2.1 - 1.4) * rand.nextDouble(); // 1.4m a 2.1m

            atletas.add(new Atleta(nombre, edad, altura));
        }

        // Variables para cálculos
        double sumaEdades = 0;
        double sumaAlturas = 0;
        int menores = 0;
        int mayores = 0;

        // Recorrido para cálculos
        for (Atleta a : atletas) {
            sumaEdades += a.getEdad();
            sumaAlturas += a.getAltura();

            if (a.getEdad() < 18) {
                menores++;
            } else {
                mayores++;
            }
        }

        // Promedios
        double promedioEdad = sumaEdades / atletas.size();
        double promedioAltura = sumaAlturas / atletas.size();

        // Mostrar resultados
        System.out.println("Cantidad de atletas: " + atletas.size());
        System.out.println("Promedio de edad: " + promedioEdad);
        System.out.println("Promedio de altura: " + promedioAltura);
        System.out.println("Menores de edad: " + menores);
        System.out.println("Mayores de edad: " + mayores);

        // Atletas más altos que el promedio
        System.out.println("\nAtletas más altos que el promedio:");
        for (Atleta a : atletas) {
            if (a.getAltura() > promedioAltura) {
                System.out.println(a.getNombre());
            }
        }
    }
}