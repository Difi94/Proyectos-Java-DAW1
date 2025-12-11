package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int anyo = 0;
		int mes = 0;
		int dia = 0;
		
		System.out.println("Fecha de nacimiento");
		
		do {
		    System.out.println("Año: ");
		    try {
		        anyo = sc.nextInt();
		    } catch (InputMismatchException ex1) {
		        System.out.println(ex1.getMessage());
		        sc.nextLine();
		    }
		} while (anyo < 1900 || anyo > 2025);

		do {
		    System.out.println("Mes: ");
		    try {
		        mes = sc.nextInt();
		    } catch (InputMismatchException ex1) {
		    	System.out.println(ex1.getMessage());
		        sc.nextLine();
		    }
		} while (mes < 1 || mes > 12);

		do {
		    System.out.println("Dia: ");
		    try {
		        dia = sc.nextInt();
		    } catch (InputMismatchException ex1) {
		    	System.out.println(ex1.getMessage());
		        sc.nextLine();
		    }
		} while (dia < 1 || dia > 31);

		LocalDate fecha = LocalDate.of(anyo, mes, dia);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		fecha.format(formatter);
		fecha.getDayOfWeek();
		fecha.isLeapYear();
		System.out.println("El dia que naciste fue " + fecha.getDayOfWeek() + ".");
		
	}

}
