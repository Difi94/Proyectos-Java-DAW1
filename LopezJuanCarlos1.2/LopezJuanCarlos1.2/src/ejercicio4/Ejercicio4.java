/*
 * Descripcion: Crear un tipo enumerado, crear cuatro variables del tipo enumerado en cuestion y asignarles un valor, luego mostrar en pantalla el valor de cada variable con un texto que lo acompañe.
 * Autor: Juan Carlos
 * Fecha: 30/09/25
 */
package ejercicio4;

public class Ejercicio4 {

	public static void main(String[] args) {
		enum Talla {PEQUEÑA, MEDIANA, GRANDE, EXTRAGRANDE}
		
		Talla talla1 = Talla.PEQUEÑA;
        Talla talla2 = Talla.MEDIANA;
        Talla talla3 = Talla.GRANDE;
        Talla talla4 = Talla.EXTRAGRANDE;
        
        System.out.println("Talla 1: " + talla1 + " *Adecuada para personas de complexion pequeña.");
        
        System.out.println("Talla 2: " + talla2 + " *Talla promedio");
        
        System.out.println("Talla 3: " + talla3 + " *Para personas de complexion robusta");
        
        System.out.println("Talla 4: " + talla4 + " *Para personas que requieren de un tallaje mayor");
        

	}

}
