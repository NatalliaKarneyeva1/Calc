package com.epam.lab.TestingCalculator.TestNG.Data_TestNG;

public class GeneratorData {

    public double convertDegreeToRadians(double someDegree){
        return Math.toRadians(someDegree);
    }

    public double findSin(double someRadians){
        return Math.sin(someRadians);
    }

    public double findCos(double someRadians){
        return Math.cos(someRadians);
    }

    public double findTan(double someRadians){
        return Math.tan(someRadians);
    }

    public double findCtan(double someRadians){
        return 1/Math.tan(someRadians);
    }
}
