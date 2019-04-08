package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class ValuesForSum_Junit{

    public static Object[][] valuesForSumDouble() {
        return new Object[][]{
                {20.0, 19.0, 39.0},
                {15, -5, 10},
                {0, 0, 0},
                {-5, 10, 5},
                {-10, -10, -20}
        };
    }

    public static Object[][] valuesForSumLong() {
        return new Object[][]{
                {20L, 19L, 39L},
                {15L, -5L, 10L},
                {0L, 0L, 0L},
                {-5L, 10L, 5L},
                {-10L, -10L, -20L}
        };
    }
}
