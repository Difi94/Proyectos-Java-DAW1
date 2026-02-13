package ejercicio2;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Coche {

    private String matricula;
    private String nombrePropietario;
    private final LocalDate fechaMatriculacion; // no se puede modificar
    private int cilindrada;
    private int potencia;

    //validar la matrícula 9999 AAA
    private static final String FORMATO_MATRICULA = "\\d{4}\\s[A-Z]{3}";

    // constructor por defecto
    public Coche(String matricula, String nombrePropietario, LocalDate fechaMatriculacion) {
        setMatricula(matricula);
        setNombrePropietario(nombrePropietario);
        this.fechaMatriculacion = fechaMatriculacion;
        this.cilindrada = 2000;
        this.potencia = 150;
    }

    // constructor con parámetros de cilindrada y potencia
    public Coche(String matricula, String nombrePropietario, LocalDate fechaMatriculacion,
                 int cilindrada, int potencia) {
        setMatricula(matricula);
        setNombrePropietario(nombrePropietario);
        this.fechaMatriculacion = fechaMatriculacion;
        setCilindrada(cilindrada);
        setPotencia(potencia);
    }

    // Getters
    public String getMatricula() {
        return matricula;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public LocalDate getFechaMatriculacion() {
        return fechaMatriculacion;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    // Setters con validación
    public void setMatricula(String matricula) {
        if (matricula != null && Pattern.matches(FORMATO_MATRICULA, matricula)) {
            this.matricula = matricula;
        } else {
            throw new IllegalArgumentException("Matrícula inválida. Formato correcto: 9999 AAA");
        }
    }

    public void setNombrePropietario(String nombrePropietario) {
        if (nombrePropietario != null && !nombrePropietario.trim().isEmpty()) {
            this.nombrePropietario = nombrePropietario;
        } else {
            throw new IllegalArgumentException("El nombre del propietario no puede ser nulo o vacío.");
        }
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada >= 0) {
            this.cilindrada = cilindrada;
        } else {
            throw new IllegalArgumentException("La cilindrada no puede ser negativa.");
        }
    }

    public void setPotencia(int potencia) {
        if (potencia >= 0) {
            this.potencia = potencia;
        } else {
            throw new IllegalArgumentException("La potencia no puede ser negativa.");
        }
    }

    @Override
    public String toString() {
        return "Coche {" +
                "Matrícula='" + matricula + '\'' +
                ", Propietario='" + nombrePropietario + '\'' +
                ", Fecha Matriculación=" + fechaMatriculacion +
                ", Cilindrada=" + cilindrada +
                ", Potencia=" + potencia +
                '}';
    }
}

