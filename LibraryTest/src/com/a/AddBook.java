package com.a;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AddBook extends JFrame implements MouseListener,ActionListener {
    JButton addFinally;
    Label label;
    JTextField name,type,publishing,dayMoney,Money,Number,author;
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
       
        Label labelname,labelNumber,labelpublishing,labeltype,labelMoney,labelauthor,labelDayMoney;
        labelname=new Label("请输入名称");
        labelname.setBounds(50,70,80,16);
        labeltype=new Label("请输入种类");
        labeltype.setBounds(50,100,80,16);
        labelMoney=new Label("请输入价格");
        labelMoney.setBounds(50,130,80,16);
        labeltype.setFont(new Font("楷体", Font.BOLD, 15));
        labelMoney.setFont(new Font("楷体", Font.BOLD, 15));
        labelname.setFont(new Font("楷体", Font.BOLD, 15));
        
        labelpublishing=new Label("请输入出版社");
        labelpublishing.setBounds(50,160,80,16);
        labelpublishing.setFont(new Font("楷体", Font.BOLD, 15));
        
        labelauthor=new Label("请输入作者");
    	labelauthor.setBounds(50,190,80,16);
    	labelauthor.setFont(new Font("宋体", Font.BOLD, 15));
        labelDayMoney=new Label("请输入日租金");
        labelDayMoney.setBounds(50,220,80,16);
        labelDayMoney.setFont(new Font("楷体", Font.BOLD, 15));
    	labelNumber=new Label("请输入数量");
    	labelNumber.setBounds(50,250,80,16);
    	labelNumber.setFont(new Font("宋体", Font.BOLD, 15));
        
    	add(labelname);
    	add(labelMoney);
    	add(labeltype);
    	add(labelNumber);
    	add(labelpublishing);
    	add(labelDayMoney);
    	add(labelauthor);
        addFinally=new JButton("添加");
    	addFinally.setBounds(330,150,100,28);
    	add(addFinally);
    	addFinally.addMouseListener(this);
    	/*
    	 * 添加textfile 
    	 */
    	
		 name = new JTextField();
		name.setBounds(140, 70, 80, 18);
		add(name);
		type = new JTextField();
		type.setBounds(140, 100, 80, 18);
		add(type);
		Money= new JTextField();
		Money.setBounds(140, 130, 80, 18);
		add(Money);
		publishing= new JTextField();
		publishing.setBounds(140, 160, 80, 18);
		add(publishing);
		author= new JTextField();
		author.setBounds(140, 190, 80, 18);
		add(author);
		dayMoney= new JTextField();
		dayMoney.setBounds(140, 220, 80, 18);
		add(dayMoney);
		Number= new JTextField();
		Number.setBounds(140, 250, 80, 18);
		add(Number);
    }
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==addFinally){
			//	String string=name.getText();
				//用get方法把Text框中的内容读出在写入数据库
			TestAdminInner tai=new TestAdminInner();
		
			// 添加输入后就把所有的数据写入 输出成功对话框
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
