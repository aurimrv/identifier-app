package app.identifier;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectPackages("app.identifier")
@SelectClasses({app.identifier.IdentifierInitialTest.class,
        app.identifier.IdentifierTimeoutTest.class,
        app.identifier.StringExceptionTest.class})
public class AllTests {
}