package com.quanshi.practice.frame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GUIJty {
  public static void main(String[] args) {

    // 窗口
    JFrame myFrame = new JFrame();

    // frame 窗口调整
    myFrame.setSize(400, 300);
    myFrame.setLayout(new FlowLayout());

    // 标签对象
    JLabel lab01 = new JLabel("JTY的窗口");

    // 按钮对象
    JButton btn01 = new JButton("模态窗口");
    JButton btn02 = new JButton("非模态窗口");
    JButton closeBtn01 = new JButton("关闭");

    // 按钮操控模态对话框打开
    btn01.addActionListener(new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {

        JDialog myDialog = new JDialog();

        myDialog.setModal(true);
        myDialog.setSize(300, 200);
        myDialog.setLayout(new FlowLayout());

        JLabel labInDialog = new JLabel("JTY的模态窗口");

        closeBtn01.addActionListener(new AbstractAction() {
          @Override
          public void actionPerformed(ActionEvent e) {

            myDialog.dispose();
          }
        });

        myDialog.add(labInDialog);
        myDialog.add(closeBtn01);

        myDialog.setVisible(true);
      }
    });

    // 按钮操控非模态对话框打开
    btn02.addActionListener(new AbstractAction() {
      @Override
      public void actionPerformed(ActionEvent e) {

        JDialog myDialog = new JDialog();

        myDialog.setModal(false);
        myDialog.setSize(300, 200);
        myDialog.setLayout(new FlowLayout());

        JLabel labInDialog = new JLabel("JTY的非模态窗口");

        closeBtn01.addActionListener(new AbstractAction() {
          @Override
          public void actionPerformed(ActionEvent e) {

            myDialog.dispose();
          }
        });

        myDialog.add(labInDialog);
        myDialog.add(closeBtn01);

        myDialog.setVisible(true);
      }
    });




    myFrame.add(btn01);
    myFrame.add(lab01);
    myFrame.add(btn02);
    myFrame.setVisible(true);
  }
}
