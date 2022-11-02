public class Gamemodel {

    private Player[] playerList;
    private int dayCounter;
    private Board board;

    public Gamemodel(Player[] playerList, Board board) {

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

    
}
