package parte3.Ejercicio6;

public class Main {
	public static void main(String[] args) {
		/*
		 * Crea una clase denominada FuncionesMatematicas.
		 * 
		 * En esta clase se definirán las siguientes funciones estáticas, que deben ser
		 * implementadas de forma recursiva: int sumatorio(int numero): Devuelve la suma
		 * de todos los números entre 1 y n.
		 * 
		 * double potencia(double a, int n): Esta función devuelve el resultado de an.
		 * 
		 * int serieFibonacci(int numero): A esta función se le pasará un número entero
		 * y nos devolverá el término correspondiente de la serie de Fibonacci.
		 * 
		 * El enésimo valor de la serie de Fibonacci se calcula sumando los dos valores
		 * anteriores de la serie. Es decir: fibonacci(n) = fibonacci(n-1) +
		 * fibonacci(n-2) fibonacci(0) = 1 fibonacci(1) = 1
		 */
		System.out.println(FuncionesMatematicas.sumatorio(3));
		System.out.println(FuncionesMatematicas.potencia(10, 4));
		System.out.println(FuncionesMatematicas.fibonacci(6));
	}
}
