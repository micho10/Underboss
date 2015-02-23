package jp.co.nekosoft.underboss.data;

/**
 * Created by micho on 23/02/15.
 */
public class Solo {

    private final int id;

    private final String name;

    private final FieldAllowance fieldAllowance;

    private final String faction;


    public Solo(int id, String name, FieldAllowance fa, String faction) {
        this.id = id;
        this.name = name;
        this.fieldAllowance = fa;
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

    public String getFaction() {
        return faction;
    }

}
