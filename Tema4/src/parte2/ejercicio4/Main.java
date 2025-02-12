package parte2.ejercicio4;

public class Main {
	public static void main(String[] args) {
		/*
		 * Crea la clase Pizza con los siguientes atributos: código: valor numérico
		 * diferente para cada pizza. tamaño: los únicos valores que puede tener son
		 * Mediana o Familiar. tipo: los únicos valores que puede tener son Margarita,
		 * CuatroQuesos o Funghi. estado: los posibles valores son Pedida o Servida.
		 * 
		 * 
		 * Siempre que se crea una pizza nueva, su estado es “Pedida”. Crea un
		 * constructor con todos los parámetros menos el estado.
		 * 
		 * Añade también los getter y setter para los atributos que veas más apropiados.
		 * 
		 * Añade el método toString de forma que cada vez que imprimamos una pizza se
		 * muestre de la siguiente manera: 203949: Mediana - Funghi - Pedida
		 * 
		 * Añade también el método equals, de forma que dos pizzas son iguales si tienen
		 * el mismo código.
		 */
		// Creamos 3 pizzas.
		Pizza p1 = new Pizza(1, "FAMILIAR", "FUNGHI");
		Pizza p2 = new Pizza(1, "MEDIANA", "MARGARITA");
		Pizza p3 = new Pizza(3, "MEDIANA", "cuatroquesos");

		// Imprimimos las pizzas.
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		// Comparamos las pizzas.
		System.out.println(p1.equals(p2) ? "Son iguales" : "No son iguales");
		System.out.println(p1.equals(p3) ? "Son iguales" : "No son iguales");
	}
}
