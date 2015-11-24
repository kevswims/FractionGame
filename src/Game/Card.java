package Game;

/**
 * Created by mtonsman on 11/22/15.
 * Currently just a basic skeleton implementation
 */
public class Card {
    // vars
    private int numerator;
    private int denominator;

    // ctor
    public Card(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    // methods

    @Override
    public String toString() {
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
}
