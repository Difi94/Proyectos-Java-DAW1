/*
 * Descripcion: Pedir fecha; dia, mes y año y comprobar si es correcta.
 * Autor: Juan Carlos
 * Fecha: 17/11/25
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el día: ");
		int dia = sc.nextInt();
		
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		
		System.out.println("Introduce el año: ");
		int anyo = sc.nextInt();
		
		if (!compruebaFecha(dia, mes, anyo)) {
			System.out.println("La fecha no existe.");
		} else {
			System.out.println("La fecha es correcta.");
		}
		
		sc.close();

	}
	//devuelve si la fecha es correcta (teniendo en cuenta los dias por mes)
	public static boolean compruebaFecha(int dia, int mes, int anyo) {
		
	/*	if (a >= 1 && a <= 31 && b >= 1 && b <= 12 && c < 2025) {
		return true;
		} else {
		return false;
		} */
		
		//comprueba el mes
	    if (mes < 1 || mes > 12) {
	        return false;
	    }
	    
	    //dias máximos depende del mes
	    int diasMes;
	    switch (mes) {
	    case 4: case 6: case 9: case 11: diasMes = 30;
	    break;
	    case 2: diasMes = 28;
	    break;
	    default: diasMes = 31;
	    }
	    return dia >= 1 && dia <= diasMes;
	}
		
}
