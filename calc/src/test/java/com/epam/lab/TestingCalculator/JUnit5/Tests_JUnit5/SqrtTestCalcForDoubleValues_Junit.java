package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SqrtTestCalcForDoubleValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForSqrt_Junit#valuesForSqrt")
    public void sqrt(double a, double expectedResult) {
        double result = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void sqrtNegativeTest(double a, double expectedResult) {
        double result = calculator.sqrt(-4);
        org.junit.Assert.assertEquals(Double.NaN, result, 0);
    }
}
