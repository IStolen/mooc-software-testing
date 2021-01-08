package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyBoundaryChocolateBagtest {

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, result={3}")
    @CsvSource({"1,1,5,0","1,1,6,1","1,1,7,-1","1,1,8,-1"})
    public void notEnoughChocolate(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name= "small={0}, big={1}, total = {2}, result = {3}")
    @CsvSource({"2,3,15,0","2,4,15,0","12,6,30,0"})
    public void onlyBigBars(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest(name= "small={0}, big={1}, total = {2}, result = {3}")
    @CsvSource({"4,4,22,2","5,5,18,3","5,2,7,2"})
    public void smallAndBigBars(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name= "small={0}, big={1}, total = {2}, result = {3}")
    @CsvSource({"4,4,2,2","5,5,3,3","3,2,4,-1"})
    public void onlySmallBars(int small, int big, int total, int expectedResult) {
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expectedResult, result);
    }
}
