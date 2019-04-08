package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTestCalcForLongValues extends BaseTestCalc {

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult(){
        return new Object[][]{
                {2L, 3L, 6L},
                {-2L, 3L, -6L},
                {2L, 0L, 0L},
                {0L, 0L, 0L},
                {-2L, -3L, 6L}
        };
    }

    @Test(dataProvider = "valuesForMultTest", groups = "Simple operations")
    public void multTest (long a, long b, long expectedResult){
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result in multiplication");
    }
}
