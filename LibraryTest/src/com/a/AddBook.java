package com.a;

import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.omg.CORBA.PUBLIC_MEMBER;
/**
 * 已经成功写入数据
 * @author wxq
 *
 */
public class AddBook extends JFrame implements ActionListener {
	JButton addFinally;
	Label label;
	JTextField id, name, type, publishing, dayMoney, Money, Number, author;
	jdbcDriver jd = new jdbcDriver();
	public int ida;
	public String namea;
	public String typea;
	public float price;
	public String publishingHouse;
	public String authora;
	public int bookCount;
	public float dayMoneya;
	public int flag = 1;

	public AddBook() {
		init();
		setTitle("添加图书");
		setVisible(true);
		setBounds(100, 100, 500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		setLayout(null);
		label = new Label("又有新书了吗,快快添加让我的小伙伴们看一看吧");
		label.setBounds(0, 30, 500, 21);
		label.setFont(new Font("楷体", Font.BOLD, 20));
		add(label);

		Label labelname, labelNumber, labelpublishing, labeltype, labelMoney, labelauthor, labelDayMoney;
		labelname = new Label("请输入名称");
		labelname.setBounds(50, 70, 80, 16);
		labeltype = new Label("请输入种类");
		labeltype.setBounds(50, 100, 80, 16);
		labelMoney = new Label("请输入价格");
		labelMoney.setBounds(50, 130, 80, 16);
		labeltype.setFont(new Font("楷体", Font.BOLD, 15));
		labelMoney.setFont(new Font("楷体", Font.BOLD, 15));
		labelname.setFont(new Font("楷体", Font.BOLD, 15));

		labelpublishing = new Label("请输入出版社");
		labelpublishing.setBounds(50, 160, 80, 16);
		labelpublishing.setFont(new Font("楷体", Font.BOLD, 15));

		labelauthor = new Label("请输入作者");
		labelauthor.setBounds(50, 190, 80, 16);
		labelauthor.setFont(new Font("宋体", Font.BOLD, 15));
		labelDayMoney = new Label("请输入日租金");
		labelDayMoney.setBounds(50, 220, 80, 16);
		labelDayMoney.setFont(new Font("楷体", Font.BOLD, 15));
		labelNumber = new Label("请输入数量");
		labelNumber.setBounds(50, 250, 80, 16);
		labelNumber.setFont(new Font("宋体", Font.BOLD, 15));

		add(labelname);
		add(labelMoney);
		add(labeltype);
		add(labelNumber);
		add(labelpublishing);
		add(labelDayMoney);
		add(labelauthor);
		addFinally = new JButton("添加");
		addFinally.setBounds(330, 150, 100, 28);
		add(addFinally);
		addFinally.addActionListener(this);
		/*
		 * 添加textfile
		 */
		id = new JTextField();
		id.setBounds(140, 40,80, 18);
		add(id);
		id.addActionListener(this);
		name = new JTextField();
		name.setBounds(140, 70, 80, 18);
		add(name);
		name.addActionListener(this);
		type = new JTextField();
		type.setBounds(140, 100, 80, 18);
		add(type);
		type.addActionListener(this);
		Money = new JTextField();
		Money.setBounds(140, 130, 80, 18);
		add(Money);
		Money.addActionListener(this);
		publishing = new JTextField();
		publishing.setBounds(140, 160, 80, 18);
		add(publishing);
		publishing.addActionListener(this);
		author = new JTextField();
		author.setBounds(140, 190, 80, 18);
		add(author);
		author.addActionListener(this);
		dayMoney = new JTextField();
		dayMoney.setBounds(140, 220, 80, 18);
		add(dayMoney);
		dayMoney.addActionListener(this);
		Number = new JTextField();
		Number.setBounds(140, 250, 80, 18);
		add(Number);
		Number.addActionListener(this);
	}

	public void BookIn() throws Exception {
		Class.forName(jd.driver);
		Connection BookTable = DriverManager.getConnection(jd.url, jd.user, jd.password);
		String sql1 = "insert book(id,name,type,price,publishingHouse,author,bookCount,dayMoney,flag,agoCount) values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps1 = BookTable.prepareStatement(sql1);
		ps1.setInt(1, ida);
		ps1.setString(2, namea);
		ps1.setString(3, typea);
		ps1.setFloat(4, price);
		ps1.setString(5, publishingHouse);
		ps1.setString(6, authora);
		ps1.setInt(7, bookCount);
		ps1.setFloat(8, dayMoneya);
		ps1.setInt(9, flag);
		ps1.setInt(10, bookCount);
		ps1.executeUpdate();
		ps1.close();
		BookTable.close();
	}

	public void actionPerformed(ActionEvent e) {
		String sida = id.getText();
		ida = Integer.parseInt(sida);
		namea = name.getText();
		typea = type.getText();
		String pricea = Money.getText();
		price = Float.parseFloat(pricea);
		publishingHouse = publishing.getText();
		authora = author.getText();
		String sbookCount = Number.getText();
		bookCount = Integer.parseInt(sbookCount);
		String sdayMoney = dayMoney.getText();
		dayMoneya = Float.parseFloat(sdayMoney);
		if (e.getSource() == addFinally) {
			// String string=name.getText();
			// 用get方法把Text框中的内容读出在写入数据库
			try {
				BookIn();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			TestAdminInner tai = new TestAdminInner();

			// 添加输入后就把所有的数据写入 输出成功对话框
			this.dispose();
		}
	}
}
