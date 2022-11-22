package com.quanshi.practice.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataJty {

  public static boolean leapYearJty(String s) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    GregorianCalendar gc = new GregorianCalendar();

    gc.setTime(sdf.parse(s));

    return gc.isLeapYear(gc.get(Calendar.YEAR));
  }
}
