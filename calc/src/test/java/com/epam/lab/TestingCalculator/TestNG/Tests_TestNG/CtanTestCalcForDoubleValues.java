package com.epam.lab.TestingCalculator.TestNG.Tests_TestNG;

import com.epam.lab.TestingCalculator.TestNG.Data_TestNG.GeneratorData;;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CtanTestCalcForDoubleValues extends BaseTestCalc {
    GeneratorData generatorData = new GeneratorData();

    @DataProvider(name = "valuesForCtangTest")
    public Object[][] valuesForCtan() {
        return new Object[][]{
                {generatorData.convertDegreeToRadians(0), generatorData.findCtan(generatorData.convertDegreeToRadians(0))},
                {generatorData.convertDegreeToRadians(90), generatorData.findCtan(generatorData.convertDegreeToRadians(90))},
                {generatorData.convertDegreeToRadians(180), generatorData.findCtan(generatorData.convertDegreeToRadians(180))}
        };
    }

    @Test(dataProvider = "valuesForCtangTest")
    public void sinTest(double a, double b) {
        double result = calculator.ctg(a);
        Assert.assertEquals(result, b, "Invalid result in Ctg operation");
    }
}

