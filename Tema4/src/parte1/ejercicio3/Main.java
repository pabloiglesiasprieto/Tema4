package parte1.ejercicio3;

public class Main {
	public static void main(String[] args) {

		// Creamos los objetos.
		Rectangulo rec1 = new Rectangulo();
		Rectangulo rec2 = new Rectangulo();

		// Le damos valores al primer objeto.
		rec1.x1 = 0;
		rec1.x2 = 0;
		rec1.y1 = 5;
		rec1.y2 = 5;

		// Le damos valores al segundo objeto
		rec2.x1 = 7;
		rec2.x2 = 9;
		rec2.y1 = 2;
		rec2.y2 = 3;

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
