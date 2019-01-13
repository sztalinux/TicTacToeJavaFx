package sample.model;

/**
 * Created by marcin on 15.01.2018.
 */
public class Board {
    private Player[][] board;


    public Board(int dimension) {
        this.board = new Player[dimension][dimension];
    }

    public void setField(int x, int y, Player player) {
        this.board[x][y] = player;
    }

    public boolean areCoordinatesValid(int x, int y) {
        return x < 0 || y < 0 ||
                x > this.board.length - 1 || y > this.board.length - 1;
    }

    public boolean isFieldOccupied(int x, int y) {
        return this.board[x][y] != null;
    }

    public boolean isFinished() {
        return isFinishedRows() || isFinishedColumns() ||
                isFinishedAxis1() || isFinishedAxis2();
    }

    private boolean isFinishedRows() {
        for(int i = 0; i < this.board.length; i++) {
            int countX = 0;
            int countO = 0;

            for(int j = 0; j < this.board.length; j++) {
                if(this.board[i][j] != null) {
                    if(this.board[i][j].getSymbol() == Player.Symbol.X) {
                        countX++;
                    } else if(this.board[i][j].getSymbol() == Player.Symbol.O) {
                        countO++;
                    }
                }
            }

            if(countX == this.board.length || countO == this.board.length) {
                return true;
            }
        }
        return false;
    }

    private boolean isFinishedColumns() {
        for(int i = 0; i < this.board.length; i++) {
            int countX = 0;
            int countO = 0;

            for(int j = 0; j < this.board.length; j++) {
                if(this.board[j][i] != null) {
                    if(this.board[j][i].getSymbol() == Player.Symbol.X) {
                        countX++;
                    } else if(this.board[j][i].getSymbol() == Player.Symbol.O) {
                        countO++;
                    }
                }
            }

            if(countX == this.board.length || countO == this.board.length) {
                return true;
            }
        }
        return false;
    }

    private boolean isFinishedAxis1() {
        int countX = 0;
        int countO = 0;
        for(int i = 0; i < this.board.length; i++) {

            if(this.board[i][i] != null) {
                if(this.board[i][i].getSymbol() == Player.Symbol.X) {
                    countX++;
                } else if(this.board[i][i].getSymbol() == Player.Symbol.O) {
                    countO++;
                }
            }

            if(countX == this.board.length || countO == this.board.length) {
                return true;
            }
        }
        return false;
    }

    private boolean isFinishedAxis2() {
        int countX = 0;
        int countO = 0;
        for(int i = 0; i < this.board.length; i++) {

            int j = this.board.length - i - 1;
            if(this.board[i][j] != null) {
                if(this.board[i][j].getSymbol() == Player.Symbol.X) {
                    countX++;
                } else if(this.board[i][j].getSymbol() == Player.Symbol.O) {
                    countO++;
                }
            }

            if(countX == this.board.length || countO == this.board.length) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for(int i = 0; i < this.board.length; i++) {
            for(int j = 0; j < this.board.length; j++) {
                System.out.print(" ");
                if(this.board[i][j] != null) {
                    System.out.print(this.board[i][j].getSymbol());
                } else{
                    System.out.print(" ");
                }
                System.out.print(" ");
                if(j != this.board.length - 1) {
                    System.out.print("|");
                }
            }

            System.out.println();

            if(i != this.board.length - 1) {
                for (int j = 0; j < this.board.length; j++) {
                    System.out.print("---");
                    if (j != this.board.length - 1) {
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }
}
