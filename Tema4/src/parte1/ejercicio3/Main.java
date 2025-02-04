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
		rec1.imprimirCoordenadas();

		// Imprimimos el perímetro.
		rec1.imprimirPerimetro();

		// Imprimimos el área.
		rec1.imprimirArea();

		// Imprimimos el segundo objeto.
		System.out.println("SEGUNDO OBJETO");

		// Imprimimos las coordenadas.
		rec2.imprimirCoordenadas();

		// Imprimimos el perímetro.
		rec2.imprimirPerimetro();

		// Imprimimos el área.
		rec2.imprimirArea();
	}

}
