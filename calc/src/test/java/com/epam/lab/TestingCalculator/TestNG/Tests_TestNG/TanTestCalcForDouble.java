package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import com.epam.lab.TestingCalculator.TestNG.Data_TestNG.GeneratorData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TanTestCalcForDouble extends BaseTestCalc {
    GeneratorData generatorData = new GeneratorData();

    @DataProvider(name = "valuesForTangTest")
    public Object[][] valuesForTan() {
        return new Object[][]{
                {generatorData.convertDegreeToRadians(0), generatorData.findTan(generatorData.convertDegreeToRadians(0))},
                {generatorData.convertDegreeToRadians(90), generatorData.findTan(generatorData.convertDegreeToRadians(90))},
                {generatorData.convertDegreeToRadians(180), generatorData.findTan(generatorData.convertDegreeToRadians(180))}
        };
    }

    @Test(dataProvider = "valuesForTangTest")
    public void sinTest(double a, double b) {
        double result = calculator.tg(a);
        Assert.assertEquals(result, b, "Invalid result in Tg operation");
    }
}
