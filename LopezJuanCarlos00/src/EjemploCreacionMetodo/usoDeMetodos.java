package EjemploCreacionMetodo;

public class usoDeMetodos {

	    public static void main(String[] args) {
	        final int TOTAL_MESES = 12;
	        final int TOTAL_DIAS = 30;

	        int[][] temperatura = new int[TOTAL_MESES][TOTAL_DIAS];

	        inicializarTemperaturas(temperatura);
	        mostrarTemperaturas(temperatura);
	        mostrarDiasMasCalurosos(temperatura);
	   
	    }
	    
	    //Llena la matriz de temperaturas con valores aleatorios entre 0 y 40.
	    public static void inicializarTemperaturas(int[][] temperatura) {
	        for (int mes = 0; mes < temperatura.length; mes++) {
	            for (int dia = 0; dia < temperatura[mes].length; dia++) {
	                temperatura[mes][dia] = (int) (Math.random() * 40);
	            }
	        }
	    }

	    //Muestra la matriz de temperaturas en formato de tabla.
	    public static void mostrarTemperaturas(int[][] temperatura) {
	        System.out.println("=== TEMPERATURAS ===");
	        for (int mes = 0; mes < temperatura.length; mes++) {
	            for (int dia = 0; dia < temperatura[mes].length; dia++) {
	                System.out.print(temperatura[mes][dia] + "\t");
	            }
	            System.out.println();
	        }
	    }

	    //Calcula y muestra el día más caluroso de cada mes.
	    public static void mostrarDiasMasCalurosos(int[][] temperatura) {
	        System.out.println("\n=== DÍA MÁS CALUROSO POR MES ===");
	        for (int mes = 0; mes < temperatura.length; mes++) {
	            int diaMax = obtenerDiaMasCaluroso(temperatura[mes]);
	            int tempMax = temperatura[mes][diaMax];
	            System.out.println("Mes " + (mes + 1) + ": día más caluroso = " + (diaMax + 1)
	                    + " con " + tempMax + "°C");
	        }
	    }

	    //Devuelve el índice del día más caluroso de un mes.
	    public static int obtenerDiaMasCaluroso(int[] mes) {
	        int maxTemp = mes[0];
	        int diaMax = 0;
	        for (int dia = 1; dia < mes.length; dia++) {
	            if (mes[dia] > maxTemp) {
	                maxTemp = mes[dia];
	                diaMax = dia;
	            }
	        }
	        return diaMax;
	    }
	}