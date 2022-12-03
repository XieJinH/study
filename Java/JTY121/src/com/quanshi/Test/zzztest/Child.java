package com.quanshi.Test.zzztest;

import java.util.Scanner;

class Parent {
  public int count() {                 // 第1行
    return 0;
  }
}
public  class Test  extends Parent {
  public float count() {              // 第2行
    return 9;                    // 第3行
  }
}