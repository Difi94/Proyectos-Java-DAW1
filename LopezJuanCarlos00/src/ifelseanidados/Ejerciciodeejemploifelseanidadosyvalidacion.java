/*
 * Descripcion:
 * Autor:
 * Fecha:
 */
package ifelseanidados;

import java.util.Scanner;

public class Ejerciciodeejemploifelseanidadosyvalidacion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Preguntas acertadas:");
		int aciertos = teclado.nextInt();
		
		System.out.println("Preguntas fallidas:");
		int fallos = teclado.nextInt();
		
		
		if (aciertos < 0 || fallos < 0 || (aciertos + fallos) > 20) {
			System.out.println("Datos erroneos");
		} else if ((aciertos * 0.5) - (fallos/0.25) <= 4){
			double notaCuantitativa = (aciertos * 0.5) - (fallos/0.25);
			System.out.println("Has sacado un: " + notaCuantitativa + " estas suspenso");
		}  else if ((aciertos * 0.5) - (fallos/0.25) >= 5){
			double notaCuantitativa = (aciertos * 0.5) - (fallos/0.25);
			System.out.println("Has sacado un: " + notaCuantitativa + " estas aprobado");
		}
teclado.close();
	}

}
