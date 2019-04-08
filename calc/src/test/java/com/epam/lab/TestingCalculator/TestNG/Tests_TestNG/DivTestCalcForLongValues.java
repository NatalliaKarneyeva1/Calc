package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTestCalcForLongValues extends BaseTestCalc {

    @DataProvider(name = "valuesForDivTest")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {100L, 2L, 50L},
                {100L, -2L, -50L},
                {0L, -2L, 0L},
                {-100L, -2L, 50L},
                {100L, 3L, 33L}
        };
    }

    @Test(dataProvider = "valuesForDivTest", groups = "Simple operations")
    public void divTest(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result in division");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Simple operations")
    public void divByZeroTest(){
        long result = calculator.div(5L, 0L);
        //i expect output of phrase, but Exception also could be. need to specify it in specification
        //Assert.assertEquals(result, "Division by zero", "Invalid behavior during division (divide by zero).");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Simple operations")
    public void divOverflowTest(){
        long result = calculator.div(999999999L, 1/10);
        //i expect output of word, but Exception also could be. need to specify it in specification
        //Assert.assertEquals(result, "Overflow during division", "Invalid behavior during division (overflow).");
    }
}