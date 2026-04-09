package ejercicio2;

import java.time.LocalDate;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;

    public Contacto(String nombre, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nTeléfono: " + telefono +
                "\nEmail: " + email +
                "\nFecha Nacimiento: " + fechaNacimiento;
    }
}
