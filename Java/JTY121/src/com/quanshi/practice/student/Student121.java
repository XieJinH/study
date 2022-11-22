package com.quanshi.practice.student;

public class Student121 {
  {
    System.out.println("A new student was born!");
  }

  static {
    System.out.println("This is static initialization block!");

    major = "Soft armour engineering";
  }

  // member
  private String name;

  private String gender;

  private int age;

  private String sid;

  private static String major;

  // constructor
  public Student121() {
    System.out.println("This is constructor");
  }

  public Student121(String name) {
    this.name = name;
  }

  public Student121(String name, String gender) {
    this.name = name;
    this.gender = gender;
  }

  public Student121(String name, String gender, int age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public Student121(String name, String gender, int age, String sid) {
    this.name = name;
    this.gender = gender;
    this.age = age;
    this.sid = sid;
  }

  // setter
  public void setName(String name) {
    this.name = name;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void setSid(String sid) {
    this.sid = sid;
  }

  public static void setMajor(String major) {
    Student121.major = major;
  }

  // show
  public void show() {
    System.out.println("Student121{" + "name = '" + name + '\'' + ", gender = '" + gender + '\'' + ", age = " + age + ", sid = '" + sid + '\'' + ", major = '" + major + '\'' + '}');
  }

  public static void main(String[] args) {
    Student121 student1 = new Student121();
    Student121 student2 = new Student121();

    student1.setAge(18);
    student1.setGender("male");
    student1.setName("York");
    student1.setSid("211308121");

    student2.setAge(18);
    student2.setGender("male");
    student2.setName("Ya-Hunhun");
    student2.setSid("211308073");

    student1.show();
    student2.show();

    student1.setMajor("Soft armour engineering");
    student2.setMajor("Soft armour engineering");

    student1.show();
    student2.show();
  }
}
