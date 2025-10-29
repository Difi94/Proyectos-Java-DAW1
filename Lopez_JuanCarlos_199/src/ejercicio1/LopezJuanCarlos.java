/*
 * Descripcion:Mostrar una cartilla con los datos del empleado.
 * Autor: Juan Carlos López Ponce
 * Fecha : 29/10/2025
 */
package ejercicio1;

public class LopezJuanCarlos {

	public static void main(String[] args) {
		long numeroEmpleado = 2055;
		int edad = 35;
		float salarioHora = 15.50f;
		boolean esJornadaCompleta = true;
		
		int horasTrabajadas = 40;
		float irpf = 12.0f;
		
		//Calculo del Salario Bruto
		float salarioBruto = salarioHora * horasTrabajadas;
		float irpfRetenido = salarioBruto - (salarioBruto * irpf);
		float salarioNeto = salarioBruto - irpfRetenido;
		
		boolean elegibleParaBono;
		
		System.out.println("Numero de empleado: " + numeroEmpleado);
		System.out.println("Salario por hora: " + salarioHora);
		System.out.println("Salario bruto semanal: " + salarioBruto);
		System.out.println("Importe del irpf: " + irpfRetenido);
		System.out.println("Salario neto: " + salarioNeto);

		if (esJornadaCompleta && horasTrabajadas >= 40) {
			elegibleParaBono = true;
			System.out.println("Obtiene bono");
		} else {
			System.out.println("No opta al bono");
		}

	}

}
