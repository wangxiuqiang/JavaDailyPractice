package com.a;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BackBook extends JFrame implements ActionListener{
    Label label,labelHave;
    JTextField idField;
    JTextArea area;
    JButton goBack,back;
	public BackBook(){
		setTitle("归还图书");
		init();
		setBounds(100, 100, 500, 300);
		setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void init(){
		getContentPane().setLayout(null);
		label=new Label("请输入要归还的图书编号");
		label.setBounds(30, 30, 200, 20);
		label.setFont(new Font("楷体", Font.BOLD, 17));
		getContentPane().add(label);
		idField= new JTextField();
		idField.setBounds(236, 30, 35, 20);
		getContentPane().add(idField);
		labelHave=new Label("尚在借阅的图书");
		labelHave.setBounds(60, 90, 230, 30);
		labelHave.setFont(new Font("楷体", Font.BOLD, 17));
		getContentPane().add(labelHave);
		
		 goBack = new JButton("归还");
		goBack.setBounds(277, 28, 60, 23);
		getContentPane().add(goBack);
		back  = new JButton("返回");
		back.setBounds(277, 63, 60, 23);
		getContentPane().add(back);
		
		area = new JTextArea();
		area.setBounds(70, 126, 244, 138);
		area.setEditable(false);
		getContentPane().add(area);
		back.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
	       if(e.getSource() == back){
	    	   StudentIn s = new StudentIn();
	    	   this.dispose();
	       }
	}
}
