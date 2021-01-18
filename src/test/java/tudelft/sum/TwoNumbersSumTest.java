package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tudelft.mirror.Mirror;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoNumbersSumTest {

    @Test
    public void SimpleSumOfTwo() {
        ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(1, 1, 1));
        ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(1, 1, 1));
        ArrayList<Integer> expected=new ArrayList<Integer>(Arrays.asList(2, 2, 2));
        TwoNumbersSum reverseSum = new TwoNumbersSum();
        ArrayList<Integer> result = reverseSum.addTwoNumbers(list1,list2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void ComplexSumOfTwo() {
        ArrayList<Integer> list1=new ArrayList<Integer>(Arrays.asList(5,6,4));
        ArrayList<Integer> list2=new ArrayList<Integer>(Arrays.asList(2,4,3));
        ArrayList<Integer> expected=new ArrayList<Integer>(Arrays.asList(7,0,8));
        TwoNumbersSum reverseSum = new TwoNumbersSum();
        ArrayList<Integer> result = reverseSum.addTwoNumbers(list1,list2);
        Assertions.assertEquals(expected, result);
    }
}
