/*
 * Descripcion: Realizar un programa que solicite al usuario diferentes datos y que a partir de ellos calcule su salario 
 * y muestre una ficha en pantalla.
 * Autor: Juan Carlos
 * Fecha: 01/10/25
 */

package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Nombre: ");
	String nombre = teclado.nextLine();
	
	System.out.println("Apellido: ");
	String apellido = teclado.nextLine();

	System.out.println("Fecha de nacimiento: ");
	String birthdate = teclado.nextLine();
	
	System.out.println("Salario: ");
	double salario = teclado.nextDouble();
	
	System.out.println("Años trabajando en la empresa: ");
	int anyosTrabajados = teclado.nextInt();
	
	double irpf = salario * 15 /100;
	
	double salarioNeto = salario - irpf;
	
	double incremento = salario * 2 /100;
	
	double incrementoTotal = incremento + salario;
	
	double salarioTotal = incremento + salario; 
	
	System.out.println("Estimad@ " + nombre + " " + apellido + ", " + "su salario bruto es " + salario + ", " + "teniendo en cuenta un IRPF del 15% su salario neto es: " + salarioNeto);
	System.out.println("Debido a sus " + anyosTrabajados + " años trabajando en la empresa su salario se incrementara en un 2% por cada año. El Aumento es de " + incremento + " y el salario total es de " + salarioTotal);
	
	teclado.close();
	
	}

}
