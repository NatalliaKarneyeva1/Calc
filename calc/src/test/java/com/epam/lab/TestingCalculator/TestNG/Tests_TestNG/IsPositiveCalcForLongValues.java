package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IsPositiveCalcForLongValues extends BaseTestCalc {

    @DataProvider(name = "valuesForIsPositiveTest")
    public Object [][] valuesForIsPositive(){
        return new Object[][]{
                {2, true},
                {-2, false},
                {0, false},
        };
    }

    @Test(dataProvider = "valuesForIsPositiveTest")
    public void isPositiveTest (long a, boolean expectedResult){
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expectedResult, "Invalid result in IsPositive operation");
    }
}
