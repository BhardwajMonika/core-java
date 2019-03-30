public class DownCasting
{
	/*Downcasting is used when u want to perform some specific operation in a generalised
	method depending upon subtype of system */
	
	public static void main(String s[])
	{
		//upcasting
		Game game2 = new Cricket();
		
		//Error
		// Chess chess = (Chess) game2;
		//Solution:
		
		if(game2 instanceof Cricket)
		{
			Cricket cricket = (Cricket) game2;
			game2.play();
			game2.noOfPlayers();
			game2.winners("B");
		}
		else if(game2 instanceof Chess)
		{
			Chess chess = (Chess) game2;
			game2.play();
			game2.noOfPlayers();
			game2.winners("B");
		}
	}
}