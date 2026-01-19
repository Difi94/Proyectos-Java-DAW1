package bombilla;

public class Bombilla {
	
	//atributos de clase
	private static int bombillasCreadas;
	private static int bombillasEncendidas;
	
	//atributos de objeto
	private boolean estado;
	private int vecesEncendida;
	
	//constantes para constructores sin parametros
	public static final boolean DEFAULT_ESTADO_INICIAL = false;
	
	public Bombilla(boolean estadoInicial) {
		this.estado = estadoInicial;
		this.vecesEncendida = estadoInicial ? 1 : 0;
		Bombilla.bombillasCreadas++;
		Bombilla.bombillasEncendidas += this.estado ? 1 : 0;
	}
	
	//constructor con 1 parametro
	public Bombilla() {
		this(Bombilla.DEFAULT_ESTADO_INICIAL);
	}
	
	//getters
	public boolean getEstado() {
		return this.estado;
	}
	
	public boolean isEncendida() {
		return this.estado;
	}
	
	public boolean isApagada() {
		return !this.estado;
	}
	
	public int getVecesEncendida() {
		return this.vecesEncendida;
	}
	
	public static int getBombillasCreadas() {
		return Bombilla.bombillasCreadas;
	}
	
	public static int getBombillasEncendidas() {
		return Bombilla.bombillasEncendidas;
	}
	
	@Override
	public String toString() {
	  String resultado = String.format("Bombilla %s. Se ha encendido %d %s",
	    this.estado ? "encendida" : "apagada",
	    this.vecesEncendida, 
	    this.vecesEncendida == 1 ? "vez" : "veces");

	    return resultado;
	}
	public void encender() throws IllegalStateException {
		if (!this.estado) {
			this.estado = true;
			this.vecesEncendida++;
			Bombilla.bombillasEncendidas++;
		} else {
			throw new IllegalStateException ("intentando encender bombilla encendida");
		}
	}
	
	public void apagar () throws IllegalStateException  {
		  if ( !this.estado ) {
		    throw new IllegalStateException ("intentando apagar bombilla apagada");
		  } else {
		    this.estado = false;
		    Bombilla.bombillasEncendidas--;
		  }
	}
	
	public void conmutar()  {
		  this.estado = !this.estado;  
		  if (this.estado) {
		    this.vecesEncendida++;
		    Bombilla.bombillasEncendidas++;
		  } else {
		    Bombilla.bombillasEncendidas--;
		  }
	}

}
