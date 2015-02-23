package jp.co.nekosoft.underboss.data;

/**
 * Created by micho on 23/02/15.
 */
public class Warlock {

    private final String id;

    private final String name;

    private final String faction;

    private final int warbeastPoints;


    public Warlock(String id, String name, String faction, int warbeastPoints) {
        this.id = id;
        this.name = name;
        this.faction = faction;
        this.warbeastPoints = warbeastPoints;
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

    public int getWarbeastPoints() {
        return warbeastPoints;
    }

}
