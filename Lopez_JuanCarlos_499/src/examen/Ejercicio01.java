/*
 * Descripción: Uso de cuentas bancarias
 * Autor: Juan Carlos
 * Fecha: 17/12/2025
 */
package examen;

import java.time.DateTimeException;

import libtarea3.CuentaBancaria;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		//2. Declaración de los objetos
		CuentaBancaria lopez1;
		CuentaBancaria lopez2;
		CuentaBancaria lopez3;
		
		//3. Instanciación de los 3 objetos
		lopez1 = new CuentaBancaria();
		lopez2 = new CuentaBancaria();
		lopez3 = new CuentaBancaria();
		
		boolean correctas = false;
		
		do {
			try {
				lopez1 = new CuentaBancaria(1000, java.time.LocalDate.of(2025, 12, 17), limiteAleatorio(-4000));
			} catch (DateTimeException ex1) {
				System.out.println("Fecha inválida: " + ex1.getMessage() + " , vuelve a crear la cuenta.");
			} catch (IllegalArgumentException ex11) {
				System.out.println(ex11.getMessage());
				System.out.println("Vuelve a crear la cuenta.");
			}
			
			try {
				lopez2 = new CuentaBancaria(2000, java.time.LocalDate.of(2025, 12, 17), limiteAleatorio(-4000));
			} catch (DateTimeException ex1) {
				System.out.println("Fecha inválida: " + ex1.getMessage());
			} catch (IllegalArgumentException ex11) {
				System.out.println(ex11.getMessage());
			}
			
			try {
				lopez3 = new CuentaBancaria(3000, java.time.LocalDate.of(2025, 12, 17), limiteAleatorio(-4000));
			} catch (DateTimeException ex1) {
				System.out.println("Fecha inválida: " + ex1.getMessage());
			} catch (IllegalArgumentException ex11) {
				System.out.println(ex11.getMessage());
			}
			correctas = true;
		} while (!correctas);
		
		System.out.println(lopez1);
		System.out.println(lopez2);
		System.out.println(lopez3);
		
		//4. Mostrar límites descubiertos
		System.out.println(lopez1.getLimiteDescubierto());
		System.out.println(lopez2.getLimiteDescubierto());
		System.out.println(lopez3.getLimiteDescubierto());
		
		//5. Transferencias
		for (int i = 0; i < 5; i++) {
			try {
			    lopez1.transferir(300, lopez2);
		    } catch (IllegalArgumentException ex2) {
		    	System.out.println(ex2.getMessage());
		    } catch (IllegalStateException ex21) {
		    	System.out.println(ex21.getMessage());
		    }
		 System.out.println("Transferencia " + (i+1) + " de lopez1 a lopez2");
		 System.out.println("saldo de lopez1: " + lopez1.getSaldo());
		 System.out.println("saldo de lopez2: " + lopez2.getSaldo());
		}
		//6. Embargar 50%
		lopez3.embargar(50.00);
		System.out.println(lopez3.toString());
		
		//7. Saldo de todas las cuentas y cuentas embargadas
		
		System.out.println("Saldo de lopez1 " + lopez1.getSaldo());
		System.out.println("Saldo de lopez2 " + lopez2.getSaldo());
		System.out.println("Saldo de lopez3 " + lopez3.getSaldo());
		
		lopez1.isEmbargada();
		lopez2.isEmbargada();
		lopez3.isEmbargada();
		
		if (lopez3.isEmbargada() == true) {
			System.out.println("Hay 1 cuenta embargada.");
		}
		

	}
	//1. Método para generar el limite descubierto de una cuenta bancaria
	public static double limiteAleatorio (int a) {
		return Math.random()*a;
	}

}
