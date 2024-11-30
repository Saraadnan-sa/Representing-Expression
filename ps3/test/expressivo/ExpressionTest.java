package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class ExpressionTest {

    @Test
    public void testLiteralToString() {
        Expression lit = new Literal(3.5);
        assertEquals("3.5", lit.toString());
    }

    @Test
    public void testVariableEquals() {
        Expression x = new Variable("x");
        Expression y = new Variable("x");
        assertEquals(x, y);
    }

    @Test
    public void testOperationHashCode() {
        Expression op1 = new Operation("+", List.of(new Literal(1), new Variable("x")));
        Expression op2 = new Operation("+", List.of(new Literal(1), new Variable("x")));
        assertEquals(op1.hashCode(), op2.hashCode());
    }
}
 