package com.a;

import java.awt.Button;
import java.awt.event.*;

import javax.swing.*;


public class TestAdminInner extends JFrame implements MouseListener,ActionListener{

	JButton add,query,delete,update;
	public TestAdminInner() {
	      init();
	      setTitle("图书管理");
	      setVisible(true);
		  setBounds(100,100,500,300);
	}
	public void init(){
		setLayout(null);
		add=new JButton("添加图书");
		add.setBounds(180,60,110,28);
		add(add);
		delete=new JButton("删除图书");
		delete.setBounds(180,110,110,28);
		add(delete);
		update=new JButton("修改图书");
		update.setBounds(180,160,110,28);
		add(update);
		query=new JButton("查询图书");
		query.setBounds(180,210,110,28);
		add(query);
	}
	public void actionPerformed(ActionEvent e) {
		
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
