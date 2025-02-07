package parte1.ejercicio3;

public class Main {
	public static void main(String[] args) {

		// Declaramos los objetos.
		Rectangulo rec1;
		Rectangulo rec2;

		// Declaramos las variables que almacenarán las coordenadas.
		int x1;
		int y1;
		int x2;
		int y2;

		// Declaramos la variable que almacenará el perimetro.
		int perimetro;

		// Declaramos la variable que almacenará el área.
		double area;

		// Le damos valores al primer objeto.
		x1 = 0;
		x2 = 0;
		y1 = 5;
		y2 = 5;

		// Creamos el objeto.
		rec1 = new Rectangulo(x1, y1, x2, y2);

		// Le damos valores al segundo objeto
		x1 = 7;
		x2 = 9;
		y1 = 2;
		y2 = 3;

		// Creamos el objeto.
		rec2 = new Rectangulo(x1, y1, x2, y2);

		// Imprimimos el primer objeto
		System.out.println("PRIMER OBJETO:");

		// Imprimimos las coordenadas.
		System.out.println("Coordenadas: " + "x1:" + rec1.getX1() + " x2:" + rec1.getX2() + " y1:" + rec1.getY1()
				+ " y2:" + rec1.getY2());

		// Imprimimos el perimetro.
		System.out.println(rec1.getPerimetro());

		// Imprimimos el area.
		System.out.println(rec1.getArea());

		// Imprimimos el segundo objeto.
		System.out.println("SEGUNDO OBJETO");

		// Imprimimos las coordenadas.
		System.out.println("Coordenadas: " + "x1:" + rec2.getX1() + " x2:" + rec2.getX2() + " y1:" + rec2.getY1()
				+ " y2:" + rec2.getY2());

		// Imprimimos el perimetro.
		System.out.println(rec2.getPerimetro());

		System.out.println(rec2.getArea());

		// Probamos los métodos.
		System.out.println(rec2);
	}

}
