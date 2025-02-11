package parte2.ejercicio2;

public class Main {
	public static void main(String[] args) {
		/*
		 * Crea una clase llamada Libro que guarde la información de cada uno de los
		 * libros de una biblioteca.
		 * 
		 * La clase debe guardar el título del libro, autor, número de ejemplares del
		 * libro y número de ejemplares prestados.
		 * 
		 * También se desea conocer el género del libro, pudiendo tener los siguientes
		 * valores: Narrativo, Lírico, Dramático, Didáctico y Poético.
		 * 
		 * La clase contendrá los siguientes métodos: Constructores: Con el título y el
		 * autor. Con el título, el autor, el número de ejemplares y el número de
		 * ejemplares prestados.
		 * 
		 * Con el título, el autor, el número de ejemplares, el número de ejemplares
		 * prestados y el género.
		 * 
		 * Añade los getters/setters que consideres oportunos.
		 * 
		 * Con los libros se pueden llevar a cabo las siguientes operaciones: prestamo:
		 * incrementa el atributo correspondiente cada vez que se realice un préstamo.
		 * No se pueden prestar libros si no quedan ejemplares disponibles para prestar.
		 * Devuelve true si se ha podido realizar el préstamo y false en caso contrario.
		 * devolucion: decrementa el atributo correspondiente cada vez que se devuelva
		 * un libro. No se podrán devolver libros que no se hayan prestado. Devuelve
		 * true si se ha podido realizar la operación y false en caso contrario.
		 * toString: Devuelve una cadena con la información del libro. equals: Dos
		 * libros se consideran iguales si tienen el mismo título y el mismo autor.
		 */
		// Creamos un libro.
		Libro libro1 = new Libro("Como cuidar a Julian", "Un tonto", 10, 10);
		System.out.println(libro1);

		Libro libro2 = new Libro("Como cuidar a Julian", "Un tonto", 10, 10, "LIRICO");
		System.out.println(libro2);

		System.out.println(libro1.equals(libro2) ? "Son iguales" : "No son iguales");
	}
}
