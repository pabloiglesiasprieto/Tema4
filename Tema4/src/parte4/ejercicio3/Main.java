package parte4.ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Guardamos la eleccion en un entero.
		int eleccion;

		// Creamos la variable que almacenará el código de Pizza.
		int codigo;

		// Creamos la variable que almacenará el tamaño.
		String tamaño;

		// Creamos la variable que almacenará el tipo.
		String tipo;

		// Le preguntamos que acción quiere realizar.
		System.out.println("Que acción quieres realizar.");

		// Imprimimos el menú.
		imprimirMenu();

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Creamos un bucle while.
		while (eleccion != 5) {

			// Creamos un Switch para la elección
			switch (eleccion) {

			// Primer case.
			case 1 -> {

				// Llamamos al método para imprimir las pizzas.
				Crud.mostrarPizzas();

				// Rompemos el case.
				break;
			}
			// Segundo case.
			case 2 -> {

				// Pedimos al usuario que introduzca el código de la Pizza.
				System.out.println("Introduce el código de la Pizza");

				// Leemos entrada de teclado.
				codigo = sc.nextInt();

				// Limpiamos el buffer.
				sc.nextLine();

				// Pedimos al usuario que introduzca el tipo de la Pizza.
				System.out.println("Introduce el tipo de la Pizza");

				// Leemos entrada de teclado.
				tipo = sc.nextLine();

				// Pedimos al usuario que introduzca el tamaño de la Pizza.
				System.out.println("Introduce el tamaño de la pizza");

				// Leemos entrada de teclado.
				tamaño = sc.nextLine();

				// Llamamos al método para añadir el alumno.
				Crud.añadirPizza(codigo, tamaño, tipo);

				// Rompemos el case.
				break;
			}
			// Tercer case.
			case 3 -> {

				// Preguntamos el código de la persona a borrar.
				System.out.println("Introduce el código de la pizza servida");

				// Leemos entrada de teclado.
				codigo = sc.nextInt();

				// Llamamos a la función que borrará la pizza.
				Crud.servirPizza(codigo);

				// Rompemos el case.
				break;
			}
			}
			// Imprimimos el menú.
			imprimirMenu();

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos buffer de entrada.
			sc.nextLine();

		}
		// Imprimimos la salida del menú.
		System.out.println("Saliendo");

		// Cerramos el Scanner.
		sc.close();
	}

	/**
	 * Función que imprime el menú de switch
	 */
	public static void imprimirMenu() {

		System.out.print("ELIGE LA OPCIÓN:\n1. Listado de pizzas\r\n" + "2. Nuevo pedido\r\n" + "3. Pizza servida\r\n"
				+ "4. Salir\r\n" + "");

	}
}
