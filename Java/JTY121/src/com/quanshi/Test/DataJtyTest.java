package com.quanshi.Test;

import com.quanshi.practice.date.DataJty;

import java.text.ParseException;

public class DataJtyTest {

  public static void main(String[] args) throws ParseException {

    String time = "2020-12-03 22:22:22";

    if (DataJty.leapYearJty(time)) {
      System.out.println(time + " is a leap year!");
    } else {
      System.out.println(time + " is not a leap year!");
    }
  }
}
