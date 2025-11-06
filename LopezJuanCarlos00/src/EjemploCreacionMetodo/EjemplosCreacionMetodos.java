package EjemploCreacionMetodo;

public class EjemplosCreacionMetodos {

	public static void main(String[] args) {
		
		boolean par;
		par = esPar(8);
		System.out.println(par);
		
		System.out.println(esPar(9));
		
		System.out.println(esImpar(9));

	}
	//Calcula si numero es par devolviendo un valor booleano
	public static boolean esPar (int numero) {
		
		boolean par;
		
		if (numero % 2 == 0) {
			par = true;
		} else {
			par = false;
		}
		return par;
		
	}
	//Calcula si numero es impar devolviendo un valor booleano (reutilizando el codigo del meto esPar)
	public static boolean esImpar (int numero) {
		
		return !esPar(numero);

	}
	
}
