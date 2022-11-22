package com.quanshi.Test;

import com.quanshi.practice.__student.StudentJty;

import java.util.TreeMap;

public class __StudentJtyTest {

  public static void main(String[] args) {

    StudentJty student1 = new StudentJty("Jty", 18, "A10#404A");
    StudentJty student2 = new StudentJty("Lyf", 1, "A10#404A");
    StudentJty student3 = new StudentJty("Abc", 18, "B07#505B");

    TreeMap<Integer, StudentJty> treeMap = new TreeMap<>();
    treeMap.put(211308121, student1);
    treeMap.put(211308073, student2);
    treeMap.put(211308999, student3);

    System.out.println(treeMap);

  }


}
