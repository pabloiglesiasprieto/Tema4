package parte4.ejercicio1;

import java.util.ArrayList;

public class Crud {

	// Creamos la lista de alumnos.
	private static ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();

	/**
	 * Función para crear un alumno
	 * 
	 * @param nombre Nombre del alumno
	 * @param media  Media del alumno.
	 */
	public static void crearAlumno(String nombre, double media) {
		Alumno alu1 = new Alumno(nombre, media);
		listaAlumno.add(alu1);
	}

	public static void mostrarAlumno() {
		for (Alumno alumno : listaAlumno) {
			System.out.println(alumno);

		}
	}

	/**
	 * Creamos función para modificar atributos de un alumno.
	 */
	public static void modificarAlumno(String nombre, double media) {

		// Creamos un for para buscar el alumno.
		for (Alumno alu : listaAlumno) {

			// Si el nombre es igual al nombre de algunas de las personas en la colección,
			// entrará en el condicional.
			if (alu.getNombre().equals(nombre)) {

				// Modificamos la media de la persona.
				alu.setNotaMedia(media);
			}
		}
	}

	/**
	 * Método para borrar un alumno.
	 */
	public static void borrarAlumno(String nombre) {

		// Declaramos una variable de tipo Alumno
		Alumno alu;

		int contador = 0;

		boolean encontrado = false;

		// Buscamos el alumno con el código.
		while (contador < listaAlumno.size() && !encontrado) {

			// Recogemos el alumno.
			alu = listaAlumno.get(contador);

			if (alu.getNombre().equals(nombre)) {

				// Borramos al alumno de la lista.
				listaAlumno.remove(contador);

				// Ponemos encontrado a true.
				encontrado = true;
			}
			// Incrementamos el contador.
			contador++;
		}
		// Imprimimos que el alumno ha sido eliminado.
		System.out.println("Alumno eliminado correctamente.");

	}

}
