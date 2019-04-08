package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubtrTestCalcForDoubleValues extends BaseTestCalc {

    @DataProvider(name = "valuesForSubTest")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {20.0, 19.0, 1.0},
                {15, -5, 20},
                {0, 0, 0},
                {-5, 10, -15},
                {-10, -10, 0}
        };
    }

    @Test(dataProvider = "valuesForSubTest", groups = "Simple operations")
    public void subTest(double a, double b, double expectedResult) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result in subtraction");
    }
}

