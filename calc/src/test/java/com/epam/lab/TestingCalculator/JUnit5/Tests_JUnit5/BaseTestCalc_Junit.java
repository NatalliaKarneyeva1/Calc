package com.epam.lab.TestingCalculator.JUnit5.Tests_JUnit5;

import com.epam.tat.module4.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestCalc_Junit {

    protected static Calculator calculator;

    @BeforeAll
    public static void setUp() {
        calculator = new Calculator();
    }

    @AfterAll
    public static void tearDown() {
        calculator = null;
    }
}
