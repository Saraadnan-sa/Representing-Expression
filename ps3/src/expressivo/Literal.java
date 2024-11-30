package expressivo;
 
import java.util.Objects;

public class Literal implements Expression {
	
    private final double value;

    // Abstraction function: represents a numeric literal
    // Rep invariant: no constraints beyond immutability
    // Safety from rep exposure: value is private and final

    /**
     * Constructs a Literal expression.
     * @param value the numeric value of the literal
     */
    public Literal(double value) {
        this.value = value;
        checkRep();
    }

    private void checkRep() {
        // No constraints to enforce
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Literal)) return false;
        Literal other = (Literal) obj;
        return Double.compare(this.value, other.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
