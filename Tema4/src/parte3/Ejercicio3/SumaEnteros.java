package parte3.Ejercicio3;

public class SumaEnteros {
	// Creamos la función con 1 parámetro de entrada.
	public static int sumaEnteros(int numero) {
		int sumaEnteros = 0;
		if (numero == 0) {
		} else {
			sumaEnteros = numero + sumaEnteros(numero - 1);
		}
		return sumaEnteros;
	}

	// Creamos la función con 2 parámetro de entrada.
	public static int sumaEnteros(int a, int b) {
		int sumaEnteros = 0;
		if (a == b) {
		} else {
			sumaEnteros = a + sumaEnteros(a - 1);
		}
		return sumaEnteros;
	}
}
