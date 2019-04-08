package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class IsNegativeCalcForLongValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForPositiveNegative_Junit#valuesForIsPositiveNegative")
    public void isNegativeTest(long a,  boolean expectedResult) {
        boolean result = calculator.isNegative(a);
        Assert.assertEquals(expectedResult, result);
    }
}
