package jp.co.nekosoft.underboss.data;

import java.util.List;

/**
 * Bean class representing an army list.
 *
 * @author micho
 *
 */
public class ArmyList {

    /* Representative name given to the army list */
    private String name;

    /* Game system */
    private String gameSystem;

    /* Points value of the list (excluding Warjack/Warbeast points granted by the Warcaster/Warlock) */
    private int pointsValue;

    /* Faction of the army */
    private String faction;

    /* Mercenary Contract, Minion Pact or Theme Force */
    private String subFaction;

    /* Units forming the army list */
    private List<UnitEntry> armyList;


    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getGameSystem() { return gameSystem; }

    public void setGameSystem(String gameSystem) { this.gameSystem = gameSystem; }

    public int getPointsValue() { return pointsValue; }

    public void setPointsValue(int pointsValue) { this.pointsValue = pointsValue; }

    public String getFaction() { return faction; }

    public void setFaction(String faction) { this.faction = faction; }

    public String getSubFaction() { return subFaction; }

    public void setSubFaction(String subFaction) { this.subFaction = subFaction; }

    public List<UnitEntry> getArmyList() { return armyList; }

    public void setArmyList(List<UnitEntry> armyList) { this.armyList = armyList; }


    private class UnitEntry {

        int amount;
        String unitType;

    }
}
