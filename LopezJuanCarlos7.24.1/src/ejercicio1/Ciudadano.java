package ejercicio1;

public class Ciudadano extends Humano {

    // Atributo protected
    protected String documento;

    // Constructor
    public Ciudadano(String nombre, String apellido, String documento) {
        super(nombre, apellido); // Llamada al constructor de la clase padre
        this.documento = documento;
    }

    // Método identificacion usando super
    public String identificacion() {
        return super.getNombreCompleto() + " - Documento: " + documento;
    }
}

