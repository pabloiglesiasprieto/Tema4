package parte1.ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Creamos los objetos.
		Persona per1 = new Persona();
		Persona per2 = new Persona();

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos el nombre.
		System.out.println("Introduce el nombre de la primera persona");

		// Leemos entrada de teclado.
		per1.nombre = sc.nextLine();

		// Le preguntamos el apellido.
		System.out.println("Introduce el apellido de la primera persona");

		// Leemos entrada de teclado.
		per1.apellidos = sc.nextLine();

		// Le preguntamos el DNI.
		System.out.println("Introduce el DNI de la primera persona.");

		// Leemos entrada de teclado.
		per1.dni = sc.nextLine();

		// Le preguntamos la edad.
		System.out.println("Introduce la edad de la primera persona.");

		// Leemos entrada de teclado.
		per1.edad = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Le preguntamos el nombre.
		System.out.println("Introduce el nombre de la segunda persona.");

		// Leemos entrada de teclado.
		per2.nombre = sc.nextLine();

		// Le preguntamos el apellido.
		System.out.println("Introduce el apellido de la segunda persona");

		// Leemos entrada de teclado.
		per2.apellidos = sc.nextLine();

		// Le preguntamos el DNI.
		System.out.println("Introduce el DNI de la segunda persona.");

		// Leemos entrada de teclado.
		per2.dni = sc.nextLine();

		// Le preguntamos la edad.
		System.out.println("Introduce la edad de la segunda persona.");

		// Leemos entrada de teclado.
		per2.edad = sc.nextInt();

		// Imprimimos los objetos.
		System.out.println(per1.nombre + " " + per1.apellidos + " con DNI " + per1.dni
				+ (per1.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));
		System.out.println(per2.nombre + " " + per2.apellidos + " con DNI " + per2.dni
				+ (per2.edad >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		// Cerramos el Scanner.
		sc.close();
	}

}
