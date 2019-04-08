package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTestCalcForDoubleValues extends BaseTestCalc {

    @DataProvider(name = "valuesForPowTest")
    public Object [][] valuesForPow(){
        return new Object[][]{
                {2, 2, 4},
                {-2, 2, 4},
                {2, -2, 0.25},
                {2, 0, 1}
        };
    }

    @Test(dataProvider = "valuesForPowTest")
    public void powTest (double a, double b, double expectedResult){
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result in Pow operation");
    }
}
