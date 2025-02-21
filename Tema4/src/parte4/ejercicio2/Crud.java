package parte4.ejercicio2;

import java.util.ArrayList;

public class Crud {

	/**
	 * Creamos la colección de articulos.
	 */
	static ArrayList<Articulo> listaArticulos = new ArrayList<>();

	/**
	 * Muestra la lista de Artículos.
	 */
	public static void mostrarArticulos() {

		// Creamos un for para recorrer la lista.
		for (Articulo art : listaArticulos) {

			// Imprimimos la información del articulo.
			System.out.println(art);

		}
	}

	/**
	 * Método para crear un articulo.
	 * 
	 * @param nombre        Nombre del producto.
	 * @param precio        Precio del producto.
	 * @param cuantosQuedan Cuantas unidades quedan del producto.
	 */
	public static void altaArticulo(String nombre, double precio, int cuantosQuedan) {

		// Llamamos al constructor de la clase Articulo y creamos el objeto.
		Articulo articulo = new Articulo(nombre, precio, cuantosQuedan);

		// Añadimos el objeto a la colección.
		listaArticulos.add(articulo);
	}

	/**
	 * Método para dar de baja a un articulo
	 * 
	 * @param nombre Nombre del articulo a dar de baja.
	 */
	public static void bajaArticulo(String nombre) {

		// Declaramos una variable de tipo Articulo
		Articulo art;

		// Inicializamos un contador a 0.
		int contador = 0;

		// Inicializamos un booleano a false.
		boolean encontrado = false;

		// Buscamos el alumno con el código.
		while (contador < listaArticulos.size() && !encontrado) {

			// Recogemos el alumno.
			art = listaArticulos.get(contador);

			// Si el nombre del producto coincide con el nombre dado por parámetro, entrará
			// en el condicional.
			if (art.getNombre().equals(nombre)) {

				// Borramos al articulo de la lista.
				listaArticulos.remove(contador);

				// Ponemos encontrado a true.
				encontrado = true;
			}
			// Incrementamos el contador.
			contador++;
		}
		// Imprimimos que el Articulo ha sido eliminado.
		System.out.println("Articulo dado de baja correctamente.");

	}

	/**
	 * Función para modificar un articulo
	 * 
	 * @param nombre        Nombre del producto
	 * @param cuantosQuedan Nuevas unidades
	 */
	public static void modificarArticulo(String nombre, int cuantosQuedan) {

		// Creamos un for para buscar el articulo.
		for (Articulo art : listaArticulos) {

			// Si el nombre es igual al nombre de algunas de los articulos en la lista,
			// entrará en el condicional.
			if (art.getNombre().equals(nombre)) {

				// Modificamos las unidades del articulo.
				art.setCuantosQuedan(cuantosQuedan);
			}
		}

	}

	/**
	 * Función para indicar la entrada de mercancia de un articulo.
	 * 
	 * @param nombre   Nombre del articulo
	 * @param cantidad Cantidad a incrementar
	 */
	public static void entradaMercancia(String nombre, int cantidad) {

		// Hacemos un bucle for para buscar la mercancia con el nombre.
		for (Articulo art : listaArticulos) {

			// Si el nombre del artículo coincide con el nombre dado por parametro de
			// entrada, entrará en el condicional.
			if (art.getNombre().equals(nombre)) {

				// Incrementamos las unidades.
				art.cuantosQuedan += cantidad;

			}
		}

	}

	/**
	 * Función para salida de mercancia.
	 * 
	 * @param nombre   Nombre del artículo
	 * @param cantidad Cantidad a extraer de las unidades.
	 */
	public static void salidaMercancia(String nombre, int cantidad) {

		// Hacemos un bucle for para buscar la mercancia con el nombre.
		for (Articulo art : listaArticulos) {

			// Si el nombre del artículo coincide con el nombre dado por parametro de
			// entrada, entrará en el condicional.
			if (art.getNombre().equals(nombre) && art.cuantosQuedan - cantidad >= 0) {

				// Incrementamos las unidades.
				art.cuantosQuedan -= cantidad;

			}

		}

	}
}
