
public class SoccerTester {
	
	public static void main(String[] args) {
		SoccerTeam team1 = new SoccerTeam(0, 0, 0);
		SoccerTeam team2 = new SoccerTeam(0, 0, 0);
		SoccerTeam team3 = new SoccerTeam(0, 0, 0);
		SoccerTeam team4 = new SoccerTeam(0, 0, 0);
		
		SoccerTeam.startTournament();
		
		team1.played(team2, 5, 4);
		team3.played(team4, 2, 8);
		team2.played(team3, 5, 5);
		team1.played(team4, 6, 3);
		
		System.out.println("Tournament 1");
		System.out.println("Total number of games: " + SoccerTeam.numOfGames());
		System.out.println("Total number of goals: " + SoccerTeam.numOfGoals());
		
		System.out.println("");
		System.out.println("Team 1");
		System.out.println("Number of points: " + team1.currentPoints());
		
		System.out.println("");
		System.out.println("Team 2");
		System.out.println("Number of points: " + team2.currentPoints());
		
		System.out.println("");
		System.out.println("Team 3");
		System.out.println("Number of points: " + team3.currentPoints());
		
		System.out.println("");
		System.out.println("Team 4");
		System.out.println("Number of points: " + team4.currentPoints());
		System.out.println("");
		
		team1.reset();
		team2.reset();
		team3.reset();
		team4.reset();
		
		SoccerTeam.startTournament();
		
		team1.played(team2, 7, 8);
		team3.played(team4, 3, 3);
		team2.played(team4, 9, 6);
		team1.played(team3, 4, 2);
		
		System.out.println("Tournament 2");
		System.out.println("Total number of games: " + SoccerTeam.numOfGames());
		System.out.println("Total number of goals: " + SoccerTeam.numOfGoals());
		
		System.out.println("");
		System.out.println("Team 1");
		System.out.println("Number of points: " + team1.currentPoints());
		
		System.out.println("");
		System.out.println("Team 2");
		System.out.println("Number of points: " + team2.currentPoints());
		
		System.out.println("");
		System.out.println("Team 3");
		System.out.println("Number of points: " + team3.currentPoints());
		
		System.out.println("");
		System.out.println("Team 4");
		System.out.println("Number of points: " + team4.currentPoints());
		
		team1.reset();
		team2.reset();
		team3.reset();
		team4.reset();
	}

}
