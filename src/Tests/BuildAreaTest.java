package Tests;

import Game.BuildArea;
import Game.Card;
import Game.Piece;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by mtonsman on 11/22/15.
 */
public class BuildAreaTest {

    private static BuildArea buildArea;
    private static Card card;

    @Before
    public void setUp() throws Exception {
        buildArea = new BuildArea();
    }

    @Test
    public void testCheckIfValid() {
        // test that 1/4 and 1/4 is valid for 1/2
        List<Piece> pieces = new ArrayList<>();
        pieces.add(new Piece(1, 4));
        pieces.add(new Piece(1, 4));
        buildArea.setSelectedPieces(pieces);
        card = new Card(1, 2);

        assertTrue(buildArea.checkIfValid(card));
    }
}