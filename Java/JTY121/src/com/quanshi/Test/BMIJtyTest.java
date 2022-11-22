package com.quanshi.Test;

import com.quanshi.util.BMIJty;

import java.util.Scanner;

public class BMIJtyTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double weight = scan.nextDouble();
        double height = scan.nextDouble();

        double bmi = new BMIJty().calcBMI(weight, height);

        if (bmi < 18.5) System.out.println("Jty, thin");
        else if (bmi >= 18.5 && bmi < 24) System.out.println("Jty, fit");
        else if (bmi >= 24 && bmi < 28) System.out.println("Jty, overweight");
        else System.out.println("Jty, fat");
    }

}
