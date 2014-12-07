package pl.org.dragonia;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppUtilsTest extends TestCase {
    public AppUtilsTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppUtilsTest.class);
    }

    public void testNoArguments() {
        assertEquals("", AppUtils.concatenateArguments(new String[0]));
    }

    public void testSingleArgument() {
        assertEquals("hello", AppUtils.concatenateArguments(new String[]{"hello"}));
    }

    public void testMultipleArguments() {
        assertEquals("hello-from-junit-example", AppUtils.concatenateArguments(new String[]{"hello", "from", "junit", "example"}));
    }
}
