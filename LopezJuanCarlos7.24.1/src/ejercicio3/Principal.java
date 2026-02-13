package ejercicio3;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Colegio colegio = new Colegio("IES Ejemplo");

        Profesor prof = new Profesor(
                "123A", "Juan", "Perez",
                LocalDate.of(1980, 5, 10),
                "Masculino", 2000,
                "600123456", "juan@email.com",
                "Matemáticas", "Matemáticas", "Física",
                true, 6);

        PAS pas = new PAS(
                "456B", "Ana", "Lopez",
                LocalDate.of(1990, 3, 15),
                "Femenino", 1500,
                "600987654", "ana@email.com",
                true, false, true,
                "Secretaría");

        colegio.agregarPersonal(prof);
        colegio.agregarPersonal(pas);

        colegio.mostrarPersonal();

        prof.aumentarSalario();
        System.out.println("Salario profesor tras aumento: " + prof.salario);

        System.out.println("Idiomas PAS: " + pas.numIdiomas());
    }
}
