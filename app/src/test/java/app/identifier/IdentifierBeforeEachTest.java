package app.identifier;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering basic functional testing criterion: Equivalence Class Partition.
 */
public class IdentifierBeforeEachTest {
    Identifier id;
    @BeforeEach
    public void inicializa() {
        id = new Identifier();
    }

    @Test
    public void validateIdentifier01() {
        boolean result = id.validateIdentifier("a1");
        assertEquals(true, result);
    }

    @Test
    public void validateIdentifier02() {
        boolean result = id.validateIdentifier("");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier03() {
        boolean result = id.validateIdentifier("A1b2C3d");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier04() {
        boolean result = id.validateIdentifier("2B3");
        assertEquals(false, result);
    }

    @Test
    public void validateIdentifier05() {
        boolean result = id.validateIdentifier("Z#12");
        assertEquals(false, result);
    }
}