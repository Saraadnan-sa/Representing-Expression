package expressivo;

import java.util.Objects; 

public class Variable implements Expression {
    private final String name;

    // Abstraction function: represents a variable with a name
    // Rep invariant: name must be non-null and non-empty
    // Safety from rep exposure: name is private and final

    /**
     * Constructs a Variable expression.
     * @param name the name of the variable
     */
    public Variable(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("Name must be non-null and non-empty");
        this.name = name;
        checkRep();
    }

    private void checkRep() {
        assert name != null && !name.isEmpty();
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Variable)) return false;
        Variable other = (Variable) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
