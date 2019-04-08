package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTestCalcForDoubleValues extends BaseTestCalc {

    @DataProvider(name = "valuesForDivTest")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {100.0, 2.0, 50.0},
                {100, -2, -50},
                {0, -2, 0},
                {-100, -2, 50},
                {100, 3, 33}
        };
    }

    @Test(dataProvider = "valuesForDivTest", groups = "Simple operations")
    public void divTest(double a, double b, double expectedResult) {
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result in division");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Simple operations")
    public void divByZeroTest() {
        double result = calculator.div(5, 0);
        //i expect output of phrase, but Exception also could be. need to specify it in specification
        //Assert.assertEquals(result, "Division by zero", "Invalid behavior during division (divide by zero).");
    }

    @Test(expectedExceptions = NumberFormatException.class, groups = "Simple operations")
    public void divOverflowTest() {
        double result = calculator.div(999999999, 1 / 10);
        //i expect output of word, but Exception also could be. need to specify it in specification
        //Assert.assertEquals(result, "Overflow during division", "Invalid behavior during division (overflow).");
    }
}

