public class Tile {

    private int[] playersOnTile;
    private Scene sceneOnTile;
    private CastingOffice castOffice;

    public Tile() {

    }

    public Tile(Scene sceneOnTile) {
        this.sceneOnTile = sceneOnTile;
    }

    public Tile(Scene sceneOnTile, CastingOffice castOffice) {
        this.sceneOnTile = sceneOnTile;
        this.castOffice = castOffice;
    }

    public int[] getPlayersOnTile() {
        return playersOnTile;
    }

    public Scene getSceneOnTile() {
        return sceneOnTile;
    }
    
}
