package Dao;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;
import javax.swing.JTextField;

public class queryMenu extends JFrame implements ActionListener {
	jdbcMysql jd = new jdbcMysql();
	String[][] info = new String[20][2];
	JTable query;
	JScrollPane sp;
	DefaultTableCellRenderer tcr;

	public queryMenu() {
		getContentPane().setLayout(null);

		JLabel head = new JLabel("菜单详情");
		head.setBounds(148, 0, 200, 36);
		head.setFont(new Font("楷体", Font.BOLD, 33));
		getContentPane().add(head);

		button = new JButton("\u8FD4\u56DE");
		button.setBounds(334, 245, 67, 23);
		getContentPane().add(button);

		JLabel label = new JLabel("\u8BF7\u8F93\u5165\u53A8\u5E08\u7F16\u53F7");
		label.setBounds(52, 48, 181, 25);
		getContentPane().add(label);
		label.setFont(new Font("宋体", Font.BOLD, 20));
		chefField = new JTextField();
		chefField.setBounds(211, 48, 52, 23);
		getContentPane().add(chefField);
		chefField.setColumns(10);
		chefField.addActionListener(this);

		ok = new JButton("\u67E5\u8BE2");
		ok.setBounds(275, 48, 84, 23);
		getContentPane().add(ok);
		ok.addActionListener(this);

		button.addActionListener(this);
		setVisible(true);
		setBounds(100, 100, 500, 300);
		setTitle("菜单查询");
	}

	JButton button, ok;
	JTextArea textArea;
	private JTextField chefField;

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			food f = new food();
			this.dispose();
		}
		if (e.getSource() == ok) {
			for (int z = 0; z < 20; z++) {
				for (int g = 0; g < 2; g++) {
					info[z][g] = "";
				}
			}
			String[] title = { "名称", "价格" };
			try {
				Connection conn = (Connection) jd.getConn();
				Statement sm = (Statement) conn.createStatement();
				String sql = "select * from menu where flag = " + chefField.getText();
				ResultSet rs = sm.executeQuery(sql);
				int i = 0;
				while (rs.next()) {
					String name = rs.getString("name");
					int price = rs.getInt("price");
					info[i][0] = name;
					info[i][1] = "" + price;
					i++;
				}
				query = new JTable(info, title);
				query.setEnabled(false);
				tcr = new DefaultTableCellRenderer();
				tcr.setHorizontalAlignment(JLabel.CENTER);
				query.getColumn("价格").setCellRenderer(tcr);
				query.getColumn("名称").setCellRenderer(tcr);
				sp = new JScrollPane();
				sp.setBounds(77, 95, 324, 138);
				query.setBackground(Color.LIGHT_GRAY);
				this.getContentPane().add(sp);
				sp.setViewportView(query);
				rs.close();
				sm.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
	}
}
