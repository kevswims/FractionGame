package Tests;

import Game.Card;
import Game.CardDeck;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtonsman on 11/22/15.
 */
//^lol wat a loser
public class CardDeckTest {

    private static CardDeck deck;
    @BeforeClass
    public static void setUp() throws Exception {
        deck = new CardDeck("cardsTest.txt");
    }

    @Test
    public void testLoadCards() {
        // test correct number of cards are loaded
        assertEquals(5, deck.getCards().size());

        // test that it contains the correct values
        Card testCard = new Card(1, 2);
        assertTrue(deck.getCards().contains(testCard));
        testCard = new Card(3, 4);
        assertTrue(deck.getCards().contains(testCard));
        testCard = new Card(2, 3);
        assertTrue(deck.getCards().contains(testCard));
    }
}