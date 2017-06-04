package com.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.*;

public class AddBook extends JFrame implements MouseListener,ActionListener {
    JButton addFinally;
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
    	label =new Label("又有新书了吗,快快添加让我的小伙伴们看一看吧");
        label.setBounds(0,30,500,21);
        label.setFont(new Font("楷体", Font.BOLD, 20));
        add(label);
        Label labelname,labelpublishing,labelauthor,labelDayMoney;
        labelname=new Label("请输入书籍名称");
        labelname.setBounds(50,100,500,16);
        labelname.setFont(new Font("楷体", Font.BOLD, 15));
        labelpublishing=new Label("请输入书籍出版社");
        labelpublishing.setBounds(50,130,500,16);
        labelpublishing.setFont(new Font("楷体", Font.BOLD, 15));
        labelDayMoney=new Label("请输入书籍名称");
        labelDayMoney.setBounds(50,160,500,16);
        labelDayMoney.setFont(new Font("楷体", Font.BOLD, 15));
    	labelauthor=new Label("请输入书籍作者");
    	labelauthor.setBounds(50,210,500,16);
    	labelauthor.setFont(new Font("宋体", Font.BOLD, 15));
        add(labelname);
    	add(labelpublishing);
    	add(labelDayMoney);
    	add(labelauthor);
        addFinally=new JButton("添加");
    	addFinally.setBounds(300,50,100,28);
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
