package parte3.Ejercicio4;

public class Parse {
	// Creamos la función de parametro entero.
	public static boolean parseToBoolean(int a) {
		boolean bool = false;
		if (a == 1) {
			bool = true;
		}
		return bool;
	}

	// Creamos la función de parametro String.
	public static boolean parseToBoolean(String a) {
		boolean bool = false;
		if (a.equals("true")) {
			bool = true;
		}
		return bool;
	}
}
