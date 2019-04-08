package com.epam.lab.TestingCalculator.JUnit5.Data_JUnit5;

public class GeneratorData {

    public static double convertDegreeToRadians(double someDegree) {
        return Math.toRadians(someDegree);
    }

    public static double findSin(double someRadians) {
        return Math.sin(someRadians);
    }

    public static double findCos(double someRadians) {
        return Math.cos(someRadians);
    }

    public static double findTan(double someRadians) {
        return Math.tan(someRadians);
    }

    public static double findCtan(double someRadians) {
        return 1 / Math.tan(someRadians);
    }
}

