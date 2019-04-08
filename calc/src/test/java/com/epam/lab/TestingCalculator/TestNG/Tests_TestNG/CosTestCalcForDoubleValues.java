package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import com.epam.lab.TestingCalculator.TestNG.Data_TestNG.GeneratorData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CosTestCalcForDoubleValues extends BaseTestCalc {
    GeneratorData generatorData = new GeneratorData();

    @DataProvider(name = "valuesForCosTest")
    public Object[][] valuesForCos() {
        return new Object[][]{
                {generatorData.convertDegreeToRadians(0), generatorData.findCos(generatorData.convertDegreeToRadians(0))},
                {generatorData.convertDegreeToRadians(90), generatorData.findCos(generatorData.convertDegreeToRadians(90))},
                {generatorData.convertDegreeToRadians(180), generatorData.findCos(generatorData.convertDegreeToRadians(180))}
        };
    }

    @Test(dataProvider = "valuesForCosTest")
    public void sinTest(double a, double b) {
        double result = calculator.cos(a);
        Assert.assertEquals(result, b, "Invalid result in Cos operation");
    }
}

