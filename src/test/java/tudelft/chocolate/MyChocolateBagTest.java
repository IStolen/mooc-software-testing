package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyChocolateBagTest {

    private ChocolateBags bag;

    @BeforeEach
    public void initialize() {
        this.bag = new ChocolateBags();
    }

    @Test
    public void notEnoughChocolate() {
        int result = bag.calculate(1,1,10);
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void onlyBigBars() {
        int result = bag.calculate(2,5,20);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void onlySmallBars() {
        int result = bag.calculate(4,3,4);
        Assertions.assertEquals(4, result);
    }
    
    @Test
    public void combinationBox() {
        int result = bag.calculate(5,3,17);
        Assertions.assertEquals(2, result);
    }

}