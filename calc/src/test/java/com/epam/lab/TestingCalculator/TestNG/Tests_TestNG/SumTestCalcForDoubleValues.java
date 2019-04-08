package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTestCalcForDoubleValues extends BaseTestCalc {

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum() {
        return new Object[][]{
                {20.0, 19.0, 39.0},
                {15, -5, 10},
                {0, 0, 0},
                {-5, 10, 5},
                {-10, -10, -20}
        };
    }

    @Test(dataProvider = "valuesForSumTest", groups = "Simple operations")
    public void sumTest(double a, double b, double expectedResult) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sum operation.");
    }
}

