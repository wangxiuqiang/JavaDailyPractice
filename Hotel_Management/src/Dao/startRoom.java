package Dao;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class startRoom implements ActionListener, ItemListener, MenuListener {
	int id1;
	int num[] = new int[9];
	private JFrame frame;
	private JTextField food11;
	private JTextField food22;
	private JTextField food33;
	private JTextField food44;
	private JTextField food55;
	private JTextField food66;
	private JTextField food77;
	private JTextField food88;
	JMenu food, soup, driver;
	String[] str = new String[9];
	JMenuBar menuBar;

	JCheckBox food1, food2, food3, food4, food5, food6, food7, food8;

	JButton queRenButton, backButton;

	public startRoom() {
		initialize();
		frame.setVisible(true);
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u8BF7\u9009\u62E9\u60A8\u7684\u4F73\u80B4");
		label.setBounds(141, 26, 157, 34);
		label.setFont(new Font("楷体", Font.BOLD, 18));
		frame.getContentPane().add(label);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 105, 21);
		frame.getContentPane().add(menuBar);

		food = new JMenu("菜品");
		menuBar.add(food);

		soup = new JMenu("汤类");
		menuBar.add(soup);

		driver = new JMenu("酒品");
		menuBar.add(driver);
		food.addActionListener(this);
		soup.addActionListener(this);
		driver.addMenuListener(this);
		food1 = new JCheckBox("1");
		food1.setBounds(24, 66, 94, 34);
		frame.getContentPane().add(food1);

		food11 = new JTextField();
		food11.setBounds(136, 73, 39, 21);
		frame.getContentPane().add(food11);
		food11.setColumns(10);

		food2 = new JCheckBox("2");
		food2.setBounds(24, 102, 94, 34);
		frame.getContentPane().add(food2);

		food3 = new JCheckBox("3");
		food3.setBounds(24, 138, 94, 34);
		frame.getContentPane().add(food3);

		food4 = new JCheckBox("4");
		food4.setBounds(24, 174, 94, 34);
		frame.getContentPane().add(food4);

		food22 = new JTextField();
		food22.setBounds(136, 109, 39, 21);
		frame.getContentPane().add(food22);
		food22.setColumns(10);

		food33 = new JTextField();
		food33.setBounds(136, 145, 39, 21);
		food33.setColumns(10);
		frame.getContentPane().add(food33);

		food44 = new JTextField();
		food44.setBounds(136, 181, 39, 21);
		food44.setColumns(10);
		frame.getContentPane().add(food44);

		food5 = new JCheckBox("5");
		food5.setBounds(237, 66, 94, 34);
		frame.getContentPane().add(food5);

		food6 = new JCheckBox("6");
		food6.setBounds(237, 102, 94, 34);
		frame.getContentPane().add(food6);

		food7 = new JCheckBox("7");
		food7.setBounds(237, 138, 94, 34);
		frame.getContentPane().add(food7);

		food8 = new JCheckBox("8");
		food8.setBounds(237, 174, 94, 34);
		frame.getContentPane().add(food8);

		food55 = new JTextField();
		food55.setBounds(332, 73, 39, 21);
		food55.setColumns(10);
		frame.getContentPane().add(food55);

		food66 = new JTextField();
		food66.setBounds(332, 109, 39, 21);
		food66.setColumns(10);
		frame.getContentPane().add(food66);

		food77 = new JTextField();
		food77.setBounds(332, 145, 39, 21);
		food77.setColumns(10);
		frame.getContentPane().add(food77);

		food88 = new JTextField();
		food88.setBounds(332, 181, 39, 21);
		food88.setColumns(10);
		frame.getContentPane().add(food88);

		queRenButton = new JButton("确认");
		queRenButton.setBounds(125, 243, 71, 23);
		frame.getContentPane().add(queRenButton);

		backButton = new JButton("返回");
		backButton.setBounds(227, 243, 71, 23);
		frame.getContentPane().add(backButton);

		JLabel label_1 = new JLabel("/\u4EFD");
		label_1.setBounds(176, 76, 39, 15);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("/\u4EFD");
		label_2.setBounds(176, 112, 39, 15);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("/\u4EFD");
		label_3.setBounds(176, 148, 39, 15);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("/\u4EFD");
		label_4.setBounds(176, 184, 39, 15);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("/\u4EFD");
		label_5.setBounds(372, 76, 39, 15);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("/\u4EFD");
		label_6.setBounds(372, 112, 39, 15);
		frame.getContentPane().add(label_6);

		JLabel label_7 = new JLabel("/\u4EFD");
		label_7.setBounds(372, 148, 39, 15);
		frame.getContentPane().add(label_7);

		JLabel label_8 = new JLabel("/\u4EFD");
		label_8.setBounds(372, 184, 39, 15);
		frame.getContentPane().add(label_8);

		JLabel label_9 = new JLabel("房间号");
		label_9.setBounds(10, 39, 63, 13);
		frame.getContentPane().add(label_9);

		house = new JTextField();
		house.setBounds(60, 37, 33, 15);
		frame.getContentPane().add(house);
		house.setColumns(10);

		house.addActionListener(this);
		food11.addActionListener(this);
		food22.addActionListener(this);
		food33.addActionListener(this);
		food44.addActionListener(this);
		food55.addActionListener(this);
		food66.addActionListener(this);
		food77.addActionListener(this);
		food88.addActionListener(this);
		food1.addItemListener(this);
		food2.addItemListener(this);
		food3.addItemListener(this);
		food4.addItemListener(this);
		food5.addItemListener(this);
		food6.addItemListener(this);
		food7.addItemListener(this);
		food8.addItemListener(this);

		queRenButton.addActionListener(this);
		backButton.addActionListener(this);
	}

	jdbcMysql jd = new jdbcMysql();
	private JTextField house;
	String string = null;

	public void jdbcDao(int id) throws Exception {

		Connection conn = (Connection) jd.getConn();
		Statement statement = (Statement) conn.createStatement();
		String sql = "select name,price from menu where id = " + id;
		ResultSet rs = statement.executeQuery(sql);
		String name = null;
		int price = 0;
		while (rs.next()) {
			name = rs.getString("name");
			price = rs.getInt("price");
		}
		String sql2 = "insert into menuin(id,name,price,flag,num) values(" + id1 + "," + name + "," + price + "," + 1
				+ "," + num[id] + ")";
		statement.execute(sql2);
		statement.close();
		rs.close();
	}

	public void itemStateChanged(ItemEvent e) {

		if (e.getItem() == food1) {
			if (food1.isSelected() == true) {
				try {
					jdbcDao(1);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		if (e.getItem() == food2) {
			if (food2.isSelected() == true) {
				try {
					jdbcDao(2);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		if (e.getItem() == food3) {
			if (food3.isSelected() == true) {
				try {
					// System.out.println(3);
					jdbcDao(3);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		if (e.getItem() == food4) {
			if (food4.isSelected() == true) {
				try {
					jdbcDao(4);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		if (e.getItem() == food5) {
			if (food5.isSelected() == true) {
				try {
					jdbcDao(5);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		if (e.getItem() == food6) {
			if (food6.isSelected() == true) {
				try {
					jdbcDao(6);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		}
		if (e.getItem() == food7) {
			if (food7.isSelected() == true) {
				try {
					jdbcDao(7);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
		if (e.getItem() == food8) {
			if (food8.isSelected() == true) {
				try {
					jdbcDao(8);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}

	}

	public void actionPerformed(ActionEvent e) {
		// if(e.getActionCommand() == "酒品"){
		// startRoomDriver s = new startRoomDriver();
		// frame.dispose();
		// }
		if (!house.getText().isEmpty()) {
			string = house.getText();
			// System.out.println(string);
			id1 = Integer.parseInt(string);
		}
		if (!food11.getText().isEmpty()) {
			str[1] = food11.getText();
			// System.out.println(str[1]);
			num[1] = Integer.parseInt(str[1]);
			// System.out.println(num[1]);
		}
		if (!food22.getText().isEmpty()) {
			str[2] = food22.getText();
			num[2] = Integer.parseInt(str[2]);
		}
		if (!food33.getText().isEmpty()) {
			str[3] = food33.getText();
			num[3] = Integer.parseInt(str[3]);
		}
		if (!food44.getText().isEmpty()) {
			str[4] = food44.getText();
			num[4] = Integer.parseInt(str[4]);
		}
		if (!food55.getText().isEmpty()) {
			str[5] = food55.getText();
			num[5] = Integer.parseInt(str[5]);
		}
		if (!food66.getText().isEmpty()) {
			str[6] = food66.getText();
			num[6] = Integer.parseInt(str[6]);
		}
		if (!food77.getText().isEmpty()) {
			str[7] = food77.getText();
			num[7] = Integer.parseInt(str[7]);
		}
		if (!food88.getText().isEmpty()) {
			str[8] = food88.getText();
			num[8] = Integer.parseInt(str[8]);
		}

	}

	public void menuSelected(MenuEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == driver) {
			startRoomDriver s = new startRoomDriver();
			frame.dispose();
		}
		if(e.getSource() == soup){
			startRoomSoup s = new startRoomSoup();
			frame.dispose();
		}
	}

	public void menuDeselected(MenuEvent e) {
	}

	
	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub

	}
}
