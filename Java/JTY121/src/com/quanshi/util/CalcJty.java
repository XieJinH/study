package com.quanshi.util;

public class CalcJty {

    public void printNum() {

        Integer sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 == 1) sum += i;
        }

        System.out.println(sum);
    }

    public CalcJty() { }
}
