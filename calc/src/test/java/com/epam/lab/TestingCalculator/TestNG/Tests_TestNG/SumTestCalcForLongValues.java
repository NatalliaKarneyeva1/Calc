package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTestCalcForLongValues extends BaseTestCalc {

    @DataProvider(name = "valuesForSumTest")
    public Object[][] valuesForSum(){
        return new Object[][]{
                {20L, 19L, 39L},
                {15L, -5L, 10L},
                {0L, 0L, 0L},
                {-5L, 10L, 5L},
                {-10L, -10L, -20L}
        };
    }

    @Test(dataProvider = "valuesForSumTest", groups = "Simple operations")
    public void sumTest(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result of sum operation.");
    }
}
