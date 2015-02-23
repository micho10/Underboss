package jp.co.nekosoft.underboss.data;

/**
 * Created by micho on 23/02/15.
 */
public class BattleEngine {

    private final int id;

    private final String name;

    private final int cost;

    private final String faction;


    public BattleEngine(int id, String name, int cost, String faction)   {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.faction = faction;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public String getFaction() {
        return faction;
    }

}
