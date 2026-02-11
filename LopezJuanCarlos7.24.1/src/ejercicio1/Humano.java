package ejercicio1;

public class Humano {

    // Atributos protected
    protected String nombre;
    protected String apellido;
    

    // Constructor sin parámetros
    public Humano() {
        this.nombre = "Juan";
        this.apellido = "García";
    }

    // Constructor con parámetros
    public Humano(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Método que devuelve "apellido, nombre"
    public String getNombreCompleto() {
        return apellido + ", " + nombre;
    }

    // Setters para poder modificar los valores desde Main
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}