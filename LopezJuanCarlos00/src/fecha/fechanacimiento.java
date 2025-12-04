package fecha;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class fechanacimiento {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dime tu fecha de nacimiento(yyyy-MM-dd)");
		String fechaNacimiento = sc.nextLine();
		LocalDate nacimiento = LocalDate.parse(fechaNacimiento);
		LocalDate hoy = LocalDate.now();
		
		Period edad = Period.between(nacimiento, hoy);
		System.out.println(edad);
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		System.out.println("Fecha de nacimiento: " + nacimiento.format(formato));
        System.out.println("Tienes " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " dia");
	}
}