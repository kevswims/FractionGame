package Game;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mtonsman on 11/22/15.
 */
public class BuildArea {
    // vars
    private List<Piece> selectedPieces;

    // ctor
    public BuildArea() {
        // no idea what is supposed to go here
        selectedPieces = new ArrayList<>();
    }

    // methods


    public List<Piece> getSelectedPieces() {
        return selectedPieces;
    }

    public Boolean checkIfValid(Card card) {
        return false;
    }

    // for testing only
    public void setSelectedPieces(List<Piece> selectedPieces) {
        this.selectedPieces = selectedPieces;
    }
}
