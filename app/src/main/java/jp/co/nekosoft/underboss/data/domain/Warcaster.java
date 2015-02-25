package jp.co.nekosoft.underboss.data.domain;

import jp.co.nekosoft.underboss.data.FieldAllowance;

/**
 * Bean to represent a Warcaster
 *
 * Created by micho on 20/02/15.
 */
public class Warcaster {

    /* Unique Id */
    private final String id;

    /* Name of the Warcaster */
    private final String name;

    /* Faction this Warcaster belongs to */
    private final String faction;

    /* Additional points provided by the Warcaster to purchase Warjacks for his Battlegroup */
    private final int warjackPoints;

    /* Limitation to the maximum number of Warcasters like this that can be included in an army.
     * All Warcasters are characters (FA = C) */
    private final FieldAllowance fieldAllowance = FieldAllowance.CHARACTER;


    /**
     * Constructor
     *
     * @param id Unique Id
     * @param name Name of the Warcaster
     * @param faction Faction this Warcaster belongs to
     * @param warjackPoints Additional points provided by the Warcaster to purchase Warjacks for
     *                      his Battlegroup
     */
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

    public FieldAllowance getFieldAllowance() {
        return fieldAllowance;
    }

}
