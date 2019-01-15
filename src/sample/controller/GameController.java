package sample.controller;

import sample.exception.FieldOccupiedException;
import sample.exception.InvalidCoordinatesException;
import sample.model.Board;
import sample.model.Player;

public class GameController {

    Player px = new Player(Player.Symbol.X);
    Player po = new Player(Player.Symbol.O);

    Board board = new Board(3);

    Game game = new Game(px, po, board);

        while(true) {
        board.print();

        if(game.isFinished()) {
            System.out.println("Koniec gry");
            break;
        }

        Player currentPlayer = game.getCurrentPlayer();


        try {
            game.move(x, y);
        } catch (InvalidCoordinatesException e) {
            System.out.println("Złe współrzędne!");
        } catch (FieldOccupiedException e) {
            System.out.println("Pole jest już zajęte");
        }
}
