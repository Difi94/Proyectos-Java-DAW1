/*
 * Descripcion: Pide al usuario cuántos días ha trabajado esta semana (entre 1 y 7).
Después, pide cuántas horas ha trabajado cada día y muestra:

El total de horas.

El promedio diario.

Cuántos días trabajó más de 8 horas.
 */
package ejemplosExamenExtendido;

import java.util.Scanner;

public class ContadorHorasTrabajadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos días has trabajado esta semana (1-7)? ");
        int dias = sc.nextInt();

        int totalHoras = 0;
        int diasLargos = 0;

        for (int i = 1; i <= dias; i++) {
            System.out.print("Horas trabajadas el día " + i + ": ");
            int horas = sc.nextInt();
            totalHoras += horas;
            if (horas > 8) {
                diasLargos++;
            }
        }

        double promedio = (double) totalHoras / dias;

        System.out.println("\nResumen semanal:");
        System.out.println("Total de horas trabajadas: " + totalHoras);
        System.out.println("Promedio diario: " + promedio);
        System.out.println("Días con más de 8 horas: " + diasLargos);

	}

}
