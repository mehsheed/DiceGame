package icas;

public class Game {
	private Player player;
	private Die die1;
	private Die die2;
	private int val1,val2;
	public Game()
	{
		this.player = new Player("random player");
	}
	
	public Game (Player player)
	{
		this.player = player;
		
	}
	public void playGame()
	{
		die1 = new Die();
		die2 = new Die();
		
		die1.rollDie();
		die2.rollDie();
		val1 = die1.getFvalue();
		val2 = die2.getFvalue();
		
		
	}
	public String getScore()
	{
		int total = val1 + val2;
		return new String ("Player Name :"+player.getPlayerName()+", Score:"+"("+val1+","+val2+") Total :"+total);
		
	}

}
