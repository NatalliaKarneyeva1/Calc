package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtrTestCalcForLongValues extends BaseTestCalc {

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub(){
        return new Object[][]{
                {20L, 19L, 1L},
                {15L, -5L, 20L},
                {0L, 0L, 0L},
                {-5L, 10L, -15L},
                {-10L, -10L, 0L}
        };
    }

    @Test(dataProvider = "valuesForSubTest", groups = "Simple operations")
    public void subTest (long a, long b, long expectedResult){
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result in subtraction");
    }
}
