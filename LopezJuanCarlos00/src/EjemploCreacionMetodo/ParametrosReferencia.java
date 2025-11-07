package EjemploCreacionMetodo;

public class ParametrosReferencia {

	public static void main(String[] args) {
		
		int[] vectorOriginal = {1,2,3};
		
		int[] vectorFinal = new int[3];
		
		for (int i = 0; i < vectorOriginal.length; i++) {
			System.out.println(vectorOriginal[i]+" ");
		}
		
		vectorFinal = cambioVector(vectorOriginal);
		
		for (int i = 0; i < vectorOriginal.length; i++) {
			System.out.println(vectorOriginal[i]+" ");
		}
		
		for (int i = 0; i < vectorFinal.length; i++) {
			System.out.println(vectorFinal[i]+" ");
		}
	}
	//
	public static int[] cambioVector (int[] vector) {
		int [] vectorMetodo = new int [3];
		
		vector [0] = 5;
		vector [1] = 10;
		
		vectorMetodo[0] = vector[0]+2;
		vectorMetodo[1] = vector[1]+10;
		
		return vectorMetodo;
	}

}
