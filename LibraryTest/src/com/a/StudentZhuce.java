package com.a;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class StudentZhuce {

	private JFrame frame;
	private JTextField nameFild;
	private JTextField numberFiled;
	private JTextField moneyField;
	private JTextField passwordField;
	private JTextField doPasswdField;

	/**
	 * Launch the application.
	 */
	
			public void init() {
				   frame = new JFrame();
					frame.setVisible(true);
					frame.setTitle("学生注册");
					initialize();
			}


	/**
	 * Create the application.
	 */
	public StudentZhuce() {
	        init();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("姓名");
		name.setBounds(56, 31, 63, 21);
		name.setFont(new Font("宋体", Font.BOLD, 19));
		frame.getContentPane().add(name);
		
		JLabel number = new JLabel("学号");
		number.setBounds(56, 71, 63, 21);
		number.setFont(new Font("宋体", Font.BOLD, 19));
		frame.getContentPane().add(number);
		
		JLabel money = new JLabel("金额");
		money.setBounds(56, 111, 63, 21);
		money.setFont(new Font("宋体", Font.BOLD, 19));
		frame.getContentPane().add(money);
		
		JLabel passwd = new JLabel("密码");
		passwd.setBounds(56, 151, 63, 21);
		passwd.setFont(new Font("宋体", Font.BOLD, 19));
		frame.getContentPane().add(passwd);
		
		JLabel passwdResert = new JLabel("确认密码");
		passwdResert.setBounds(40, 191, 100, 21);
		passwdResert.setFont(new Font("宋体", Font.BOLD, 19));
		frame.getContentPane().add(passwdResert);
		
		nameFild = new JTextField();
		nameFild.setBounds(158, 31, 64, 19);
		frame.getContentPane().add(nameFild);
		nameFild.setColumns(10);
		
		numberFiled = new JTextField();
		numberFiled.setBounds(158, 71, 64, 19);
		frame.getContentPane().add(numberFiled);
		numberFiled.setColumns(10);
		
		moneyField = new JTextField();
		moneyField.setBounds(158, 111, 64, 19);
		frame.getContentPane().add(moneyField);
		moneyField.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setBounds(158, 151, 64, 19);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		doPasswdField = new JTextField();
		doPasswdField.setBounds(158, 191, 64, 19);
		frame.getContentPane().add(doPasswdField);
		doPasswdField.setColumns(10);
		
		JButton submit = new JButton("注册");
		submit.setBounds(75, 230, 82, 25);
		frame.getContentPane().add(submit);
		
		JButton Rest = new JButton("重置");
		Rest.setBounds(207, 230, 82, 25);
		frame.getContentPane().add(Rest);
	}
}
