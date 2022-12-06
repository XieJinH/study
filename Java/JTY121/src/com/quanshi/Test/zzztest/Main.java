package com.quanshi.Test.zzztest;

import java.util.Scanner;

class Shape {
  double getPerimeter() {
    return 0;
  }

  double getArea() {
    return 0;
  }

}

class Square extends Shape {
  double a;

  public Square(double a) {
    this.a = a;
  }

  double getPerimeter() {
    return a * 4;
  }

  double getArea() {
    return a * a;
  }
}

class Rectangle extends Shape {
  double l, w;

  public Rectangle(double l, double w) {
    this.l = l;
    this.w = w;
  }

  double getPerimeter() {
    return (l + w) * 2;
  }

  double getArea() {
    return l * w;
  }
}

class Circle extends Shape {
  double r;

  public Circle(double r) {
    this.r = r;
  }

  double getPerimeter() {
    return 2 * r * Math.PI;
  }

  double getArea() {
    return r * r * Math.PI;
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Square square = new Square(sc.nextDouble());
    Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
    Circle circle = new Circle(sc.nextDouble());

    System.out.printf("%.2f", square.getPerimeter());
    System.out.print(" ");
    System.out.printf("%.2f", square.getArea());
    System.out.print('\n');

    System.out.printf("%.2f", rectangle.getPerimeter());
    System.out.print(" ");
    System.out.printf("%.2f", rectangle.getArea());
    System.out.print('\n');

    System.out.printf("%.2f", circle.getPerimeter());
    System.out.print(" ");
    System.out.printf("%.2f", circle.getArea());
    System.out.print('\n');

  }
}