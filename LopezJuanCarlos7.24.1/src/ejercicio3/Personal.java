package ejercicio3;

import java.time.LocalDate;
import java.time.Period;

public class Personal {

    protected String dni;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNacimiento;
    protected String genero;
    protected double salario;
    protected String telefono;
    protected String email;

    public Personal(String dni, String nombre, String apellidos,
                    LocalDate fechaNacimiento, String genero,
                    double salario, String telefono, String email) {

        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.salario = salario;
        this.telefono = telefono;
        this.email = email;
    }

    public void aumentoSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public int anyosJubilacion() {
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();
        return 67 - edad; // suponiendo jubilación a los 67
    }

    @Override
    public String toString() {
        return "Personal{" +
                "DNI='" + dni + '\'' +
                ", Nombre='" + nombre + " " + apellidos + '\'' +
                ", Salario=" + salario +
                ", Email='" + email + '\'' +
                '}';
    }
}
