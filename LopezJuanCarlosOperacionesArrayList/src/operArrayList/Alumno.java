package operArrayList;

public class Alumno {
    String grupo;
    String nombre;
    int matematicas;
    int lengua;
    int fisica;
    int quimica;
    int ingles;

    public Alumno(String grupo, String nombre, int matematicas, int lengua,
                  int fisica, int quimica, int ingles) {
        this.grupo = grupo;
        this.nombre = nombre;
        this.matematicas = matematicas;
        this.lengua = lengua;
        this.fisica = fisica;
        this.quimica = quimica;
        this.ingles = ingles;
    }

    public double media() {
        return (matematicas + lengua + fisica + quimica + ingles) / 5.0;
    }

    @Override
    public String toString() {
        return grupo + ";" + nombre + ";" + matematicas + ";" + lengua + ";" +
               fisica + ";" + quimica + ";" + ingles;
    }
    
    
}