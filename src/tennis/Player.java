package tennis;

public class Player {

	private String name;
	private int points;
	
	
	public Player(int x) {
		
		name = "Player " + x;
		points = 0;
	}
	
	public Player(String s) {
		name = s;
		points = 0;
	}
	public void score() {
		points++;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getPoints() {
		return points;
	}
}
