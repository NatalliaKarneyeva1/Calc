package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SumTestCalcForLongValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForSum_Junit#valuesForSumLong")
    public void sumTest(long a, long b, long expectedResult) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(expectedResult, result);
    }
}

