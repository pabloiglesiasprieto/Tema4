package parte4.ejercicio4;

import java.util.ArrayList;

/**
 * Clase Crud
 */
public class Crud {

	/**
	 * Creamos una lista para almacenar los discos.
	 */
	private static ArrayList<Disco> listaDiscos = new ArrayList<Disco>();

	/**
	 * Función que muestra los discos de una colección.
	 */
	public static void mostrarDiscos() {

		// For-each que recorre la colección.
		for (Disco d1 : listaDiscos) {

			// Imprimimos el objeto.
			System.out.println(d1);
		}

	}

	/**
	 * Función que añade un disco a la colección.
	 * 
	 * @param codigo   Código del disco.
	 * @param autor    Autor del disco.
	 * @param titulo   Título del disco.
	 * @param duracion Duración del disco.
	 * @param genero   Género del disco.
	 */
	public static void agregarDisco(int codigo, String autor, String titulo, String duracion, String genero) {

		// Creamos el objeto.
		Disco d1 = new Disco(codigo, autor, titulo, duracion, genero);

		// Lo añadimos a la colección.
		listaDiscos.add(d1);

	}

	/**
	 * Función para borrar un disco de la colección.
	 * 
	 * @param codigo Código del disco a borrar.
	 */
	public static void borrarDisco(int codigo) {

		// Creamos un objeto de tipo Disco.
		Disco d1 = new Disco(codigo);

		// Borramos de la colección el disco con el mismo código.
		listaDiscos.remove(d1);

	}
}
