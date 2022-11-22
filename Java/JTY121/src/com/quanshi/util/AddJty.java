package com.quanshi.util;

public class AddJty {

    public static Integer add(int num1, int num2) {
        return num1 + num2;
    }

    public static Integer add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static Integer add(int[] arr) {
        int res = 0;
        for (int num : arr) {
            res += num;
        }
        return res;
    }
}
