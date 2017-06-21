package com.a;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Lose extends JFrame implements ActionListener {
	JButton back = new JButton("返回");
	JLabel information = new JLabel("用户名和密码不匹配!");

	public Lose() {
		init();
		setTitle("登录失败");
		setVisible(true);
		setBounds(100, 100, 500, 300);
	}

	public void init() {
		setLayout(null);
		information.setBounds(30, 30, 300, 30);
		information.setFont(new Font("宋体", Font.BOLD, 22));
		add(information);
		back.setBounds(90, 90, 80, 25);
		add(back);
		back.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		/*
		 * 按back按钮后把管理员的static 值 变为空 如果失败就把 管理员的值置为空,
		 * 保证登录一次管理员失败后可以登录学生在登录,
		 * 学生失败后返回学生登录界面, 不会因为static的管理员不为空
		 * 而返回管路员登录界面
		 */
		if (e.getSource() == back) {
			TestAdminIn tam = new TestAdminIn();
			if (tam.userText != null) {
				tam.userText = null;
				tam.init();
				this.dispose();
			} else {
				tam.userText = null;
				StudentInner std = new StudentInner();
				std.init();
				this.dispose();
			}
		}
	}
}
