package com.quanshi.Test;

import com.quanshi.practice._student.Student121;

import java.util.HashSet;

public class StudentJyTest {
  public static void main(String[] args) {

    HashSet<Student121> hs = new HashSet<Student121>();

    Student121 York = new Student121("York", 211308121, 18);

    Student121 Jty = new Student121("York", 211308121, 18);

    Student121 Lyf = new Student121("Ya-Hunhun", 211308073, 1);

    hs.add(York);
    hs.add(Jty);
    hs.add(Lyf);

    System.out.println(hs);
  }


}
