package parte4.ejercicio3;

import java.util.ArrayList;

/**
 * Clase Crud
 */
public class Crud {

	/**
	 * Atributo de la clase Crud el cual almacenará las pizzas.
	 */
	private static ArrayList<Pizza> listaPizza = new ArrayList<>();

	/**
	 * Método para mostrar las pizzas
	 */
	public static void mostrarPizzas() {

		// Creamos un for que recorrerá la colección mostrando las pizzas.
		for (Pizza pizza : listaPizza) {

			// Llamamos al metodo .toString de la clase Pizza.
			System.out.println(pizza);
		}
	}

	public static void añadirPizza() {

	}

}
