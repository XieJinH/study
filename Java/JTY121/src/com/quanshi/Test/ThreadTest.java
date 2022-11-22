package com.quanshi.Test;

import com.quanshi.practice.thread.RunnableJty;
import com.quanshi.practice.thread.ThreadJty;

public class ThreadTest {

  public static void main(String[] args) throws InterruptedException {

//    ThreadJty myThread = new ThreadJty();
//    myThread.start();
//    for (int i = 0; i < 100; i++) {
//      System.out.println("jty");
//
//      Thread.sleep(100);
//    }

    RunnableJty myRunnable = new RunnableJty();
    Thread myThread = new Thread(myRunnable);
    myThread.start();
    for (int i = 0; i < 100; i++) {
      System.out.println("jty");

      Thread.sleep(100);
    }

  }


}
