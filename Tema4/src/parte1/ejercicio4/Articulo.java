package parte1.ejercicio4;

public class Articulo {

	String nombre;
	double precio;
	int cuantosQuedan;
	public static final int IVA = 21;

	/**
	 * Constructor de Artículo.
	 * 
	 * @param nombre        nombre del producto
	 * @param precio        precio de producto
	 * @param cuantosQuedan cuantas unidades quedan del producto.
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {

		// Si el nombre es inferior a 20 de longitud, no está vacío ni es nulo, entrará
		// en el if.
		if (nombre != null && nombre.length() < 20 && !nombre.isEmpty())

			// Asigna el valor al atributo.
			this.nombre = nombre;

		// Si el precio es superior a 0, entrará en el condicional.
		if (precio > 0)

			// Asigna el valor al atributo.
			this.precio = precio;

		// Si las cantidades son positivas, entrará en el condicional.
		if (cuantosQuedan > 0)

			// Asignamos el valor al atributo.
			this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Obtener nombre del producto
	 * 
	 * @return Nombre del producto.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica nombre del producto.
	 * 
	 * @param nombre Nombre de producto.
	 */
	public void setNombre(String nombre) {
		if (nombre != null && nombre.length() < 20 && !nombre.isEmpty())

			// Asigna el valor al atributo.
			this.nombre = nombre;
	}

	/**
	 * Obtener precio del producto
	 * 
	 * @return precio del producto.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Modifica nombre del producto.
	 * 
	 * @param precio Precio del producto.
	 */
	public void setPrecio(double precio) {
		// Si el precio es superior a 0, entrará en el condicional.
		if (precio > 0)

			// Asigna el valor al atributo.
			this.precio = precio;
	}

	/**
	 * Obtener unidades del producto
	 * 
	 * @return unidades del producto.
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Modifica unidades del producto.
	 * 
	 * @param cuantosQuedan Unidades del producto.
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		// Si las cantidades son positivas, entrará en el condicional.
		if (cuantosQuedan > 0)

			// Asignamos el valor al atributo.
			this.cuantosQuedan = cuantosQuedan;
	}

}
