package utils;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProjectUtilities {

    @Test
    public void testGetNumbersFromRatio(){
        String ratio = "3:7";
        int[] numbersFromRatio = ProjectUtilities.getNumbersFromRatio(ratio);
        Assertions.assertEquals(3, numbersFromRatio[0]);
        Assertions.assertEquals(7, numbersFromRatio[1]);
    }
}
