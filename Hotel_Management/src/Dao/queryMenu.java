package Dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class queryMenu extends JFrame implements ActionListener {
	jdbcMysql jd = new jdbcMysql();

	public queryMenu() {
		getContentPane().setLayout(null);

		JLabel head = new JLabel("菜单详情");
		head.setBounds(155, 33, 200, 36);
		head.setFont(new Font("楷体", Font.BOLD, 33));
		getContentPane().add(head);

		textArea = new JTextArea();
		textArea.setBounds(82, 90, 314, 129);
		getContentPane().add(textArea);
		textArea.append("名称\t\t\t价格\n");
		try {
			Connection conn = (Connection) jd.getConn();
			Statement sm = (Statement) conn.createStatement();
			String sql = "select * from menu";
			ResultSet rs = sm.executeQuery(sql);
			while (rs.next()) {
				String name = rs.getString("name");
				int price = rs.getInt("price");
				textArea.append(name + "\t\t\t" + price + "\n");
			}
			rs.close();
			sm.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		button = new JButton("\u8FD4\u56DE");
		button.setBounds(334, 245, 67, 23);
		getContentPane().add(button);
		button.addActionListener(this);
		setVisible(true);setBounds(100, 100, 500, 300);
		setTitle("菜单查询");
	}

	JButton button;
	JTextArea textArea;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			food f = new food();
			this.dispose();
		}
	}
}
