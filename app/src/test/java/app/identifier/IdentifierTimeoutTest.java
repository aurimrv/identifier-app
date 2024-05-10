package app.identifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering basic functional testing criterion: Equivalence Class Partition.
 */
public class IdentifierTimeoutTest {
    private static int LIMIT=30;
    Identifier id;
    @BeforeEach
    public void inicializa() {
        id = new Identifier();
    }

    @Test
    public void validateIdentifier01() {
        assertTimeoutPreemptively(Duration.ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("a1");
            assertEquals(true, result);
        }, () -> "Aborted by timeout" );
    }

    @Test
    public void validateIdentifier02() {
        assertTimeoutPreemptively(Duration.ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("");
            assertEquals(false, result);
        }, () -> "Aborted by timeout" );
    }

    @Test
    public void validateIdentifier03() {
        assertTimeoutPreemptively(Duration.ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("A1b2C3d");
            assertEquals(false, result);
        }, () -> "Aborted by timeout" );
    }

    @Test
    public void validateIdentifier04() {
        assertTimeoutPreemptively(Duration.ofMillis(LIMIT), () -> {
            boolean result = id.validateIdentifier("2B3");
            assertEquals(false, result);
        }, () -> "Aborted by timeout" );
    }

    @Test
    @Timeout(value = 20, unit = TimeUnit.MILLISECONDS, threadMode = Timeout.ThreadMode.SEPARATE_THREAD)
    public void validateIdentifier05() {
        boolean result = id.validateIdentifier("Z#12");
        assertEquals(false, result);
    }
}