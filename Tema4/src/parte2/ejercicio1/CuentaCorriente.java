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

	public boolean sacarDinero(int cantidad) {
		boolean extraer = false;

		if (saldo > cantidad) {
			
		}

		return extraer;

	}

}
