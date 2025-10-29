/*
 * Descripcion: Pedir numero total de paginas de un libro, numero de paginas que lee
 * cada dia, dia de la semana que empieza a leer (de lunes a domingo), calcular que dia de la semana
 * terminara el libro, suponiendo que todos los dias se leen las mismas paginas, se puede suponer
 * que el numero total de paginas es multiplo de paginas leidas por dia.
 */
package bucles;

import java.util.Scanner;

public class CalcularQueDiaAcabaLibro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        //Entrada de datos
        System.out.print("Introduce el número total de páginas del libro: ");
        int paginasTotales = sc.nextInt();

        System.out.print("Introduce el número de páginas que lees por día: ");
        int paginasPorDia = sc.nextInt();

        sc.nextLine(); // Limpiar buffer

        System.out.print("Introduce el día en que comienzas a leer (lunes a domingo): ");
        String diaInicio = sc.nextLine().toLowerCase();

        //Calcular cuántos días se tardará en leer el libro
        int diasLectura = paginasTotales / paginasPorDia;

        //Asignar un número al día de la semana (lunes = 1, ..., domingo = 7)
        int numeroDiaInicio = 0;
        switch (diaInicio) {
            case "lunes":
                numeroDiaInicio = 1;
                break;
            case "martes":
                numeroDiaInicio = 2;
                break;
            case "miércoles":
            case "miercoles": // permitir sin tilde
                numeroDiaInicio = 3;
                break;
            case "jueves":
                numeroDiaInicio = 4;
                break;
            case "viernes":
                numeroDiaInicio = 5;
                break;
            case "sábado":
            case "sabado":
                numeroDiaInicio = 6;
                break;
            case "domingo":
                numeroDiaInicio = 7;
                break;
            default:
                System.out.println("Día no válido.");
                System.exit(0);
        }

        //Calcular el día final
        int numeroDiaFinal = (numeroDiaInicio + diasLectura - 1) % 7;
        if (numeroDiaFinal == 0) {
            numeroDiaFinal = 7; // Si el resto es 0, significa domingo
        }

        //Obtener el nombre del día final
        String diaFinal = "";
        switch (numeroDiaFinal) {
            case 1:
                diaFinal = "lunes";
                break;
            case 2:
                diaFinal = "martes";
                break;
            case 3:
                diaFinal = "miércoles";
                break;
            case 4:
                diaFinal = "jueves";
                break;
            case 5:
                diaFinal = "viernes";
                break;
            case 6:
                diaFinal = "sábado";
                break;
            case 7:
                diaFinal = "domingo";
                break;
        }

        
        System.out.println("\nTerminarás de leer el libro un " + diaFinal + ".");
		
		sc.close();
	}

}
