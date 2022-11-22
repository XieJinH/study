package com.quanshi.Test;

import com.quanshi.util.AddJty;

public class AddJtyTest {

    public static void main(String[] args) {

        int num1 = 1, num2 = 2, num3 = 3;
        int[] arr = {1, 2, 3, 4};

        System.out.println("num1 + num2 = " + AddJty.add(num1, num2));
        System.out.println("num1 + num2 + num3 = " + AddJty.add(num1, num2, num3));
        System.out.println("The sum of the arr is " + AddJty.add(arr));
    }
}
