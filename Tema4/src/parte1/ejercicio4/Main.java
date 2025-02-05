package parte1.ejercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Declaramos el objeto.
		Articulo art1;

		// Declaramos la variable que almacenará el nombre.
		String nombre;

		// Declaramos la variable que almacenará el precio.
		int precio;

		// Declaramos la variable que almacenará las unidades de producto.
		int cuantosQuedan;

		// Le pedimos al usuario que escriba el nombre del producto.
		System.out.println("Introduce el nombre del producto");

		// Le damos valores al objeto.
		nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el precio.
		System.out.println("Introduce el precio.");

		// Le damos valores al objeto.
		precio = sc.nextInt();

		// Le pedimos al usuario cuantas unidades quedan.
		System.out.println("Introduce las unidades del producto.");

		// Leemos entrada de teclado.
		cuantosQuedan = sc.nextInt();

		// Creamos el objeto.
		art1 = new Articulo(nombre, precio, cuantosQuedan);

		// Imprimimos la información de objeto.
		System.out.println(art1.getNombre() + " - " + "Precio:" + art1.getPrecio() + "€" + " - " + "IVA:" + Articulo.IVA
				+ "%" + " - " + "PVP:" + (art1.getPrecio() + ((Articulo.IVA / 100.0) * art1.getPrecio())) + "€");
		// Cerramos el Scanner.
		sc.close();

	}
}
