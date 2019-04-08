package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class ValuesForPow_Junit {

    public static Object [][] valuesForPow(){
        return new Object[][]{
                {2, 2, 4},
                {-2, 2, 4},
                {2, -2, 0.25},
                {2, 0, 1}
        };
    }
}
