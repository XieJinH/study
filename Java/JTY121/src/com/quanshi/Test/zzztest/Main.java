package com.quanshi.Test.zzztest;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // 输入土地数 input area number
    int areaNum = input.nextInt();

    // 输入家庭人数 peopleNum
    int peopleNum = input.nextInt();

    // 创建土地数组 根据土地数 new Shape Array based on areaNum
    Shape[] shapes = new Shape[areaNum];

    for (int i = 0; i < shapes.length; i++) {
      String str = input.next();

      if (str.equals("cir")) { // 判断是否是圆形土地
        double r = input.nextDouble(); // 输入圆形土地的半径
        // 创建圆形土地对象，并放入shapes数组
        shapes[i] = new Circle(r);
      } else if (str.equals("rec")) {
        double height = input.nextDouble();
        double width = input.nextDouble();
        shapes[i] = new Rectangle(height, width);// 创建长方形土地对象，并放入shapes数组
      }

    }

    // 创建家庭对象小明，将小明家的人数和土地传入
    Family xiaoMing = new Family(peopleNum, shapes);
    // 求小明家总土地面积
    double totalArea = xiaoMing.getTotalArea();
    // 求小明家人均土地面积
    double avgArea = xiaoMing.getAvgArea();
    System.out.printf("total Area is:%.2f\n", totalArea);
    System.out.printf("average Area is:%.2f\n", avgArea);
  }

}

// 定义接口Shape
interface Shape {
  // 定义方法double getArea();
  public double getArea();
}

class Circle implements Shape {
  private double radius;

  public double getArea() {
    return radius * radius * Math.PI;
  }

  public Circle() {
    this(1);
  }

  public Circle(double radius) {
    setRadius(radius);
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

}

class Rectangle implements Shape {
  private double height, width;

  // 方法重写
  public double getArea() {
    return height * width;
  }

  public Rectangle(double height, double width) {
    super();
    this.height = height;
    this.width = width;
  }

  public Rectangle() {
    this.width = height = 1;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }
}

class Family {
  private int numPeople; // 人口数

  private Shape[] shapes;// 家庭拥有土地

  public Family(int numPeople, Shape[] shapes) {
    this.numPeople = numPeople;
    this.shapes = shapes;
  }

  public double getTotalArea() {
    double sum = 0;
    // 求家庭土地总面积，将shapes数组中每一个土地求面积相加求和
    for (Shape c : shapes) {
      sum += c.getArea();
    }
    return sum;
  }

  // 求家庭人均土地面积
  public double getAvgArea() {
    return this.getTotalArea() / this.numPeople;
  }

  public int getNumPeople() {
    return numPeople;
  }

  public void setNumPeople(int numPeople) {
    this.numPeople = numPeople;
  }

  public Shape[] getShapes() {
    return shapes;
  }

  public void setShapes(Shape[] shapes) {
    this.shapes = shapes;
  }

}