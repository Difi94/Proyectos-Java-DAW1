/*
 * Descripcion: Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta
que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A
partir de la hora 41, se pagan a 16 euros la hora.
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4Salario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número de horas trabajadas esta semana: ");
        int horas = sc.nextInt();
        
        double salario;
        
        if (horas <= 40) {
            salario = horas * 12;
        } else {
            int horasExtra = horas - 40;
            salario = (40 * 12) + (horasExtra * 16);
        }
        
        System.out.println("El salario semanal es: " + salario + " euros");
        
        sc.close();

	}

}
