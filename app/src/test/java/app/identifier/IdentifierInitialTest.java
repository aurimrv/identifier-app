package app.identifier;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering basic functional testing criterion: Equivalence Class Partition.
 */
public class IdentifierInitialTest {
    @Test
    public void validateIdentifier01() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("a1");
        assertEquals(true, result);
    }

    @Test
    public void validateIdentifier02() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier03() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("A1b2C3d");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier04() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("2B3");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier05() {
        Identifier id = new Identifier();
        boolean result = id.validateIdentifier("Z#12");
        assertEquals(false, result);
    }
}