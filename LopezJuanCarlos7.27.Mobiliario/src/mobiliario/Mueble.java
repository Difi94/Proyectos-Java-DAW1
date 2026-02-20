package mobiliario;

public abstract class Mueble {
	
	private String ID;
	protected int precio;
	private String descripcion;
	
	public static final double PRECIO_MINIMO = 0.001;
    public static final double PRECIO_MAXIMO = 10000.00;
	
	public Mueble() {
        this.ID = "Sin nombre";
        this.precio = 1;
        this.descripcion = "Sin descripcion";
    }
	
	public Mueble(String ID, int precio, String descripcion) {
		this.ID = ID;
		this.precio = precio;
		this.descripcion = descripcion;
	}
	
	//getters y setters
	 public String getID() { return ID; }
	    public void setID(String ID) { this.ID = ID; }
	    
	 public int getPrecio() { return precio; }
	    public void setPrecio(int precio) { this.precio = precio; }
	    
	 public String getDescripcion() { return descripcion; }
	    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
	    
	 @Override
	 public String toString() {
		return String.format(
		
		        "tipo: %s, ID: %s, Precio: %,.2f, Descripcion: %s",
		         this.getClass().getSimpleName(),
		         this.getID(),
		         this.getPrecio(),
		         this.getDescripcion()
		         );
		 
	 }
	        
	  

}
