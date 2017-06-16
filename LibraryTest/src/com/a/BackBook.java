package com.a;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BackBook extends JFrame implements ActionListener{
    Label label,labelHave;
    JTextField idField;
    JTextArea area;
	public BackBook(){
		setTitle("归还图书");
		init();
		setBounds(100, 100, 500, 300);
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void init(){
		setLayout(null);
		label=new Label("请输入要归还的书籍编号");
		label.setFont(new Font("宋体", Font.BOLD, 17));
		label.setBounds(30, 30, 200, 20);
		add(label);
		idField= new JTextField();
		idField.setBounds(230, 30, 35, 20);
		add(idField);
		labelHave=new Label("尚在借阅中的书籍:");
		labelHave.setBounds(60, 90, 230, 30);
		labelHave.setFont(new Font("宋体", Font.BOLD, 17));
		add(labelHave);
	}
	public void actionPerformed(ActionEvent e) {
	
	}

}
