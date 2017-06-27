package com.a;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class StudentInner extends JFrame implements MouseListener, ActionListener {
	JButton queren, quit;
	static public String userText, passwdText;
	JTextField user = new JTextField(10);
	JPasswordField passwd = new JPasswordField(10);

	public StudentInner() {
	}

	public void init() {
		setVisible(true);
		setBounds(100, 100, 500, 300);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Label label = new Label("欢迎学生登录,请输入用户名和密码:");
		label.setBounds(10, 0, 400, 80);
		label.setFont(new Font("楷体", Font.BOLD, 20));
		add(label);
		Label userlabel = new Label("学生ID:");
		userlabel.setBounds(155, 80, 70, 20);
		userlabel.setFont(new Font("楷体", Font.BOLD, 18));
		add(userlabel);

		user.setBounds(240, 80, 60, 25);
		add(user);

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
		user.addActionListener(this);
		passwd.addActionListener(this);
		quit.addMouseListener(this);
		queren.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		userText = user.getText();
		passwdText = passwd.getText();
		if (e.getSource() == queren) {
			//System.out.println(userText);
			jdbcDriver jd = new jdbcDriver();
			try {
				String name1 , passwd1 = null;
				Class.forName(jd.driver);
				Connection connection = DriverManager.getConnection(jd.url, jd.user, jd.password);
				String sql = "select name,passwd from student where id="+userText;
				Statement statement = connection.createStatement();
				ResultSet rSet = statement.executeQuery(sql);
				while (rSet.next()) {
					name1 = rSet.getString(1);
					passwd1 = rSet.getString(2);
				}
				 //System.out.println(passwd1);
				 if (passwd1.equals(passwdText)) {
						StudentIn si = new StudentIn();
						this.dispose();
					} else {
						Lose lose = new Lose();
						dispose();
					}
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			

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
		// TODO Auto-generated method stub

	}

}
