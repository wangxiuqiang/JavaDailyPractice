package com.a;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.naming.InitialContext;
import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class BoxLayout {

	public static void main(String[] args) {
           BoxLayoutbox blb=new BoxLayoutbox();
           blb.setBounds(100, 100, 310,260);
           blb.setTitle("盒式布局");
	}
    
}
class BoxLayoutbox extends JFrame{
	Box basebox ,boxV1,boxV2;
	public BoxLayoutbox(){
		setLayout(new FlowLayout());
		init();//函数
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	void init(){
		boxV1=Box.createVerticalBox();
		boxV1.add(new Label("姓名"));
		boxV1.add(Box.createVerticalStrut(8));
		boxV1.add(new Label("email"));
		boxV1.add(Box.createVerticalStrut(8));
		boxV1.add(new Label("职业"));
		boxV2 =Box.createVerticalBox();
		boxV2.add(new JTextField(10));
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(new JTextField(10));
		boxV2.add(Box.createVerticalStrut(8));
		boxV2.add(new JTextField(10));
		basebox=Box.createHorizontalBox();
		basebox.add(boxV1);
		basebox.createHorizontalStrut(10);
		basebox.add(boxV2);
		add(basebox);
	}
	
}