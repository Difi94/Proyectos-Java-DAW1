package ejercicio2;

import java.time.LocalDate;

public class Deportivo extends Coche {

    private String traccion; // total o delantera

    public Deportivo(String matricula, String nombrePropietario,
                     LocalDate fechaMatriculacion, int cilindrada,
                     int potencia, String traccion) {

        super(matricula, nombrePropietario, fechaMatriculacion, cilindrada, potencia);
        setTraccion(traccion);
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        if (traccion != null &&
                (traccion.equalsIgnoreCase("total") ||
                 traccion.equalsIgnoreCase("delantera"))) {
            this.traccion = traccion;
        } else {
            throw new IllegalArgumentException("La tracción debe ser 'total' o 'delantera'.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Tracción='" + traccion + "'";
    }
}

