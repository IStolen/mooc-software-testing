package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CaesarShiftCipherTest {

    private CaesarShiftCipher word;

    @BeforeEach
    public void initialize() { this.word = new CaesarShiftCipher(); }

    @Test
    public void invalidInput() {
        String result = word.caesarShiftCipher("aBBbc",2);
        Assertions.assertEquals("invalid", result);
    }

    @Test
    public void largeShift() {
        String result = word.caesarShiftCipher("abcd ef",28);
        Assertions.assertEquals("cdef gh", result);
    }

    @Test
    public void borderLargeShift() {
        String result = word.caesarShiftCipher("abc", 25);
        Assertions.assertEquals("zab", result);
    }

    @Test
    public void easyCase() {
        String result = word.caesarShiftCipher("abc", 3);
        Assertions.assertEquals("def", result);
    }

    @Test
    public void easyCaseWithSpace() {
        String result = word.caesarShiftCipher("abc abc", 3);
        Assertions.assertEquals("def def", result);
    }

    @Test
    public void longSentence() {
        String result = word.caesarShiftCipher("i have two unicorns", 3);
        Assertions.assertEquals("l kdyh wzr xqlfruqv", result);
    }
}
