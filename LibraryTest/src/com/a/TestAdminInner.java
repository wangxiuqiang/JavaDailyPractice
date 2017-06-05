package com.a;

import java.awt.Button;
import java.awt.event.*;

import javax.swing.*;


public class TestAdminInner extends JFrame implements MouseListener,ActionListener{

	JButton add,query,delete,update;
	JButton quit;
	public TestAdminInner() {
	      init();
	      setTitle("图书管理");
	      setVisible(true);
		  setBounds(100,100,500,300);
	}
	public void init(){
		setLayout(null);
		add=new JButton("添加图书");
		add.setBounds(180,40,110,28);
		add(add);
	    add.addMouseListener(this);
		delete=new JButton("删除图书");
		delete.setBounds(180,90,110,28);
		add(delete);
		update=new JButton("修改图书");
		update.setBounds(180,140,110,28);
		add(update);
		query=new JButton("查询图书");
		query.setBounds(180,190,110,28);
		add(query);
		 quit=new JButton("退出");
		quit.setBounds(180,240,110,28);
		add(quit);
		quit.addMouseListener(this);
		query.addMouseListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==quit){
			dispose();
		}
		if(e.getSource()==add){
			AddBook addBook=new AddBook();
			this.dispose();
		}
		if(e.getSource()==query){
			QueryBook qb=new QueryBook();
			this.dispose();
		}
		
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
