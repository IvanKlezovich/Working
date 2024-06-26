package study.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingDuplicatesTest {
    @Test
    public void abcdeReturnsZero() {
        assertEquals(0, study.kuy6.CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    public void abcdeaReturnsOne() {
        assertEquals(1, study.kuy6.CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    public void indivisibilityReturnsOne() {
        assertEquals(26, study.kuy6.CountingDuplicates.duplicateCount(
                "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix"));
    }

    @Test
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC + testHundredB + testThousandA;
        assertEquals(3, study.kuy6.CountingDuplicates.duplicateCount(test));
    }
}
