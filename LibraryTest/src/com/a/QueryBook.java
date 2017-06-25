package com.a;

import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class QueryBook extends JFrame implements ActionListener {

	JButton queryAll;
	JTextArea allBook;
	List<Book> list = new ArrayList<Book>();

	public QueryBook() {
		init();
		setVisible(true);
		setBounds(100, 100, 500, 300);
		setTitle("查询书籍");
	}

	public void init() {
		setLayout(null);

		queryAll = new JButton("查询图书");
		queryAll.setBounds(50, 50, 95, 25);
		add(queryAll);
		allBook = new JTextArea();
		allBook.setBounds(50, 90, 320, 150);
		allBook.setEditable(false);
		add(allBook);

		queryAll.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == queryAll) {
			try {
				Class.forName(jdbcDriver.driver);
				Connection connection = (Connection) DriverManager.getConnection(jdbcDriver.url, jdbcDriver.user,
						jdbcDriver.password);
				Statement statement = (Statement) connection.createStatement();
				String sql = "Select id,name,price,author,bookCount,dayMoney,publishingHouse,type from book";
				ResultSet rs = statement.executeQuery(sql);
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
					list.add(book);
				}
				for (int i = 0; i < list.size(); i++) {
					Book book = list.get(i);
					allBook.append(book.id + " " + book.name + " " + book.type + " " + book.author + " "
							+ book.publishingHouse + " " + book.bookCount + " " + book.price + " " + book.dayMoney+"\n");
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
