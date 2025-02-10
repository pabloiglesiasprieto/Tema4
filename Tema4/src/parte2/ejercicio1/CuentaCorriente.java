package parte2.ejercicio1;

public class CuentaCorriente {

	private String DNI;
	private String nombre;
	private int saldo;
	private Nacionalidad nacion;

	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	public CuentaCorriente(String DNI, int saldo) {
		this.DNI = DNI;
		this.saldo = saldo;
	}

	public CuentaCorriente(String DNI, String nombre, int saldo) {
		this.DNI = DNI;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public CuentaCorriente(String DNI, String nombre, int saldo, Nacionalidad nacion) {
		this.DNI = DNI;
		this.saldo = saldo;
		this.nacion = nacion;
	}

	public String getNacion() {
		return String.valueOf(nacion);

	}

	public void setNacion(String nacion) {
		this.nacion = Nacionalidad.valueOf(nacion);

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre.length() >= 1 && nombre.length() <= 20)
			this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		if (saldo >= 0)
			this.saldo = saldo;
	}

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
		cadena += "DNI: " + DNI + "Nombre: " + nombre + "Saldo: " + saldo + "Nación: " + nacion;
		return cadena;

	}

	public boolean equals(Object cuenta) {
		boolean iguales = false;

		cuenta = (CuentaCorriente) cuenta;
		
		if (DNI == cuenta.DNI)

		return iguales;

	}

}
