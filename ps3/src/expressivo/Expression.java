/* Copyright (c) 2015-2016 MIT 6.005 course staff, all rights reserved.
 * Redistribution of original or derived work requires permission of course staff.
 */
package expressivo;
import java.util.Objects;

public interface Expression {
    /**
     * Returns a string representation of this expression.
     * The string must be a valid mathematical expression.
     * @return string representation of the expression
     */
    @Override
    String toString();

    /**
     * Compares this expression with another object for structural equality.
     * @param obj the object to compare with
     * @return true if the two expressions are structurally equal, false otherwise
     */
    @Override
    boolean equals(Object obj);

    /**
     * Returns a hash code value for this expression.
     * The hash code must be consistent with equals().
     * @return hash code of the expression
     */
    @Override
    int hashCode();
}
