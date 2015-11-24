package Game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mtonsman on 11/22/15.
 */
public class PiecesBox {
    // vars
    private List<Piece> pieces;

    // ctor
    public PiecesBox(String piecesFile) {
        // read config files?
        pieces = new ArrayList<>();
    }

    // methods


    public List<Piece> getPieces() {
        return pieces;
    }
}
