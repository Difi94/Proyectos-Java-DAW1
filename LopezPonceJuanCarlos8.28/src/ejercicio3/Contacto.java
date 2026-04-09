package ejercicio3;

import java.time.LocalDate;
import java.util.Objects;

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

    public String getNombre() { return nombre; }
    public String getTelefono() { return telefono; }
    public String getEmail() { return email; }
    public LocalDate getFechaNacimiento() { return fechaNacimiento; }

	@Override
	public int hashCode() {
		return Objects.hash(email, fechaNacimiento, nombre, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(email, other.email) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(telefono, other.telefono);
	}

    
    
}