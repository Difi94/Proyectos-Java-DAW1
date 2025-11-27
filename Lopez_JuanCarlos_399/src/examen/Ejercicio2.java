/*
 * Descripcion: 
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package examen;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		final String[] MUNICIPIOS = {"Antequera", "Ardales", "Benagalbón", "Coín", "Estepona", "Marbella", "Mijas", "Nerja", "Ronda", "Torrox"};
		//int[] dias = new int [16];
		int[][] nacimientos = new int [16][10];
		//nacimientos [0][]
		
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 10; j++) {
				nacimientos[i] = 16 + i;
				nacimientos[j] = i + 1;
			}
		}
		
		//System.out.println(Arrays.toString(dias));
		//System.out.println(Arrays.toString(MUNICIPIOS));
		//int[][] nacimientos = new int [MUNICIPIOS][dias];

	}
	
	public static int diaMasNacimientos (int[][] nacimientos, int[][] dias) {
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 10; j++) {
				nacimientos [i][j] = Math.max(i, j);
				
			}
		}
		return;
	}

}
