package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CosTestCalcForDoubleValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForTrigonom_Junit#valuesForCos")
    public void cosTest(double a, double expectedResult) {
        double result = calculator.cos(a);
        Assert.assertEquals(expectedResult, result, 0);
    }
}

