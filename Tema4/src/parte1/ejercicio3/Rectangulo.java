package parte1.ejercicio3;

public class Rectangulo {

	int x1;
	int x2;
	int y1;
	int y2;

	/**
	 * Constructor para rectangulo.
	 * 
	 * @param x1 punto inferior izquierdo
	 * @param y1 punto inferior izquierdo
	 * @param x2 punto superior derecho
	 * @param y2 punto superior derecho
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {

		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;

	}

	/*
	 * Esta función imprime el perimetro del rectangulo
	 */
	public void imprimirPerimetro() {

		// Declaramos la variable que almacenará el perimetro
		int perimetro;

		// Calculamos el perimetro.
		perimetro = 2 * (Math.abs(this.x2 - this.x1)) + 2 * (Math.abs(this.y2 - this.y1));

		// Imprimimos el perimetro.
		System.out.println("Perimetro: " + perimetro);
	}

	/*
	 * Esta función imprime el área del rectangulo
	 */
	public void imprimirArea() {

		// Imprimimos el area.
		System.out.println("Área: " + Math.abs(this.x2 - this.x1) * Math.abs(this.y2 - this.y1));

	}

	/*
	 * Esta función imprime las coordenadas del rectangulo
	 */
	public void imprimirCoordenadas() {

		// Imprimimos las coordenadas.
		System.out.println("Coordenadas: " + "x1:" + this.x1 + " x2:" + this.x2 + " y1:" + this.y1 + " y2:" + this.y2);
	}

}
