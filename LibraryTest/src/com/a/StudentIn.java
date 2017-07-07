package com.a;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class StudentIn extends JFrame implements ActionListener {

	JButton queryBook, borrowBook, backBook, back;

	public StudentIn() {
		init();
		setTitle("学生登录");
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		setLayout(null);
		queryBook = new JButton("查询图书");
		borrowBook = new JButton("借阅图书");
		backBook = new JButton("归还图书");
		back = new JButton("返回");
		queryBook.setBounds(180, 80, 100, 30);
		borrowBook.setBounds(180, 140, 100, 30);
		backBook.setBounds(180, 200, 100, 30);
		back.setBounds(180, 240, 100, 30);
		add(backBook);
		add(back);
		add(borrowBook);
		add(queryBook);
		queryBook.addActionListener(this);
		borrowBook.addActionListener(this);
		backBook.addActionListener(this);
		back.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == queryBook) {
			QueryBook qb = new QueryBook();
			this.dispose();
		}
		if (e.getSource() == borrowBook) {
			BorrowBook bb = new BorrowBook();
			this.dispose();
		}
		if (e.getSource() == backBook) {
			BackBook bb = new BackBook();
			this.dispose();
		}
		if (e.getSource() == back) {
          TestJFrame s = new TestJFrame();
            this.dispose();
		}
	}

}
