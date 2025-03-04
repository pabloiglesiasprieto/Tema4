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

				// Pedimos al usuario que introduzca el tipo de la Pizza.
				System.out.println("Introduce el tipo de la Pizza");

				// Leemos entrada de teclado.
				tipo = sc.nextLine();

				// Pedimos al usuario que introduzca el tamaño de la Pizza.
				System.out.println("Introduce el tamaño de la pizza");

				// Leemos entrada de teclado.
				tamaño = sc.nextLine();

				// Limpiamos buffer.
				sc.nextLine();

				// Llamamos al método para añadir el alumno.
				Crud.mostrarPizzas();

				// Rompemos el case.
				break;
			}
			// Tercer case.
			case 3 -> {

				// Preguntamos el nombre del alumno.
				System.out.println("Introduce el nombre del alumno");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Preguntamos la nueva media.
				System.out.println("Introduce la nueva media");

				// Leemos entrada de teclado.
				media = sc.nextDouble();

				// Llamamos a la función que modifica al alumno.
				Crud.modificarAlumno(nombre, media);

				// Rompemos el case.
				break;
			}
			// Cuarto case.
			case 4 -> {

				// Preguntamos el código de la persona a borrar.
				System.out.println("Introduce el nombre de la persona a borrar");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Llamamos a la función que borrará el alumno.
				Crud.borrarAlumno(nombre);

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

	public static void imprimirMenu() {

		System.out.println("ELIGE LA OPCIÓN:\n1. Listado de pizzas\r\n" + "2. Nuevo pedido\r\n" + "3. Pizza servida\r\n"
				+ "4. Salir\r\n" + "");

	}
}
