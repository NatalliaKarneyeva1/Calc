package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class ValuesForPositiveNegative_Junit {

    public static Object [][] valuesForIsPositiveNegative(){
        return new Object[][]{
                {2, true},
                {-2, false},
                {0, false},
        };
    }
}
