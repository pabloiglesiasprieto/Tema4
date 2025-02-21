package parte4.ejercicio1;

public class Alumno {
	/**
	 * Atributo que identificará el nombre del alumno.
	 */
	private String nombre;
	/**
	 * Atributo que identificará la nota media del alumno.
	 */
	private double media;

	/**
	 * Constructor para la clase Alumno.
	 * 
	 * @param nombre    Parámetro de entrada que identificará el nombre del alumno.
	 * @param notaMedia Parámetro de entrada que identificará la nota media del
	 *                  alumno.
	 */
	public Alumno(String nombre, double notaMedia) {
		this.nombre = nombre;
		if (notaMedia >= 0 && notaMedia <= 10)
			this.media = notaMedia;
	}

	/**
	 * Getter del nombre del alumno.
	 * 
	 * @return Devuelve el nombre del alumno.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter de nombre
	 * 
	 * @param nombre Nuevo nombre de la persona.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter de la nota media.
	 * 
	 * @return Devuelve la nota media del alumno.
	 */
	public double getNotaMedia() {
		return media;
	}

	/**
	 * Setter de la nota media
	 * 
	 * @param notaMedia Parámetro de entrada que será la nueva media.
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10)
			this.media = notaMedia;
	}

	/**
	 * Override método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += nombre + " " + media;
		return cadena;
	}

	/**
	 * Override método equals().
	 */
	public boolean equals(Object a) {
		boolean iguales = false;
		Alumno otroAlumno = (Alumno) a;
		if (otroAlumno.nombre.equals(this.nombre))
			iguales = true;
		return iguales;
	}

}
