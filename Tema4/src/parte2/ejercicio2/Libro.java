package parte2.ejercicio2;

public class Libro {
	private String titulo = "No definido";
	private String autor = "No definido";
	private int ejemplares = 0;
	private int prestados = 0;
	private Generos genero = Generos.NARRATIVO;

	enum Generos {
		NARRATIVO, LIRICO, DRAMATICO, DIDACTICO, POETICO
	};

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		this.titulo = titulo;
		this.autor = autor;
		if (ejemplares >= 0)
			this.ejemplares = ejemplares;
		if (prestados <= ejemplares)
			this.prestados = prestados;

	}

	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		if (ejemplares >= 0)
			this.ejemplares = ejemplares;
		if (prestados <= ejemplares)
			this.prestados = prestados;
		switch (genero) {
		case "NARRATIVO" -> this.genero = Generos.NARRATIVO;
		case "DIDACTICO" -> this.genero = Generos.DIDACTICO;
		case "POETICO" -> this.genero = Generos.POETICO;
		case "LIRICO" -> this.genero = Generos.LIRICO;
		}

	}

	/**
	 * Getter título
	 * 
	 * @return Devuelve título del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Setter título
	 * 
	 * @param titulo Nuevo título del libro.
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * Getter del autor.
	 * 
	 * @return Devuelve el autor del libro.
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Setter de autor.
	 * 
	 * @param autor Nuevo autor del libro.
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * Getter de ejemplares.
	 * 
	 * @return Devuelve ejemplares del libro.
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Setter de ejemplares.
	 * 
	 * @param ejemplares Nueva cantidad de ejemplares.
	 */
	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	/**
	 * Getter de prestados
	 * 
	 * @return Devuelve el número de libros prestados.
	 */
	public int getPrestados() {
		return prestados;
	}

	/**
	 * Setter de prestados.
	 * 
	 * @param prestados Nueva cantidad de libros prestados.
	 */
	public void setPrestados(int prestados) {
		this.prestados = prestados;
	}

	/**
	 * Getter de genero.
	 * 
	 * @return Devuelve género del libro
	 */
	public String getGenero() {
		return String.valueOf(genero);
	}

	/**
	 * Función que aumentará la cantidad de prestados.
	 * 
	 * @return Devuelve un booleano indicando si se ha podido incrementar las
	 *         unidades prestadas.
	 */
	public boolean prestamo() {
		boolean prestamo = false;

		if (prestados + 1 <= ejemplares) {
			prestamo = true;
			prestados++;
		}
		return prestamo;
	}

	/**
	 * Función que devolverá un libro prestado
	 * 
	 * @return Devuelve un booleano para saber si se ha podido devolver o no un
	 *         libro.
	 */
	public boolean devolucion() {
		boolean devolucion = false;

		if (prestados - 1 <= ejemplares) {
			devolucion = true;
			prestados--;
		}
		return devolucion;
	}

	/**
	 * Override toString().
	 */
	public String toString() {
		String frase = "";
		frase += "Título: " + titulo + "\nAutor: " + autor + "\nEjemplares: " + ejemplares + "\nPrestados: " + prestados
				+ "\nGénero: " + genero;
		return frase;
	}

	/**
	 * Override equals.
	 */
	public boolean equals(Object a) {
		boolean iguales = false;
		Libro otroLibro = (Libro) a;
		if (otroLibro.autor.equals(this.autor) && otroLibro.titulo.equals(this.titulo))
			iguales = true;
		return iguales;
	}
}
