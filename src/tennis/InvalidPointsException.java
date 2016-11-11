package tennis;

public class InvalidPointsException extends Exception {

	private String message;
		
		public InvalidPointsException() {
			message = "Punti non validi.";
		}
		
		public InvalidPointsException(String s) {
			message = s;
			System.exit(0);
		}
		
		public String getMessage() {
			return message;
		}
}
