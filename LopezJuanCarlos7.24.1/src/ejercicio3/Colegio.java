package ejercicio3;

import java.util.ArrayList;

public class Colegio {

    private String nombre;
    private ArrayList<Personal> personal;

    public Colegio(String nombre) {
        this.nombre = nombre;
        this.personal = new ArrayList<>();
    }

    public void agregarPersonal(Personal p) {
        personal.add(p);
    }

    public void mostrarPersonal() {
        for (Personal p : personal) {
            System.out.println(p);
        }
    }

    public double gastoTotalSalarios() {
        double total = 0;
        for (Personal p : personal) {
            total += p.salario;
        }
        return total;
    }
}
