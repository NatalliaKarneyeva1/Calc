package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class ValuesForSubtr_Junit {

    public static Object[][] valuesForSubtrDouble() {
        return new Object[][]{
                {20.0, 19.0, 1.0},
                {15, -5, 20},
                {0, 0, 0},
                {-5, 10, -15},
                {-10, -10, 0}
        };
    }

    public static Object[][] valuesForSubtrLong(){
        return new Object[][]{
                {20L, 19L, 1L},
                {15L, -5L, 20L},
                {0L, 0L, 0L},
                {-5L, 10L, -15L},
                {-10L, -10L, 0L}
        };
    }
}
