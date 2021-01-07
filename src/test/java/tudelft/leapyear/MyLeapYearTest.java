package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyLeapYearTest {

    private LeapYear ly;

    @BeforeEach
    public void initialize() {
        this.ly = new LeapYear();
    }

    @Test
    public void leapYearsThatAreNoncenturialYears() {
        boolean leap = ly.isLeapYear(2016);
        Assertions.assertTrue(leap);
    }

    @Test
    public void leapCenturialYears() {
        boolean leap = ly.isLeapYear(2000);
        Assertions.assertTrue(leap);
    }

    @Test
    public void centurialNotLeapYears() {
        boolean leap = ly.isLeapYear(1500);
        Assertions.assertFalse(leap);
    }

    @Test
    public void nonCenturialNonLeapYears() {
        boolean leap = ly.isLeapYear(1981);
        Assertions.assertFalse(leap);
    }
}
