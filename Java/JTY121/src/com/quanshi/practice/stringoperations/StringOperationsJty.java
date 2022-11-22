package com.quanshi.practice.stringoperations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringOperationsJty {

  public void characterStatisticsJty(String s) {

    int low = 0, cap = 0, num = 0, spa = 0, etc = 0;

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
        low++;
      } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
        cap++;
      } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        num++;
      } else if (s.charAt(i) == ' ') {
        spa++;
      } else etc++;
    }

    System.out.println("s.low = " + low);
    System.out.println("s.cap = " + cap);
    System.out.println("s.num = " + num);
    System.out.println("s.spa = " + spa);
    System.out.println("s.etc = " + etc);

  }

  public boolean isPalindromeJty(String s) {

    int size = s.length();
    System.out.println(size);

    for (int i = 0; i < size / 2; i++) {
      if (s.charAt(i) != s.charAt(size - i - 1)) {
        return false;
      }
    }

    return true;
  }


  public static void main(String[] args) throws IOException {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String s = reader.readLine();

    StringOperationsJty stringOperationsJty = new StringOperationsJty();
    stringOperationsJty.characterStatisticsJty(s);
    if (stringOperationsJty.isPalindromeJty(s)) {
      System.out.println("\"" + s + "\" is a palindrome string");
    } else System.out.println("\"" + s + "\" is not a palindrome string");

    reader.close();
  }

}
