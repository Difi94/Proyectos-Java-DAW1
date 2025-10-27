/*
 * Descripcion: 20 primeros números naturales
 * Autor: Juan Carlos
 */
package ejercicio1;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Creacion del array
		int[] naturales = new int [20];
		//Llenar el array con valores
		 for (int contador = 0; contador < 20; contador++) {
	            naturales[contador] = contador + 1;
	        }
	        //Imprimir el array para verificar
	        for (int contador = 0; contador < naturales.length; contador++) {
	            System.out.print(naturales[contador] + " ");
	        }

	}

}
