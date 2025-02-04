package parte1.ejercicio2;

public class Persona {
	String dni;
	String nombre;
	String apellidos;
	int edad;

	/**
	 * Creamos el constructor para persona.
	 * 
	 * @param dni       dni de la persona.
	 * @param nombre    nombre de la persona.
	 * @param apellidos apellidos de la persona.
	 * @param edad      edad de la persona.
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		if (dni != null && !dni.isEmpty())
			this.dni = dni;

		if (nombre != null && nombre.length() < 20 && !nombre.isEmpty())
			this.nombre = nombre;

		if (nombre != null && apellidos.length() < 40 && !apellidos.isEmpty())
			this.apellidos = apellidos;

		if (edad > 0 && edad < 100)
			this.edad = edad;

	}

}
