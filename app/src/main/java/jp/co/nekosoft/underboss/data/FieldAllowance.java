package jp.co.nekosoft.underboss.data;

/**
 * Field allowance limits the number of entries of a given item in an army list.
 *
 * Created by micho on 23/02/15.
 */
public enum FieldAllowance {

    UNLIMITED ("U", Integer.MAX_VALUE),  // No limit
    CHARACTER ("C", 1),                  // Limited to 1 per list. Additional restrictions might apply
    LIMITED_1 ("1", 1),                  // Limited to 1 per list
    LIMITED_2 ("2", 2),                  // Limited to 2 per list
    LIMITED_3 ("3", 3),                  // Limited to 3 per list
    LIMITED_4 ("4", 4),                  // Limited to 4 per list
    LIMITED_5 ("5", 5);                  // Limited to 5 per list

    private String representation;
    private int amount;

    /**
     * Constructor
     *
     * @param representation of the FA in an army list entry
     * @param amount maximum number of entries of this item in an army list
     */
    FieldAllowance(String representation, int amount) {
        this.representation = representation;
        this.amount = amount;
    }

}
