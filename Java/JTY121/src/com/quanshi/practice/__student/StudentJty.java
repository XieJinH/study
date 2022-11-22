package com.quanshi.practice.__student;

public class StudentJty {
  private String name;

  private Integer age;

  private String address;

  public StudentJty(String name, Integer age, String address) {
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public StudentJty() {
  }

  @Override
  public String toString() {
    return "StudentJty{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            '}';
  }
}
