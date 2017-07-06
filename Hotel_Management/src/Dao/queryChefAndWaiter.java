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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class queryChefAndWaiter extends JFrame implements ActionListener {

	String info[][] = new String[15][3];
	jdbcMysql jd = new jdbcMysql();
	JScrollPane s;
	DefaultTableCellRenderer tcr;
	JTable query;
	JTableHeader header;
	String idString, flags;

	public queryChefAndWaiter() {
		getContentPane().setLayout(null);
		setVisible(true);
		setBounds(100, 100, 500, 300);
		JLabel label = new JLabel("\u67E5\u8BE2\u4F1A\u5458");
		label.setFont(new Font("宋体", Font.BOLD, 20));
		label.setBounds(164, 12, 116, 58);
		getContentPane().add(label);
		try {
			int i = 0;
			Connection conn = jd.getConn();
			String sql;
			sql = "select * from chef";
			Statement statement = (Statement) conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				idString = rs.getString("id");
				flags = rs.getString(2);
				String name = rs.getString("tel");
				info[i][0] = idString;
				info[i][1] = flags;
				info[i][2] = name;
				i++;
			}
			String sqlq;
			info[i][0] = "服务员";
			i++;
			sqlq = "select * from waiter";
			rs = statement.executeQuery(sqlq);
			while (rs.next()) {
				idString = rs.getString("id");
				flags = rs.getString(2);
				String name = rs.getString("tel");
				info[i][0] = idString;
				info[i][1] = flags;
				info[i][2] = name;
				i++;
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		String[] title = { "编号", "姓名", "电话" };
		query = new JTable(info, title);
		query.setEnabled(false);
		tcr = new DefaultTableCellRenderer();
		tcr.setHorizontalAlignment(JLabel.CENTER);
		query.getColumn("编号").setCellRenderer(tcr);
		query.getColumn("姓名").setCellRenderer(tcr);
		s = new JScrollPane();
		query.setBackground(Color.LIGHT_GRAY);
		getContentPane().add(s);
		s.setBounds(89, 82, 300, 150);
		s.setViewportView(query);
		button = new JButton("返回");
		button.setBackground(Color.LIGHT_GRAY);
		button.setBounds(332, 233, 72, 23);
		getContentPane().add(button);
		button.addActionListener(this);

	}

	JButton button;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			staff s = new staff();
			this.dispose();
		}
	}
}
