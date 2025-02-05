package parte1.ejercicio1;

import java.util.Scanner;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Declaramos los 3 objetos.
		Punto p1;
		Punto p2;
		Punto p3;

		// Declaramos la variable que almacenará el valor x.
		int x;

		// Declaramos la variable que almacenará el valor y.
		int y;

		// Le damos valores al primer punto.
		x = 5;
		y = 0;

		// Creamos el primer objeto.
		p1 = new Punto(x, y);

		// Le damos valores al segundo punto.
		x = 10;
		y = 10;

		// Creamos el segundo objeto.
		p2 = new Punto(x, y);

		// Le damos valores al tercer punto.
		x = -3;
		y = 7;

		// Creamos el tercer objeto.
		p3 = new Punto(x, y);

		// Imprimimos valores.
		System.out.println("Coordenadas primer punto: " + p1.getX() + "," + p1.getY());
		System.out.println("Coordenadas segundo punto: " + p2.getX() + "," + p2.getY());
		System.out.println("Coordenadas tercer punto: " + p3.getX() + "," + p3.getY());

		// Probamos con operadores.
		p1.setX(x *= -1);
		p1.setX(x /= 2);
		p1.setX(x += p3.getX());
		p2.setX(x -= 3);

		// Salto de linea.
		System.out.println();

		// Volvemos a imprimir.
		System.out.println("Coordenadas primer punto: " + p1.getX() + "," + p1.getY());
		System.out.println("Coordenadas segundo punto: " + p2.getX() + "," + p2.getY());
		System.out.println("Coordenadas tercer punto: " + p3.getX() + "," + p3.getY());

		// Cerramos Scanner.
		sc.close();
	}

}
