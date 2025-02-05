package parte1.ejercicio1;

public class Punto {

	private int x;
	private int y;

	/**
	 * Creamos el constructor para Punto.
	 * 
	 * @param x coordenada x en un mapa.
	 * @param y coordenada y en un mapa
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;

	}

	/**
	 * Obtener valor de x
	 * 
	 * @return Valor de x.
	 */
	public int getX() {
		return x;
	}

	/**
	 * Obtener valor de y
	 * 
	 * @return Valor de y.
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modificar valor de x.
	 * 
	 * @param x valor x.
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Modificar valor de y.
	 * 
	 * @param y valor y.
	 */
	public void setY(int y) {
		this.y = y;
	}

}
