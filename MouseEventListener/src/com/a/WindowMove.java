package com.a;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WindowMove extends JFrame{
       LP layeredPane;
       JButton button;
       public WindowMove() {
	    layeredPane=new LP();
	  //add(layeredPane,BorderLayout.CENTER);
	    setVisible(true);
	    button =new JButton("拖动");
    	button.addMouseListener(layeredPane);
    	button.addMouseMotionListener(layeredPane);
    	setLayout(new FlowLayout());
    	add(button);
	 //  setBounds(12,12,300,300);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       }
}
