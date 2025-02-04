package parte1.ejercicio4;

public class Articulo {

	String nombre;
	double precio;
	int cuantosQuedan;
	final int IVA = 21;

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
	 * Función que imprime la información del producto.
	 */
	public void imprimirProducto() {

		System.out.println(this.nombre + " - " + "Precio:" + this.precio + "€" + " - " + "IVA:" + IVA + "%" + " - "
				+ "PVP:" + (this.precio + ((IVA / 100.0) * this.precio)) + "€");

	}
}
