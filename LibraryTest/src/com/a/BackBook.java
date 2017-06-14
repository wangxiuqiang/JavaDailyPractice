package com.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class BackBook extends JFrame implements ActionListener{

	public BackBook(){
		setTitle("归还图书");
		init();
		setBounds(100, 100, 500, 300);
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void init(){
		
	}
	public void actionPerformed(ActionEvent e) {
	
	}

}
