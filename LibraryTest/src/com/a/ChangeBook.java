package com.a;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Set;
import java.util.jar.Attributes.Name;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class ChangeBook implements ActionListener, ItemListener {
	public JFrame changeBook;
	public JTextField QueRen, input, change;
	JButton changeOk, changeFirst , back;
	public String str;
	/*
	 * float1 string int1 表示修改的内容的全局变量，通过判断后给其赋值，然后把 这三个值写入ＳＱＬ语句
	 */
	Float float1;
	String string;
	int int1;
	public JComboBox<String> comboBox;
	int id;

	public ChangeBook() {
		changeBook = new JFrame("修改图书");
		init();
		ComboBox();
		changeBook.setVisible(true);
		changeBook.setBounds(100, 100, 500, 300);
	}

	public void init() {
		changeBook.setLayout(null);
		changeFirst = new JButton("确认");
		changeFirst.setBounds(320, 50, 60, 30);

		QueRen = new JTextField();
		QueRen.setEditable(false);
		QueRen.setText("请输入需要修改的书籍id");
		QueRen.setBounds(60, 50, 160, 35);
		QueRen.setFont(new Font("宋体", Font.BOLD, 13));

		input = new JTextField();
		input.setBounds(230, 55, 60, 25);

		changeOk = new JButton("修改");
		changeOk.setBounds(350, 130, 60, 20);
		back = new JButton("返回");
		back.setBounds(350, 190, 60, 30);
		changeBook.add(changeFirst);
		changeBook.add(back);
		changeBook.add(QueRen);
		changeBook.add(changeOk);
		changeBook.add(input);

		input.addActionListener(this);
		changeOk.addActionListener(this);
		changeFirst.addActionListener(this);
		back.addActionListener(this);
        
	}

	public void ComboBox() {
		comboBox = new JComboBox<String>();
		comboBox.addItem("请选择要修改的内容");
		comboBox.addItem("名称");
		comboBox.addItem("种类");
		comboBox.addItem("价格");
		comboBox.addItem("出版社");
		comboBox.addItem("作者");
		comboBox.addItem("数量");
		comboBox.addItem("日租金");
		comboBox.setBounds(90, 130, 150, 30);
		comboBox.addItemListener(this);
		changeBook.add(comboBox);

		change = new JTextField();
		change.setBounds(256, 130, 80, 30);
		changeBook.add(change);
		change.addActionListener(this);
	}

	public String decideNumber() {
		if (str.equals("名称")) {
			return "name";
		}
		if (str.equals("种类")) {
			return "type";
		}
		if (str.equals("出版社")) {
			return "publishingHouse";
		}
		if (str.equals("价格")) {
			return "price";
		}
		if (str.equals("作者")) {
			return "author";
		}
		if (str.equals("数量")) {
			return "bookCount";
		}
		if (str.equals("日租金")) {
			return "dayMoney";
		} else {
			return "";
		}

	}

	public int changFlag(String bookName) {

		if (bookName.equals("price") || bookName.equals("dayMoney")) {
			return 1;
		} else if (bookName.equals("bookCount")) {
			return 2;
		} else {
			return 0;
		}
	}

	public void itemStateChanged(ItemEvent e) {
		str = comboBox.getSelectedItem().toString();
	}

	public String jdbcForQueren() throws Exception {
		Class.forName(jdbcDriver.driver);
		Connection Check = DriverManager.getConnection(jdbcDriver.url, jdbcDriver.user, jdbcDriver.password);
		String sq1 = "select name from book where id=" + id;
		String bookName = "";
		Statement statement = Check.createStatement();
		ResultSet rs;
		rs = statement.executeQuery(sq1);
		while (rs.next()) {
			bookName = rs.getString(1);
		}
		return bookName;
	}

	public void jdbcForChangBook(String sql2) throws Exception {
		Class.forName(jdbcDriver.driver);
		Connection Check = DriverManager.getConnection(jdbcDriver.url, jdbcDriver.user, jdbcDriver.password);
		Statement statement = Check.createStatement();
		statement.execute(sql2);
	}

	public void actionPerformed(ActionEvent e) {
		String bookName = "";
		String changeValue = "";
		String ids = input.getText();
		id = Integer.parseInt(ids);
		changeValue = change.getText();
		
		
		if(e.getSource() == back){
			TestAdminInner tai = new TestAdminInner();
			changeBook.dispose();
		}
		if (e.getSource() == changeFirst) {

			try {
				bookName = jdbcForQueren();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			
			JTextField bookWantChange = new JTextField();
			bookWantChange.setBounds(150, 90, 60, 30);
			bookWantChange.setEditable(false);
			bookWantChange.setText(bookName);
			changeBook.add(bookWantChange);
		}

		if (e.getSource() == changeOk) {
			String string = decideNumber();
			// System.out.println(string);
			if (changFlag(string) == 1) {
				float1 = Float.parseFloat(changeValue);
				String sql2 = "update book set " + string + " = " + float1 + " where id=" + id;
				try {
					jdbcForChangBook(sql2);
					JTextField bookWantChange = new JTextField();
					bookWantChange.setBounds(150, 150, 60, 30);
					bookWantChange.setEditable(false);
					bookWantChange.setText("修改成功");
					changeBook.add(bookWantChange);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (changFlag(string) == 2) {
				int1 = Integer.parseInt(changeValue);
				String sql2 = "update book set " + string + " = " + int1 + " where id=" + id;
				try {
					jdbcForChangBook(sql2);
					JTextField bookWantChange = new JTextField();
					bookWantChange.setBounds(150, 150, 60, 30);
					bookWantChange.setEditable(false);
					bookWantChange.setText("修改成功");
					changeBook.add(bookWantChange);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (changFlag(string) == 0) {

				String sql2 = "update book set " + string + " = " + "'" + changeValue + "'" + " where id=" + id;
				try {
					jdbcForChangBook(sql2);
					JTextField bookWantChange = new JTextField();
					bookWantChange.setBounds(150, 170, 60, 30);
					bookWantChange.setEditable(false);
					bookWantChange.setText("修改成功");
					changeBook.add(bookWantChange);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			// String string = decideNumber();
			// System.out.println(string);
		}
	}

}
