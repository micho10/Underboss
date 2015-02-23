package jp.co.nekosoft.underboss.data;

/**
 * Created by micho on 23/02/15.
 */
public class Unit {

    private final int id;

    private final String name;

    private final FieldAllowance fieldAllowance;

    private final int minSize;

    private final int maxSize;

    private final String faction;


    public Unit(int id, String name, FieldAllowance fa, int minSize, int maxSize, String faction) {
        this. id = id;
        this.name = name;
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
