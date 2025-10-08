/*
 * Descripcion: Ejemplos de conversione de tipos
 * Autor: Juan Carlos
 * Fecha: 01/10/25
 */

package operadoresbase;

public class Conversiontipos {

	public static void main(String[] args) {
		byte monederoPequenyo = 10;
		int monederoMediano = 10000;
		long monederoGrande = 1000000000l;
		
		monederoGrande = monederoMediano; //conversion automatica
		monederoMediano = monederoPequenyo;
		
		monederoPequenyo = (byte) monederoMediano; //ejemplo de cast
		
		System.out.println("Monedero pequeño: " + monederoPequenyo);
		System.out.println("Monedero mediano: " + monederoMediano);
		System.out.println("Monedero grande: " + monederoGrande);

	}

}
