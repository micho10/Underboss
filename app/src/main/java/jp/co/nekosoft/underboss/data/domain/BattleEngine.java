package jp.co.nekosoft.underboss.data.domain;

import jp.co.nekosoft.underboss.data.FieldAllowance;

/**
 * Bean to represent a Battle Engine. These are models in a huge base (5").
 *
 * Created by micho on 23/02/15.
 */
public class BattleEngine {

    /* Unique Id */
    private final int id;

    /* Name of the Battle Engine */
    private final String name;

    /* Cost in points to include it in an army */
    private final int cost;

    /* Limitation to the maximum number of Battle Engines like this that can be included in an army */
    private final FieldAllowance fieldAllowance;

    /* Faction this Battle Engine belongs to */
    private final String faction;


    /**
     * Constructor
     *
     * @param id Unique Id
     * @param name Name of the Battle Engine
     * @param cost Cost in points to include it in an army
     * @param fa Limitation to the maximum number of Battle Engines like this that can be included in an army
     * @param faction Faction the Battle Engine belongs to
     */
    public BattleEngine(int id, String name, int cost, FieldAllowance fa, String faction)   {
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
