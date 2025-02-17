package parte3.Ejercicio4;

public class Main {
	public static void main(String[] args) {
		/*
		 * Diseña una clase que contenga dos funciones de nombre parseToBoolean que
		 * hagan lo siguiente:
		 * 
		 * La primera de las funciones recibirá un argumento de tipo entero que devuelva
		 * false si el argumento es 0 y true si el argumento es 1.
		 * 
		 * 
		 * La segunda de las funciones recibirá un argumento de tipo String que devuelva
		 * false si la cadena es igual a “false” y true si la cadena es igual a “true”.
		 */
		// Imprimimos los resultados.
		System.out.println(Parse.parseToBoolean(1));
		System.out.println(Parse.parseToBoolean("true"));
	}
}
