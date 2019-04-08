package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import com.epam.lab.TestingCalculator.TestNG.Data_TestNG.GeneratorData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTestCalcForDoubleValues extends BaseTestCalc {
    GeneratorData generatorData = new GeneratorData();

    @DataProvider(name = "valuesForSinTest")
    public Object[][] valuesForSin() {
        return new Object[][]{
                {generatorData.convertDegreeToRadians(0), generatorData.findSin(generatorData.convertDegreeToRadians(0))},
                {generatorData.convertDegreeToRadians(90), generatorData.findSin(generatorData.convertDegreeToRadians(90))},
                {generatorData.convertDegreeToRadians(180), generatorData.findSin(generatorData.convertDegreeToRadians(180))}
        };
    }

    @Test(dataProvider = "valuesForSinTest")
    public void sinTest(double a, double b) {
        double result = calculator.sin(a);
        Assert.assertEquals(result, b, "Invalid result in Sin operation");
    }
}
