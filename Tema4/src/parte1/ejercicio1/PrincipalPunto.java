package parte1.ejercicio1;

public class PrincipalPunto {

	public static void main(String[] args) {

		// Creamos el primer objeto
		Punto p1 = new Punto();

		// Creamos el segundo objeto
		Punto p2 = new Punto();

		// Creamos el tercer objeto
		Punto p3 = new Punto();

		// Le damos valores al primer punto.
		p1.x = 5;
		p1.y = 0;

		// Le damos valores al segundo punto.
		p2.x = 10;
		p2.y = 10;

		// Le damos valores al tercer punto.
		p3.x = -3;
		p3.y = 7;

		// Imprimimos valores.
		System.out.println("Coordenadas primer punto: " + p1.x + "," + p1.y);
		System.out.println("Coordenadas segundo punto: " + p2.x + "," + p2.y);
		System.out.println("Coordenadas tercer punto: " + p3.x + "," + p3.y);

		// Probamos con operadores.
		p3.x *= -1;
		p1.y /= 2;
		p1.x += p3.x;
		p2.x -= 3;

		// Salto de linea.
		System.out.println();

		// Volvemos a imprimir.
		System.out.println("Coordenadas primer punto: " + p1.x + "," + p1.y);
		System.out.println("Coordenadas segundo punto: " + p2.x + "," + p2.y);
		System.out.println("Coordenadas tercer punto: " + p3.x + "," + p3.y);
	}

}
