package com.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Label;
import java.awt.event.*;

public class AddBook extends JFrame implements MouseListener,ActionListener {
    JButton queryBook,addFinally;
    Label label;
    public AddBook(){
    	init();
    	setTitle("添加图书");
    	setVisible(true);
    	setBounds(100,100,500,300);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void init(){
    	setLayout(null);
    	queryBook=new JButton("查询图书");
    	queryBook.setBounds(100,10,100,28);
    	add(queryBook);
    	addFinally=new JButton("添加");
    	addFinally.setBounds(120,50,100,28);
    	add(addFinally);
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
