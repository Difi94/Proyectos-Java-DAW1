package referenciaJavaPOO;

public class ReferenciaEstudio {
	// ╔══════════════════════════════════════════════════════════════════╗
	// ║     REFERENCIA EXAMEN JAVA — DAW 1º PROGRAMACIÓN                ║
	// ║     Temas: POO, Herencia, Abstractas, Interfaces,               ║
	// ║            Arrays, Excepciones, Estructuras de control          ║
	// ╚══════════════════════════════════════════════════════════════════╝
	//
	// ── CÓMO USAR ESTO EN EL EXAMEN ─────────────────────────────────────
	//  1. Lee el enunciado y detecta: ¿qué clases piden? ¿hay herencia?
	//  2. Copia el bloque que corresponde y renombra clases y atributos.
	//  3. El main ya te muestra cómo instanciar y usar las clases.
	// ────────────────────────────────────────────────────────────────────

	import java.util.ArrayList;
	import java.util.Scanner;

	// ════════════════════════════════════════════════════════════════════
	// PLANTILLA 1 — CLASE BASE (adaptar atributos y nombre)
	// ════════════════════════════════════════════════════════════════════
	//
	//  ► Copiar cuando pidan "crear una clase con sus atributos y métodos"
	//  ► Cambiar: nombre de clase, atributos, lógica de métodos

	class Animal {

	    // Atributos (privados siempre salvo que digan lo contrario)
	    private String nombre;
	    private int    edad;
	    private double peso;

	    // ── Constructores ─────────────────────────────────────────────
	    public Animal() {
	        this.nombre = "Sin nombre";
	        this.edad   = 0;
	        this.peso   = 0.0;
	    }

	    public Animal(String nombre, int edad, double peso) {
	        this.nombre = nombre;
	        this.edad   = edad;
	        this.peso   = peso;
	    }

	    // Constructor copia
	    public Animal(Animal otro) {
	        this(otro.nombre, otro.edad, otro.peso);
	    }

	    // ── Getters y Setters ─────────────────────────────────────────
	    public String getNombre() { return nombre; }
	    public void   setNombre(String nombre) { this.nombre = nombre; }

	    public int  getEdad() { return edad; }
	    public void setEdad(int edad) {
	        if (edad >= 0) this.edad = edad;
	        else System.out.println("Edad no válida");
	    }

	    public double getPeso() { return peso; }
	    public void   setPeso(double peso) {
	        if (peso > 0) this.peso = peso;
	    }

	    // ── Métodos ───────────────────────────────────────────────────
	    public void emitirSonido() {
	        System.out.println(nombre + " emite un sonido.");
	    }

	    public boolean esMayorQue(Animal otro) {
	        return this.peso > otro.peso;
	    }

	    // ── toString ──────────────────────────────────────────────────
	    @Override
	    public String toString() {
	        return "Animal{nombre='" + nombre + "', edad=" + edad + ", peso=" + peso + "}";
	    }
	}


	// ════════════════════════════════════════════════════════════════════
	// PLANTILLA 2 — CLASE HIJA (herencia simple)
	// ════════════════════════════════════════════════════════════════════
	//
	//  ► Copiar cuando el enunciado diga "Perro ES UN Animal" o similar
	//  ► Añadir los atributos extra que pidan
	//  ► Sobreescribir los métodos que se comporten diferente

	class Perro extends Animal {

	    // Atributo propio de Perro (no existe en Animal)
	    private String raza;
	    private boolean entrenado;

	    // Constructor: llama a super() SIEMPRE en primera línea
	    public Perro(String nombre, int edad, double peso, String raza, boolean entrenado) {
	        super(nombre, edad, peso);  // ← obligatorio, primera línea
	        this.raza      = raza;
	        this.entrenado = entrenado;
	    }

	    // Getters y setters propios
	    public String  getRaza()      { return raza; }
	    public boolean isEntrenado()  { return entrenado; }
	    public void    setEntrenado(boolean entrenado) { this.entrenado = entrenado; }

	    // Sobreescritura: mismo método, comportamiento diferente
	    @Override
	    public void emitirSonido() {
	        System.out.println(getNombre() + " ladra: ¡Guau!");
	        // Si además quisieras ejecutar el del padre: super.emitirSonido();
	    }

	    // Método propio de Perro
	    public void buscar() {
	        if (entrenado) System.out.println(getNombre() + " busca el objeto.");
	        else           System.out.println(getNombre() + " no sabe buscar todavía.");
	    }

	    @Override
	    public String toString() {
	        // Reutiliza el toString del padre con super.toString()
	        return "Perro{raza='" + raza + "', entrenado=" + entrenado +
	               ", " + super.toString() + "}";
	    }
	}


	// ════════════════════════════════════════════════════════════════════
	// PLANTILLA 3 — CLASE ABSTRACTA + SUBCLASES
	// ════════════════════════════════════════════════════════════════════
	//
	//  ► Copiar cuando pidan una clase que NO se pueda instanciar
//	    y que fuerce a las subclases a implementar ciertos métodos.
	//  ► Los métodos abstractos NO tienen cuerpo en la clase padre.

	abstract class Vehiculo {

	    protected String marca;     // protected: accesible en subclases
	    protected int    anyo;
	    protected double velocidadMax;

	    public Vehiculo(String marca, int anyo, double velocidadMax) {
	        this.marca        = marca;
	        this.anyo         = anyo;
	        this.velocidadMax = velocidadMax;
	    }

	    // Métodos abstractos: OBLIGATORIO implementarlos en cada subclase
	    public abstract void arrancar();
	    public abstract double calcularConsumo(int km);  // ejemplo con parámetro

	    // Método concreto: igual para todos, no se sobreescribe
	    public void mostrarFicha() {
	        System.out.println("── Ficha ──────────────────────────");
	        System.out.println("  Marca:    " + marca);
	        System.out.println("  Año:      " + anyo);
	        System.out.println("  Vel.max:  " + velocidadMax + " km/h");
	        System.out.println("  Consumo(100km): " + calcularConsumo(100) + "L");
	    }

	    public String getMarca() { return marca; }
	    public int    getAnyo()  { return anyo; }

	    @Override
	    public String toString() {
	        return "Vehiculo{marca='" + marca + "', anyo=" + anyo + "}";
	    }
	}

	class Coche extends Vehiculo {

	    private int numeroPuertas;
	    private double litrosPorKm;     // consumo específico de este coche

	    public Coche(String marca, int anyo, double velMax,
	                 int puertas, double litrosPorKm) {
	        super(marca, anyo, velMax);
	        this.numeroPuertas = puertas;
	        this.litrosPorKm   = litrosPorKm;
	    }

	    @Override
	    public void arrancar() {
	        System.out.println(marca + " arranca con llave. " + numeroPuertas + " puertas.");
	    }

	    @Override
	    public double calcularConsumo(int km) {
	        return km * litrosPorKm;
	    }

	    public int getNumeroPuertas() { return numeroPuertas; }

	    @Override
	    public String toString() {
	        return "Coche{puertas=" + numeroPuertas + ", " + super.toString() + "}";
	    }
	}

	class Moto extends Vehiculo {

	    private String tipo;    // "deportiva", "naked", "touring", etc.

	    public Moto(String marca, int anyo, double velMax, String tipo) {
	        super(marca, anyo, velMax);
	        this.tipo = tipo;
	    }

	    @Override
	    public void arrancar() {
	        System.out.println(marca + " (" + tipo + ") arranca con botón.");
	    }

	    @Override
	    public double calcularConsumo(int km) {
	        return km * 0.05;   // las motos consumen menos
	    }

	    public String getTipo() { return tipo; }
	}


	// ════════════════════════════════════════════════════════════════════
	// PLANTILLA 4 — INTERFAZ + IMPLEMENTACIÓN
	// ════════════════════════════════════════════════════════════════════
	//
	//  ► Copiar cuando el enunciado diga "implementa la interfaz X"
//	    o pidan garantizar que varias clases tengan el mismo método.
	//  ► Una clase puede extender UNA clase padre e implementar VARIAS interfaces.

	interface Vendible {
	    // Todo lo de la interfaz es public por defecto
	    double getPrecio();
	    void   mostrarEtiqueta();

	    // Método default: tiene implementación, se puede sobreescribir
	    default void aplicarDescuento(double porcentaje) {
	        System.out.printf("Precio con %.0f%% descuento: %.2f€%n",
	                          porcentaje, getPrecio() * (1 - porcentaje / 100));
	    }
	}

	interface Garantizable {
	    int getAnyosGarantia();
	    void mostrarGarantia();
	}

	// Clase que hereda Y implementa interfaces a la vez
	class Producto implements Vendible, Garantizable {

	    private String nombre;
	    private double precio;
	    private int    anyosGarantia;

	    public Producto(String nombre, double precio, int anyosGarantia) {
	        this.nombre        = nombre;
	        this.precio        = precio;
	        this.anyosGarantia = anyosGarantia;
	    }

	    // Implementación obligatoria de Vendible
	    @Override public double getPrecio() { return precio; }

	    @Override
	    public void mostrarEtiqueta() {
	        System.out.printf("[%s] → %.2f€%n", nombre, precio);
	    }

	    // Implementación obligatoria de Garantizable
	    @Override public int  getAnyosGarantia()  { return anyosGarantia; }

	    @Override
	    public void mostrarGarantia() {
	        System.out.println(nombre + " tiene " + anyosGarantia + " año(s) de garantía.");
	    }

	    public String getNombre() { return nombre; }
	    public void   setPrecio(double precio) { this.precio = precio; }

	    @Override
	    public String toString() {
	        return "Producto{'" + nombre + "', " + precio + "€, " + anyosGarantia + "a garantía}";
	    }
	}


	// ════════════════════════════════════════════════════════════════════
	// PLANTILLA 5 — EXCEPCIONES PERSONALIZADAS
	// ════════════════════════════════════════════════════════════════════
	//
	//  ► Checked (extends Exception):   el compilador OBLIGA a capturarla
	//  ► Unchecked (extends RuntimeException): opcional capturarla

	// Checked: hay que poner "throws" en la firma del método
	class EdadInvalidaException extends Exception {
	    public EdadInvalidaException(int edad) {
	        super("Edad inválida: " + edad + ". Debe estar entre 0 y 120.");
	    }
	}

	// Unchecked: no hace falta "throws" en la firma
	class StockInsuficienteException extends RuntimeException {
	    private int stockActual;
	    public StockInsuficienteException(int stock) {
	        super("Stock insuficiente. Stock actual: " + stock);
	        this.stockActual = stock;
	    }
	    public int getStockActual() { return stockActual; }
	}

	// Clase que usa excepciones
	class Almacen {
	    private String producto;
	    private int    stock;

	    public Almacen(String producto, int stockInicial) {
	        this.producto = producto;
	        this.stock    = stockInicial;
	    }

	    // throws → avisa al que llame que puede lanzar esta excepción
	    public void añadirPersona(int edad) throws EdadInvalidaException {
	        if (edad < 0 || edad > 120) throw new EdadInvalidaException(edad);
	        System.out.println("Persona con edad " + edad + " registrada.");
	    }

	    public void retirar(int cantidad) {
	        if (cantidad > stock) throw new StockInsuficienteException(stock);
	        stock -= cantidad;
	        System.out.println("Retiradas " + cantidad + " unidades. Stock: " + stock);
	    }

	    public int getStock() { return stock; }
	}


	// ════════════════════════════════════════════════════════════════════
	// PLANTILLA 6 — ARRAYS Y ALGORITMOS
	// ════════════════════════════════════════════════════════════════════

	class Algoritmos {

	    // ── Operaciones básicas ───────────────────────────────────────
	    public static int maximo(int[] a) {
	        int max = a[0];
	        for (int n : a) if (n > max) max = n;
	        return max;
	    }

	    public static int minimo(int[] a) {
	        int min = a[0];
	        for (int n : a) if (n < min) min = n;
	        return min;
	    }

	    public static double media(int[] a) {
	        int suma = 0;
	        for (int n : a) suma += n;
	        return (double) suma / a.length;
	    }

	    public static int suma(int[] a) {
	        int s = 0;
	        for (int n : a) s += n;
	        return s;
	    }

	    // ── Búsqueda ──────────────────────────────────────────────────
	    // Devuelve el índice, o -1 si no está
	    public static int buscarLineal(int[] a, int valor) {
	        for (int i = 0; i < a.length; i++)
	            if (a[i] == valor) return i;
	        return -1;
	    }

	    // Solo funciona con arrays ORDENADOS
	    public static int buscarBinaria(int[] a, int valor) {
	        int ini = 0, fin = a.length - 1;
	        while (ini <= fin) {
	            int mid = (ini + fin) / 2;
	            if      (a[mid] == valor) return mid;
	            else if (valor < a[mid])  fin = mid - 1;
	            else                      ini = mid + 1;
	        }
	        return -1;
	    }

	    // ── Ordenación burbuja ────────────────────────────────────────
	    public static void burbuja(int[] a) {
	        for (int i = 0; i < a.length - 1; i++)
	            for (int j = 0; j < a.length - i - 1; j++)
	                if (a[j] > a[j+1]) {
	                    int tmp = a[j]; a[j] = a[j+1]; a[j+1] = tmp;
	                }
	    }

	    // ── Matrices ──────────────────────────────────────────────────
	    public static void imprimirMatriz(int[][] m) {
	        for (int[] fila : m) {
	            for (int val : fila) System.out.printf("%4d", val);
	            System.out.println();
	        }
	    }

	    public static int sumaMatriz(int[][] m) {
	        int s = 0;
	        for (int[] fila : m)
	            for (int val : fila) s += val;
	        return s;
	    }

	    // Suma de la diagonal principal (solo matrices cuadradas)
	    public static int diagonal(int[][] m) {
	        int s = 0;
	        for (int i = 0; i < m.length; i++) s += m[i][i];
	        return s;
	    }

	    // Traspuesta
	    public static int[][] traspuesta(int[][] m) {
	        int f = m.length, c = m[0].length;
	        int[][] t = new int[c][f];
	        for (int i = 0; i < f; i++)
	            for (int j = 0; j < c; j++)
	                t[j][i] = m[i][j];
	        return t;
	    }

	    // ── Métodos con ArrayList ─────────────────────────────────────
	    public static int maximoLista(ArrayList<Integer> lista) {
	        int max = lista.get(0);
	        for (int n : lista) if (n > max) max = n;
	        return max;
	    }

	    // ── Recursividad ──────────────────────────────────────────────
	    public static long factorial(int n) {
	        if (n <= 1) return 1;               // caso base
	        return n * factorial(n - 1);        // llamada recursiva
	    }

	    public static long fibonacci(int n) {
	        if (n <= 1) return n;
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }

	    public static int sumaDigitos(int n) {
	        if (n < 10) return n;
	        return n % 10 + sumaDigitos(n / 10);
	    }

	    public static String invertir(String s) {
	        if (s.isEmpty()) return s;
	        return invertir(s.substring(1)) + s.charAt(0);
	    }

	    // Imprime el array con formato bonito
	    public static void imprimir(int[] a) {
	        System.out.print("[");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]);
	            if (i < a.length - 1) System.out.print(", ");
	        }
	        System.out.println("]");
	    }
	}


	// ════════════════════════════════════════════════════════════════════
	// PLANTILLA 7 — CLASE GESTORA (agrupa objetos con ArrayList)
	// ════════════════════════════════════════════════════════════════════
	//
	//  ► Este patrón aparece casi siempre: "crea una clase Concesionario
//	    que gestione una colección de Vehiculos"

	class Concesionario {

	    private String            nombre;
	    private ArrayList<Vehiculo> vehiculos;

	    public Concesionario(String nombre) {
	        this.nombre    = nombre;
	        this.vehiculos = new ArrayList<>();
	    }

	    // Añadir (funciona con Coche, Moto... gracias al polimorfismo)
	    public void añadir(Vehiculo v) { vehiculos.add(v); }

	    // Eliminar por índice
	    public boolean eliminar(int indice) {
	        if (indice >= 0 && indice < vehiculos.size()) {
	            vehiculos.remove(indice);
	            return true;
	        }
	        return false;
	    }

	    // Mostrar todos
	    public void listar() {
	        System.out.println("═══ " + nombre + " (" + vehiculos.size() + " vehículos) ═══");
	        for (int i = 0; i < vehiculos.size(); i++) {
	            System.out.println("  " + (i+1) + ". " + vehiculos.get(i));
	        }
	    }

	    // Buscar por marca (devuelve el primero que coincide)
	    public Vehiculo buscarPorMarca(String marca) {
	        for (Vehiculo v : vehiculos) {
	            if (v.getMarca().equalsIgnoreCase(marca)) return v;
	        }
	        return null;    // no encontrado
	    }

	    // Contar cuántos son Coches (instanceof)
	    public int contarCoches() {
	        int cont = 0;
	        for (Vehiculo v : vehiculos)
	            if (v instanceof Coche) cont++;
	        return cont;
	    }

	    // El más rápido (recorre buscando el máximo)
	    public Vehiculo masRapido() {
	        if (vehiculos.isEmpty()) return null;
	        Vehiculo max = vehiculos.get(0);
	        for (Vehiculo v : vehiculos)
	            if (v.velocidadMax > max.velocidadMax) max = v;
	        return max;
	    }

	    public int size() { return vehiculos.size(); }
	}


	// ════════════════════════════════════════════════════════════════════
	// MAIN — USO DE TODAS LAS PLANTILLAS
	// ════════════════════════════════════════════════════════════════════

	public class ReferenciaExamen {

	    public static void main(String[] args) {

	        // ── 1. CLASE BASE ──────────────────────────────────────────
	        sep("1. CLASE BASE");
	        Animal a1 = new Animal("León", 5, 180.0);
	        Animal a2 = new Animal("Gato", 3, 4.5);
	        Animal a3 = new Animal(a1);     // constructor copia

	        a1.emitirSonido();
	        a1.setEdad(6);
	        System.out.println(a1);
	        System.out.println("¿a1 pesa más que a2? " + a1.esMayorQue(a2));

	        // ── 2. HERENCIA Y POLIMORFISMO ─────────────────────────────
	        sep("2. HERENCIA Y POLIMORFISMO");
	        Perro p = new Perro("Rex", 4, 30.0, "Pastor Alemán", true);
	        p.emitirSonido();   // versión sobreescrita
	        p.buscar();
	        System.out.println(p);

	        // Referencia de tipo PADRE apunta a objeto HIJO (polimorfismo)
	        Animal animalRef = new Perro("Buddy", 2, 15.0, "Labrador", false);
	        animalRef.emitirSonido(); // ejecuta el método de Perro (no de Animal)

	        // instanceof: comprobar tipo real
	        if (animalRef instanceof Perro perroReal) {
	            System.out.println("Es un Perro de raza: " + perroReal.getRaza());
	        }

	        // Array de tipo padre con objetos de distintos tipos
	        Animal[] animales = {
	            new Animal("Tigre", 7, 200.0),
	            new Perro("Toby",   3,  20.0, "Beagle", true),
	            new Perro("Kira",   1,  10.0, "Chihuahua", false)
	        };
	        System.out.println("\n-- Todos los sonidos --");
	        for (Animal an : animales) an.emitirSonido(); // polimorfismo

	        // ── 3. CLASE ABSTRACTA ─────────────────────────────────────
	        sep("3. CLASE ABSTRACTA");
	        // Vehiculo v = new Vehiculo(...);  ← ERROR: no se puede instanciar
	        Coche  c1 = new Coche("Toyota",  2021, 180, 4, 0.07);
	        Coche  c2 = new Coche("BMW",     2023, 250, 2, 0.09);
	        Moto   m1 = new Moto("Honda",    2022, 210, "deportiva");

	        c1.arrancar();
	        c1.mostrarFicha();
	        m1.arrancar();

	        // Array de tipo abstracto (polimorfismo)
	        Vehiculo[] flota = {c1, c2, m1};
	        System.out.println("\n-- Consumo en 150 km --");
	        for (Vehiculo v : flota) {
	            System.out.printf("  %-10s → %.2f L%n", v.getMarca(), v.calcularConsumo(150));
	        }

	        // ── 4. INTERFACES ──────────────────────────────────────────
	        sep("4. INTERFACES");
	        Producto prod = new Producto("Portátil", 899.99, 2);
	        prod.mostrarEtiqueta();
	        prod.mostrarGarantia();
	        prod.aplicarDescuento(10);  // método default de la interfaz

	        // ── 5. EXCEPCIONES ─────────────────────────────────────────
	        sep("5. EXCEPCIONES");
	        Almacen almacen = new Almacen("Tornillos", 50);

	        // Excepción checked: compilador obliga a usar try-catch
	        try {
	            almacen.añadirPersona(25);   // OK
	            almacen.añadirPersona(-5);   // lanza EdadInvalidaException
	        } catch (EdadInvalidaException e) {
	            System.out.println("Capturada: " + e.getMessage());
	        }

	        // Excepción unchecked: try-catch opcional pero recomendable
	        try {
	            almacen.retirar(20);     // OK, quedan 30
	            almacen.retirar(100);    // lanza StockInsuficienteException
	        } catch (StockInsuficienteException e) {
	            System.out.println("Capturada: " + e.getMessage());
	            System.out.println("Stock disponible: " + e.getStockActual());
	        } finally {
	            // finally SIEMPRE se ejecuta (con o sin excepción)
	            System.out.println("Operación de almacén finalizada.");
	        }

	        // ── 6. ARRAYS Y ALGORITMOS ─────────────────────────────────
	        sep("6. ARRAYS Y ALGORITMOS");
	        int[] nums = {7, 2, 9, 1, 5, 8, 3};

	        System.out.print("Original: ");     Algoritmos.imprimir(nums);
	        System.out.println("Máximo:  " + Algoritmos.maximo(nums));
	        System.out.println("Mínimo:  " + Algoritmos.minimo(nums));
	        System.out.printf("Media:   %.2f%n", Algoritmos.media(nums));
	        System.out.println("Índice del 5: " + Algoritmos.buscarLineal(nums, 5));

	        Algoritmos.burbuja(nums);
	        System.out.print("Ordenado: ");    Algoritmos.imprimir(nums);
	        System.out.println("Búsq.binaria del 8: índice " + Algoritmos.buscarBinaria(nums, 8));

	        // Matriz 3x3
	        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
	        System.out.println("Matriz:");     Algoritmos.imprimirMatriz(mat);
	        System.out.println("Suma total: " + Algoritmos.sumaMatriz(mat));
	        System.out.println("Diagonal:   " + Algoritmos.diagonal(mat));

	        // Recursividad
	        System.out.println("\n-- Recursividad --");
	        System.out.println("5! = "            + Algoritmos.factorial(5));
	        System.out.println("fib(7) = "         + Algoritmos.fibonacci(7));
	        System.out.println("sumaDigitos(123) = "+ Algoritmos.sumaDigitos(123));
	        System.out.println("invertir('Hola') = "+ Algoritmos.invertir("Hola"));

	        // ── 7. CLASE GESTORA CON ARRAYLIST ─────────────────────────
	        sep("7. CLASE GESTORA (ArrayList)");
	        Concesionario conces = new Concesionario("AutoYA");
	        conces.añadir(c1);
	        conces.añadir(c2);
	        conces.añadir(m1);
	        conces.añadir(new Moto("Yamaha", 2020, 190, "naked"));

	        conces.listar();
	        System.out.println("Coches:      " + conces.contarCoches());
	        System.out.println("Más rápido:  " + conces.masRapido().getMarca());

	        Vehiculo encontrado = conces.buscarPorMarca("honda");
	        System.out.println("Buscar Honda: " +
	            (encontrado != null ? encontrado : "No encontrado"));

	        System.out.println("\n✓ FIN");
	    }

	    private static void sep(String titulo) {
	        System.out.println("\n" + "─".repeat(50));
	        System.out.println("  " + titulo);
	        System.out.println("─".repeat(50));
	    }
	}


	// ════════════════════════════════════════════════════════════════════
	// CHULETA RÁPIDA — COPIAR/PEGAR EN EL EXAMEN
	// ════════════════════════════════════════════════════════════════════
	//
	// CLASE HIJA:        class Hija extends Padre { }
	// ABSTRACTA:         abstract class A { abstract void m(); }
	// INTERFAZ:          interface I { void m(); }
	// IMPLEMENTAR:       class X extends Padre implements I1, I2 { }
	// SUPER CONSTRUCTOR: super(params);   ← primera línea del constructor
	// SUPER MÉTODO:      super.metodo();  ← llama al método del padre
	// SOBREESCRIBIR:     @Override  public tipo metodo() { }
	// INSTANCIA/TIPO:    if (obj instanceof Tipo t) { usar t }
	// NO INSTANCIAR:     abstract class → new NombreAbstracta() da ERROR
	//
	// ARRAYLIST:
	//   ArrayList<Tipo> l = new ArrayList<>();
	//   l.add(obj)            → añadir al final
	//   l.get(i)              → obtener por índice
	//   l.remove(i)           → eliminar por índice
	//   l.size()              → número de elementos
	//   l.isEmpty()           → true si vacía
	//   l.contains(obj)       → true si contiene el objeto
	//   for (Tipo x : l) { }  → recorrer
	//
	// EXCEPCIÓN CHECKED:
	//   class MiEx extends Exception { public MiEx(msg) { super(msg); } }
	//   public void metodo() throws MiEx { throw new MiEx("..."); }
	//   try { metodo(); } catch (MiEx e) { e.getMessage(); }
	//
	// EXCEPCIÓN UNCHECKED:
	//   class MiEx extends RuntimeException { ... }  ← no necesita throws
	//
	// TRY-CATCH-FINALLY:
	//   try { código que puede fallar }
	//   catch (TipoEx e) { tratamiento }
	//   catch (OtroTipo e) { ... }          ← puedes poner varios catch
	//   finally { siempre se ejecuta }      ← opcional
	//
	// ARRAYS:
	//   int[] a = new int[n];   int[] a = {1,2,3};   a.length
	//   int[][] m = new int[f][c];   m[fila][col]
	//   for (int x : a) { }    for (int i=0; i<a.length; i++) { }
	//
	// STRING ÚTILES:
	//   s.equals(s2)  s.equalsIgnoreCase(s2)  s.length()
	//   s.toUpperCase()  s.toLowerCase()  s.trim()
	//   s.contains("x")  s.startsWith("x")  s.endsWith("x")
	//   s.replace("a","b")  s.substring(i,j)  s.split(" ")
	//   Integer.parseInt("5") → 5    String.valueOf(5) → "5"
	//
	// PRINTF:
	//   System.out.printf("%-15s %6.2f€%n", nombre, precio);
	//   %-15s → String 15 chars alineado izquierda
	//   %6.2f → decimal 6 chars, 2 decimales
	//   %d    → entero   %n → salto de línea
	//
	// SCANNER (leer por teclado):
	//   Scanner sc = new Scanner(System.in);
	//   String s  = sc.nextLine();
	//   int    n  = sc.nextInt();   sc.nextLine(); // ← limpiar buffer
	//   double d  = sc.nextDouble(); sc.nextLine();
	// ════════════════════════════════════════════════════════════════════
}
