/*
 * Descripcion: ejemplos de tipos de variables
 * Autor: Juan Carlos
 * Fecha: 22/09/25
 */
package tiposvariables;

public class Ejemplosvariables {

	public static void main(String[] args) {
		int numAlumnos; //Declaramos la variable numAlumnos
		numAlumnos = 0;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		numAlumnos = 12;
		System.out.println("Valor de la variable: " + numAlumnos);
		
		//float alturaAlumno1 = 1.75f;
		
		double alturaAlumno = 1.75;
		System.out.println("Valor de la \"variable\":\n " + alturaAlumno + " cms.");
		
		char letraDni;
		letraDni = 'a';
		
		String nombreAlumno = "Alberto";
		System.out.println("Valor de la variable: " + nombreAlumno);
		
		final int NUM_MAX_ALUMNOS = 22; // Declaramos una constante
		System.out.println("Valor de la constante: " + NUM_MAX_ALUMNOS);
		
		final String GRUPO = "DAW1";
		System.out.println("Valor del grupo constante: " + GRUPO);

	}

}
