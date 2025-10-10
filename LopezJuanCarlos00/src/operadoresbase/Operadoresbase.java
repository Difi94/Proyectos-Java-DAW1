package operadoresbase;

import java.util.Scanner;

public class Operadoresbase {

	public static void main(String[] args) {
		int dato1;
		double dato2;
		int dato3;
		dato1 = 5;
		dato2 = 3.0;
		dato3 = 4;
		double suma;
		suma = dato1+dato2;
		System.out.println("La suma es: "+suma);
		
		double resta;
		resta = dato1-dato2;
		System.out.println("La resta es: "+resta);
		
		double multiplicacion;
		multiplicacion = dato1*dato2;
		System.out.println("La multiplicacion es: "+multiplicacion);
		
		double division;
		division = dato1/dato2;
		System.out.println("La division es: "+division);
		
		double modulo;
		modulo = dato1%dato3;
		System.out.println("El resto es: "+modulo);
		
		int dato1mas, dato1menos;
		dato1mas = dato1++; //dato1mas = dato1 +1
		dato1menos = dato1--; //dato1menos = dato1 -1
		System.out.println("Incremental posterior: " + ++dato1);
		
		dato1=dato1+1;
		System.out.println(dato1);
		System.out.println("Incremental posterior: " + dato1++);
		
		//ejemplos de peticion de operadores al usuario
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer numero entero:");
		int dato4 = teclado.nextInt();
		System.out.println("Introduce el segundo numero entero:");
		int dato5 = teclado.nextInt();
		int resultadoSuma = dato4 + dato5;
		System.out.println("La suma de " + dato4 + " + " + dato5 + " es: " + resultadoSuma);
		
		//ejemplo de comparaciones
		System.out.println (dato1 == dato2);
		
		boolean distinto = dato1 != dato2;
		System.out.println(distinto);
		 
		 
		

	}

}
