package com.a;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableCellRenderer;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class QueryBook extends JFrame implements ActionListener {

	JButton queryAll, back;
	JTextArea allBook;
	JTable query;
	DefaultTableCellRenderer tcr;
	String info[][] = new String[10][8];

	public QueryBook() {
		init();
		setVisible(true);
		setBounds(100, 100, 500, 300);
		setTitle("查询书籍");
	}

	public void init() {
		getContentPane().setLayout(null);
		back = new JButton("返回");
		back.setBounds(292, 244, 80, 25);
		add(back);
		back.addActionListener(this);
		queryAll = new JButton("查询图书");
		queryAll.setBounds(50, 50, 95, 25);
		add(queryAll);
		queryAll.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == back) {
			if (TestAdminIn.userText == null) {
				StudentIn s = new StudentIn();
				this.dispose();
			} else {
				TestAdminInner t = new TestAdminInner();
				this.dispose();
			}
		}
		if (e.getSource() == queryAll) {
			try {
				Class.forName(jdbcDriver.driver);
				Connection connection = (Connection) DriverManager.getConnection(jdbcDriver.url, jdbcDriver.user,
						jdbcDriver.password);
				Statement statement = (Statement) connection.createStatement();
				String sql = "Select id,name,price,author,bookCount,dayMoney,publishingHouse,type from book";
				ResultSet rs = statement.executeQuery(sql);
				int i = 0;
				while (rs.next()) {
					Book book = new Book();
					book.setId(rs.getInt("id"));
					book.setName(rs.getString("name"));
					book.setPrice(rs.getFloat("price"));
					book.setAuthor(rs.getString("author"));
					book.setBookCount(rs.getInt("bookCount"));
					book.setDayMoney(rs.getFloat("dayMoney"));
					book.setPublishingHouse(rs.getString("publishingHouse"));
					book.setType(rs.getString("type"));
					info[i][0] = book.getId() + "";
					info[i][1] = book.getName() + "";
					info[i][2] = book.getPrice() + "";
					info[i][3] = book.getAuthor();
					info[i][4] = book.getBookCount() + "";
					info[i][5] = book.getDayMoney() + "";
					info[i][6] = book.getPublishingHouse();
					info[i][7] = book.getType() + "";
				}
				String[] title = { "编号", "名称", "价格", "作者", "数量", "日租金", "出版社", "种类" };
				query = new JTable(info, title);
				tcr = new DefaultTableCellRenderer();
				tcr.setHorizontalAlignment(JLabel.CENTER);
				query.getColumn("名称").setCellRenderer(tcr);
				query.getColumn("编号").setCellRenderer(tcr);
				 query.getColumn("价格").setCellRenderer(tcr);
				 query.getColumn("作者").setCellRenderer(tcr);
				 query.getColumn("数量").setCellRenderer(tcr);
				 query.getColumn("日租金").setCellRenderer(tcr);
				 query.getColumn("出版社").setCellRenderer(tcr);
				 query.getColumn("种类").setCellRenderer(tcr);
				JScrollPane sc = new JScrollPane();
				sc.setBounds(50, 90, 390, 150);
				query.setEnabled(false);
				this.add(sc);
				sc.setViewportView(query);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
