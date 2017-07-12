package Dao;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class queryAll implements ActionListener {

	private JFrame frame;

	public queryAll() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u67E5\u8BE2\u623F\u95F4\u7684\u4F7F\u7528\u4FE1\u606F");
		label.setBounds(120, 12, 216, 38);
		frame.getContentPane().add(label);

		button = new JButton("\u8FD4\u56DE");
		button.setBounds(280, 239, 73, 23);
		frame.getContentPane().add(button);
        button.addActionListener(this);
        
		Connection conn;
		try {
			conn = jd.getConn();
			String sql;
			sql = "select * from menuin";
			Statement statement = (Statement) conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				String idString = rs.getString("id");
				String name = rs.getString(2);
				String price = rs.getString("price");
				String num = rs.getString("num");
				info[i][0] = idString;
				info[i][1] = name;
				info[i][2] = price;
				info[i][3] = num;
				i++;
			}
			JTable query = new JTable(info, title);
			query.setEnabled(false);
			JScrollPane s = new JScrollPane();
			query.setBackground(Color.LIGHT_GRAY);
			frame.add(s);
			s.setBounds(43, 55, 296, 168);
			s.setViewportView(query);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}

	JButton button;
	jdbcMysql jd = new jdbcMysql();
	String info[][] = new String[50][4];
	String title[] = { "房间号", "菜名", "价格", "数量" };

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			system s = new system();
			frame.dispose();
		}
	}
}
