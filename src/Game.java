public class Game
{
    private int scorePlayer[];
   
    
    public Game()
    {
	scorePlayer = new int[2];
    }

    public int scorePlayer1()
    {
	return scorePlayer[0];
    }

    public int scorePlayer2()
    {
	return scorePlayer[1];
    }
    public void playerWinsPoint(int playerNumber){
	
	if (scorePlayer[playerNumber-1]<30)
	    {
		scorePlayer[playerNumber-1] += 15;
	    }
	else
	    {
		scorePlayer[playerNumber-1] = 40;
	    }
    }

    public boolean winPlayer1(){ 
	return scorePlayer[0] == 40;}
    public boolean winPlayer2(){ 
	return scorePlayer[1] == 40;
    }
    public boolean deuce(){return true;}
}
