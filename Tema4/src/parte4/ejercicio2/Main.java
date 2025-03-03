package parte4.ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos una variable que guardará la elección.
		char eleccion;

		// Declaramos la variable que almacenará el nombre.
		String nombre;

		// Declaramos la variable que almacenará las unidades.
		int unidades;

		// Declaramos la variable que almacenará el precio.
		double precio;

		// Le preguntamos que acción quieres realizar.
		System.out.println("Que acción quieres realizar.");

		// Imprimimos el menú.
		imprimirMenu();

		// Leemos entrada de teclado.
		eleccion = sc.next().charAt(0);

		// Limpiamos el buffer.
		sc.nextLine();

		// Creamos un bucle.
		while (eleccion != 'g') {

			// Creamos un switch de elección.
			switch (eleccion) {

			// Case a
			case 'a' -> {

				// Llamamos a la función que imprime el listado.
				Crud.mostrarArticulos();

				// Rompemos el case.
				break;
			}

			// Case b
			case 'b' -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre del articulo.");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Le pedimos al usuario que introduzca el precio.
				System.out.println("Introduce el precio del articulo.");

				// Leemos entrada de teclado.
				precio = sc.nextDouble();

				// Le pedimos al usuario que introduzca las unidades.
				System.out.println("Introduce las unidades del articulo.");

				// Leemos entrada de teclado.
				unidades = sc.nextInt();

				// Llamamos a la función que crea el artículo.
				Crud.altaArticulo(nombre, precio, unidades);

				// Rompemos el case.
				break;
			}

			// Case c
			case 'c' -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre del articulo.");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Llamamos a la función que da de baja al artículo.
				Crud.bajaArticulo(nombre);

				// Imprimimos que el artículo se ha dado de baja
				System.out.println("El artículo ha sido dado de baja");

				// Rompemos el case.
				break;
			}

			// Case d
			case 'd' -> {

				// Le pedimos al usuario que introduzca el nombre.
				System.out.println("Introduce el nombre del articulo.");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Le pedimos al usuario que introduzca las unidades.
				System.out.println("Introduce las nuevas unidades del articulo.");

				// Leemos entrada de teclado.
				unidades = sc.nextInt();

				// Llamamos a la función que modifica el artículo.
				Crud.modificarArticulo(nombre, unidades);

				// Rompemos el case.
				break;
			}

			// Case e
			case 'e' -> {

				// Le preguntamos al usuario cual es el nombre del artículo.
				System.out.println("¿Cuál es el nombre del artículo que ha entrado?");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Preguntamos la cantidad que ha llegado.
				System.out.println("Cuánta cantidad ha entrado");

				// Leemos entrada de teclado.
				unidades = sc.nextInt();

				// Llamamos a la función.
				Crud.entradaMercancia(nombre, unidades);

				// Imprimimos que la cantidad ha sido incrementada correctamente
				System.out.println("La cantidad ha sido incrementada correctamente");

				// Rompemos el case.
				break;
			}

			// Case f
			case 'f' -> {

				// Le preguntamos al usuario cual es el nombre del artículo.
				System.out.println("¿Cuál es el nombre del artículo que ha salido?");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Preguntamos la cantidad que ha salido.
				System.out.println("Cuánta cantidad ha salido");

				// Leemos entrada de teclado.
				unidades = sc.nextInt();

				// Llamamos a la función.
				Crud.salidaMercancia(nombre, unidades);

				// Imprimimos que ha salido correctamente.
				System.out.println("La cantidad ha salido correctamente.");

				// Rompemos el case.
				break;
			}
			}
			// Imprimimos el menú.
			imprimirMenu();

			// Leemos entrada de teclado.
			eleccion = sc.next().charAt(0);

			// Limpiamos el buffer.
			sc.nextLine();

		}
		// Imprimimos salida de programa.
		System.out.println("Saliste del programa.");

		// Cerramos Scanner.
		sc.close();

	}

	public static void imprimirMenu() {
		System.out.println(
				"GESTISIMAL\n=================\na. Listado\nb. Alta\nc. Baja\nd. Modificación\ne. Entrada de Mercancia\nf. Salida de Mercancia\ng. Salir");
	}
}
