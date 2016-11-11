package tennis;

public class InvalidPlayerException extends Exception {

	private String message;
	
	public InvalidPlayerException() {
		message = "Giocatore non valido.";
	}
	
	public InvalidPlayerException(String s) {
		message = s;
		System.exit(0);
	}
	
	public String getMessage() {
		return message;
	}
}
