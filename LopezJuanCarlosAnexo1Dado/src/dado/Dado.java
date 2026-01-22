package dado;

public class Dado {
	
	private final byte numCaras;
	private long numLanzamientos;
	
	public Dado (byte numCaras) throws IllegalArgumentException {
		//comprobamos el numero de caras
		if (numCaras != 4 && numCaras != 6 && numCaras != 8 && numCaras != 12 && numCaras != 20 ) {
			throw new IllegalArgumentException (String.format("el numero de caras es invalido: %d", numCaras));
		}
		
		//atributos de objeto
		this.numCaras = numCaras;
		this.numLanzamientos = 0;
	}
	
	
	//devuelve el numero de caras del dado
	public byte getNumCaras () {
		return this.numCaras;
	}
	
	//devuelve el numero de lanzamientos del dado
	public long getNumLanzamientos () {
		return this.numLanzamientos;
	}
	//nombre de las caras del dado
	private static final String[] NOMBRE_CARAS = {"UNO", "DOS", "TRES", "CUATRO", "CINCO", "SEIS", "SIETE", "OCHO", "NUEVE", 
			"DIEZ", "ONCE", "DOCE", "TRECE", "CATORCE", "QUINCE", "DIECISÉIS", "DICECISIETE", "DIECIOCHO", "DIECINUEVE", "VEINTE"};
	//metodo para lanzar el dado
	public String lanzar() {
		  byte random = (byte) (Math.random()*this.numCaras);
		  return Dado.NOMBRE_CARAS[random];
		}
	//metodo para mostrar la informacion del dado
	@Override 
	public String toString() {
		return String.format("numero de caras: &d, numero de lanzamientos: %d", this.numCaras, this.numLanzamientos);
	}

}
