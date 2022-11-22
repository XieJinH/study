package com.quanshi.util;

public class BMIJty {
    public double calcBMI(double weight, double height) {

        double bmi = weight / Math.pow(height, 2);

        return bmi;
    }
}
