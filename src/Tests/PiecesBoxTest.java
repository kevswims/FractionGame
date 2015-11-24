package Tests;

import Game.Piece;
import Game.PiecesBox;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mtonsman on 11/22/15.
 */
public class PiecesBoxTest {

    PiecesBox pieces;

    @Before
    public void setUp() throws Exception {
        pieces = new PiecesBox("piecesTest.txt");
    }

    @Test
    public void testLoadCards() {
        // test correct number of cards are loaded
        assertEquals(5, pieces.getPieces().size());

        // test that it contains the correct values
        Piece testPiece = new Piece(1, 2);
        assertTrue(pieces.getPieces().contains(testPiece));
        testPiece = new Piece(3, 4);
        assertTrue(pieces.getPieces().contains(testPiece));
        testPiece = new Piece(2, 3);
        assertTrue(pieces.getPieces().contains(testPiece));
    }
}