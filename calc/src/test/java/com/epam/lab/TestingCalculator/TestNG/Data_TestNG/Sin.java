package com.epam.lab.TestNG.forData;

import java.sql.SQLOutput;

public class Sin {
    public static void main(String[] args) {
        double [] forSinArray = {0, 30, 90, 360};
        for (int i=0; i<forSinArray.length; i++){
            double result = Math.sin(i);
            System.out.println("angle= " +forSinArray[i]+ "  , sin= " +result + ".");
        }

    }
}
