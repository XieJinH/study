package com.quanshi.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CeateFileJty {
  public static void main(String[] args) throws IOException {

    File file = new File("C:\\test\\121.txt");
    FileOutputStream fileOutputStream = new FileOutputStream(file);

    String data = "Jty211308121";
    fileOutputStream.write(data.getBytes());
    fileOutputStream.close();


  }

}
