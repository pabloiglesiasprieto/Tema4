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

	/**
	 * Está función añadirá la pizza a la colección.
	 * 
	 * @param codigo Código de la pizza.
	 * @param tamaño Tamaño de la pizza.
	 * @param tipo   Tipo de la pizza.
	 */
	public static void añadirPizza(int codigo, String tamaño, String tipo) {

		// Creamos el objeto p1.
		Pizza p1 = new Pizza(codigo, tamaño, tipo);

		// Añadimos el objeto a la colección.
		listaPizza.add(p1);

	}

	/**
	 * Está función eliminará la pizza de la colección
	 * 
	 * @param codigo
	 */
	public static void servirPizza(int codigo) {

		// Creamos un objeto con el código solo.
		Pizza p1 = new Pizza(codigo);

		// Buscamos en la lista el objeto con el mismo nombre y lo borramos.
		listaPizza.remove(p1);

	}

}
