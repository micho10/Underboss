package jp.co.nekosoft.underboss.data;

/**
 * Created by micho on 23/02/15.
 */
public enum FieldAllowance {

    UNLIMITED ("U", Integer.MAX_VALUE),
    CHARACTER ("C", 1),
    LIMITED_1 ("1", 1),
    LIMITED_2 ("2", 2),
    LIMITED_3 ("3", 3),
    LIMITED_4 ("4", 4),
    LIMITED_5 ("5", 5);

    private String representation;
    private int amount;

    FieldAllowance(String representation, int amount) {
        this.representation = representation;
        this.amount = amount;
    }

}
