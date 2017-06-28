package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import Jdbc.jdbcMysql;

import com.mysql.jdbc.PreparedStatement;

public class chefAdd implements ActionListener {

	private JFrame frame;
	private JTextField idField;
	private JTextField nameField;
	private JTextField ageField;
	private JTextField moneyField;
	private JTextField adressField;
	private JTextField telField;
	JButton addButton;
	JButton resertButton;
	jdbcMysql jd = new jdbcMysql();

	public chefAdd() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel headLabel = new JLabel("添加厨师");
		headLabel.setBounds(109, 0, 200, 41);
		headLabel.setFont(new Font("楷体", Font.BOLD, 30));
		frame.getContentPane().add(headLabel);

		JLabel idLabel = new JLabel("编号");
		idLabel.setBounds(100, 40, 76, 30);
		frame.getContentPane().add(idLabel);

		JLabel nameLabel = new JLabel("姓名");
		nameLabel.setBounds(100, 70, 66, 30);
		frame.getContentPane().add(nameLabel);

		JLabel ageLabel = new JLabel("年龄");
		ageLabel.setBounds(100, 100, 66, 30);
		frame.getContentPane().add(ageLabel);

		JLabel moneyLabel = new JLabel("薪水");
		moneyLabel.setBounds(100, 130, 80, 22);
		frame.getContentPane().add(moneyLabel);

		JLabel adressLabel = new JLabel("地址");
		adressLabel.setBounds(100, 160, 80, 22);
		frame.getContentPane().add(adressLabel);

		JLabel delLabel = new JLabel("电话");
		delLabel.setBounds(100, 189, 97, 22);
		frame.getContentPane().add(delLabel);

		idField = new JTextField();
		idField.setBounds(184, 40, 66, 21);
		frame.getContentPane().add(idField);
		idField.setColumns(10);

		nameField = new JTextField();
		nameField.setBounds(184, 70, 66, 21);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);

		ageField = new JTextField();
		ageField.setBounds(184, 100, 66, 21);
		frame.getContentPane().add(ageField);
		ageField.setColumns(10);

		moneyField = new JTextField();
		moneyField.setBounds(184, 130, 66, 21);
		frame.getContentPane().add(moneyField);
		moneyField.setColumns(10);

		adressField = new JTextField();
		adressField.setBounds(184, 160, 66, 21);
		frame.getContentPane().add(adressField);
		adressField.setColumns(10);

		telField = new JTextField();
		telField.setBounds(184, 190, 66, 21);
		frame.getContentPane().add(telField);
		telField.setColumns(10);

		addButton = new JButton("添加");
		addButton.setBounds(86, 222, 76, 30);
		frame.getContentPane().add(addButton);
		addButton.addActionListener(this);// 添加监视器

		resertButton = new JButton("返回");
		resertButton.setBounds(180, 222, 76, 30);
		frame.getContentPane().add(resertButton);
		resertButton.addActionListener(this);// 添加监视器

	}

	public void actionPerformed(ActionEvent e) {
		if (!idField.getText().isEmpty()) {

			String ids = idField.getText();
			int id = Integer.parseInt(ids);
			String name = nameField.getText();
			String ages = ageField.getText();
			int age = Integer.parseInt(ages);
			String moneys = moneyField.getText();
			int money = Integer.parseInt(moneys);
			String adress = adressField.getText();
			String tel = telField.getText();

			
			if (e.getSource() == addButton) {
				try {
					Connection conn = jd.getConn();
					String sql = "insert into chef(id,name,age,money,adress,tel) values (?,?,?,?,?,?)";
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, age);
					ps.setInt(4, money);
					ps.setString(5, adress);
					ps.setString(6, tel);
					ps.executeUpdate();
					JTextField s = new JTextField();
					s.setEditable(false);
					s.setText("添加成功");
					s.setFont(new Font("楷体", Font.BOLD, 30));
					s.setBounds(100, 110, 140, 50);
					frame.add(s);
					ps.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}else{
			if (e.getSource() == addButton) {
				idField.setText("请输入内容");
			}
		}
		if (e.getSource() == resertButton) {
			chef s = new chef();
			frame.dispose();
		}
	}
}
