/*
 * Descripcion: Crea un método llamado accesoBecaUsa. Este método recibe como parámetros los siguientes
 * datos: edad, nota académica, renta, nivel de Idioma (Boolean)
 * El método analizará los datos recibidos y hará las siguientes comprobaciones:
 * Si el nivel de idioma no es el requerido, devolverá: "No apto"
 * Si la edad es mayor de 30 devolverá: "No apto"
 * Si cumple las condiciones anteriores se comprobará lo siguiente:
 * Si la nota es superior a 9:" Apto"
 * Si la nota es inferior a 5:" No Apto"
 * Si la nota es 6, 7 u 8 y la renta menor a 20.000 "Apto", en caso contrario "No apto".
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu edad: ");
		int edad = sc.nextInt();
		System.out.println("Dime tu nota: ");
		double nota = sc.nextDouble();
		System.out.println("Dime tu renta: ");
		double renta = sc.nextDouble();
		System.out.println("Tienes el nivel de Idioma requerido?(True o False): ");
		boolean nivel = sc.nextBoolean();
		
		System.out.println(accesoBecaUsa(edad, nota, renta, nivel));
		
		sc.close();

	}
	
	public static String accesoBecaUsa (int edad, double nota, double renta, boolean nivel) {
		
		if (!nivel) {
			return "No apto";
		} if (edad > 30) {
			return "No apto";
		} if (nota > 9) {
			return "Apto";
		} if (nota < 5) {
			return "No apto";
		} if ((nota == 6 || nota == 7 || nota == 8) && renta < 20000) {
			return "Apto";
		} else {
			return "No apto";
		}
	}

}
