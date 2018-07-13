package com.company;

import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {

    static final long serialVersionUID = 2387492;
    private Label lbl;
    private Button btn;
    private TextField txt;
    private int counter = 0;

    public Main() {
        setLayout(new FlowLayout());

        lbl = new Label("Counter");
        add(lbl);

        txt = new TextField(counter + "", 10);
        txt.setEditable(false);
        txt.addMouseListener(new MyMouseListener());
        add(txt);

        btn = new Button("Count");
        add(btn);

        btn.addActionListener(this);

        setTitle("AWT Counter");
        setSize(250, 100);
        setResizable(false);

        setVisible(true);
    }

    public static void main(String[] args) {
        Main app = new Main();
    }

    public void actionPerformed(ActionEvent evt) {
        ++counter;
        txt.setText(counter + "");
    }

}
