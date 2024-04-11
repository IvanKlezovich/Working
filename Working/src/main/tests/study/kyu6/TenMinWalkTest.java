package study.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static study.kuy6.TenMinWalk.isValid;

public class TenMinWalkTest {
    @Test
    public void Test() {
        assertTrue("Should return true", isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertFalse("Should return false", isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertFalse("Should return false", isValid(new char[]{'w'}));
        assertFalse("Should return false", isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
