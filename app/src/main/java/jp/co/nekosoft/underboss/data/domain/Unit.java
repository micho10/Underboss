package jp.co.nekosoft.underboss.data.domain;

import jp.co.nekosoft.underboss.data.FieldAllowance;

/**
 * Bean to represent a Unit
 *
 * Created by micho on 23/02/15.
 */
public class Unit {

    /* Unique Id */
    private final int id;

    /* Name of the Unit */
    private final String name;

    /* Cost in points to include a minimum sized Unit in an army */
    private final int minCost;

    /* Cost in points to include a maximum sized Unit in an army */
    private final int maxCost;

    /* Limitation to the maximum number of Units like this that can be included in an army */
    private final FieldAllowance fieldAllowance;

    /* Number of models composing a minimum sized Unit */
    private final int minSize;

    /* Number of models composing a maximum sized Unit */
    private final int maxSize;

    /* Faction this Unit belongs to */
    private final String faction;


    /**
     * Constructor
     *
     * @param id Unique Id
     * @param name Name of the Unit
     * @param minCost Cost in points to include a minimum sized Unit in an army
     * @param maxCost Cost in points to include a maximum sized Unit in an army
     * @param fa Limitation to the maximum number of Units like this that can be included in an army
     * @param minSize Number of models composing a minimum sized Unit
     * @param maxSize Number of models composing a maximum sized Unit
     * @param faction Faction this Unit belongs to
     */
    public Unit(int id, String name, int minCost, int maxCost, FieldAllowance fa, int minSize, int maxSize, String faction) {
        this. id = id;
        this.name = name;
        this.minCost = minCost;
        this.maxCost = maxCost;
        this.fieldAllowance = fa;
        this.minSize = minSize;
        this.maxSize = maxSize;
        this.faction = faction;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMinCost() {
        return minCost;
    }

    public int getMaxCost() {
        return maxCost;
    }

    public FieldAllowance getFieldAllowance() {
        return fieldAllowance;
    }

    public int getMinSize() {
        return minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public String getFaction() {
        return faction;
    }

}
