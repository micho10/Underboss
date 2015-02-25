package jp.co.nekosoft.underboss.data.domain;

import jp.co.nekosoft.underboss.data.FieldAllowance;

/**
 * Bean to represent a Warlock
 *
 * Created by micho on 23/02/15.
 */
public class Warlock {

    /* Unique Id */
    private final String id;

    /* Name of the Warlock */
    private final String name;

    /* Faction this Warlock belongs to */
    private final String faction;

    /* Additional points provided by the Warlock to purchase Warbeasts for his Battlegroup */
    private final int warbeastPoints;

    /* Limitation to the maximum number of Warlocks like this that can be included in an army.
     * All Warlocks are characters (FA = C) */
    private final FieldAllowance fieldAllowance = FieldAllowance.CHARACTER;


    /**
     * Constructor
     *
     * @param id Unique Id
     * @param name Name of the Warlock
     * @param faction Faction this Warlock belongs to
     * @param warbeastPoints Additional points provided by the Warlock to purchase Warbeasts for
     *                       his Battlegroup
     */
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

    public FieldAllowance getFieldAllowance() {
        return fieldAllowance;
    }
}
