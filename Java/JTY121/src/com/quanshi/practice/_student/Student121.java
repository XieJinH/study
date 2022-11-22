package com.quanshi.practice._student;

import java.util.Objects;

public class Student121 {
  private String name;

  private Integer sid;

  private Integer age;

  public Student121() {

  }

  public Student121(String name, Integer sid, Integer age) {
    this.name = name;
    this.sid = sid;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student121{" +
            "name='" + name + '\'' +
            ", sid=" + sid +
            ", age=" + age +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Student121 that)) return false;
    return Objects.equals(getName(), that.getName()) && Objects.equals(getSid(), that.getSid()) && Objects.equals(getAge(), that.getAge());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getName(), getSid(), getAge());
  }
}
