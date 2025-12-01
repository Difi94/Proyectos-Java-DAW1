package Ejercicio2;

import libtarea3.Dado;

public class Ejercicio2 {

	public static void main(String[] args) {
		Dado Ejercicio02 = new Dado();
		System.out.printf("Número total de dados creados: %d "
				+ "\nNúmero total de lanzamientos: %d"
				+ " \nCantidad de veces que ha salido la cara 1 %d"
				+ " \nCantidad de veces que ha salido la cara 2 %d"
				+ " \nCantidad de veces que ha salido la cara 3 %d"
				+ " \nCantidad de veces que ha salido la cara 4 %d",
				Dado.getNumeroDadosCreados(),
				Dado.getNumeroLanzamientosGlobal(),
				Dado.getNumeroVecesCaraGlobal(1),
				Dado.getNumeroVecesCaraGlobal(2),
				Dado.getNumeroVecesCaraGlobal(3),
				Dado.getNumeroVecesCaraGlobal(4));

	}

}
