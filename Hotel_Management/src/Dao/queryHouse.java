package Dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class queryHouse implements ActionListener {

	private JFrame frame;
	JTextArea textArea;
	JButton button;

	public queryHouse() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("文泉驿微米黑", Font.PLAIN, 17));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("房间信息");
		label.setFont(new Font("文泉驿微米黑", Font.BOLD, 27));
		label.setBounds(176, 28, 162, 33);
		frame.getContentPane().add(label);

		textArea = new JTextArea();
		textArea.setBounds(87, 73, 297, 141);
		textArea.setEditable(false);
		textArea.append("名称\t\t\t状态\n");
		frame.getContentPane().add(textArea);
		try {
			Connection conn = jd.getConn();
			String sql = "select * from houseanddesk";
			Statement statement = (Statement) conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				idString = rs.getString("id");
				flags = rs.getString(2);
				if (flags.equals("1")) {
					textArea.append("  "+idString + "\t\t\t" + "已预订\n");
				}
				if (flags.equals("2")) {
					textArea.append("  "+idString + "\t\t\t" + "已使用\n");
				}
				if (flags.equals("0")) {
					textArea.append("  "+idString + "\t\t\t" + "未使用\n");
				}
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		button = new JButton("返回");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(329, 226, 72, 23);
		frame.getContentPane().add(button);
		button.addActionListener(this);
	}

	String idString, flags;
	jdbcMysql jd = new jdbcMysql();

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			HouseManagement h = new HouseManagement();
			frame.dispose();
		}
	}
}
