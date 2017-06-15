package com.a;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestJFrame extends JFrame implements MouseListener{
        JButton stuButton,adminButton,zhuceButton,quitButton;
        Label label;
        public TestJFrame() {
		      init();
		      setTitle("图书管理系统");
		      setVisible(true);
		      setBounds(100, 100, 500, 300);
        }
        public void init(){
        	setLayout(null);
//        	Denglu in=new Denglu();
        	label =new Label("欢迎进入图书管理系统",label.CENTER);
        	stuButton=new JButton("学生登录");
        	adminButton=new JButton("管理员登陆");
        	zhuceButton=new JButton("学生注册");
        	quitButton=new JButton("退出");
        	label.setFont(new Font("楷体", Font.BOLD, 20));
        	label.setBounds(10, 0, 300, 70);
        	add(label);
        	adminButton.setBounds(170,70,100,30);
        	add(adminButton);
        	stuButton.setBounds(170,110,100,30);
        	add(stuButton);
        	zhuceButton.setBounds(170,150,100,30);
        	add(zhuceButton);
        	quitButton.setBounds(170,190,100,30);
            add(quitButton);
            quitButton.addMouseListener(this);
            adminButton.addMouseListener(this);
            stuButton.addMouseListener(this);
        }
		public void mouseClicked(MouseEvent e) {
			if(e.getSource()==quitButton){
				this.dispose();
			}
			else if(e.getSource()==adminButton){
				TestAdminIn ta=new TestAdminIn();
				ta.setTitle("管理员登录");
				this.dispose();
			}
			else if(e.getSource()==stuButton){
				
				StudentInner si=new StudentInner();
				this.dispose();
			}
			else if(e.getSource()==zhuceButton){
				
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
	
}
