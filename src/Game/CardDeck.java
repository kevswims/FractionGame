package Game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mtonsman on 11/22/15.
 */
public class CardDeck {
    // vars
    private List<Card> cards;

    // ctor
    public CardDeck(String cardsFile) {
        // load card file
        cards = new ArrayList<>();
    }

    // methods

    public void drawCard() {
        // draw stuff
    }

    public List<Card> getCards() {
        return cards;
    }
}
