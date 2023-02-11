package com.quanshi.Test.zzzTest;

public interface Shape {
  Double area();

  Double volume();

}

class Cylinder implements Shape {

  Double high;

  Double radius;

  @Override
  public Double area() {
    return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * high;
  }

  @Override
  public Double volume() {
    return Math.PI * radius * radius *high;
  }
}

class TestClass {
  public static void main(String[] args) {

    Cylinder c = new Cylinder();

    c.high = 1.0;
    c.radius = 2.0;

    System.out.println(c.area());
    System.out.println(c.volume());
  }
}