package com.a;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BorrowBook extends JFrame implements ActionListener{
    public JButton borrowBook ;
    public JTextField field;
    public JLabel label;
	public BorrowBook(){
		init();
		setTitle("借阅图书");
		setVisible(true);
		setBounds(100,100,500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
   public void init(){
	   setLayout(null);
	   label =new JLabel("请输入要借的图书编号");
	   label.setFont(new Font("宋体",Font.BOLD, 15));
	   label.setBounds(50, 80,260, 18);
	   add(label);
	   field=new JTextField();
	   field.setBounds(220,80,50,18);
	   add(field);
	   borrowBook=new JButton("借阅");
	   borrowBook.setBounds(160,120,80,25);
	   add(borrowBook);
	   
   }
	public void actionPerformed(ActionEvent e) {

	}
}
