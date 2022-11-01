import java.util.Random;

public class Gamemaster {

    private Player[] playerList;
    private int dayCounter;
    private Board board;
    private Random gameDie;

    public Gamemaster(Player[] playerList) {
        this.playerList = playerList;
        gameDie = new Random();
    }

    public Player[] getPlayerList() {
        return playerList;
    }

    public int getDayCounter() {
        return dayCounter;
    }

    public void incrementDayCounter() {
        this.dayCounter++;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    private void nextPlayerTurn(Player[] playerList) {

    }

    private int rollDie() {
        return gameDie.nextInt(6) + 1;
    }

    private boolean checkGameDayOver(int dayCounter) {
        return false;
    }

    private int countScores(Player[] playerList) {
        return 1;
    }

    private void bonusPayout(Player[] playerList,Board board) {

    }
}
