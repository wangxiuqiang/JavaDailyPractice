
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

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

public class startRoomDriver implements ActionListener, MenuListener {

	int id1;
	int num[] = new int[9];
	JMenuBar menuBar;
	JMenu food, soup, driver;
	private JFrame frame;
	private JTextField driver11, house;
	private JTextField driver22;
	private JTextField driver33;
	private JTextField driver44;
	private JTextField driver55;
	private JTextField driver66;
	JCheckBox driver1, driver2, driver3, driver4, driver5, driver6;
	String string;
	String str[] = new String[9];

	public startRoomDriver() {
		initialize();
		frame.setVisible(true);
	}

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
		food.addMenuListener(this);
		soup = new JMenu("汤类");
		menuBar.add(soup);
		soup.addMenuListener(this);
		driver = new JMenu("酒品");
		menuBar.add(driver);

		driver1 = new JCheckBox("可乐 5");
		driver1.setBounds(24, 66, 94, 34);
		frame.getContentPane().add(driver1);

		driver11 = new JTextField();
		driver11.setBounds(136, 73, 39, 21);
		frame.getContentPane().add(driver11);
		driver11.setColumns(10);

		driver2 = new JCheckBox("苏打水 2");
		driver2.setBounds(24, 119, 94, 34);
		frame.getContentPane().add(driver2);

		driver3 = new JCheckBox("啤酒 8");
		driver3.setBounds(24, 174, 94, 34);
		frame.getContentPane().add(driver3);

		driver22 = new JTextField();
		driver22.setBounds(136, 126, 39, 21);
		frame.getContentPane().add(driver22);
		driver22.setColumns(10);

		driver33 = new JTextField();
		driver33.setColumns(10);
		driver33.setBounds(136, 181, 39, 21);
		frame.getContentPane().add(driver33);

		driver4 = new JCheckBox("雪碧 5");
		driver4.setBounds(237, 66, 94, 34);
		frame.getContentPane().add(driver4);

		driver5 = new JCheckBox("茅台 900");
		driver5.setBounds(237, 119, 94, 34);
		frame.getContentPane().add(driver5);

		driver6 = new JCheckBox("国窖 500");
		driver6.setBounds(237, 174, 94, 34);
		frame.getContentPane().add(driver6);

		driver44 = new JTextField();
		driver44.setColumns(10);
		driver44.setBounds(332, 73, 39, 21);
		frame.getContentPane().add(driver44);

		driver55 = new JTextField();
		driver55.setColumns(10);
		driver55.setBounds(332, 126, 39, 21);
		frame.getContentPane().add(driver55);

		driver66 = new JTextField();
		driver66.setColumns(10);
		driver66.setBounds(332, 181, 39, 21);
		frame.getContentPane().add(driver66);

		queRenButton = new JButton("确认");
		queRenButton.setBounds(115, 214, 71, 23);
		frame.getContentPane().add(queRenButton);

		backButton = new JButton("返回");
		backButton.setBounds(227, 214, 71, 23);
		frame.getContentPane().add(backButton);
		backButton.addActionListener(this);

		JLabel label_1 = new JLabel("/\u74F6");
		label_1.setBounds(177, 76, 54, 15);
		frame.getContentPane().add(label_1);

		JLabel label_2 = new JLabel("/\u74F6");
		label_2.setBounds(177, 129, 54, 15);
		frame.getContentPane().add(label_2);

		JLabel label_3 = new JLabel("/\u74F6");
		label_3.setBounds(177, 184, 54, 15);
		frame.getContentPane().add(label_3);

		JLabel label_4 = new JLabel("/\u74F6");
		label_4.setBounds(370, 76, 54, 15);
		frame.getContentPane().add(label_4);

		JLabel label_5 = new JLabel("/\u74F6");
		label_5.setBounds(370, 129, 54, 15);
		frame.getContentPane().add(label_5);

		JLabel label_6 = new JLabel("/\u74F6");
		label_6.setBounds(370, 184, 54, 15);
		frame.getContentPane().add(label_6);

		JLabel label_9 = new JLabel("房间号");
		label_9.setBounds(10, 39, 63, 13);
		frame.getContentPane().add(label_9);

		house = new JTextField();
		house.setBounds(60, 37, 33, 15);
		frame.getContentPane().add(house);
		house.setColumns(10);
		house.addActionListener(this);
		driver11.addActionListener(this);
		driver22.addActionListener(this);
		driver33.addActionListener(this);
		driver44.addActionListener(this);
		driver55.addActionListener(this);
		driver66.addActionListener(this);

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
				+ "," + num[id] + ")";
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
	
		if (!driver11.getText().isEmpty()) {
			str[1] = driver11.getText();
			// System.out.println(str[1]);
			num[1] = Integer.parseInt(str[1]);
			// System.out.println(num[1]);
		}
		if (!driver22.getText().isEmpty()) {
			str[2] = driver22.getText();
			num[2] = Integer.parseInt(str[2]);
		}
		if (!driver33.getText().isEmpty()) {
			str[3] = driver33.getText();
			num[3] = Integer.parseInt(str[3]);
		}
		if (!driver44.getText().isEmpty()) {
			str[4] = driver44.getText();
			num[4] = Integer.parseInt(str[4]);
		}
		if (!driver55.getText().isEmpty()) {
			str[5] = driver55.getText();
			num[5] = Integer.parseInt(str[5]);
		}
		if (!driver66.getText().isEmpty()) {
			str[6] = driver66.getText();
			num[6] = Integer.parseInt(str[6]);
		}
		if (e.getSource() == queRenButton) {
			if (driver1.isSelected() == true) {
				try {
					jdbcDao(1);
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				if (driver2.isSelected() == true) {
					try {
						jdbcDao(2);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (driver3.isSelected() == true) {
					try {
						// System.out.println(3);
						jdbcDao(3);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (driver4.isSelected() == true) {
					try {
						jdbcDao(4);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (driver5.isSelected() == true) {
					try {
						jdbcDao(5);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (driver6.isSelected() == true) {
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
		if (e.getSource() == soup) {
			startRoomSoup s = new startRoomSoup();
			frame.dispose();
		}
	}

	public void menuDeselected(MenuEvent e) {
		// TODO Auto-generated method stub

	}

	public void menuCanceled(MenuEvent e) {
		// TODO Auto-generated method stub

	}
}
