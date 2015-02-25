package jp.co.nekosoft.underboss.data.domain;

import jp.co.nekosoft.underboss.data.FieldAllowance;

/**
 * Bean to represent a Warbeast
 *
 * Created by micho on 23/02/15.
 */
public class Warbeast {

    /* Unique Id */
    private final int id;

    /* Name of the Warbeast */
    private final String name;

    /* Type of Warbeast (Light, Heavy...) */
    private final String type;

    /* Cost in points to include it in an army */
    private final int cost;

    /* Limitation to the maximum number of Warbeasts like this that can be included in an army */
    private final FieldAllowance fieldAllowance;

    /* Faction this Warbeast belongs to */
    private final String faction;


    /**
     * Constructor
     *
     * @param id Unique Id
     * @param name Name of the Unit
     * @param type Type of Warbeast
     * @param cost Cost in points to include it in an army
     * @param fa Limitation to the maximum number of Warbeasts like this that can be included in an army
     * @param faction Faction this Warbeast belongs to
     */
    public Warbeast(int id, String name, String type, int cost, FieldAllowance fa, String faction) {
        this.id = id;
        this.name = name;
        this.type = type;
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

    public String getType() {
        return type;
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
