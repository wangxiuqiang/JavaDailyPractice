package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Jdbc.jdbcMysql;

import com.mysql.jdbc.PreparedStatement;

public class deskIn implements ActionListener {

	private JFrame frame;
	private JTextField idField;
	private JTextField nameField;
	private JTextField sizeField;
	private JTextField peopleField;
	private JTextField adressField;
	private JTextField telField;
	JButton addButton;
	JButton resertButton;
	jdbcMysql jd = new jdbcMysql();

	public deskIn() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("闲居阁");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel roomLabel = new JLabel("添加餐桌");
		roomLabel.setBounds(109, 0, 200, 41);
		roomLabel.setFont(new Font("楷体", Font.BOLD, 30));
		frame.getContentPane().add(roomLabel);

		JLabel idLabel = new JLabel("编号");
		idLabel.setBounds(100, 40, 76, 30);
		frame.getContentPane().add(idLabel);

		JLabel nameLabel = new JLabel("餐桌名");
		nameLabel.setBounds(100, 70, 66, 30);
		frame.getContentPane().add(nameLabel);

		JLabel sizeLabel = new JLabel("大小");
		sizeLabel.setBounds(100, 100, 66, 30);
		frame.getContentPane().add(sizeLabel);

		JLabel peopleLabel = new JLabel("可容纳人数");
		peopleLabel.setBounds(100, 130, 80, 22);
		frame.getContentPane().add(peopleLabel);

		idField = new JTextField();
		idField.setBounds(184, 40, 66, 21);
		frame.getContentPane().add(idField);
		idField.setColumns(10);

		nameField = new JTextField();
		nameField.setBounds(184, 70, 66, 21);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);

		sizeField = new JTextField();
		sizeField.setBounds(184, 100, 66, 21);
		frame.getContentPane().add(sizeField);
		sizeField.setColumns(10);

		peopleField = new JTextField();
		peopleField.setBounds(184, 130, 66, 21);
		frame.getContentPane().add(peopleField);
		peopleField.setColumns(10);

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
			if (e.getSource() == addButton) {
				try {
					Connection conn = jd.getConn();
					String sql = "insert into houseanddesk(id,name,tag,flag) values (?,?,?)";
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
					ps.setInt(1, id);
					ps.setString(2, name);
					ps.setInt(3, 2);
					ps.setInt(4, 0);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(frame, "添加成功", "消息", JOptionPane.ERROR_MESSAGE);
					ps.close();
					chef c = new chef();
					frame.dispose();
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
			deskMange_1 s = new deskMange_1();
			frame.dispose();
		}
	

	}
}