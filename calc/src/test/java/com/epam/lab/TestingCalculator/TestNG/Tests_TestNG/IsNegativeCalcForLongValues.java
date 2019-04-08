package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsNegativeCalcForLongValues extends BaseTestCalc {


    @DataProvider(name = "valuesForIsNegativeTest")
    public Object[][] valuesForIsNegative() {
        return new Object[][]{
                {2, false},
                {-2, true},
                {0, false},
        };
    }

    @Test(dataProvider = "valuesForIsNegativeTest")
    public void isNegativeTest(long a, boolean expectedResult) {
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expectedResult, "Invalid result in IsNegative operation");
    }
}
