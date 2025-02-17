package parte3.Ejercicio6;

public class FuncionesMatematicas {

	public static int sumatorio(int num) {
		int suma = 0;
		if (num == 0) {

		} else {
			suma = num + sumatorio(num - 1);
		}
		return suma;
	}

	public static double potencia(double num, int potencia) {
		double resultado = 0;
		if (potencia == 0) {
			resultado = 1;
		} else {
			resultado = num * potencia(num, potencia - 1);
		}
		return resultado;
	}

	public static int fibonacci(int num) {
		int resultado = 0;
		if (num == 0) {
			resultado = 0;
		} else if (num == 1) {
			resultado = 1;
		} else {
			resultado = fibonacci(num - 1) + fibonacci(num - 2);
		}
		return resultado;

	}

}
