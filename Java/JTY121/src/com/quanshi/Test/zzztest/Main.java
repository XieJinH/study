package com.quanshi.Test.zzztest;

public class Main {
  public static void main(String[] args) {
    String[] strs = { "Tom", "Jerry", "Donald" };
    // foreach循环遍历数组
    for (String str : strs) {
      str = "Tuffy";
    }
    System.out.println(strs[0] + "," + strs[1] + "," + strs[2]);
  }
}