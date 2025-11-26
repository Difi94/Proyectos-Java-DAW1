/*
 * Descripcion: Realizar un método auditoriaEmpresa, que devolverá un valor boolean.
 * Recibe los siguientes parámetros:
 * SalarioJefe
 * SalarioEncargado
 * SalarioOficinistas
 * numeroOficinistas
 * proyectosTerminados (boolean)
 * presupuestoEmpresa
 * El método hará las siguientes comprobaciones:
 * Si los proyectos no se han terminado devolverá un valor false.y además mostrará un
 * mensaje por pantalla:" No ha pasado la auditoría ya que no ha terminado los
 * proyectos acordados"
 * En caso contrario: calculará el gasto acumulado en sueldos globales : (sueldo jefe +
 * sueldo encargado + sueldo de todos los oficinistas).
 * Si sobrepasa los 20.000 euros devolverá un valor false y además mostrará el mensaje
 * por pantalla: " No ha pasado la auditoría ya que el gasto en personal es de ... y
 * excede el límite mensual de 20.000 euros".
 * Si el gasto acumulado es inferior o igual a 20.000 euros comprobaremos el presupuesto
 * asignado por la empresa. Si es superior a 100.000 euros devolverá false y además
 * mostrará el mensaje por pantalla: "No ha pasado la auditoría ya que el presupuesto
 * asignado de .... excede el límite establecido de 100.000 euros".
 * En caso contrario devolverá true y además mostrará un mensaje por pantalla:
 * "Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene".
 * Autor: Juan Carlos
 * Fecha: 26/11/25
 */
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Salario del jefe: ");
	    double salarioJefe = sc.nextDouble();
	    System.out.println("Salario del encargado: ");
	    double salarioEncargado = sc.nextDouble();
	    System.out.println("Numero de oficinistas de la empresa: ");
	    int numOficinistas = sc.nextInt();
	    System.out.println("Salario de los oficinistas: ");
	    double salarioOficinistas = sc.nextDouble();
	    System.out.println("Presupuesto de la empresa: ");
	    double presupuestoEmpresa = sc.nextDouble();
	    System.out.println("Has terminado los proyectos?(True o False): ");
	    boolean proyectosTerminados = sc.nextBoolean();

	    sc.close();

	    boolean resultado = auditoriaEmpresa(
	            salarioJefe,
	            salarioEncargado,
	            numOficinistas,
	            salarioOficinistas,
	            proyectosTerminados,
	            presupuestoEmpresa
	    );

	    // OPCIONAL (solo informativo)
	    if (!resultado) {
	        System.out.println("Auditoría NO superada.");
	    }
	}
	
	public static boolean auditoriaEmpresa (double salarioJefe,
            double salarioEncargado,
            int numOficinistas,
            double salarioOficinistas,
            boolean proyectosTerminados,
            double presupuestoEmpresa) {
		// 1. Proyectos terminados
	    if (!proyectosTerminados) {
	        System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
	        return false;
	    }

	    // 2. Cálculo de gasto en personal
	    double gastoPersonal = salarioJefe + salarioEncargado + (salarioOficinistas * numOficinistas);

	    if (gastoPersonal > 20000) {
	        System.out.println("No ha pasado la auditoría ya que el gasto en personal es de "
	                + gastoPersonal + "€ y excede el límite mensual de 20.000€");
	        return false;
	    }

	    // 3. Presupuesto de empresa
	    if (presupuestoEmpresa > 100000) {
	        System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de "
	                + presupuestoEmpresa + "€ excede el límite establecido de 100.000€");
	        return false;
	    }

	    // 4. Todo correcto
	    System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
	    return true;
	}
	

}
