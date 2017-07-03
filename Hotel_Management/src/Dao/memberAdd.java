package Dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Jdbc.jdbcMysql;

import com.mysql.jdbc.PreparedStatement;

public class memberAdd implements ActionListener {

	private JFrame frame;
	private JTextField idField;
	private JTextField nameField;
	private JTextField ageField;
	private JTextField moneyField;
	private JTextField adressField;
	private JTextField telField;
	jdbcMysql jd = new jdbcMysql();

	public memberAdd() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel headLabel = new JLabel("添加会员");
		headLabel.setBounds(109, 0, 200, 50);
		headLabel.setFont(new Font("楷体", Font.BOLD, 30));
		frame.getContentPane().add(headLabel);

		JLabel idLabel = new JLabel("ID");
		idLabel.setBounds(120, 80, 41, 30);
		frame.getContentPane().add(idLabel);

		JLabel nameLabel = new JLabel("姓名");
		nameLabel.setBounds(120, 115, 41, 30);
		frame.getContentPane().add(nameLabel);

		JLabel delLabel = new JLabel("电话");
		delLabel.setBounds(120, 159, 41, 22);
		frame.getContentPane().add(delLabel);

		idField = new JTextField();
		idField.setBounds(184, 80, 66, 21);
		frame.getContentPane().add(idField);
		idField.setColumns(10);
		idField.addActionListener(this);

		nameField = new JTextField();
		nameField.setBounds(184, 120, 66, 21);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
		nameField.addActionListener(this);

		telField = new JTextField();
		telField.setBounds(184, 160, 66, 21);
		frame.getContentPane().add(telField);
		telField.setColumns(10);
		telField.addActionListener(this);

		addButton = new JButton("确认");
		addButton.setBounds(113, 202, 76, 30);
		frame.getContentPane().add(addButton);
		addButton.addActionListener(this);

		resertButton = new JButton("返回");
		resertButton.setBounds(199, 202, 76, 30);
		frame.getContentPane().add(resertButton);
		resertButton.addActionListener(this);

	}

	JButton resertButton;
	JButton addButton;

	public void actionPerformed(ActionEvent e) {
		String ids = idField.getText();
		int id = Integer.parseInt(ids);
		// System.out.println(id);
		String name = nameField.getText();
		String tel = telField.getText();
		// System.out.println(name);
		// System.out.println(tel);
		if (e.getSource() == addButton) {
			try {
				Connection conn = jd.getConn();
				String sql = "insert into member(id,name,tel) values (?,?,?)";
				PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, tel);
				ps.executeUpdate();
				JOptionPane.showMessageDialog(frame, "添加成功", "消息", JOptionPane.DEFAULT_OPTION);
				ps.close();
				member m = new member();
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == resertButton) {
			member s = new member();
			frame.dispose();
		}
	}
}
