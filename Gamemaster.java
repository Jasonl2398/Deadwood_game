import java.util.Random;

public class Gamemaster {

    private Random gameDie;

    public Gamemaster() {
        gameDie = new Random();
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
