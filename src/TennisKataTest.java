import junit.framework.Assert;
import org.junit.Test;

public class TennisKataTest {

    @Test
	public final void testTruth() {
	Assert.assertEquals(true, true);
    }

    @Test
    public final void testWhenGameStartEveryScoreAreZero()
    {
	Game g = new Game();
	Assert.assertEquals(g.scorePlayer1(), 0);
	Assert.assertEquals(g.scorePlayer2(), 0);
    }
    @Test
    public final void testWhenPlayer1WinFirstPointScoreIs15(){
	Game g = new Game();
       
	g.playerWinsPoint(1);       
	Assert.assertEquals(g.scorePlayer1(), 15);
    }

    @Test
    public final void testWhenPlayer2WinFirstPointScoreIs15(){
	Game g = new Game();
       
	g.playerWinsPoint(2);       
	Assert.assertEquals(g.scorePlayer2(), 15);
    }
    
    @Test
    public final void testWhenPlayer1Win2FirstPointsInARow(){
	Game g = new Game();
       
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       
	Assert.assertEquals(g.scorePlayer1(), 30);	
    }

    @Test
    public final void testWhenPlayer1Win3FirstPointsInARow(){
	Game g = new Game();
       
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       	
    	Assert.assertEquals(g.scorePlayer1(), 40);	
    }

    @Test
    public final void testWhenPlayer2Win3FirstPointsInARow(){
	Game g = new Game();
       
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);       	
    	Assert.assertEquals(g.scorePlayer2(), 40);	
    }

    @Test
    public final void testWhenPlayer1WinRacleeGame(){
	Game g = new Game();
       
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       		
	g.playerWinsPoint(1);       	
    	Assert.assertEquals(g.winPlayer1(), true);	
    }
    @Test
    public final void testWhenPlayer2LostRacleeGame(){
	Game g = new Game();
       
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       		
	g.playerWinsPoint(1);       	
    	Assert.assertEquals(g.winPlayer2(),false);	
    }
    @Test
    public final void testWhenPlayer1LostRacleeGame(){
	Game g = new Game();
       
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);       		
	g.playerWinsPoint(2);       	
    	Assert.assertEquals(g.winPlayer1(),false);	
    }
    @Test
    public final void testWhenPlayer2WinRacleeGame(){
	Game g = new Game();
       
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);       		
	g.playerWinsPoint(2);       	
    	Assert.assertEquals(g.winPlayer2(), true);	
    }    

    @Test
    public final void testWhenDeuce(){
	Game g = new Game();
       
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);     
	g.playerWinsPoint(2);
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);
	// 40 A
	
	Assert.assertEquals(g.deuce(), true);	
    }
    @Test
    public final void testPlayer1WinAfterDeuce(){
	Game g = new Game();
       
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);       	
	g.playerWinsPoint(1);     
	g.playerWinsPoint(2);
	g.playerWinsPoint(2);       	
	g.playerWinsPoint(2);
	// 40 A
	g.playerWinsPoint(1);
	g.playerWinsPoint(1);     	
	Assert.assertEquals(g.winPlayer1(), true);	
    }

}
