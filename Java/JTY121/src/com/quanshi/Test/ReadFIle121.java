package com.quanshi.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFIle121 {
  public static void main(String[] args) throws IOException {

    File file = new File("C:\\test\\121.txt");
    FileInputStream fileInputStream = new FileInputStream(file);

    int read = fileInputStream.read();
    while (read != -1) {
      System.out.print((char) read);
      read = fileInputStream.read();

    }

    fileInputStream.close();

  }

}
