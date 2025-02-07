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

	/**
	 * Asigna valores x e y.
	 * 
	 * @param x valor x
	 * @param y valor y
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Desplaza el punto.
	 * 
	 * @param dx incremento al punto x
	 * @param dy incremento al punto y.
	 */
	public void desplaza(int dx, int dy) {
		x += dx;
		y += dy;
	}

	/**
	 * Calcula la distancia entre un punto y otro.
	 * 
	 * @param p Punto
	 * @return distancia entre punto a punto.
	 */
	public double distancia(Punto p) {
		double dx = this.x - p.x;
		double dy = this.y - p.y;
		return Math.sqrt(dx * dx + dy * dy);
	}

	@Override
	public String toString() {
		String objeto = "(" + x + "," + y + ")";

		return objeto;
	}

}
