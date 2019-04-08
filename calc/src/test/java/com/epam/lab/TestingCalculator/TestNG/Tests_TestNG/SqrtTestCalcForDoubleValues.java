package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTestCalcForDoubleValues extends BaseTestCalc {

    @DataProvider(name = "valuesForSqrtTest")
    public Object[][] valuesForSqrt() {
        return new Object[][]{
                {4, 2},
                {Double.NaN, Double.NaN}
        };
    }

    @Test(dataProvider = "valuesForSqrtTest")
    public void SqrtTest(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expectedResult, "Invalid result in sqrt");
    }

    @Test
    public void SqrtNegativeTest(){
        double result = calculator.sqrt(-4);
        Assert.assertEquals(result, Double.NaN, "Invalid result in sqrt (negative input parameter)");
    }
}
