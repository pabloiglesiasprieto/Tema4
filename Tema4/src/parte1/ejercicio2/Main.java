package parte1.ejercicio2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// Declaramos los objetos.
		Persona per1;
		Persona per2;

		// Declaramos la variable que almacenará el nombre de la persona.
		String nombre;

		// Declaramos la variable que almacenará el apellido de la persona
		String apellidos;

		// Declaramos la variable que almacenará la edad.
		int edad;

		// Declaramos la variable que almacenará el dni.
		String dni;

		// Creamos un Scanner.
		Scanner sc = new Scanner(System.in);

		// Le preguntamos el nombre.
		System.out.println("Introduce el nombre de la primera persona");

		// Leemos entrada de teclado.
		nombre = sc.nextLine();

		// Le preguntamos el apellido.
		System.out.println("Introduce el apellido de la primera persona");

		// Leemos entrada de teclado.
		apellidos = sc.nextLine();

		// Le preguntamos el DNI.
		System.out.println("Introduce el DNI de la primera persona.");

		// Leemos entrada de teclado.
		dni = sc.nextLine();

		// Le preguntamos la edad.
		System.out.println("Introduce la edad de la primera persona.");

		// Leemos entrada de teclado.
		edad = sc.nextInt();

		// Limpiamos buffer de entrada.
		sc.nextLine();

		// Creamos el objeto.
		per1 = new Persona(dni, nombre, apellidos, edad);

		// Le preguntamos el nombre.
		System.out.println("Introduce el nombre de la segunda persona.");

		// Leemos entrada de teclado.
		nombre = sc.nextLine();

		// Le preguntamos el apellido.
		System.out.println("Introduce el apellido de la segunda persona");

		// Leemos entrada de teclado.
		apellidos = sc.nextLine();

		// Le preguntamos el DNI.
		System.out.println("Introduce el DNI de la segunda persona.");

		// Leemos entrada de teclado.
		dni = sc.nextLine();

		// Le preguntamos la edad.
		System.out.println("Introduce la edad de la segunda persona.");

		// Leemos entrada de teclado.
		edad = sc.nextInt();

		// Creamos el objeto.
		per2 = new Persona(dni, nombre, apellidos, edad);

		// Imprimimos los objetos.
		System.out.println(per1.getNombre() + " " + per1.getApellidos() + " con DNI " + per1.getDni()
				+ (per1.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));
		System.out.println(per2.getNombre() + " " + per2.getApellidos() + " con DNI " + per2.getDni()
				+ (per2.getEdad() >= 18 ? " es mayor de edad" : " no es mayor de edad"));

		// Cerramos el Scanner.
		sc.close();
	}

}
