package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.jar.Attributes.Name;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

import javax.swing.JButton;

public class bookRoom implements ActionListener {

	private JFrame frame;
	private JTextField roomField;
	private JTextField roomField_1;
	private JTextField sizeField;
	private JTextField telField;

	public bookRoom() {
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

		JLabel bookLabel = new JLabel("预定房间");
		bookLabel.setBounds(142, 10, 142, 41);
		bookLabel.setFont(new Font("宋體", Font.BOLD, 30));
		frame.getContentPane().add(bookLabel);

		JLabel roomLabel = new JLabel("请输入要预定的房间号");
		roomLabel.setBounds(10, 61, 132, 37);
		frame.getContentPane().add(roomLabel);

		roomField = new JTextField();
		roomField.setBounds(152, 69, 132, 21);
		frame.getContentPane().add(roomField);
		roomField.setColumns(10);
		roomField.addActionListener(this);

		JLabel nameLabel = new JLabel("请输入客户名");
		nameLabel.setBounds(10, 86, 132, 37);
		frame.getContentPane().add(nameLabel);

		JLabel sizeLabel = new JLabel("请输入用餐人数");
		sizeLabel.setBounds(10, 113, 132, 37);
		frame.getContentPane().add(sizeLabel);

		JLabel telLabel = new JLabel("请输入客户电话");
		telLabel.setBounds(10, 143, 132, 37);
		frame.getContentPane().add(telLabel);

		roomField_1 = new JTextField();
		roomField_1.setColumns(10);
		roomField_1.setBounds(152, 96, 132, 21);
		frame.getContentPane().add(roomField_1);
		roomField_1.addActionListener(this);

		sizeField = new JTextField();
		sizeField.setColumns(10);
		sizeField.setBounds(152, 121, 132, 21);
		frame.getContentPane().add(sizeField);

		telField = new JTextField();
		telField.setColumns(10);
		telField.setBounds(152, 151, 132, 21);
		frame.getContentPane().add(telField);

		bookButton = new JButton("预定");
		bookButton.setBounds(48, 201, 120, 31);
		frame.getContentPane().add(bookButton);
		bookButton.addActionListener(this);// 添加监视器

		returnButton = new JButton("返回");
		returnButton.setBounds(206, 201, 120, 31);
		frame.getContentPane().add(returnButton);
		returnButton.addActionListener(this);// 添加监视器
	}

	JButton bookButton;
	JButton returnButton;
	jdbcMysql jd = new jdbcMysql();

	public void actionPerformed(ActionEvent e) {
		String room = null;
		String name = null;
		if (!roomField.getText().isEmpty()) {
			room = roomField.getText();
			name = roomField_1.getText();
		}
		if (e.getSource() == bookButton) {
			try {
				Connection conn = (Connection) jd.getConn();
				Statement sm = (Statement) conn.createStatement();
				String sql = "update houseanddesk set flag = 1 , name = '" + name + "' where id = " + room;
				JOptionPane.showMessageDialog(frame, "预定成功","消息",  JOptionPane.DEFAULT_OPTION);
				sm.execute(sql);
				sm.close();
				HouseManagement s = new HouseManagement();
				frame.dispose();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}
		if (e.getSource() == returnButton) {
			HouseManagement s = new HouseManagement();
			frame.dispose();
		}

	}
}
