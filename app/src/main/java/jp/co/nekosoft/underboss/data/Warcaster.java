package jp.co.nekosoft.underboss.data;

/**
 * Created by micho on 20/02/15.
 */
public class Warcaster {

    private final String id;

    private final String name;

    private final String faction;

    private final int warjackPoints;


    public Warcaster(String id, String name, String faction, int warjackPoints) {
        this.id = id;
        this.name = name;
        this.faction = faction;
        this.warjackPoints = warjackPoints;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFaction() {
        return faction;
    }

    public int getWarjackPoints() {
        return warjackPoints;
    }
}
