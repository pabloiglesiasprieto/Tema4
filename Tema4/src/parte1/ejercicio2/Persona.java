package parte1.ejercicio2;

public class Persona {
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;

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

	/**
	 * Obtener nombre de objeto.
	 * 
	 * @return Nombre de la persona.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Obtener apellidos de la persona.
	 * 
	 * @return Apellido de la persona.
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Obtener edad de la persona.
	 * 
	 * @return Edad de la persona.
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Obtener dni de la persona.
	 * 
	 * @return Dni de la persona.
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Modificar nombre de la persona.
	 * 
	 * @param nombre Nombre de la persona.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && nombre.length() < 20 && !nombre.isEmpty())
			this.nombre = nombre;
	}

	/**
	 * Modificar apellidos de la persona.
	 * 
	 * @param apellidos Apellidos de la persona.
	 */
	public void setApellidos(String apellidos) {
		if (nombre != null && apellidos.length() < 40 && !apellidos.isEmpty())
			this.apellidos = apellidos;
	}

	/**
	 * Modificar edad de la persona.
	 * 
	 * @param edad Edad de la persona.
	 */
	public void setEdad(int edad) {
		if (edad > 0 && edad < 100)
			this.edad = edad;
	}

	/**
	 * Comprueba si la persona es mayor de edad.
	 * 
	 * @return Devuelve un booleano dependiendo de si es mayor de edad o no.
	 */
	public boolean esMayorEdad() {
		boolean esMayor = edad >= 18 ? true : false;

		return esMayor;
	}

	/**
	 * Comprueba la diferencia de edad entre 2 personas.
	 * 
	 * @param p Persona.
	 * @return Devuelve la diferencia de edad entre las 2 personas.
	 */
	public int diferenciaEdad(Persona p) {
		int diferenciaEdad;

		diferenciaEdad = Math.abs(edad - p.edad);

		return diferenciaEdad;

	}

	/**
	 * Override metodo toString()
	 */
	public String toString() {
		String persona = "";
		persona += "Nombre: " + nombre + "\n";
		persona += "Apellidos: " + apellidos + "\n";
		persona += "Edad: " + edad + "\n";
		persona += "DNI: " + dni + "\n";

		return persona;

	}
}
