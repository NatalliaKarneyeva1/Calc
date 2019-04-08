package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class ValuesForDiv_Junit {

    public static Object[][] valuesForDivLong() {
        return new Object[][]{
                {100L, 2L, 50L},
                {100L, -2L, -50L},
                {0L, -2L, 0L},
                {-100L, -2L, 50L},
                {100L, 3L, 33L}
        };
    }

    public static Object[][] valuesForDivDouble() {
        return new Object[][]{
                {100.0, 2.0, 50.0},
                {100, -2, -50},
                {0, -2, 0},
                {-100, -2, 50},
                {100, 3, 33}
        };
    }
}
