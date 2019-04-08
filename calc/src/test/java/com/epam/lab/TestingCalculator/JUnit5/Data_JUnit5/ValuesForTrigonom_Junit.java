package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class ValuesForTrigonom_Junit {

    public static Object[][] valuesForTang() {
        return new Object[][]{
                {Math.toRadians(0), 0},
                {Math.toRadians(45), 1.61977519054},
                {Math.toRadians(180), 1.33869021035}
        };
    }

    public static Object[][] valuesForSin() {
        return new Object[][]{
                {Math.toRadians(0), 0},
                {Math.toRadians(45), 0.85090352453},
                {Math.toRadians(180), -0.80115263573}
        };
    }

    public static Object[][] valuesForCtan() {
        return new Object[][]{
                {Math.toRadians(45), 0.61736962378},
                {Math.toRadians(90), -0.50120278338},
        };
    }

    public static Object[][] valuesForCos() {
        return new Object[][]{
                {Math.toRadians(0), 1},
                {Math.toRadians(90), -0.50120278338},
                {Math.toRadians(45), 0.52532198881}
        };
    }
}

