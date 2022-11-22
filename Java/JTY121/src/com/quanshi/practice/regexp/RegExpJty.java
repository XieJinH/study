package com.quanshi.practice.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpJty {

  public static boolean matchEmail(String s) {
    String str = "^[a-zA-Z]{1}+[a-zA-Z0-9]{2,7}+@[a-zA-Z0-9_-]+.cn+$";
    Pattern regex = Pattern.compile(str);
    Matcher matcher = regex.matcher(s);

    return matcher.matches();
  }

  public static boolean matchPhone(String s) {
    String str = "^[1][3,5,7,8][0-9]\\d{8}$";
    Pattern regex = Pattern.compile(str);
    Matcher matcher = regex.matcher(s);

    return matcher.matches();
  }
}
