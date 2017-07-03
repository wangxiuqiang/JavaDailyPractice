
package Dao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

import javax.lang.model.type.UnionType;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class startRoomSoup implements ActionListener, MenuListener {

	String string;
	int id1;
	String str[] = new String[9];
	int num[] = new int[9];
	private JFrame frame;
	private JTextField soup11, house;
	private JTextField soup22;
	private JTextField soup33;
	private JTextField soup44;
	private JTextField soup55;
	private JTextField soup66;
	JMenuBar menuBar;
	JMenu food, soup, driver;

	public startRoomSoup() {
		initialize();
		frame.setVisible(true);
	}

	JCheckBox soup6, soup1, soup2, soup3, soup4, soup5;

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel label = new JLabel("\u8BF7\u9009\u62E9\u60A8\u7684\u4F73\u80B4");
		label.setFont(new Font("楷体", Font.BOLD, 18));
		label.setBounds(141, 26, 157, 34);
		frame.getContentPane().add(label);

		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 105, 21);
		frame.getContentPane().add(menuBar);

		food = new JMenu("菜品");
		menuBar.add(food);

		soup = new JMenu("汤类");
		menuBar.add(soup);
		food.addMenuListener(this);
		driver = new JMenu("酒品");
		menuBar.add(driver);
		driver.addMenuListener(this);
		soup1 = new JCheckBox("三鲜汤 40");
		soup1.setBounds(9, 66, 94, 34);
		frame.getContentPane().add(soup1);

		soup11 = new JTextField();
		soup11.setBounds(136, 73, 39, 21);
		frame.getContentPane().add(soup11);
		soup11.setColumns(10);

		soup2 = new JCheckBox("青菜豆腐汤 20");
		soup2.setBounds(9, 119, 119, 34);
		frame.getContentPane().add(soup2);

		soup3 = new JCheckBox("酸菜粉丝汤 30");
		soup3.setBounds(11, 174, 117, 34);
		frame.getContentPane().add(soup3);

		soup22 = new JTextField();
		soup22.setBounds(136, 126, 39, 21);
		frame.getContentPane().add(soup22);
		soup22.setColumns(10);

		soup33 = new JTextField();
		soup33.setColumns(10);
		soup33.setBounds(136, 181, 39, 21);
		frame.getContentPane().add(soup33);

		soup4 = new JCheckBox("紫菜蛋花汤  50");
		soup4.setBounds(199, 66, 132, 34);
		frame.getContentPane().add(soup4);

		soup5 = new JCheckBox("西红柿鸡蛋汤 20");
		soup5.setBounds(199, 119, 132, 34);
		frame.getContentPane().add(soup5);

		soup6 = new JCheckBox("凤凰玉米羹 60");
		soup6.setBounds(199, 174, 132, 34);
		frame.getContentPane().add(soup6);

		soup44 = new JTextField();
		soup44.setColumns(10);
		soup44.setBounds(332, 73, 39, 21);
		frame.getContentPane().add(soup44);

		soup55 = new JTextField();
		soup55.setColumns(10);
		soup55.setBounds(332, 126, 39, 21);
		frame.getContentPane().add(soup55);

		soup66 = new JTextField();
		soup66.setColumns(10);
		soup66.setBounds(332, 181, 39, 21);
		frame.getContentPane().add(soup66);

		queRenButton = new JButton("确认");
		queRenButton.setBounds(115, 214, 71, 23);
		frame.getContentPane().add(queRenButton);

		backButton = new JButton("返回");
		backButton.setBounds(227, 214, 71, 23);
		frame.getContentPane().add(backButton);
		backButton.addActionListener(this);

		JLabel label_1 = new JLabel("/\u4EFD");
		label_1.setBounds(177, 76, 54, 15);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("/\u4EFD");
		label_2.setBounds(177, 129, 54, 15);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("/\u4EFD");
		label_3.setBounds(177, 184, 54, 15);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("/\u4EFD");
		label_4.setBounds(373, 76, 39, 15);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("/\u4EFD");
		label_5.setBounds(373, 129, 39, 15);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("/\u4EFD");
		label_6.setBounds(373, 184, 39, 15);
		frame.getContentPane().add(label_6);
		JLabel label_9 = new JLabel("房间号");
		label_9.setBounds(10, 39, 63, 13);
		frame.getContentPane().add(label_9);

		house = new JTextField();
		house.setBounds(60, 37, 33, 15);
		frame.getContentPane().add(house);
		house.setColumns(10);

		house.addActionListener(this);
		soup11.addActionListener(this);
		soup22.addActionListener(this);
		soup33.addActionListener(this);
		soup44.addActionListener(this);
		soup55.addActionListener(this);
		soup66.addActionListener(this);
	
		queRenButton.addActionListener(this);
		backButton.addActionListener(this);
	}

	JButton queRenButton, backButton;
	jdbcMysql jd = new jdbcMysql();

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
		String sql2 = "insert into menuIn(id,name,price,flag,num) values(" + id1 + " ," + name + ", " + price + "," + 1
				+ num[id] + ")";
		statement.execute(sql2);
		statement.close();
		rs.close();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == backButton) {
			HouseManagement h = new HouseManagement();
			frame.dispose();
		}
		if (!house.getText().isEmpty()) {
			string = house.getText();
			// System.out.println(string);
			id1 = Integer.parseInt(string);
		}
		if (!soup11.getText().isEmpty()) {
			str[1] = soup11.getText();
			// System.out.println(str[1]);
			num[1] = Integer.parseInt(str[1]);
			// System.out.println(num[1]);
		}
		if (!soup22.getText().isEmpty()) {
			str[2] = soup22.getText();
			num[2] = Integer.parseInt(str[2]);
		}
		if (!soup33.getText().isEmpty()) {
			str[3] = soup33.getText();
			num[3] = Integer.parseInt(str[3]);
		}
		if (!soup44.getText().isEmpty()) {
			str[4] = soup44.getText();
			num[4] = Integer.parseInt(str[4]);
		}
		if (!soup55.getText().isEmpty()) {
			str[5] = soup55.getText();
			num[5] = Integer.parseInt(str[5]);
		}
		if (!soup66.getText().isEmpty()) {
			str[6] = soup66.getText();
			num[6] = Integer.parseInt(str[6]);
		}
		if (e.getSource() == queRenButton) {
			if (soup1.isSelected() == true) {
				try {
					jdbcDao(1);
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				if (soup2.isSelected() == true) {
					try {
						jdbcDao(2);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soup3.isSelected() == true) {
					try {
						// System.out.println(3);
						jdbcDao(3);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soup4.isSelected() == true) {
					try {
						jdbcDao(4);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soup5.isSelected() == true) {
					try {
						jdbcDao(5);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soup6.isSelected() == true) {
					try {
						jdbcDao(6);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		}
	}

	public void menuSelected(MenuEvent e) {
		if (e.getSource() == food) {
			startRoom s = new startRoom();
			frame.dispose();
		}
		if (e.getSource() == driver) {
			startRoomDriver s = new startRoomDriver();
			frame.dispose();
		}
	}

	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	public void menuCanceled(MenuEvent e) {
	}
}
