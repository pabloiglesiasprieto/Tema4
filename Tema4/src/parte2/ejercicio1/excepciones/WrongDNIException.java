package parte2.ejercicio1.excepciones;

public class WrongDNIException extends Exception {

	@Override
	public String toString() {
		return "El dni es invalido.";
	}

	@Override
	public String getMessage() {
		return "El dni es invalido.";
	}
}
