package ejemploArrays;

public class ejemploArrays {

	public static void main(String[] args) {
		final int TAMANIO = 20;
		int [] numeros; // declaramos array de enteros
		numeros = new int[TAMANIO]; //instanciamos array
		
		for (int posicion = 0; posicion < TAMANIO; posicion++) { //TAMANIO podria cambiarse por numeros.length
			numeros[posicion] = 0; // inicializamos a cero todas las posiciones
		}
		
		for (int posicion = 0; posicion < TAMANIO ; posicion++) {
			numeros[posicion] = (int) (Math.random() * 50); //asignamos un valor aleatorio a la posicion de cada numero
			System.out.println("El valor de la posicion "+ posicion+" es: "+numeros[posicion]);
		}

	}

}
