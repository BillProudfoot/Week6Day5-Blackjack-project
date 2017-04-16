import card_game.*;

import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class WinCheckerTest {

  Player player1;
  Player player2;
  Card card1;
  Card card2;

  @Before
  public void before(){
    player1 = new Player("Keith");
    player2 = new Player("Craig");
    card1 = new Card(2, Suit.Clubs);
    card2 = new Card(3, Suit.Spades);
    player1.setHand(card1);
    player2.setHand(card2);
  }

@Test
public void whoWins(){
  assertEquals("Craig wins", player1.hand());
}

}