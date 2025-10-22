/*
 * Descripcion: calcular para cada mes que dia fue el mas caluroso
 * Autor:
 * Fecha:
 */
 
package ejemploArrays;

public class EjemploArraysBidimensionalesMatrices {

	public static void main(String[] args) {
		final int TOTAL_MESES = 12;
		final int TOTAL_DIAS = 30;
		int diaTemp10;
		int[][] temperatura; //declaracion de un array bidimensional
	    temperatura = new int [TOTAL_MESES][TOTAL_DIAS];
	    //inicializamos el array bidimensioanl y le damos datos con mathrandom
	    for (int mes = 0; mes < temperatura.length; mes++) { 
	    	for (int dia = 0; dia < temperatura[mes].length; dia++) {
	    		temperatura[mes][dia] = (int) (Math.random()*40); //valores aleatorios entre 0 y 40
	    	}
	    }
	    //mostrando temperaturas
	    for (int mes = 0; mes < temperatura.length; mes++) { 
	    	for (int dia = 0; dia < temperatura[mes].length; dia++) {
	    		System.out.print(temperatura[mes][dia] + "\t"); //mostramos el array en forma de tabla con el tabulador \t
	    	}
	    	System.out.println();
	    }
	    
	    //calcular para cada mes que dia fue el mas caluroso
	    for (int mes = 0; mes < temperatura.length; mes++) {
            int maxTemp = temperatura[mes][0]; //inicializamos la temperatura a la del primer dia
            int diaMax = 0;
            for (int dia = 1; dia < temperatura[mes].length; dia++) { //empiezo a comparar a partir de la segunda temperatura "0 la primera, 1 la segunda"
                if (temperatura[mes][dia] > maxTemp) {
                    maxTemp = temperatura[mes][dia];
                    diaMax = dia;
                }
            }
            System.out.println("Mes " + (mes+1) + ": Dia mas caluroso fue el dia " + (diaMax+1) + " con " + maxTemp + " grados.");
                               
	}
	    //para cada mes, mostrar el primer dia con temperatura inferior a 10 grados
	    for (int mes = 0; mes < temperatura.length; mes++) {
        	diaTemp10 = 0;
        	do {
        		diaTemp10++;
        	} while (temperatura[mes][diaTemp10] > 10);
        	System.out.println("Para el mes " + (mes+1) + " el primer dia con menos de 10 grados es: " + diaTemp10);
        	
        }

}
}
