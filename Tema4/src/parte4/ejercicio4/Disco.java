package parte4.ejercicio4;

/**
 * Clase para los Disco
 */
public class Disco {

	/**
	 * Código del disco.
	 */
	private int codigo;

	/**
	 * Autor del disco
	 */
	private String autor;

	/**
	 * Título de disco.
	 */
	private String titulo;

	/**
	 * Duración de disco.
	 */
	private String duracion;

	/**
	 * Género del disco.
	 */
	private discoEnum genero;

	/**
	 * Enumerado para el genero del disco.
	 */
	enum discoEnum {
		ROCK, POP, JAZZ, BLUES
	}

	/**
	 * Constructor de disco.
	 * 
	 * @param codigo   Código del disco.
	 * @param autor    Autor del disco.
	 * @param titulo   Título del disco.
	 * @param duracion Duración del disco.
	 * @param genero   Género del disco.
	 */
	public Disco(int codigo, String autor, String titulo, String duracion, String genero) {

		this.codigo = codigo;

		this.autor = autor;

		this.titulo = titulo;

		this.duracion = duracion;

		switch (genero) {

		case "ROCK" -> this.genero = discoEnum.ROCK;
		case "POP" -> this.genero = discoEnum.POP;
		case "JAZZ" -> this.genero = discoEnum.JAZZ;
		case "BLUES" -> this.genero = discoEnum.BLUES;

		default -> this.genero = discoEnum.ROCK;
		}
	}

	/**
	 * Constructor clase Disco
	 * 
	 * @param codigo Código de disco.
	 */
	public Disco(int codigo) {

		this.codigo = codigo;

	}

	/**
	 * Getter del autor
	 * 
	 * @return Autor de un disco.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Setter del autor
	 * 
	 * @param autor Nuevo autor.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Getter de título
	 * 
	 * @return Título del disco.
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Setter del título.
	 * 
	 * @param titulo Nuevo título.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Getter de duración.
	 * 
	 * @return Duración del disco.
	 */
	public String getDuracion() {
		return duracion;
	}

	/**
	 * Setter de duración
	 * 
	 * @param duracion Nueva duración.
	 */
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	/**
	 * Getter del codigo.
	 * 
	 * @return Código del disco.
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Override metodo toString().
	 */
	public String toString() {

		String cadena = "";

		cadena += "Código: " + codigo + " - " + "Autor: " + autor + " - " + "Título: " + titulo + " - " + "Duración: "
				+ duracion + " - " + "Género: " + genero;

		return cadena;

	}

	/**
	 * Override de equals.
	 */
	public boolean equals(Object obj) {
		boolean iguales = false;

		Disco d1 = (Disco) obj;

		if (d1.codigo == this.codigo) {

			iguales = true;
		}
		return iguales;

	}
}
