package parte3.Ejercicio5;

import java.util.Random;

public class NumerosAleatorios {
	// Creamos la primera función.
	public static void imprimirNumerosAleatorios(int a) {
		// Importamos random
		Random rnd = new Random();

		// Bucle para generar valores.
		for (int i = 0; i < a; i++) {

			// Imprimimos valor aleatorio entre 0 y 1.
			System.out.print(rnd.nextInt(0, 2) + " ");
		}
	}

	// Creamos la segunda función.
	public static void imprimirNumerosAleatorios(int a, int b) {
		// Importamos random
		Random rnd = new Random();

		// Bucle para generar valores.
		for (int i = 0; i < a; i++) {

			// Imprimimos valor aleatorio comprendido entre 0 y b.
			System.out.print(rnd.nextInt(0, b + 1) + " ");
		}
	}

	// Creamos la tercera función.
	public static void imprimirNumerosAleatorios(int a, int b, int c) {
		// Importamos random
		Random rnd = new Random();

		// Bucle para generar valores.
		for (int i = 0; i < a; i++) {

			// Imprimimos valor aleatorio entre 0 y 1.
			System.out.print(rnd.nextInt(b, c + 1) + " ");
		}
	}
}
