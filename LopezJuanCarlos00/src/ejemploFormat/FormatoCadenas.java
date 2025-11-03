package ejemploFormat;

public class FormatoCadenas {

	public static void main(String[] args) {
		String nombre = "Juan";
		int edad = 34;
		double altura = 1.87;
		double peso = 75.4;
		double imc = peso / (altura * altura);
		
		//String cadena = String.format("Nombre: %s \nEdad: %d \nAltura: %.2f \nPeso: %.1f", nombre, edad, altura, peso);
		//System.out.println(cadena);
		
		//equivale a lo de arriba
		System.out.printf("Nombre: %s \nEdad: %d \nAltura: %.2f \nPeso: %.1f \nIMC: %.3f", nombre, edad, altura, peso, imc);
		
		

	}

}
