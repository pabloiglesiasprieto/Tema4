package parte2.ejercicio1;

public class CuentaCorriente {
	/**
	 * DNI del dueño de la cuenta.
	 */
	private String DNI = "No específicado.";
	/**
	 * Nombre del dueño de la cuenta,
	 */

	private String nombre = "No específicado.";
	/**
	 * Saldo de la cuenta.
	 */
	private int saldo;

	/**
	 * Nacionalidad de la cuenta.
	 */
	private Nacionalidad nacion = Nacionalidad.ESPAÑOLA;

	/**
	 * Enumeración de nacionalidades.
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	/**
	 * Constructor para la clase CuentaCorriente
	 * 
	 * @param DNI   DNI de la persona.
	 * @param saldo Saldo de la persona.
	 */
	public CuentaCorriente(String DNI, int saldo) {
		if (DNI.length() == 9 && DNI != null)
			this.DNI = DNI;
		if (saldo >= 0)
			this.saldo = saldo;
	}

	/**
	 * Constructor para la clase CuentaCorriente.
	 * 
	 * @param DNI    DNI de la persona.
	 * @param nombre Nombre de la persona.
	 * @param saldo  Saldo de la persona.
	 */
	public CuentaCorriente(String DNI, String nombre, int saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	/**
	 * Constructor para la clase CuentaCorriente
	 * 
	 * @param DNI    DNI de la persona.
	 * @param nombre Nombre de la persona.
	 * @param saldo  Saldo de la persona.
	 * @param nacion Nación de la persona.
	 */
	public CuentaCorriente(String DNI, String nombre, int saldo, String nacion) {
		this.DNI = DNI;
		this.saldo = saldo;
		switch (nacion) {

		case "ESPAÑOLA" -> this.nacion = Nacionalidad.ESPAÑOLA;
		default -> this.nacion = Nacionalidad.EXTRANJERA;
		}
		;
	}

	/**
	 * Getter de nacion.
	 * 
	 * @return Retorna nación de la CuentaCorriente.
	 */
	public String getNacion() {
		return String.valueOf(nacion);

	}

	/**
	 * Setter de nación.
	 * 
	 * @param nacion Nación de la CuentaCorriente.
	 */
	public void setNacion(String nacion) {
		this.nacion = Nacionalidad.valueOf(nacion);

	}

	/**
	 * Getter del nombre de la cuenta.
	 * 
	 * @return Devuelve nombre de la cuenta.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Setter de nombre de la cuenta.
	 * 
	 * @param nombre Nombre de la cuenta.
	 */
	public void setNombre(String nombre) {
		if (nombre.length() >= 1 && nombre.length() <= 20)
			this.nombre = nombre;
	}

	/**
	 * Getter del saldo.
	 * 
	 * @return Devuelve saldo de la cuenta.
	 */
	public int getSaldo() {
		return saldo;
	}

	/**
	 * Setter de saldo.
	 * 
	 * @param saldo Parámetro de entrada saldo.
	 */
	public void setSaldo(int saldo) {
		if (saldo >= 0)
			this.saldo = saldo;
	}

	/**
	 * Getter de DNI
	 * 
	 * @return DNI del dueño de la cuenta.
	 */
	public String getDNI() {
		return DNI;
	}

	/**
	 * Esta función sirve para extraer dinero de la cuenta corriente.
	 * 
	 * @param cantidad Parametro de entrada que indica una cantidad a extraer.
	 * @return Retorna un booleano para indicar si se ha podido extraer el dinero o
	 *         no.
	 */
	public boolean sacarDinero(int cantidad) {
		boolean extraer = false;

		if (saldo > cantidad) {
			extraer = true;
			saldo -= cantidad;

		}

		return extraer;

	}

	/**
	 * Esta función sirve para ingresar dinero de la cuenta corriente.
	 * 
	 * @param cantidad Parametro de entrada que indica una cantidad a ingresar.
	 * @return Retorna un booleano para indicar si se ha podido ingresar el dinero o
	 *         no.
	 */
	public boolean ingresarDinero(int cantidad) {
		boolean ingresar = false;

		if (cantidad >= 1) {
			ingresar = true;
			saldo += cantidad;

		}
		return ingresar;
	}

	/**
	 * Override método toString().
	 */
	public String toString() {
		String cadena = "";
		cadena += "DNI: " + DNI + " Nombre: " + nombre + " Saldo: " + saldo + " Nación: " + nacion;
		return cadena;

	}

	/**
	 * Override metodo equals.
	 */
	public boolean equals(Object cuenta) {
		boolean iguales = false;

		CuentaCorriente otraCuenta = (CuentaCorriente) cuenta;

		if (otraCuenta.DNI.equals(this.DNI) && otraCuenta.nombre.equals(this.nombre)) {
			iguales = true;
		}

		return iguales;

	}

}
