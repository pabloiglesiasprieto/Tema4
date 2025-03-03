package parte4.ejercicio3;

public class Pizza {
	enum TamañoPizza {
		MEDIANA, FAMILIAR
	};

	enum TipoPizza {
		MARGARITA, CUATROQUESOS, FUNGHI
	};

	enum EstadoPizza {
		PEDIDA, SERVIDA
	};

	private int codigo;
	private TamañoPizza tamaño = TamañoPizza.MEDIANA;
	private TipoPizza tipo = TipoPizza.MARGARITA;
	private EstadoPizza estado = EstadoPizza.PEDIDA;

	/**
	 * Constructor para la clase Pizza
	 * 
	 * @param codigo Código de la pizza
	 * @param tamaño Tamaño de la pizza
	 * @param tipo   Tipo de la pizza.
	 */
	public Pizza(int codigo, String tamaño, String tipo) {
		this.codigo = codigo;
		comprobarTamaño(tamaño);
		comprobarTipo(tipo);

	}

	/**
	 * Getter de código
	 * 
	 * @return Devuelve el codigo de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Getter del estado de la pizza.
	 * 
	 * @return Devuelve el estado de la pizza.
	 */
	public EstadoPizza getEstado() {
		return estado;
	}

	/**
	 * Setter del estado de la pizza.
	 * 
	 * @param estado Nuevo estado de la pizza.
	 */
	public void setEstado(String estado) {
		switch (estado.toUpperCase()) {
		case "PEDIDA" -> this.estado = EstadoPizza.PEDIDA;
		case "SERVIDA" -> this.estado = EstadoPizza.SERVIDA;

		}

	}

	/**
	 * Override metodo toString()
	 */
	public String toString() {
		String cadena = "";
		cadena += tamaño + ": " + tipo + " - " + estado;
		return cadena;
	}

	/**
	 * Override metodo equals
	 */
	public boolean equals(Object a) {
		boolean iguales = false;
		Pizza otraPizza = (Pizza) a;
		if (otraPizza.codigo == this.codigo)
			iguales = true;

		return iguales;

	}

	/**
	 * Función que comprobará el tamaño dado por parámetro de entrada.
	 * 
	 * @param tamaño Tamaño de la pizza.
	 */
	public void comprobarTamaño(String tamaño) {
		switch (tamaño.toUpperCase()) {
		case "MEDIANA" -> this.tamaño = TamañoPizza.MEDIANA;
		case "FAMILIAR" -> this.tamaño = TamañoPizza.FAMILIAR;
		}
	}

	/**
	 * Función que comprobará el tipo dado por parámetro de entrada.
	 * 
	 * @param tipo Tipo de la pizza.
	 */
	public void comprobarTipo(String tipo) {
		switch (tipo.toUpperCase()) {
		case "CUATROQUESOS" -> this.tipo = TipoPizza.CUATROQUESOS;
		case "FUNGHI" -> this.tipo = TipoPizza.FUNGHI;
		case "MARGARITA" -> this.tipo = TipoPizza.MARGARITA;

		}
	}
}
