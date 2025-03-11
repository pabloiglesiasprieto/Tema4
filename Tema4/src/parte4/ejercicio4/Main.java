package parte4.ejercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos la variable que almacenará la elección del usuario.
		int eleccion;

		// Declaramos la variable que almacenará el código del disco.
		int codigo;

		// Declaramos la variable que almacenará el título de disco.
		String titulo;

		// Declaramos la variable que almacenará la duración del disco.
		String duracion;

		// Declaramos la variable que almacenará el autor del disco.
		String autor;

		// Declaramos la variable que almacenará el género del disco.
		String genero;

		// Imprimimos el menú.
		imprimirMenu();

		// Leemos entrada de teclado.
		eleccion = sc.nextInt();

		// Limpiamos el buffer.
		sc.nextLine();

		// Hacemos un while.
		while (eleccion != 4) {

			// Hacemos un switch de la eleccion.
			switch (eleccion) {

			// Primer case.
			case 1 -> {

				// Mostramos los discos.
				Crud.mostrarDiscos();

			}
			// Segundo case.
			case 2 -> {

				// Le preguntamos al usuario los datos del disco.
				System.out.println("Introduce el código del disco.");

				// Leemos entrada de teclado.
				codigo = sc.nextInt();

				// Limpiamos buffer de entrada.
				sc.nextLine();

				// Le preguntamos al usuario los datos del disco.
				System.out.println("Introduce el título del disco.");

				// Leemos entrada de teclado.
				titulo = sc.nextLine();

				// Le preguntamos al usuario los datos del disco.
				System.out.println("Introduce el autor del disco.");

				// Leemos entrada de teclado.
				autor = sc.nextLine();

				// Le preguntamos al usuario los datos del disco.
				System.out.println("Introduce la duración del disco.");

				// Leemos entrada de teclado.
				duracion = sc.nextLine();

				// Le preguntamos al usuario los datos del disco.
				System.out.println("Introduce el género del disco.");

				// Leemos entrada de teclado.
				genero = sc.nextLine();

				// Llamamos a la función que crea el disco.
				if (Crud.agregarDisco(codigo, autor, titulo, duracion, genero)) {
					System.out.println("El disco ha sido agregado.");
				} else {
					System.out.println("El disco no ha sido agregado.");
				}

			}
			// Tercer case.
			case 3 -> {

				// Le preguntamos al usuario los datos del disco.
				System.out.println("Introduce el código del disco.");

				// Leemos entrada de teclado.
				codigo = sc.nextInt();

				// Llamamos a la función que borra el disco.
				Crud.borrarDisco(codigo);

			}

			}
			// Imprimimos el menú.
			imprimirMenu();

			// Leemos entrada de teclado.
			eleccion = sc.nextInt();

			// Limpiamos el buffer.
			sc.nextLine();
		}
		// Imprimimos la salida del while.
		System.out.println("Saliendo...");

		// Cerramos Scanner.
		sc.close();

	}

	public static void imprimirMenu() {
		// Le preguntamos al usuario que acción quiere realizar.

		System.out.println("ELIGE UNA OPCIÓN:\nCOLECCIÓN DE DISCOS\r\n" + "===================\r\n" + "1. Listado.\r\n"
				+ "2. Nuevo Disco.\r\n" + "3. Borrar.\r\n" + "4. Salir.");
	}
}
