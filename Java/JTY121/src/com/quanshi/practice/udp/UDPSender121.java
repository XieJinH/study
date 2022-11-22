package com.quanshi.practice.udp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender121 {
  public static void main(String[] args) throws Exception {

    DatagramSocket ds = new DatagramSocket(8080);
    BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

    while (true) {

      String str = buff.readLine();

      byte[] arr = str.getBytes();
      DatagramPacket dp = new DatagramPacket(arr, arr.length, InetAddress.getByName("localhost"), 8954);
      ds.send(dp);

      System.out.println("发送成功");

      if (str.equals("exit")) {
        System.out.println("发送关闭");

        break;
      }
    }

    ds.close();
    buff.close();
  }

}
