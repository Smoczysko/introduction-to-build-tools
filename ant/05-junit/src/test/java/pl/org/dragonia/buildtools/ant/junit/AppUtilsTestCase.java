package pl.org.dragonia.buildtools.ant.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppUtilsTestCase {

    @Test
    public void testNoArguments() {
        assertEquals("", AppUtils.concatenateArguments(new String[0]));
    }

    @Test
    public void testSingleArgument() {
        assertEquals("hello", AppUtils.concatenateArguments(new String[]{"hello"}));
    }

    @Test
    public void testMultipleArguments() {
        assertEquals("hello-from-junit-example", AppUtils.concatenateArguments(new String[]{"hello", "from", "junit", "example"}));
    }
}
