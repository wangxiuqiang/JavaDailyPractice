package com.a;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class QueryBook extends JFrame implements MouseListener{

	JButton queryAll;
	JTextArea allBook;
	public QueryBook(){
		init();
		setVisible(true);
		setBounds(100,100,500,300);
		setTitle("查询书籍");
	}
	public void init(){
		setLayout(null);
		
		queryAll = new JButton("查询图书");
		queryAll.setBounds(50, 50,95, 25);
		add(queryAll);
		allBook = new JTextArea();
		allBook.setBounds(50,50,160,180);
       add(allBook);
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
