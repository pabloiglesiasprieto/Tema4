package parte1.ejercicio3;

public class Rectangulo {

	private int x1;
	private int x2;
	private int y1;
	private int y2;

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

	/**
	 * Obtener valor x1.
	 * 
	 * @return valor x1.
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Modificar valor x1
	 * 
	 * @param x1 Valor x1.
	 */
	public void setX1(int x1) {
		this.x1 = x1;
	}

	/**
	 * Obtener valor x2.
	 * 
	 * @return valor x2.
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Modificar valor x2
	 * 
	 * @param x2 Valor x2.
	 */
	public void setX2(int x2) {
		this.x2 = x2;
	}

	/**
	 * Obtener valor y1.
	 * 
	 * @return valor y1.
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Modificar valor y1
	 * 
	 * @param y1 Valor y1.
	 */
	public void setY1(int y1) {
		this.y1 = y1;
	}

	/**
	 * Obtener valor y2.
	 * 
	 * @return valor y2.
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Modificar valor y2
	 * 
	 * @param y2 Valor y2.
	 */
	public void setY2(int y2) {
		this.y2 = y2;
	}

	/**
	 * Setter doble.
	 * 
	 * @param x1 valor x1 del rectangulo
	 * @param y1 valor y1 del rectangulo.
	 */
	public void setX1Y1(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}

	/**
	 * Setter doble.
	 * 
	 * @param x2 valor x2 del rectangulo
	 * @param y2 valor y2 del rectangulo.
	 */
	public void setX2Y2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	/**
	 * Setter entero.
	 * 
	 * @param x1 valor x1 del rectangulo.
	 * @param y1 valor y1 del rectangulo.
	 * @param x2 valor x2 del rectangulo.
	 * @param y2 valor y2 del rectangulo.
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	/**
	 * Obtiene el perimetro.
	 * 
	 * @param rec2 Rectangulo
	 * @return Devuelve el perimetro.
	 */
	public int getPerimetro() {
		int perimetro;
		perimetro = 2 * (Math.abs(x2 - x1 + 2 * (Math.abs(y2 - y1))));
		return perimetro;
	}

	/**
	 * Calcula el area.
	 * 
	 * @return Devuelve el area del rectangulo.
	 */
	public double getArea() {
		double area;
		// Calculamos el area.
		area = Math.abs(x2 - x1 * Math.abs(y2 - y1));
		return area;
	}

	public String toString() {
		String objeto = "";
		objeto += "OBJETO:\n" + "x1:" + x1 + "\n" + "x2:" + x2 + "\n" + "y1:" + y1 + "\n" + "y2:" + y2 + "\n";
		objeto += "Area: " + getArea() + "\n";
		objeto += "Perímetro: " + getPerimetro() + "\n";
		return objeto;
	}
}
