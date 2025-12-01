package Ejercicio1;

import java.time.DateTimeException;

import libtarea3.CuentaBancaria;

public class Ejercicio1 {

	public static void main(String[] args) {
		CuentaBancaria cuentaPrivada;
		CuentaBancaria cuentaConjunta;
		CuentaBancaria cuentaFamiliar;
		
		cuentaPrivada = new CuentaBancaria();
		cuentaConjunta = new CuentaBancaria();
		cuentaFamiliar = new CuentaBancaria();
		
		try {
		    CuentaBancaria pruebaError = new CuentaBancaria(
		        2000,
		        java.time.LocalDate.of(2020, 9, 1)); //si ponemos 2027 en la fecha saltará el error correspondiente
		    CuentaBancaria pruebaError1 = new CuentaBancaria(2000); //si ponemos saldo negatio saldrá su error correspondiente
		    cuentaPrivada = new CuentaBancaria(1000, java.time.LocalDate.of(2021, 7, 1), -200);
		    cuentaConjunta = new CuentaBancaria(200, java.time.LocalDate.of(2021, 7, 1));
		    cuentaFamiliar = new CuentaBancaria();
		    
		} catch (DateTimeException ex1) {
		    System.out.println("Fecha inválida: " + ex1.getMessage());
		} catch (IllegalArgumentException ex2) {
			System.out.println(ex2.getMessage());
		}

	    System.out.println("ID de la cuenta Privada: " + cuentaPrivada.getId());
	    System.out.println("Fecha de creación: " + cuentaPrivada.getFechaCreacion());
	    System.out.printf("Limite descubierto: %.2f\n", cuentaPrivada.getLimiteDescubierto());
	    System.out.println("Está la cuenta embargada?: " + cuentaPrivada.isEmbargada());
	    System.out.println("Está la cuenta en descubierto?: " + cuentaPrivada.isDescubierta());
	    System.out.println("Número de días que lleva la cuenta abierta: " + cuentaPrivada.getDiasCuenta());
	    
	    cuentaPrivada.ingresar(100);
	    cuentaConjunta.extraer(100);
	    cuentaPrivada.transferir(100, cuentaFamiliar);
	    
	    System.out.println(cuentaPrivada.toString());
	    System.out.println(cuentaConjunta.toString());
	    System.out.println(cuentaFamiliar.toString());

	}

}
