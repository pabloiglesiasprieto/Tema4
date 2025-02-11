package parte2.ejercicio1;

public class Main {
	/*
	 * Diseñar la clase CuentaCorriente, que almacena los datos DNI, nombre, saldo y
	 * nacionalidad, el cual tendrá 2 valores: Española y Extranjera.
	 * 
	 * Añade los siguientes constructores: Con el DNI del titular de la cuenta y un
	 * saldo inicial.
	 * 
	 * Con el DNI, nombre y el saldo inicial. Con el DNI, nombre, el saldo inicial y
	 * nacionalidad.
	 * 
	 * Añade los getters/setters que consideres oportunos.
	 * 
	 * Las operaciones típicas de una cuenta corriente son:
	 * 
	 * Sacar dinero: se extraerá una cantidad de dinero introducida por parámetro.
	 * Sólo se puede sacar dinero si existe saldo suficiente. Si es posible llevar a
	 * cabo la operación se resta la cantidad a sacar al saldo de la cuenta y
	 * devolverá true. En caso contrario, no se podrá sacar dinero y devolverá
	 * false. Ingresar dinero: se incrementa el saldo. Hay que comprobar que el
	 * saldo a ingresar es una cantidad positiva. Devolverá true si se puede llevar
	 * a cabo la operación y false en caso contrario.
	 * 
	 * toString: Devuelve una cadena con la información de la cuenta corriente.
	 * 
	 * equals: Dos cuentas corrientes se consideran iguales si coinciden el DNI y el
	 * nombre.
	 */
	public static void main(String[] args) {

		// Creamos el objeto cuenta corriente.
		CuentaCorriente cc1 = new CuentaCorriente("31884793P", "Pedro", 0, "ESPAÑOLA");

		// Imprimimos la información del objeto.
		System.out.println(cc1);

		// Ingresamos dinero.
		System.out.println(cc1.ingresarDinero(1000) ? "Ingresaste dinero correctamente" : "Cantidad invalida.");

		// Imprimimos la información del objeto.
		System.out.println(cc1);

		// Extraemos dinero.
		System.out.println(cc1.sacarDinero(11110) ? "Extraiste dinero correctamente" : "Cantidad invalida.");

		// Imprimimos la información del objeto.
		System.out.println(cc1);

		// Creamos el objeto cuenta corriente.
		CuentaCorriente cc2 = new CuentaCorriente("31884793P", "Pedro", 0, "ESPAÑOLA");

		System.out.println(cc1.equals(cc2) ? "Son iguales" : "No son iguales");
	}

}