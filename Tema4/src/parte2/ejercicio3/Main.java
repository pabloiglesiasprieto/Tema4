package parte2.ejercicio3;

public class Main {
	public static void main(String[] args) {
		/*
		 * Diseñar la clase Alumno, de los que interesa almacenar su nombre y su nota
		 * media, que puede contener decimales.
		 * 
		 * Añade un constructor que reciba el nombre y la nota media del alumno.
		 * 
		 * Añade los getters/setters que consideres oportunos.
		 * 
		 * Crea también el método toString que devolverá una cadena con el nombre del
		 * alumno y a la derecha su nota. Ejemplo: Pepe Martínez Pérez 8.5
		 * 
		 * Añade también el método equals, de forma que dos alumnos son iguales si
		 * tienen el mismo nombre.
		 */
		// Creamos 3 alumnos.
		Alumno alu1 = new Alumno("Pedro Sánchez", 10);
		Alumno alu2 = new Alumno("Pedro Sánchez", 5);
		Alumno alu3 = new Alumno("Jose", 4);

		// Imprimimos la información de los alumnos.
		System.out.println(alu1);
		System.out.println(alu2);
		System.out.println(alu3);

		// Comparamos alumnos.
		System.out.println(alu1.equals(alu2) ? "Son iguales" : "No son iguales");
		System.out.println(alu1.equals(alu3) ? "Son iguales" : "No son iguales");
	}
}
