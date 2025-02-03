package parte1.ejercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos un Scanner
		Scanner sc = new Scanner(System.in);

		// Creamos el objeto.
		Articulo art1 = new Articulo();

		// Le pedimos al usuario que escriba el nombre del producto.
		System.out.println("Introduce el nombre del producto");

		// Le damos valores al objeto.
		art1.nombre = sc.nextLine();

		// Le pedimos al usuario que introduzca el precio.
		System.out.println("Introduce el precio.");

		// Le damos valores al objeto.
		art1.precio = sc.nextInt();

		// Imprimimos la información de objeto.
		art1.imprimirProducto();

		// Cerramos el Scanner.
		sc.close();

	}
}
