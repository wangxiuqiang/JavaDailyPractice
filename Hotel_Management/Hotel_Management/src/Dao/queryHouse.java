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
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class queryHouse implements ActionListener {

	String info[][] = new String[15][3];
	private JFrame frame;
	JTextArea textArea;
	JButton button;
	JTable query;
	JTableHeader header;

	public queryHouse() {
		initialize();
		frame.setVisible(true);
	}

	DefaultTableCellRenderer tcr;

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("闲居阁");
		frame.getContentPane().setFont(new Font("文泉驿微米黑", Font.PLAIN, 17));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("餐厅信息");
		label.setFont(new Font("文泉驿微米黑", Font.BOLD, 27));
		label.setBounds(159, 12, 162, 33);
		frame.getContentPane().add(label);

		if (deskManage.z == 2) {
			String[] title = {"房间号","状态","预订人"};
			query = new JTable(info, title);
			query.setEnabled(false);
			tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(JLabel.CENTER);
			query.getColumn("状态").setCellRenderer(tcr);
			query.getColumn("房间号").setCellRenderer(tcr);
		} else {
			String[] title = {"桌号","状态"};
			query = new JTable(info, title);
			query.setEnabled(false);
			tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(JLabel.CENTER);
			query.getColumn("状态").setCellRenderer(tcr);
			query.getColumn("桌号").setCellRenderer(tcr);
		}
		s = new JScrollPane();
		query.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(s);
//		header = query.getTableHeader();
		s.setBounds(73, 49, 300, 150);
//		frame.getContentPane().add(header);
//		frame.getContentPane().add(query);
		s.setViewportView(query);

		try {
			int i = 0;
			Connection conn = jd.getConn();
			String sql;
			if (deskManage.z == 2) {
				sql = "select * from houseanddesk where tag = 1";
			} else {
				sql = "select * from houseanddesk where tag = 2";
			}
			Statement statement = (Statement) conn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				idString = rs.getString("names");
				flags = rs.getString(2);
				String name = rs.getString("name");
				info[i][0] = idString;
				info[i][2] = name;
				if (flags.equals("1")) {
					info[i][1] = "已预订";
				}
				if (flags.equals("2")) {
					info[i][1] = "使用中";
				}
				if (flags.equals("0")) {
					info[i][1] = "未使用";
				}
				i++;
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
	JScrollPane s;

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == button) {
			HouseManagement h = new HouseManagement();
			frame.dispose();
		}
	}
}
