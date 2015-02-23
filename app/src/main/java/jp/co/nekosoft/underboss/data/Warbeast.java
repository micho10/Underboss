package jp.co.nekosoft.underboss.data;

/**
 * Created by micho on 23/02/15.
 */
public class Warbeast {

    private final int id;

    private final String name;

    private final int cost;

    private final FieldAllowance fieldAllowance;

    private final String faction;


    public Warbeast(int id, String name, int cost, FieldAllowance fa, String faction) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.fieldAllowance = fa;
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

    public FieldAllowance getFieldAllowance() {
        return fieldAllowance;
    }

    public String getFaction() {
        return faction;
    }

}
