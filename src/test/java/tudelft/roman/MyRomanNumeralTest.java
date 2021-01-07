package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyRomanNumeralTest {
    
    @Test
    public void numberIKnow() {
        RomanNumeral rNumeral = new RomanNumeral();
        int result = rNumeral.convert("V");
        Assertions.assertEquals(5, result);
    }

    @Test
    public void numberWithSubtractionMethod() {
        RomanNumeral rNumeral = new RomanNumeral();
        int result = rNumeral.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test

    public void numberWithAdditionMethod() {
        RomanNumeral rNumeral = new RomanNumeral();
        int result = rNumeral.convert("VI");
        Assertions.assertEquals(6, result);
    }

    @Test
    public void invalidInputsLowercase() {
        RomanNumeral rNumeral = new RomanNumeral();
        int result = rNumeral.convert("top");
        Assertions.assertEquals(null, result);
        }
}
