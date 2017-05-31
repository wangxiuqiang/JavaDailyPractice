package com.test;

import java.awt.FlowLayout;

import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowNumber extends JFrame{
       JTextField textSource,textShow;
       PoliceListen listen;
       public WindowNumber(){
    	   init();
    	   setBounds(100,100,150,150);
    	   setVisible(true);
    	   setDefaultCloseOperation(EXIT_ON_CLOSE);
       }
       void init(){
    	   setLayout(new FlowLayout());
    	   textSource=new JTextField(10);
    	   textShow=new JTextField(10);
    	   textShow.setEditable(false);
    	   listen=new PoliceListen();
    	   listen.setJTextField(textShow);
    	   textSource.addActionListener(listen);
    	   add(textSource);
    	   add(textShow);
    	   
       }
}
