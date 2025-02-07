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

	/**
	 * Método que calcula el precio con el IVA aplicado.
	 * 
	 * @return Devuelve el PVP.
	 */
	public double getPVP() {
		return getPrecio() + ((IVA / 100.0) * getPrecio());

	}

	/**
	 * Devuelve el precio con un descuento aplicado.
	 * 
	 * @param Descuento Parametro de entrada que indica un descuento.
	 * @return Devuelve el precio con el descuento aplicado.
	 */
	public double getPVPDescuento(int descuento) {
		return (descuento / 100 * getPVP()) + getPVP();
	}

	/**
	 * Método que indica si se ha podido vender unidades.
	 * 
	 * @param cantidad Cantidad de productos vendidos.
	 * @return Devuelve un booleano indicando si se ha vendido o no.
	 */
	public boolean vender(int cantidad) {
		boolean vendido = false;
		if (cuantosQuedan - cantidad >= 0) {
			cuantosQuedan -= cantidad;
			vendido = true;
		}
		return vendido;
	}

	/**
	 * Método que añade una cantidad de productos.
	 * 
	 * @param cantidad Cantidad a añadir a la cantidad.
	 */
	public void añadir(int cantidad) {

		cuantosQuedan += cantidad;

	}

	/**
	 * Override método toString();
	 */
	public String toString() {
		String objeto = "";
		objeto += nombre + " - " + "Precio:" + precio + "€" + " - " + "IVA:" + IVA + "%" + " - " + "PVP:" + getPVP()
				+ "€";
		return objeto;

	}

}
