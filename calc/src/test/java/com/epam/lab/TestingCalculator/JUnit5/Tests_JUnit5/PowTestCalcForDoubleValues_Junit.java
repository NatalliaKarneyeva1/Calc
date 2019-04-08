package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PowTestCalcForDoubleValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForPow_Junit#valuesForPow")
    public void powTest(double a, double b, double expectedResult) {
        double result = calculator.pow(a, b);
        Assert.assertEquals(expectedResult, result, 0);
    }
}
