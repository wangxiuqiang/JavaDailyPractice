package com.a;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class BackBook extends JFrame implements ActionListener {
	Label label, labelHave;
	JTextField idField;
	JTextArea area;
	JButton goBack, back;
	String[][] info = new String[20][5];

	public BackBook() {
		setTitle("归还图书");
		init();
		setBounds(100, 100, 500, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		getContentPane().setLayout(null);
		label = new Label("请输入要归还的图书编号");
		label.setBounds(30, 30, 200, 20);
		label.setFont(new Font("楷体", Font.BOLD, 17));
		getContentPane().add(label);
		idField = new JTextField();
		idField.setBounds(236, 30, 35, 20);
		getContentPane().add(idField);
		labelHave = new Label("尚在借阅的图书");
		labelHave.setBounds(60, 60, 230, 30);
		labelHave.setFont(new Font("楷体", Font.BOLD, 17));
		getContentPane().add(labelHave);

		goBack = new JButton("归还");
		goBack.setBounds(277, 28, 60, 23);
		getContentPane().add(goBack);
		goBack.addActionListener(this);
		back = new JButton("返回");
		back.setBounds(277, 63, 60, 23);
		getContentPane().add(back);
		back.addActionListener(this);
		try {
			Class.forName(jdbcDriver.driver);
			Connection connection = (Connection) DriverManager.getConnection(jdbcDriver.url, jdbcDriver.user,
					jdbcDriver.password);
			Statement statement = (Statement) connection.createStatement();
			String sql = "Select bookid,name,author,publishingHouse,type from studentborrow where id  = "
					+ StudentInner.userText;
			ResultSet rs = statement.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				Book book = new Book();
				book.setId(rs.getInt("bookid"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setPublishingHouse(rs.getString("publishingHouse"));
				book.setType(rs.getString("type"));
				info[i][0] = book.getId() + "";
				info[i][1] = book.getName() + "";
				info[i][2] = book.getAuthor();
				info[i][3] = book.getPublishingHouse();
				info[i][4] = book.getType() + "";
				i++;
			}
			String[] title = { "编号", "名称", "作者", "出版社", "种类" };
			JTable query = new JTable(info, title);
			DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
			tcr.setHorizontalAlignment(JLabel.CENTER);
			query.getColumn("名称").setCellRenderer(tcr);
			query.getColumn("编号").setCellRenderer(tcr);
			query.getColumn("作者").setCellRenderer(tcr);
			query.getColumn("出版社").setCellRenderer(tcr);
			query.getColumn("种类").setCellRenderer(tcr);
			JScrollPane sc = new JScrollPane();
			sc.setBounds(50, 90, 390, 150);
			query.setEnabled(false);
			this.add(sc);
			sc.setViewportView(query);
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == back) {
			StudentIn s = new StudentIn();
			this.dispose();
		}
		if (e.getSource() == goBack) {
			if (!idField.getText().isEmpty()) {
				try {
					Class.forName(jdbcDriver.driver);
					Connection connection = (Connection) DriverManager.getConnection(jdbcDriver.url, jdbcDriver.user,
							jdbcDriver.password);
					Statement statement1 = (Statement) connection.createStatement();
					String sql1 = "delete from studentborrow where bookid =" + idField.getText();
					statement1.execute(sql1);
					statement1.close();
					JOptionPane.showMessageDialog(this, "归还成功", "提示", JOptionPane.DEFAULT_OPTION);

				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(this, "请先输入内容", "提示", JOptionPane.DEFAULT_OPTION);
			}
		}
	}
}
