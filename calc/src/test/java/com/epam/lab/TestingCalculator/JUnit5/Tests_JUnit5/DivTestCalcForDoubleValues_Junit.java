package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivTestCalcForDoubleValues_Junit extends BaseTestCalc_Junit {

    @ParameterizedTest
    @MethodSource("com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5.ValuesForDiv_Junit#valuesForDivDouble")
    public void divTest(long a, long b, long expectedResult) {
        long result = calculator.div(a, b);
        org.junit.Assert.assertEquals(result, expectedResult,  0);
    }

    @Test
    public void divByZeroTestExceptionTest(){
        assertThrows(ArithmeticException.class, () -> calculator.div(1, 0));
    }

    @Test
    public void overflowTestExceptionTest(){
        assertThrows(NumberFormatException.class, () -> calculator.div(999999999, 1/10));
    }
}

