package study.kyu6;

import org.junit.Test;
import study.kuy6.Kata;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTests() {
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }

    @Test
    public void edgeCaseTests() {
        assertEquals("aa", Kata.high("aa b"));
        assertEquals("b", Kata.high("b aa"));
        assertEquals("bb", Kata.high("bb d"));
        assertEquals("d", Kata.high("d bb"));
        assertEquals("aaa", Kata.high("aaa b"));
    }
}
