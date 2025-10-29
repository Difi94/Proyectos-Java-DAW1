/*
 * Descripcion: Un trabajador cobra 12 € por hora. Si trabaja más de 40 h a la semana, las horas extra se pagan a 16 €.
Pide las horas trabajadas e indica el salario total.
 */
package ejemplosExamen;

import java.util.Scanner;

public class CalculoSalarioSemanal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        final double PAGA_NORMAL = 12.0;
        final double PAGA_EXTRA = 16.0;
        
        System.out.print("Introduce las horas trabajadas esta semana: ");
        int horas = sc.nextInt();

        double salario;
        if (horas <= 40) {
            salario = horas * PAGA_NORMAL;
        } else {
            salario = 40 * PAGA_NORMAL + (horas - 40) * PAGA_EXTRA;
        }

        System.out.println("El salario total es: " + salario + " €");

	}

}
