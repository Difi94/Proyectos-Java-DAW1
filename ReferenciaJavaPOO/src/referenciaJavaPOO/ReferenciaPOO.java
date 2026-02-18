package referenciaJavaPOO;

public class ReferenciaPOO {
	// ============================================================
//  REFERENCIA POO EN JAVA - DAW 1º - PROGRAMACIÓN
//  Contenido: Clases, Herencia, Interfaces, Polimorfismo
// ============================================================

import java.util.ArrayList;

// ============================================================
// 1. CLASE BASE (con atributos, constructores, getters/setters)
// ============================================================

class Persona {

    // --- Atributos (privados → encapsulamiento) ---
    private String nombre;
    private int edad;
    protected static int totalPersonas = 0; // estático: compartido por todos

    // --- Constructor por defecto ---
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        totalPersonas++;
    }

    // --- Constructor con parámetros ---
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        totalPersonas++;
    }

    // --- Constructor copia ---
    public Persona(Persona otra) {
        this.nombre = otra.nombre;
        this.edad = otra.edad;
        totalPersonas++;
    }

    // --- Getters y Setters ---
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad >= 0) this.edad = edad;
        else System.out.println("Edad no válida");
    }

    public static int getTotalPersonas() { return totalPersonas; }

    // --- Método de instancia ---
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    // --- toString (para imprimir el objeto directamente) ---
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
}


// ============================================================
// 2. INTERFAZ (contrato que las clases deben cumplir)
// ============================================================

interface Trabajable {
    double calcularSalario();          // abstracto por defecto
    void mostrarPuesto();

    // Método con implementación por defecto (Java 8+)
    default void descripcion() {
        System.out.println("Soy una persona que trabaja.");
    }
}

interface Identificable {
    String getId();
}


// ============================================================
// 3. CLASE HIJA (herencia + implementación de interfaz)
// ============================================================

class Empleado extends Persona implements Trabajable, Identificable {

    private String id;
    private String puesto;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, int edad, String id, String puesto, double salarioBase) {
        super(nombre, edad); // llama al constructor de Persona
        this.id = id;
        this.puesto = puesto;
        this.salarioBase = salarioBase;
    }

    // Implementación obligatoria de Trabajable
    @Override
    public double calcularSalario() {
        return salarioBase;
    }

    @Override
    public void mostrarPuesto() {
        System.out.println(getNombre() + " trabaja como: " + puesto);
    }

    // Implementación obligatoria de Identificable
    @Override
    public String getId() { return id; }

    // Sobreescribir método de Persona
    @Override
    public void saludar() {
        super.saludar(); // llama al método del padre
        System.out.println("Mi ID de empleado es: " + id);
    }

    @Override
    public String toString() {
        return "Empleado [id=" + id + ", puesto=" + puesto +
               ", salario=" + salarioBase + ", " + super.toString() + "]";
    }
}


// ============================================================
// 4. SUBCLASE CON COMPORTAMIENTO EXTRA (polimorfismo)
// ============================================================

class Gerente extends Empleado {

    private double bonus;

    public Gerente(String nombre, int edad, String id, double salarioBase, double bonus) {
        super(nombre, edad, id, "Gerente", salarioBase);
        this.bonus = bonus;
    }

    // Sobreescritura: polimorfismo en acción
    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonus;
    }

    @Override
    public String toString() {
        return "Gerente [bonus=" + bonus + ", salario total=" + calcularSalario() +
               ", " + super.toString() + "]";
    }
}


// ============================================================
// 5. CLASE ABSTRACTA (no se puede instanciar directamente)
// ============================================================

abstract class Vehiculo {

    protected String marca;
    protected int año;

    public Vehiculo(String marca, int año) {
        this.marca = marca;
        this.año = año;
    }

    // Método abstracto: cada subclase lo implementa a su manera
    public abstract void arrancar();

    // Método concreto compartido
    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " (" + año + ")");
    }
}

class Coche extends Vehiculo {

    private int numeroPuertas;

    public Coche(String marca, int año, int numeroPuertas) {
        super(marca, año);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void arrancar() {
        System.out.println(marca + " arranca con llave. Puertas: " + numeroPuertas);
    }
}

class Moto extends Vehiculo {

    public Moto(String marca, int año) {
        super(marca, año);
    }

    @Override
    public void arrancar() {
        System.out.println(marca + " arranca con botón de encendido.");
    }
}


// ============================================================
// 6. CLASE CON ARRAYLIST (colección de objetos)
// ============================================================

class Empresa {

    private String nombre;
    private ArrayList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    public void añadirEmpleado(Empleado e) {
        empleados.add(e);
    }

    public void listarEmpleados() {
        System.out.println("\n--- Empleados de " + nombre + " ---");
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }

    public void mostrarSalarios() {
        System.out.println("\n--- Salarios ---");
        for (Empleado e : empleados) {
            System.out.println(e.getNombre() + " → " + e.calcularSalario() + " €");
        }
    }

    // Buscar por ID
    public Empleado buscarPorId(String id) {
        for (Empleado e : empleados) {
            if (e.getId().equals(id)) return e;
        }
        return null; // no encontrado
    }
}


// ============================================================
// 7. MAIN - USO DE TODO LO ANTERIOR
// ============================================================

public class ReferenciaJava_POO {

    public static void main(String[] args) {

        System.out.println("========== POO EN JAVA ==========\n");

        // --- Crear objetos de Persona ---
        Persona p1 = new Persona("Ana", 30);
        Persona p2 = new Persona(); // constructor por defecto
        p2.setNombre("Luis");
        p2.setEdad(25);

        p1.saludar();
        p2.saludar();
        System.out.println(p1); // usa toString()
        System.out.println("Total personas creadas: " + Persona.getTotalPersonas());

        System.out.println("\n--- Empleados ---");

        // --- Crear empleados ---
        Empleado emp1 = new Empleado("Carlos", 35, "E001", "Desarrollador", 2000.0);
        Empleado emp2 = new Empleado("María", 28, "E002", "Diseñadora", 1800.0);
        Gerente ger1  = new Gerente("Sofía", 45, "G001", 3000.0, 500.0);

        emp1.saludar();
        emp1.mostrarPuesto();
        emp1.descripcion(); // método default de interfaz

        System.out.println(ger1);
        System.out.println("Salario gerente: " + ger1.calcularSalario() + " €");

        System.out.println("\n--- Polimorfismo ---");

        // Referencia de tipo padre apuntando a objetos hijos
        Empleado[] lista = { emp1, emp2, ger1 };
        for (Empleado e : lista) {
            // calcularSalario() se resuelve en tiempo de ejecución
            System.out.println(e.getNombre() + " cobra: " + e.calcularSalario() + " €");
        }

        System.out.println("\n--- Empresa con ArrayList ---");

        Empresa empresa = new Empresa("TechCorp");
        empresa.añadirEmpleado(emp1);
        empresa.añadirEmpleado(emp2);
        empresa.añadirEmpleado(ger1);

        empresa.listarEmpleados();
        empresa.mostrarSalarios();

        // Buscar por ID
        Empleado encontrado = empresa.buscarPorId("E002");
        if (encontrado != null) {
            System.out.println("\nEmpleado encontrado: " + encontrado.getNombre());
        }

        System.out.println("\n--- Clase Abstracta y Polimorfismo ---");

        // No se puede hacer: new Vehiculo(...)  → es abstracta
        Vehiculo v1 = new Coche("Toyota", 2020, 4);
        Vehiculo v2 = new Moto("Honda", 2022);

        Vehiculo[] vehiculos = { v1, v2 };
        for (Vehiculo v : vehiculos) {
            v.mostrarInfo();
            v.arrancar(); // polimorfismo: cada uno arranca a su manera
        }

        System.out.println("\n========== FIN ==========");
    }
}

// ============================================================
// RESUMEN RÁPIDO DE CONCEPTOS
// ============================================================
// Clase:           class NombreClase { }
// Herencia:        class Hija extends Padre { }
// Interfaz:        interface Nombre { } / implements Nombre
// Abstracta:       abstract class / abstract void metodo();
// super():         llama al constructor o método del padre
// @Override:       sobreescritura de método heredado
// static:          pertenece a la clase, no al objeto
// toString():      se llama al hacer System.out.println(objeto)
// ArrayList<T>:    lista dinámica de objetos
// Polimorfismo:    referencia padre → objeto hijo, método según tipo real
// ============================================================
}
