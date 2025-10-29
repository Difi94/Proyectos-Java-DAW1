/*
 * Descripcion: dado un día de la semana (de lunes a viernes) y una hora (horas
y minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el
fin de semana comienza el viernes a las 21:30h. Se da por hecho que el usuario
introducirá un día y hora correctos, anterior al viernes a las 15:00h.
 */
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10CuantoFaltaFindeEnMinutos {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Introduce el día de la semana (lunes-viernes): ");
	        String diaStr = sc.nextLine().toLowerCase();

	        System.out.print("Introduce la hora (0-23): ");
	        int hora = sc.nextInt();

	        System.out.print("Introduce los minutos (0-59): ");
	        int minutos = sc.nextInt();

	        int dia = 0;
	        switch (diaStr) {
	            case "lunes":
	                dia = 1;
	                break;
	            case "martes":
	                dia = 2;
	                break;
	            case "miércoles":
	            case "miercoles":
	                dia = 3;
	                break;
	            case "jueves":
	                dia = 4;
	                break;
	            case "viernes":
	                dia = 5;
	                break;
	            default:
	                System.out.println("Día no válido.");
	                System.exit(0);
	        }

	        // Minutos actuales desde lunes 00:00
	        int minutosActuales = (dia - 1) * 24 * 60 + hora * 60 + minutos;

	        // Minutos del viernes 21:30 desde lunes 00:00
	        int minutosFinSemana = (4 * 24 * 60) + (21 * 60) + 30; // 4 días completos + 21:30

	        int faltan = minutosFinSemana - minutosActuales;

	        System.out.println("Faltan " + faltan + " minutos para el fin de semana.");

	        sc.close();

	}

}
