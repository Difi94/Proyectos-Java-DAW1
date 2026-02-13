package ejercicio3;

import java.time.LocalDate;

public class PAS extends Personal {

    private boolean aleman;
    private boolean chino;
    private boolean ingles;
    private String areaAtencion;

    public PAS(String dni, String nombre, String apellidos,
               LocalDate fechaNacimiento, String genero,
               double salario, String telefono, String email,
               boolean aleman, boolean chino, boolean ingles,
               String areaAtencion) {

        super(dni, nombre, apellidos, fechaNacimiento, genero, salario, telefono, email);
        this.aleman = aleman;
        this.chino = chino;
        this.ingles = ingles;
        this.areaAtencion = areaAtencion;
    }

    public int numIdiomas() {
        int contador = 0;
        if (aleman) contador++;
        if (chino) contador++;
        if (ingles) contador++;
        return contador;
    }

    public void cambioIdioma(String idioma) {
        switch (idioma.toLowerCase()) {
            case "aleman":
                aleman = !aleman;
                break;
            case "chino":
                chino = !chino;
                break;
            case "ingles":
                ingles = !ingles;
                break;
            default:
                System.out.println("Idioma no válido");
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                ", PAS{" +
                "Área Atención='" + areaAtencion + '\'' +
                ", Idiomas=" + numIdiomas() +
                '}';
    }
}
