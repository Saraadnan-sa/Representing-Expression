package expressivo;

import java.util.List;
import java.util.Objects;

public class Operation implements Expression {
    private final String operator;
    private final List<Expression> operands;

    // Abstraction function: represents a mathematical operation
    // Rep invariant: operator is non-null, and operands is non-null and non-empty
    // Safety from rep exposure: operator and operands are private and final

    /**
     * Constructs an Operation expression.
     * @param operator the operator (e.g., "+", "-")
     * @param operands the operands of the operation
     */
    public Operation(String operator, List<Expression> operands) {
        if (operator == null || operands == null || operands.isEmpty())
            throw new IllegalArgumentException("Invalid operator or operands");
        this.operator = operator;
        this.operands = List.copyOf(operands);
        checkRep();
    }

    private void checkRep() {
        assert operator != null;
        assert operands != null && !operands.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < operands.size(); i++) {
            if (i > 0) sb.append(" ").append(operator).append(" ");
            sb.append(operands.get(i).toString());
        }
        return "(" + sb + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Operation)) return false;
        Operation other = (Operation) obj;
        return this.operator.equals(other.operator) && this.operands.equals(other.operands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operator, operands);
    }
}
