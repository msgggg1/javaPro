package scorer;

public class Player {
	private String name;
	private int points = 0;
	private int games = 0;
	private int setpoints = 0;
		
	
	public void winPoint() {
		this.points++ ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getGames() {
		return games;
	}

	public void setGames(int games) {
		this.games = games;
	}

	public void winGame() {
		this.games ++;
		this.points = 0;
		
	}
	
	public void winSet() {
		this.setpoints ++;
	}

	public int getSetpoints() {
		return setpoints;
	}

	public void setSetpoints(int setpoints) {
		this.setpoints = setpoints;
	}

}
