public class Board {
    private Tile[][] boardTiles;
    private Scene[] sceneList;

    public Board(Tile[][] boardTiles) {
        this.boardTiles = boardTiles;
    }

    public Tile[][] shuffleTiles(Tile[][] boardTiles,Scene[] sceneList) {
        Tile[][] temp = new Tile[3][4];
        return temp;
    }

    public void updateBoard(Tile[][] boardTiles) {

    }

    public Tile[][] getBoardTiles() {
        return boardTiles;
    }

    public Scene[] getScenes() {
        return sceneList;
    }
}
