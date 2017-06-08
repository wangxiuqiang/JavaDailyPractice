package com.a;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class ChangeBook implements MouseListener,ActionListener,ItemListener{
	public JFrame changeBook;
	public JTextField QueRen, input;
	JButton changeOk, changeFirst;
    public String str;
    public  JComboBox<String> comboBox;
	public ChangeBook() {
		changeBook = new JFrame("修改图书");
		init();
		ComboBox();
		changeBook.setVisible(true);
		changeBook.setBounds(100, 100, 500, 300);
	}

	public void init() {
		changeBook.setLayout(null);
		changeFirst = new JButton("确认");
		changeFirst.setBounds(320, 50, 60, 30);
		QueRen = new JTextField();
		QueRen.setEditable(false);
		QueRen.setText("请输入需要修改的书籍id");
		QueRen.setBounds(60, 50, 160, 35);
		QueRen.setFont(new Font("宋体", Font.BOLD, 13));
		changeBook.add(QueRen);
		input = new JTextField();
		input.setBounds(230, 55, 60, 25);
		changeBook.add(input);
		changeOk = new JButton("修改");
		changeOk.setBounds(350, 130, 60, 20);
		changeBook.add(changeFirst);
		changeBook.add(changeOk);
		changeOk.addMouseListener(this);
	}
         /**
          * 添加新的容器   然后改他的布局格式
          */
	//	public void chang(){
//			Label labelName=new Label("名称");
//			Label labelType=new Label("种类");
//			Label labelPrice=new Label("价格");
//			Label labelPublish=new Label("出版社");
//			Label labelAuthor=new Label("作者");
//			Label labelCount=new Label("数量");
//			Label labelDayMoney=new Label("日租金");
//			   changeBook.add(labelName);
//			   changeBook.add(labelType);
//			   changeBook.add(labelPrice);
//			   changeBook.add(labelPublish);
//			   changeBook.add(labelAuthor);
//			   changeBook.add(labelCount);
//			   changeBook.add(labelDayMoney);
 	//	}
	public void ComboBox() {
        comboBox=new JComboBox<String>();
         comboBox.addItem("请选择要修改的内容");
         comboBox.addItem("名称");
         comboBox.addItem("种类");
         comboBox.addItem("价格");
         comboBox.addItem("出版社");
         comboBox.addItem("作者");
         comboBox.addItem("数量");
         comboBox.addItem("日租金");
         /*
          * 给下拉列表加内容可以用String []a ={"",""}
          * 然后用for循环  a[i]添加
          */
         comboBox.setBounds(90, 130,150, 20); 
         comboBox.addItemListener(this);
         changeBook.add(comboBox);
         JTextField change=new JTextField();
         change.setBounds(256, 130,80, 20);
         changeBook.add(change);
         
	}
  
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==changeOk){
			//System.out.println(str);
		}
	}
	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}

	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void itemStateChanged(ItemEvent e) {
         str=comboBox.getSelectedItem().toString();  
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
