package parte2.ejercicio3;

public class Alumno {
	/**
	 * Atributo que identificará el nombre del alumno.
	 */
	private String nombre;
	/**
	 * Atributo que identificará la nota media del alumno.
	 */
	private double notaMedia;

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
			this.notaMedia = notaMedia;
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
	 * Getter de la nota media.
	 * 
	 * @return Devuelve la nota media del alumno.
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Setter de la nota media
	 * 
	 * @param notaMedia Parámetro de entrada que será la nueva media.
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10)
			this.notaMedia = notaMedia;
	}

	/**
	 * Override método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += nombre + " " + notaMedia;
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