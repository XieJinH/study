package com.quanshi.Test;

import com.quanshi.practice.regexp.RegExpJty;

public class RegExpJtyTest {

  public static void main(String[] args) {

    String corEmail = "Yanmeng@gmail.cn";
    String errEmail = "2644229800@qq.com";

    if (RegExpJty.matchEmail(corEmail)) System.out.println(corEmail + " is a correct email!");
    else System.out.println(corEmail + " is not a correct email!");

    if (RegExpJty.matchEmail(errEmail)) System.out.println(errEmail + " is a correct email!");
    else System.out.println(errEmail + " is not a correct email!");

    String corPhone = "17145752644";
    String errPhone = "110";

    if (RegExpJty.matchPhone(corPhone)) System.out.println(corPhone + " is a correct email!");
    else System.out.println(corPhone + " is not a correct email!");

    if (RegExpJty.matchPhone(errPhone)) System.out.println(errPhone + " is a correct email!");
    else System.out.println(errPhone + " is not a correct email!");
  }
}
