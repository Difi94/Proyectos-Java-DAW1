/*
 * Descripcion: añado dos comprobaciones mas al programa del ejercicio 2
 * Autor: Juan Carlos
 * Fecha: 16/10/25
 */
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre:");
		String nombre = teclado.nextLine();
		
		System.out.println("Introduzca sus apellidos:");
		String apellidos = teclado.nextLine();
		
		System.out.println("Introduce tu edad:");
		int edad = teclado.nextInt();
		
		System.out.println("Salario deseado:");
		double salario = teclado.nextDouble();
		teclado.nextLine();
		
		
		if (salario > 30000 || edad > 45) {
			System.out.println("Su salario deseado, " + salario + " y su edad " + edad + " superan nuestros margenes deseados, lo sentimos pero no cumple nuestro perfil");
		} else {
			System.out.print("Introduzca sus años de experiencia: ");
			int exp = teclado.nextInt();
			teclado.nextLine();
			 System.out.print("Introduzca el numero de proyectos en los que ha trabajado: ");
			int proyectos = teclado.nextInt();
			teclado.nextLine();
			if (exp >= 2 && proyectos >= 3) {
				System.out.println("Enhorabuena, has sido contratad@.");
				double salarioAnual;
				 if (exp >= 5 || proyectos >= 5) {
		             salarioAnual = 30000;
		                } else {
		                    salarioAnual = 25000; 
		                }
				 System.out.println("Su salario anual asignado sere de: " + salarioAnual + " euros.");
				 
			} else {
                System.out.println("Lo sentimos pero no cumple nuestro perfil.");
            }
			
			} 
			
teclado.close();
	}

}
