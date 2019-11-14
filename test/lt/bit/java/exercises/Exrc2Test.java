package lt.bit.java.exercises;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exrc2Test {
    @Test
    public void testExtraFront() {
        String result = Exrc2.extraFront("Hello");
        assertEquals("HeHeHe", result);
    }

    @Test
    public void testExtraFrontWithTwoLetters() {
        String result = Exrc2.extraFront("ab");
        assertEquals("ababab", result);
    }

    @Test
    public void testExtraFrontWithOneLetter() {
        String result = Exrc2.extraFront("H");
        assertEquals("HHH", result);
    }

    @Test
    public void testExtraFrontWithEmpty() {
        String result = Exrc2.extraFront("");
        assertEquals("", result);
    }

    @Test
    public void testExtraFrontWithNull() {
        String result = Exrc2.extraFront(null);
        assertEquals(null, result);
    }
}