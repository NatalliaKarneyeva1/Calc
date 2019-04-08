package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MultTestCalcForLongValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForMult_Junit#valuesForMultLong")
    public void multTest(long a, long b, long expectedResult) {
        long result = calculator.mult(a, b);
        Assert.assertEquals(expectedResult, result, 0);
    }
}
