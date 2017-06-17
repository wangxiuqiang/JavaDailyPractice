package com.a;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Register {

	private JFrame frame;
	private JTextField nameFiled;
	private JTextField passwdField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register window = new Register();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Register() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("用户注册");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel name = new JLabel("账号");
		name.setBounds(94, 71, 95, 26);
		frame.getContentPane().add(name);
		
		JLabel password = new JLabel("密码");
		password.setBounds(94, 145, 63, 13);
		frame.getContentPane().add(password);
		
		nameFiled = new JTextField();
		nameFiled.setBounds(190, 76, 130, 25);
		frame.getContentPane().add(nameFiled);
		nameFiled.setColumns(10);
		
		passwdField = new JTextField();
		passwdField.setBounds(190, 140, 130, 25);
		frame.getContentPane().add(passwdField);
		passwdField.setColumns(10);
		
		JButton zhuCe = new JButton("确认注册");
		zhuCe.setBounds(200, 200, 104, 23);
		frame.getContentPane().add(zhuCe);
	}
}
