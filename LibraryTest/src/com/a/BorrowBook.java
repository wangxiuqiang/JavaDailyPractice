package com.a;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BorrowBook extends JFrame implements ActionListener {
	public JButton borrowBook, back;
	public JTextField field, field1;
	public JLabel label,label1;

	public BorrowBook() {
		init();
		setTitle("借阅图书");
		setVisible(true);
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		setLayout(null);
		label = new JLabel("请输入要借的图书编号");
		label.setFont(new Font("宋体", Font.BOLD, 15));
		label.setBounds(50, 80, 260, 18);
		add(label);
		field = new JTextField();
		field.setBounds(220, 80, 50, 18);
		add(field);
		label1 = new JLabel("请输入要借的天数");
		label1.setFont(new Font("宋体", Font.BOLD, 15));
		label1.setBounds(50, 120, 260, 18);
		add(label1);
		field1 = new JTextField();
		field1.setBounds(220, 120, 50, 18);
		add(field1);
		borrowBook = new JButton("借阅");
		borrowBook.setBounds(160, 160, 60, 25);
		add(borrowBook);
		borrowBook.addActionListener(this);
		back = new JButton("返回");
		back.setBounds(260, 160, 60, 25);
		add(back);
		back.addActionListener(this);
		field.addActionListener(this);
		field1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == back) {
			StudentIn studentIn = new StudentIn();
			this.dispose();
		}
		if (e.getSource() == borrowBook) {
			float money = 0;
			String Bookid = field.getText();
			String days = field1.getText();
			int day = Integer.parseInt(days);
			try {
				Class.forName(jdbcDriver.driver);

				/**
				 * sql 查找出来书籍的库存 日租金 满书状态 其中 booCount-- 日租金用来扣除学生卡里的钱
				 * 修改flag控制是不是可以删除
				 */
				Connection connection = DriverManager.getConnection(jdbcDriver.url, jdbcDriver.user,
						jdbcDriver.password);
				Statement statement = connection.createStatement();
				Statement statement2 = connection.createStatement();
				String sqlSelectBook = "SELECT bookCount,dayMoney,flag FROM book where id=" + Bookid;
				ResultSet rSet = statement.executeQuery(sqlSelectBook);
				int bookCount = -1;
				int flag = 1;
				float dayMoney = 0;
				while (rSet.next()) {
					bookCount = rSet.getInt(1);
					dayMoney = rSet.getFloat(2);
					flag = rSet.getInt(3);
				}

				// System.out.println(flag); //测试使用
				/**
				 * 判断库存是不是有书
				 */
				if (bookCount == 0) {
					JOptionPane.showMessageDialog(this, "没有该书或该书已经被借光", "提示", JOptionPane.DEFAULT_OPTION);
				} else {
					// System.out.println(maining.id);
					/**
					 * 如果有 首先判断钱够不够 不够就冲
					 */
					String sqlStuMoney = "SELECT money FROM student where id=" +StudentInner.userText;
					rSet = statement2.executeQuery(sqlStuMoney);
					while (rSet.next()) {
						money = rSet.getFloat(1);
					}
				    
					if (dayMoney * day > money) {
						JOptionPane.showMessageDialog(this, "余额不足，请充值", "消息", JOptionPane.DEFAULT_OPTION);
					
					}
					// System.out.println(money);
					else {
						// 学生的id也要添加过来然后把他们的bookCount数加1 学生帐号里 的钱扣除
						// 并且学生借的书也放入数据库
						/*
						 * sql2 表示更改书库的存量 修改flag 表示该书 尚有书未还 sqljoin表示 把学生借的书
						 * 按照学生的id 存放在studentborrow表中 sqlqu 表示把书籍的一部分字段 取出 以便放到
						 * student borrow表中 sql1 修改学生的借书的数量
						 */

						String sqlQueryStuId = "SELECT bookCount FROM student where id=" + StudentInner.userText;// 学生的bookCount
						// 也需要修改
						String sqlChangeMoney = "update student set money = " + (money - day * dayMoney);
						String sqlBookCount = "update  book set bookCount=" + (bookCount - 1) + ",flag= " + 3
								+ " where id=" + Bookid;

						ResultSet resultSet = statement.executeQuery(sqlQueryStuId);
						int bookCountStu = 0;
						while (resultSet.next()) {
							bookCountStu = resultSet.getInt(1);
						}
						int a = bookCountStu;
						String sqlstudentBookCount = "update student set bookCount=" + (bookCountStu + 1) + " where id="
								+ StudentInner.userText;
						statement2.execute(sqlBookCount);
						statement2.execute(sqlChangeMoney);
						statement2.execute(sqlstudentBookCount);
						String sqljoin = "insert studentborrow(bookid,id,name,type,publishingHouse,author) values(?,?,?,?,?,?)";
						String sqlqu = "select id,name,type,publishingHouse,author from book where id=" + Bookid;
						int bookid = 0;
						String name = "", type = "", publishingHouse = "", author = "";
						ResultSet rSet2 = statement2.executeQuery(sqlqu);
						while (rSet2.next()) {
							bookid = rSet2.getInt(1);
							name = rSet2.getString(2);
							type = rSet2.getString(3);
							publishingHouse = rSet2.getString(4);
							author = rSet2.getString(5);
						}

						// System.out.println(money);测试使用
						/**
						 * sqlmoney 用来更改学生的金额 借了书要减去租金 = 天数 * 日租金
						 */
						int id = Integer.parseInt(StudentInner.userText);
						PreparedStatement statement3 = connection.prepareStatement(sqljoin);
						statement3.setInt(1, bookid);
						statement3.setInt(2, id);//表示哪个学生借了该书
						statement3.setString(3, name);
						statement3.setString(4, type);
						statement3.setString(5, publishingHouse);
						statement3.setString(6, author);
						statement3.executeUpdate();
						statement2.close();
						statement.close();
						statement3.close();
						rSet.close();
						rSet2.close();
						connection.close();
					}
				}
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}
}
