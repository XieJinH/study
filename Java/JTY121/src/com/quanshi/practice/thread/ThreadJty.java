package com.quanshi.practice.thread;

public class ThreadJty extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      System.out.println(211308121);

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
