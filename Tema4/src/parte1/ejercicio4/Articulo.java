package parte1.ejercicio4;

public class Articulo {

	String nombre;
	double precio;
	int cuantosQuedan;
	final int IVA = 21;

	public void imprimirProducto() {

		System.out.println(this.nombre + " - " + "Precio:" + this.precio + "€" + " - " + "IVA:" + IVA + "%" + " - "
				+ "PVP:" + (this.precio + ((IVA / 100.0) * this.precio)) + "€");

	}
}
