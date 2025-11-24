/*
 * Descripcion: Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
 * En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
 * oportuno. Implementa las funciones:
 * int menu() // Muestra el menú y devuelve el número elegido
 * double pideRadio() // Pide que se introduzca el radio y lo devuelve
 * double circunferencia(double r) // Calcula la circunferencia y la devuelve
 * double area(double r) // Calcula el área y la devuelve
 * Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario
 * también pueda solicitar el cálculo del volumen. Añade la función:
 * double volumen(double r) // Calcula el volumen y lo devuelve
 * Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez
 * y se muestren los tres cálculos posibles (circunferencia, área y volumen).
 * Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú ->
 * realizar el cálculo -> volver a mostrar menú). Añade una opción más llamada “Salir” que terminará
 * el programa si es elegida.
 * Autor: Juan Carlos
 * Fecha: 24/11/25
 */
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21test {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int opcion;
		opcion = menu(opcion);
		
			
		switch (opcion) {
		   case 1: pideRadio(opcion);
		   
		   break;
		   case 2: pideRadio(opcion);
		   break;
		   case 3: pideRadio(opcion);
		   break;
		   case 4: pideRadio(opcion);
		   break;
		   default: System.out.println("Opción no válida. Intenta de nuevo.");
	       }
		
		sc.close();
	}
	
	
	public static int menu(int a) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n----- MENÚ -----");
        System.out.println("1. Circunferencia");
        System.out.println("2. Area");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.print("Elige una opción: ");
        int opcionMenu = sc.nextInt();
        sc.close();
        return opcionMenu;
		
	}
	
	public static double circunferencia (int a) {
		return 2 * 3.14 * a;
	}
	
	public static double area (int a) {
		return (a * a) * 3.14;
	}
	
	public static double volumen (int a) {
		return (a * a * a) * 3.14 / 3 * 4;
	}
	
	public static double[] todas (int a) {
		double[] todas = new double[2];
		todas[0] = circunferencia(a);
		todas[1] = area(a);
		todas[2] = volumen(a);
		return todas;	
	}
	
	public static int pideRadio (int a) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Dime el radio: ");
		int radio = sc.nextInt();
		sc.close();
		return radio;
		
	}
	
	
}


