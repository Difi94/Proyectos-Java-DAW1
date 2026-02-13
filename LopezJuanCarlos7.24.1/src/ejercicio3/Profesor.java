package ejercicio3;

import java.time.LocalDate;

public class Profesor extends Personal {

    private String titulacion;
    private String asignatura1;
    private String asignatura2;
    private boolean tutor;
    private int anyosExperiencia;

    public Profesor(String dni, String nombre, String apellidos,
                    LocalDate fechaNacimiento, String genero,
                    double salario, String telefono, String email,
                    String titulacion, String asignatura1,
                    String asignatura2, boolean tutor,
                    int anyosExperiencia) {

        super(dni, nombre, apellidos, fechaNacimiento, genero, salario, telefono, email);
        this.titulacion = titulacion;
        this.asignatura1 = asignatura1;
        this.asignatura2 = asignatura2;
        this.tutor = tutor;
        this.anyosExperiencia = anyosExperiencia;
    }

    public void aumentarSalario() {
        if (anyosExperiencia >= 5) {
            aumentoSalario(5);
        } else if (anyosExperiencia >= 3) {
            aumentoSalario(2);
        } else if (anyosExperiencia >= 1) {
            aumentoSalario(1);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Profesor{" +
                "Titulacion='" + titulacion + '\'' +
                ", Asignaturas='" + asignatura1 + ", " + asignatura2 + '\'' +
                ", Tutor=" + tutor +
                ", Años Experiencia=" + anyosExperiencia +
                '}';
    }
}
