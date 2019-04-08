package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTestCalcForDoubleValues extends BaseTestCalc {

    @DataProvider(name = "valuesForMultTest")
    public Object[][] valuesForMult() {
        return new Object[][]{
                {2.0, 3.0, 6.0},
                {-2, 3, -6},
                {2, 0, 0},
                {0, 0, 0},
                {-2, -3, 6}
        };
    }

    @Test(dataProvider = "valuesForMultTest", groups = "Simple operations")
    public void multTest(double a, double b, double expectedResult) {
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expectedResult, "Invalid result in multiplication");
    }
}

