package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class ValuesForMult_Junit {

    public static Object[][] valuesForMultLong(){
        return new Object[][]{
                {2L, 3L, 6L},
                {-2L, 3L, -6L},
                {2L, 0L, 0L},
                {0L, 0L, 0L},
                {-2L, -3L, 6L}
        };
    }

    public static Object[][] valuesForMultDouble() {
        return new Object[][]{
                {2.0, 3.0, 6.0},
                {-2, 3, -6},
                {2, 0, 0},
                {0, 0, 0},
                {-2, -3, 6}
        };
    }
}
