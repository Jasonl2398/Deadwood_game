import java.util.Random;

public class Player {
    
    private int[] currentTile;
    private int actorRank;
    private int moneyBalance;
    private int creditBalance;
    private int practiceChipBalance;
    private int totalScore;
    private String playerName;

    public Player() {
        
    }

    public int[] getCurrentTile() {
        return currentTile;
    }

    public int getActorRank() {
        return actorRank;
    }

    public void setActorRank(int actorRank) {
        this.actorRank = actorRank;
    }

    public int getMoneyBalance() {
        return moneyBalance;
    }

    public void updateMoneyBalance(int money) {
        moneyBalance += money;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public void updateCreditBalance(int credit) {
        creditBalance += credit;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getPracticeChipBalance() {
        return practiceChipBalance;
    }

    public void updatePracChipBal(int practiceChips) {
        practiceChipBalance += practiceChips;
    }

    public int[] move() {
        int[] moveInput = new int[2];
        return moveInput;
    }

    public int rehearse(int[] currentTile, Random gameDie) {
        return gameDie.nextInt(6) + 1;
    }

    public void takeRole(int[] currentTile) {

    }

    public int performRole(int[] currentTile, Random gameDie) {
        return gameDie.nextInt(6) + 1;
    }
}
