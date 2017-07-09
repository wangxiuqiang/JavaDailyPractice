package com.a;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class StudentZhuce implements ActionListener {

	private JFrame frame;
	private JTextField nameField;
	private JTextField numberFiled;
	private JTextField moneyField;
	private JPasswordField passwordField;
	private JPasswordField doPasswdField;

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

		nameField = new JTextField();
		nameField.setBounds(158, 31, 64, 19);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);

		numberFiled = new JTextField();
		numberFiled.setBounds(158, 71, 64, 19);
		frame.getContentPane().add(numberFiled);
		numberFiled.setColumns(10);

		moneyField = new JTextField();
		moneyField.setBounds(158, 111, 64, 19);
		frame.getContentPane().add(moneyField);
		moneyField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(158, 151, 64, 19);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);

		doPasswdField = new JPasswordField();
		doPasswdField.setBounds(158, 191, 64, 19);
		frame.getContentPane().add(doPasswdField);
		doPasswdField.setColumns(10);

		submit = new JButton("注册");
		submit.setBounds(75, 230, 82, 25);
		frame.getContentPane().add(submit);
		submit.addActionListener(this);
		Rest = new JButton("重置");
		Rest.setBounds(207, 230, 82, 25);
		frame.getContentPane().add(Rest);
		Rest.addActionListener(this);
	}
	JButton submit, Rest;
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == submit) {
			if (!nameField.getText().isEmpty()) {
				int n = 0;
				String name = nameField.getText();
				String id = numberFiled.getText();
				String money = moneyField.getText();
				String passwd = passwordField.getText();
				String password = doPasswdField.getText();
				int ida = Integer.parseInt(id);
				float moneya = Float.parseFloat(money);
				if (passwd.equals(password)) {
					try {
						Class.forName(jdbcDriver.driver);
						Connection connection = (Connection) DriverManager.getConnection(jdbcDriver.url,
								jdbcDriver.user, jdbcDriver.password);
						String sql = "insert student(id, passwd,name,money) values (?,?,?,?)";
						PreparedStatement ps = (PreparedStatement) connection.prepareStatement(sql);
						ps.setInt(1, ida);
						ps.setString(2, passwd);
						ps.setString(3, name);
						ps.setFloat(4, moneya);
						// ps.setInt(5,n);
						ps.execute();
						connection.close();
						JOptionPane.showMessageDialog(frame, "注册成功，请登录", "提示", JOptionPane.DEFAULT_OPTION);
						TestJFrame testJFrame = new TestJFrame();
						frame.dispose();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(frame, "两次密码输入不相同", "提示", JOptionPane.DEFAULT_OPTION);
				}
			}
		}
		if (e.getSource() == Rest) {
			nameField.setText("");
			numberFiled.setText("");
			moneyField.setText("");
			passwordField.setText("");
			doPasswdField.setText("");
		}
	}
}
