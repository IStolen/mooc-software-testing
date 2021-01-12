package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GHappyTest {
    @Test
    public void trueOneOccurance() {
         GHappy muHap = new GHappy();
         boolean result = muHap.gHappy("toggle");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void trueMultipleOccurences() {
        GHappy muHap = new GHappy();
        boolean result = muHap.gHappy("toggleboggle");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void falseOneOcurrance() {
        GHappy muHap = new GHappy();
        boolean result = muHap.gHappy("togood");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void falseMoreOcurrance() {
        GHappy muHap = new GHappy();
        boolean result = muHap.gHappy("togoodgogo");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void falseBothOcurrance() {
        GHappy muHap = new GHappy();
        boolean result = muHap.gHappy("toggoodgogo");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void falseThreeOcurrance() {
        GHappy muHap = new GHappy();
        boolean result = muHap.gHappy("togggoodgogo");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void talseThreeOcurrance() {
        GHappy muHap = new GHappy();
        boolean result = muHap.gHappy("togggoodggggoggggo");
        Assertions.assertEquals(true, result);
    }

    @Test
    public void trueStartWithDouble() {
        GHappy muHap = new GHappy();
        boolean result = muHap.gHappy("ggopp");
        Assertions.assertEquals(true, result);
    }
}
