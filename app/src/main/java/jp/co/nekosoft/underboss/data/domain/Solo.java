package jp.co.nekosoft.underboss.data.domain;

import jp.co.nekosoft.underboss.data.FieldAllowance;

/**
 * Bean to represent a Solo. These are characters.
 *
 * Created by micho on 23/02/15.
 */
public class Solo {

    /* Unique Id */
    private final int id;

    /* Name of the Solo */
    private final String name;

    /* Cost in points to include it in an army */
    private final int cost;

    /* Some solos have access to special options for an additional cost */
    private final int specialCost;

    /* Limitation to the maximum number of Solos like this that can be included in an army */
    private final FieldAllowance fieldAllowance;

    /* Faction this Solo belongs to */
    private final String faction;


    /**
     * Constructor
     *
     * @param id Unique Id
     * @param name Name of the Solo
     * @param cost Cost in points to include it in an army
     * @param specialCost Some solos have access to special options for an additional cost
     * @param fa Limitation to the maximum number of Solos like this which can be included in an army
     * @param faction Faction this Solo belongs to
     */
    public Solo(int id, String name, int cost, int specialCost, FieldAllowance fa, String faction) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.specialCost = specialCost;
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

    public int getSpecialCost() {
        return specialCost;
    }

    public FieldAllowance getFieldAllowance() {
        return fieldAllowance;
    }

    public String getFaction() {
        return faction;
    }

}
