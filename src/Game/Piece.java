package Game;

/**
 * Created by mtonsman on 11/22/15.
 */
public class Piece {
    // vars

    private int numerator;
    private int denominator;

    // ctor
    public Piece(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // methods

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

}
