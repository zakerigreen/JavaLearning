package com.company;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {

    public void mousePressed(MouseEvent evt) {
      System.out.println("Mouse-button pressed!");
    }

    public void mouseReleased(MouseEvent evt) {
      System.out.println("Mouse-button released!");
    }

    public void mouseClicked(MouseEvent evt) {
      System.out.println("Mouse-button clicked!");
      System.exit(0);
    }

    public void mouseEntered(MouseEvent evt) {
      System.out.println("Mouse entered!");
    }

    public void mouseExited(MouseEvent evt) {
      System.out.println("Mouse exited!");
    }

    public void mouseDragged(MouseEvent evt) {
      System.out.println("Mouse dragged!");
    }

}

