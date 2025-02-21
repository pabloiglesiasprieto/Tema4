package parte4.ejercicio1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Patiendo de la clase Alumno diseña un CRUD atendiendo a lo siguiente:
		 * 
		 * Crea una colección donde almacenar los alumnos de una clase. Toda la gestión
		 * de la lista se debería de hacer en una clase independiente de Alumno.
		 * 
		 * En el método principal se mostrará el siguiente menú de opciones para
		 * gestionar al alumnado:
		 * 
		 * ALUMNOS/AS ===================
		 * 
		 * 1. Listado.
		 * 
		 * 2. Nuevo Alumno.
		 * 
		 * 3. Modificar.
		 * 
		 * 4. Borrar.
		 * 
		 * 5. Salir.
		 * 
		 * Opción 1: Imprimirá el listado de alumnos. Un alumno por línea.
		 * 
		 * Opción 2: Deberá pedir los datos del alumno, crearlo y añadirlo a la lista.
		 * 
		 * Opción 3: Para modificar un alumno debemos buscarlo por su nombre. En caso de
		 * que esté, entonces se le pedirá al usuario por teclado la nota del alumno
		 * para modificarla. Sólo se modifica la nota.
		 * 
		 * Opción 4: Para borrar un alumno debemos pedir al usuario el nombre del alumno
		 * a borrar y eliminarlo de la lista.
		 */
		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Guardamos la eleccion en un entero.
		int eleccion;

		// Creamos la variable que almacenará el nombre del alumno.
		String nombre;

		// Creamos la variable que almacenará la media del alumno.
		double media;

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

				// Llamamos al método para imprimir los Alumnos.
				Crud.mostrarAlumno();

				// Rompemos el case.
				break;
			}
			// Segundo case.
			case 2 -> {

				// Pedimos al usuario que introduzca el nombre del alumno.
				System.out.println("Introduce el nombre del Alumno");

				// Leemos entrada de teclado.
				nombre = sc.nextLine();

				// Pedimos al usuario que introduzca la media del alumno.
				System.out.println("Introduce la media del Alumno");

				// Leemos entrada de teclado.
				media = sc.nextDouble();

				// Limpiamos buffer.
				sc.nextLine();

				// Llamamos al método para añadir el alumno.
				Crud.crearAlumno(nombre, media);

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
		System.out.println(
				"ALUMNOS/AS\n=================\n\n1. Listado\n2. Nuevo Alumno\n3. Modificar\n4. Borrar\n5. Salir");
	}
}
