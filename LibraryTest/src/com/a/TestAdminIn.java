package com.a;

import java.awt.Button;
import java.awt.Font;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.naming.InitialContext;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class TestAdminIn extends JFrame implements MouseListener, ActionListener {
	JButton queren, quit;
	String userText, passwdText;
	JTextField user, passwd;

	public TestAdminIn() {
		init();
		setVisible(true);
		setBounds(100, 100, 500, 300);
	}

	public void init() {
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Label label = new Label("欢迎管理员登录,请输入用户名和密码:");
		label.setBounds(10, 0, 400, 80);
		label.setFont(new Font("楷体", Font.BOLD, 20));
		add(label);
		Label userlabel = new Label("用户名:");
		userlabel.setBounds(155, 80, 60, 20);
		userlabel.setFont(new Font("楷体", Font.BOLD, 18));
		add(userlabel);
		user = new JTextField(10);
		user.setBounds(240, 80, 60, 25);
		add(user);
		passwd = new JTextField(10);
		Label pwdlabel = new Label("密码:");
		pwdlabel.setBounds(165, 120, 60, 20);
		pwdlabel.setFont(new Font("楷体", Font.BOLD, 18));
		add(pwdlabel);
		passwd.setBounds(240, 120, 60, 25);
		add(passwd);
		queren = new JButton("登录");
		quit = new JButton("退出");
		queren.setBounds(160, 160, 60, 25);
		quit.setBounds(240, 160, 60, 25);
		add(queren);
		add(quit);
		quit.addMouseListener(this);
		queren.addActionListener(this);
		user.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {	
		userText = user.getText();
		if(e.getSource() == queren){
			//System.out.println(userText);
			TestAdminInner tai = new TestAdminInner();
			this.dispose();
		}
	}

	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == quit) {
			TestMain tm = new TestMain();
			tm.main(null);
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
		
	}

}
