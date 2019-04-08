package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SubtrTestCalcForLongValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForSubtr_Junit#valuesForSubtrLong")
    public void subtrTest(long a, long b, long expectedResult) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(expectedResult, result, 0);
    }
}
