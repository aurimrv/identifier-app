package app.identifier;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/**
 * Example of JUnit 5.0 test for Identifier Program,
 * considering basic functional testing criterion: Equivalence Class Partition.
 */
public class StringExceptionTest {
    @Disabled
    @Test
    public void stringExceptionTestNegative() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            "Web2024".substring(-10);
        });
    }
    @Disabled
    @Test
    public void stringExceptionTestOutOfRange() {
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            "Web2024".substring(20);
        });
    }
}