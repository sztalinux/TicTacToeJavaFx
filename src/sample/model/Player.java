package sample.model;

/**
 * Created by marcin on 15.01.2018.
 */
public class Player {
    public enum Symbol {
        X,
        O,
    }

    private Symbol symbol;


    public Player(Symbol symbol) {
        this.symbol = symbol;
    }


    public Symbol getSymbol() {
        return symbol;
    }
}
