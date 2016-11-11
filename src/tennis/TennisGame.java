package tennis;

public class TennisGame {

	private Player player1, player2;
	private boolean finished;
	
	public TennisGame() {
		
		finished = false;
		player1 = new Player(1);
		player2 = new Player(2);
	}
	
	public String scored(Player p) throws GameAlreadyFinishedException
	{
		if (this.finished)
			throw new GameAlreadyFinishedException();
		p.score();
		return printScore();
	}
	
	private String printScore()
	{
		boolean advantages = false;
		if (player1.getPoints() >= 3 && player2.getPoints() >= 3)
			advantages = true;
		
		
		if (advantages)
			switch (player1.getPoints() - player2.getPoints()) {
			case 0:
				return ("Score: Deuce");
			case 1:
				return ("Score: Advantage - 40");
			case -1:
				return ("Score: 40 - Advantage");
			case 2:
				finished = true;
				return (player1.getName() + " wins!");
			case -2:
				finished = true;
				return (player2.getName() + " wins!");
			default:
				return ("Error");
		}
		else
			if (player1.getPoints() >= 4) {
				finished = true;
				return (player1.getName() + " wins!"); }
			else if (player2.getPoints() >= 4) {
				finished = true;
				return (player2.getName() + " wins!"); }
			else
				try {
					return ("Score: " + this.toTennisPoints(player1.getPoints()) + " - " + this.toTennisPoints(player2.getPoints()));
				} catch (InvalidPointsException e) {
					return (e.getMessage());
				}
	}
	
	private String toTennisPoints(int x)  throws InvalidPointsException
	{
		switch (x) {
		case 0: return "Love";
		case 1: return "15";
		case 2: return "30";
		case 3: return "40";
		default: throw new InvalidPointsException();
		}
	}
	
	public Player getPlayer(int x) throws InvalidPlayerException
	{
		if (x == 1) {
			return player1;
		} else if (x == 2) {
			return player2;
		} else
			throw new InvalidPlayerException();
	}

	
}
