package Ejercicio2;

import libtarea3.Dado;

public class Ejercicio2 {

    public static void main(String[] args) {

        System.out.printf("Número total de dados creados: %d "
                + "\nNúmero total de lanzamientos: %d"
                + "\nCantidad de veces que ha salido la cara 1: %d"
                + "\nCantidad de veces que ha salido la cara 2: %d"
                + "\nCantidad de veces que ha salido la cara 3: %d"
                + "\nCantidad de veces que ha salido la cara 4: %d\n\n",
                Dado.getNumeroDadosCreados(),
                Dado.getNumeroLanzamientosGlobal(),
                Dado.getNumeroVecesCaraGlobal(1),
                Dado.getNumeroVecesCaraGlobal(2),
                Dado.getNumeroVecesCaraGlobal(3),
                Dado.getNumeroVecesCaraGlobal(4));

        //2.1
        for (int i = 0; i < 10; i++) {
            Dado carasAleatorias = new Dado();
            try {
                int nCaras = (int)(Math.random()*9);
                carasAleatorias = new Dado(nCaras);
                //System.out.println("Dado creado con " + nCaras + " caras");
            } catch (IllegalArgumentException ex1) {
                //System.out.println("Error al crear dado: " + ex1.getMessage());
            }
            //2.2
            for (int j = 0; j < carasAleatorias.getNumeroCaras(); j++) {
                carasAleatorias.lanzar();
                //System.out.println("Lanzamiento" + " " + (j+1) + ": " + resultado);
            }
            System.out.println("Dados que se han creado: " + carasAleatorias.getSerieHistoricaLanzamientos());
            System.out.println("Suma de los dados: " + carasAleatorias.getSumaPuntuacionHistorica());
        }
        //3
        System.out.printf("Número total de dados creados: %d "
                + "\nNúmero total de lanzamientos: %d"
                + "\nCantidad de veces que ha salido la cara 1: %d"
                + "\nCantidad de veces que ha salido la cara 2: %d"
                + "\nCantidad de veces que ha salido la cara 3: %d"
                + "\nCantidad de veces que ha salido la cara 4: %d\n\n",
                Dado.getNumeroDadosCreados(),
                Dado.getNumeroLanzamientosGlobal(),
                Dado.getNumeroVecesCaraGlobal(1),
                Dado.getNumeroVecesCaraGlobal(2),
                Dado.getNumeroVecesCaraGlobal(3),
                Dado.getNumeroVecesCaraGlobal(4));
        
        
    }
}

