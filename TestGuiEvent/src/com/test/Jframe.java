package com.test;

import java.awt.FlowLayout;
import java.nio.channels.NonWritableChannelException;

import javax.naming.InitialContext;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Jframe extends JFrame{
     JTextField textShow,textInput;
     public Jframe() {
		init();
		setBounds(100,100,150,150);
		setVisible(true);
		setTitle("数据库输出");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
     void init(){
    	 setLayout(new FlowLayout());
    	 textInput=new JTextField(10);
    	 textShow=new JTextField(10);
    	 textShow.setEditable(false);
    	PoliceListen listener=new PoliceListen();
    	listener.setJTestField(textShow);
       textInput.addActionListener(listener);
        add(textInput);
        add(textShow);
     }
}
