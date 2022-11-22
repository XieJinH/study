package com.quanshi.Test;

import com.quanshi.practice.shape.CircleJty;
import com.quanshi.practice.shape.RectangleJty;
import com.quanshi.practice.shape.ShapeJty;

public class ShapeJtyTest {
  public static void main(String[] args) {

    ShapeJty circle = new CircleJty();
    ShapeJty rectangle = new RectangleJty();

    circle.draw();
    rectangle.draw();

  }

}
