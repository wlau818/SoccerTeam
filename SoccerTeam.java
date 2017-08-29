
public class SoccerTeam {
	
	private int wins;
	private int losses;
	private int ties;
	private int points;
	private static int numOfGames;
	private static int numOfGoals;
	
	public SoccerTeam(int wins, int losses, int ties) {
		this.wins = wins;
		this.losses = losses;
		this.ties = ties;
	}
	
	public static void startTournament() {
		numOfGames = 0;
		numOfGoals = 0;
	}
	
	public void played(SoccerTeam opponent, int myScore, int opponentScore) {
		numOfGames ++;
		numOfGoals = numOfGoals + myScore + opponentScore;
		if (myScore > opponentScore) {
			wins ++;	
			opponent.losses ++;
		} else if (myScore == opponentScore) {
			ties ++;
			opponent.ties ++;
		} else {
			opponent.wins ++;
			losses ++;
		}
	}
	
	public static int numOfGames() {
		return numOfGames;
	}
	
	public static int numOfGoals() {
		return numOfGoals;
	}
	
	public int currentPoints() {
		points = (wins * 3) + ties;
		return points;
	}
	
	public int reset() {
		return points = 0;
	}

}
