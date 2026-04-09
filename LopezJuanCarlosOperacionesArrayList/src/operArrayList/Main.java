package operArrayList;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		ArrayList<Alumno> lista = new ArrayList<>();

		try {
		    BufferedReader br = new BufferedReader(new FileReader("notas1.txt"));
		    String linea;

		    while ((linea = br.readLine()) != null) {
		        String[] partes = linea.split(";");

		        lista.add(new Alumno(
		            partes[0],
		            partes[1],
		            Integer.parseInt(partes[2]),
		            Integer.parseInt(partes[3]),
		            Integer.parseInt(partes[4]),
		            Integer.parseInt(partes[5]),
		            Integer.parseInt(partes[6])
		        ));
		    }

		    br.close();

		} catch (FileNotFoundException e) {
		    System.out.println("Error: no se encuentra el archivo notas1.txt");

		} catch (IOException e) {
		    System.out.println("Error al leer el archivo");

		} catch (NumberFormatException e) {
		    System.out.println("Error al convertir los datos numéricos");
		}
		//numero de registros
		System.out.println("Total alumnos: " + lista.size());
		//ordenar por grupo y nombre
		Collections.sort(lista, (a1, a2) -> {
		    int cmp = a1.grupo.compareTo(a2.grupo);
		    if (cmp == 0) {
		        return a1.nombre.compareTo(a2.nombre);
		    }
		    return cmp;
		});
		//insertar registro al final
		lista.add(new Alumno("1º ESO D", "López Muro, Rosario", 3, 3, 4, 4, 3));
		
		//insertar en mitad
		int mitad = lista.size()/2;
		Alumno nuevo = new Alumno("1º ESO B", "Duarte Durán, Alba", 2, 3, 4, 1, 3);
		lista.add(mitad,nuevo);
		
		//posicion del ultimo insertado
		int pos = lista.indexOf(nuevo);
		System.out.println("Posicion: " + pos);
		
		//importar notas2 arraylist auxiliar
		ArrayList<Alumno> lista2 = new ArralyList<>();
		
		BufferedReader br2 = new BufferedReader(new FileReader("notas2.txt"));
		
		String linea;
		while ((linea = br2.readLine()) != null) {
			String[] partes = linea.split(";");
			
			lista2.add(new Alumno(
					partes[0],
					partes[1],
					Integer.parseInt(partes[2]),
					Integer.parseInt(partes[3]),
					Integer.parseInt(partes[4]),
					Integer.parseInt(partes[5]),
					Integer.parseInt(partes[6])
			));		
		}
		
		br2.close();
		
		//añadir todos
		lista.addAll(lista2);
		
		//buscar alumno por nombre
		for (Alumno a : lista) {
			if (a.nombre.equals("Cordero Benítez, Alejandro")) {
				System.out.println(a);
			}
		}
		
		//borrar posicion mitad +1
		
		int posBorrar = lista.size() / 2 + 1;

		Alumno eliminado = lista.remove(posBorrar);

		System.out.println("Eliminado: " + eliminado);
		
		//borrar primeros 10
		for (int i = 0; i < 10; i++) {
		    lista.remove(0);
		}
		
		//borrar alumnos con mates = 2
		
		int contador = 0;

		Iterator<Alumno> it = lista.iterator();

		while (it.hasNext()) {
		    Alumno a = it.next();
		    if (a.matematicas == 2) {
		        it.remove();
		        contador++;
		    }
		}

		System.out.println("Eliminados: " + contador);

	}

}
