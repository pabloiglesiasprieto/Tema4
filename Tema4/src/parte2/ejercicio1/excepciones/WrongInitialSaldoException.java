package parte2.ejercicio1.excepciones;

public class WrongInitialSaldoException extends Exception {
	@Override
	public String toString() {
		return "El saldo es invalido.";
	}

	@Override
	public String getMessage() {
		return "El saldo es invalido.";
	}
}
