package com.a;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class DeleteBook extends JFrame implements ActionListener {

	JButton deleteBook,exit;
	JTextField idDecide, idInput;
	int id;

	public DeleteBook() {
		init();
		setTitle("删除书籍");
		setVisible(true);
		setBounds(100, 100, 500, 300);
	}

	public void init() {
		setLayout(null);
		exit = new JButton("退出");
		exit.setBounds(290, 220, 90, 28);
		add(exit);
		exit.addActionListener(this);
		deleteBook = new JButton("确认删除");
		deleteBook.setBounds(290, 100, 90, 28);
		idDecide = new JTextField();
		idDecide.setEditable(false);
		idDecide.setBounds(30,40, 250, 25);
		idDecide.setFont(new Font("楷体", Font.BOLD, 20));
		idDecide.setText("请输入要删除书籍的id:");
		idInput = new JTextField();
		idInput.setBounds(290, 60, 60, 25);
		add(deleteBook);
		add(idDecide);
		add(idInput);
		deleteBook.addActionListener(this);
		idInput.addActionListener(this);
	}
   /**
    * 链接数据库  在标记变量flag ==  1 时 ,即所有的书都在库存 ,并未外借时可删除
    * flag != 1  有书未还 则不能删除提示错误信息
    * @throws Exception
    */
	public void jdbc() throws Exception {
		jdbcDriver jd = new jdbcDriver();
		int flag = 0;
		JTextField result = new JTextField();
		Class.forName(jd.driver);
		Connection Check = DriverManager.getConnection(jd.url, jd.user, jd.password);
		String sql = "delete from book where id=" + id;
		String sq2 = "SELECT flag FROM book WHERE id=" + id;
		Statement statement = Check.createStatement();
		ResultSet rs;
		rs = statement.executeQuery(sq2);
		while (rs.next()) {
			flag = rs.getInt(1);
			// System.out.print(" "+rs.getFloat(4)+" "+rs.getString(5)+"
			// "+rs.getString(6));
			// System.out.println(" "+rs.getInt(7)+" "+rs.getFloat(8)+"
			// "+rs.getInt(9));
		}
		//System.out.println(flag);
		if (flag == 1) {
			statement.execute(sql);
			result.setBounds(290, 150, 120, 28);
			add(result);
			result.setEditable(false);
			result.setText("删除成功");
			statement.close();
			Check.close();
		} else {
			result.setBounds(290, 150, 120, 28);
			add(result);
			result.setEditable(false);
			result.setText("该书籍尚未归还完全,不能删除");
		}
	}

	public void actionPerformed(ActionEvent e) {
		String sid = idInput.getText();
		id = Integer.parseInt(sid);
		if (e.getSource() == deleteBook) {
			//System.out.println(id);
			try {
				jdbc();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if(e.getSource() == exit){
			TestAdminInner tai = new TestAdminInner();
			this.dispose();
		}
	}

}
