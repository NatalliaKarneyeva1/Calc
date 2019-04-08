package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CtanTestCalcForDoubleValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForTrigonom_Junit#valuesForCtan")
    public void ctanTest(double a, double expectedResult) {
        double result = calculator.ctg(a);
        Assert.assertEquals(expectedResult, result, 0);
    }
}

