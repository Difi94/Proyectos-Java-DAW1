package Ejercicio1;

import java.time.DateTimeException;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		//1
		CuentaBancaria cuentaPrivada;
		CuentaBancaria cuentaConjunta;
		CuentaBancaria cuentaFamiliar;
		
		
		cuentaPrivada = new CuentaBancaria();
		cuentaConjunta = new CuentaBancaria();
		cuentaFamiliar = new CuentaBancaria();
		
		//2.1
		try {
		    CuentaBancaria pruebaError = new CuentaBancaria(
		        2000,
		        java.time.LocalDate.of(2027, 9, 1));
		    //2.2
		    CuentaBancaria pruebaError1 = new CuentaBancaria(-2000);
		    
		} catch (DateTimeException ex1) {
		    System.out.println("Fecha inválida: " + ex1.getMessage());
		} catch (IllegalArgumentException ex2) {
			System.out.println(ex2.getMessage());
		}
		
		//2.3
		try {
		    cuentaPrivada = new CuentaBancaria(1000, java.time.LocalDate.of(2021, 7, 1), -200);
		    
		} catch (IllegalArgumentException ex2) {
			System.out.println(ex2.getMessage());
		} catch (Exception ex21) {
		    System.out.println("Error desconocido: " + ex21.getMessage());
		    cuentaPrivada = new CuentaBancaria();
		}
		//2.4
		try {
		    cuentaConjunta = new CuentaBancaria(200, java.time.LocalDate.of(2021, 7, 1));
		    
		} catch (IllegalArgumentException ex2) {
			System.out.println(ex2.getMessage());
		} catch (Exception ex21) {
		    System.out.println("Error desconocido: " + ex21.getMessage());
		    cuentaConjunta = new CuentaBancaria();
		}
		//2.5
		cuentaFamiliar = new CuentaBancaria();
		
		//3
	    System.out.println("ID de la cuenta Privada: " + cuentaPrivada.getId());
	    System.out.println("Fecha de creación: " + cuentaPrivada.getFechaCreacion());
	    System.out.printf("Limite descubierto: %.2f\n", cuentaPrivada.getLimiteDescubierto());
	    System.out.println("Está la cuenta embargada?: " + cuentaPrivada.isEmbargada());
	    System.out.println("Está la cuenta en descubierto?: " + cuentaPrivada.isDescubierta());
	    System.out.println("Número de días que lleva la cuenta abierta: " + cuentaPrivada.getDiasCuenta());
	    
	    //4.1
	    try {
	    	cuentaPrivada.ingresar(100);
	    } catch (IllegalArgumentException ex4) {
	    	System.out.println(ex4.getMessage());
	    } catch (IllegalStateException ex41) {
	    	System.out.println(ex41.getMessage());
	    	
	    }
	    //4.2
	    try {
		    cuentaConjunta.extraer(100);
	    } catch (IllegalArgumentException ex4) {
	    	System.out.println(ex4.getMessage());
	    } catch (IllegalStateException ex41) {
	    	System.out.println(ex41.getMessage());
	    	
	    }
	    
	    //4.3
	    try {
		    cuentaPrivada.transferir(100, cuentaFamiliar);
	    } catch (IllegalArgumentException ex4) {
	    	System.out.println(ex4.getMessage());
	    } catch (IllegalStateException ex41) {
	    	System.out.println(ex41.getMessage());
	
	    }
	    
	    
	    //5
	    System.out.println(cuentaPrivada.toString());
	    System.out.println(cuentaConjunta.toString());
	    System.out.println(cuentaFamiliar.toString());

	}

}
