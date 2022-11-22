package com.quanshi.practice.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver121 {
  public static void main(String[] args) throws Exception {

    byte[] buf = new byte[1024];

    DatagramSocket ds = new DatagramSocket(8954);
    DatagramPacket dp = new DatagramPacket(buf, buf.length);

    System.out.println("等待接收数据");

    while (true) {
      ds.receive(dp);

      if (new String(dp.getData(), 0, dp.getLength()).equals("exit")) {
        System.out.println("停止接受");

        break;
      }

      // 输出
      String str = new String(dp.getData(), 0, dp.getLength()) + " from " + dp.getAddress().getHostAddress() + ":" + dp.getPort();
      System.out.println(str);
    }

    ds.close();

  }

}
