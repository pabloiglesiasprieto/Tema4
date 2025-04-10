package parte2.ejercicio1.excepciones;

public class WrongNombreException extends Exception {
	@Override
	public String toString() {
		return "El Nombre es invalido.";
	}

	@Override
	public String getMessage() {
		return "El Nombre es invalido.";
	}
}
