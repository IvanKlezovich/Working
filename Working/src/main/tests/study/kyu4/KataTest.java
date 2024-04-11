package study.kyu4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KataTest {
    @Test
    public void test() {
        assertEquals("579", Kata.sumStrings("123", "456"));
    }

}
