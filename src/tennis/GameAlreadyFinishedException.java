package tennis;

public class GameAlreadyFinishedException extends Exception {

	private String message;
	
	public GameAlreadyFinishedException() {
		message = "Partita già finita.";
	}
	
	public GameAlreadyFinishedException(String s) {
		message = s;
		System.exit(0);
	}
	
	public String getMessage() {
		return message;
	}
}
