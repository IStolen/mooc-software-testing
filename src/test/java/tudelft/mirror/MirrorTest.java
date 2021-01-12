package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.roman.RomanNumeral;

public class MirrorTest {
    @Test
    public void number() {
        Mirror mends = new Mirror();
        String result = mends.mirrorEnds("adda");
        Assertions.assertEquals("adda", result);
    }
}
