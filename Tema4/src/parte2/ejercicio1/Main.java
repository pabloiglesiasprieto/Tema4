package parte2.ejercicio1;

import parte2.ejercicio1.excepciones.WrongDNIException;
import parte2.ejercicio1.excepciones.WrongInitialSaldoException;
import parte2.ejercicio1.excepciones.WrongNombreException;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CuentaCorriente cuenta = null;

		// Mostrar menú inicial
		while (true) {
			System.out.println("===== MENÚ =====");
			System.out.println("1. Crear cuenta corriente");
			System.out.println("2. Ingresar dinero");
			System.out.println("3. Sacar dinero");
			System.out.println("4. Mostrar información de la cuenta");
			System.out.println("0. Salir");
			System.out.print("Seleccione una opción: ");

			int opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:
				// Crear cuenta corriente
				try {
					System.out.print("Ingrese el DNI del titular: ");
					String dni = scanner.nextLine();

					System.out.print("Ingrese el nombre del titular: ");
					String nombre = scanner.nextLine();

					System.out.print("Ingrese el saldo inicial: ");
					double saldo = scanner.nextDouble();
					scanner.nextLine(); // Limpiar el buffer

					System.out.print("Ingrese la nacionalidad (ESPAÑOLA/EXTRANJERA): ");
					String nacionalidad = scanner.nextLine().toUpperCase();

					cuenta = new CuentaCorriente(dni, nombre, saldo, nacionalidad);
					System.out.println("Cuenta creada con éxito.");
				} catch (Exception e) {
					System.out.println("Error al crear la cuenta: " + e.getMessage());
				}
				break;

			case 2:
				// Ingresar dinero
				if (cuenta == null) {
					System.out.println("Primero debe crear una cuenta.");
				} else {
					System.out.print("Ingrese la cantidad a ingresar: ");
					double cantidadIngreso = scanner.nextDouble();
					scanner.nextLine(); // Limpiar el buffer

					if (cuenta.ingresarDinero(cantidadIngreso)) {
						System.out.println("Ingreso realizado correctamente.");
					} else {
						System.out.println("Cantidad inválida.");
					}
				}
				break;

			case 3:
				// Sacar dinero
				if (cuenta == null) {
					System.out.println("Primero debe crear una cuenta.");
				} else {
					System.out.print("Ingrese la cantidad a sacar: ");
					double cantidadRetiro = scanner.nextDouble();
					scanner.nextLine(); // Limpiar el buffer

					if (cuenta.sacarDinero(cantidadRetiro)) {
						System.out.println("Retiro realizado correctamente.");
					} else {
						System.out.println("No hay suficiente saldo o cantidad inválida.");
					}
				}
				break;

			case 4:
				// Mostrar información de la cuenta
				if (cuenta == null) {
					System.out.println("Primero debe crear una cuenta.");
				} else {
					System.out.println(cuenta);
				}
				break;

			case 0:
				// Salir
				System.out.println("Saliendo del programa...");
				scanner.close();
				return;

			default:
				System.out.println("Opción no válida. Intente de nuevo.");
			}

			System.out.println(); // Línea en blanco para mejorar la presentación
		}
	}
}
