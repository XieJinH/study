package com.quanshi.practice.geometric;

abstract class Shape121 {
  public abstract double getArea();

  public abstract double getPerimeter();
}

class Circle121 extends Shape121 {
  public final double PI = 3.14;

  private final double radius;

  @Override
  public double getArea() {
    return PI * Math.pow(radius, 2);
  }

  @Override
  public double getPerimeter() {
    return 2 * PI * radius;
  }

  public Circle121(double radius) {
    this.radius = radius;
  }

}

class Rectangle121 extends Shape121 {
  private final double length;

  private final double width;

  @Override
  public double getArea() {
    return length * width;
  }

  @Override
  public double getPerimeter() {
    return 2 * (length + width);
  }

  public Rectangle121(double length, double width) {
    this.length = length;

    this.width = width;
  }

}

class GeometricTest {
  public static void main(String[] args) {

    double radius = 5;

    double length = 6;

    double width = 7;

    Circle121 circle = new Circle121(radius);

    Rectangle121 rectangle = new Rectangle121(length, width);

    System.out.println("Circle.getArea = " + circle.getArea());

    System.out.println("Circle.getPerimeter = " + circle.getPerimeter());

    System.out.println("rectangle.getArea = " + rectangle.getArea());

    System.out.println("rectangle.getPerimeter = " + rectangle.getPerimeter());

  }
}