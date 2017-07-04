
package Dao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
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
	private JTextField house;
	private JTextField driverd[] = new JTextField[7];

	JCheckBox drivera[] = new JCheckBox[7];
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
		soup = new JMenu("汤品");
		menuBar.add(soup);
		soup.addMenuListener(this);
		driver = new JMenu("酒品");
		menuBar.add(driver);

		drivera[1] = new JCheckBox("可乐 5");
		drivera[1].setBounds(24, 66, 94, 34);
		frame.getContentPane().add(drivera[1]);

		driverd[1] = new JTextField();
		driverd[1].setBounds(136, 73, 39, 21);
		frame.getContentPane().add(driverd[1]);
		driverd[1].setColumns(10);

		drivera[2] = new JCheckBox("苏打水 2");
		drivera[2].setBounds(24, 119, 94, 34);
		frame.getContentPane().add(drivera[2]);

		drivera[3] = new JCheckBox("啤酒 8");
		drivera[3].setBounds(24, 174, 94, 34);
		frame.getContentPane().add(drivera[3]);

		driverd[2] = new JTextField();
		driverd[2].setBounds(136, 126, 39, 21);
		frame.getContentPane().add(driverd[2]);
		driverd[2].setColumns(10);

		driverd[3] = new JTextField();
		driverd[3].setColumns(10);
		driverd[3].setBounds(136, 181, 39, 21);
		frame.getContentPane().add(driverd[3]);

		drivera[4] = new JCheckBox("雪碧 5");
		drivera[4].setBounds(237, 66, 94, 34);
		frame.getContentPane().add(drivera[4]);

		drivera[5] = new JCheckBox("茅台 900");
		drivera[5].setBounds(237, 119, 94, 34);
		frame.getContentPane().add(drivera[5]);

		drivera[6] = new JCheckBox("国窖 500");
		drivera[6].setBounds(237, 174, 94, 34);
		frame.getContentPane().add(drivera[6]);

		driverd[4] = new JTextField();
		driverd[4].setColumns(10);
		driverd[4].setBounds(332, 73, 39, 21);
		frame.getContentPane().add(driverd[4]);

		driverd[5] = new JTextField();
		driverd[5].setColumns(10);
		driverd[5].setBounds(332, 126, 39, 21);
		frame.getContentPane().add(driverd[5]);

		driverd[6] = new JTextField();
		driverd[6].setColumns(10);
		driverd[6].setBounds(332, 181, 39, 21);
		frame.getContentPane().add(driverd[6]);

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
		driverd[1].addActionListener(this);
		driverd[2].addActionListener(this);
		driverd[3].addActionListener(this);
		driverd[4].addActionListener(this);
		driverd[5].addActionListener(this);
		driverd[6].addActionListener(this);

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

		if (!driverd[1].getText().isEmpty()) {
			str[1] = driverd[1].getText();
			// System.out.println(str[1]);
			num[1] = Integer.parseInt(str[1]);
			// System.out.println(num[1]);
		}
		if (!driverd[2].getText().isEmpty()) {
			str[2] = driverd[2].getText();
			num[2] = Integer.parseInt(str[2]);
		}
		if (!driverd[3].getText().isEmpty()) {
			str[3] = driverd[3].getText();
			num[3] = Integer.parseInt(str[3]);
		}
		if (!driverd[4].getText().isEmpty()) {
			str[4] = driverd[4].getText();
			num[4] = Integer.parseInt(str[4]);
		}
		if (!driverd[5].getText().isEmpty()) {
			str[5] = driverd[5].getText();
			num[5] = Integer.parseInt(str[5]);
		}
		if (!driverd[6].getText().isEmpty()) {
			str[6] = driverd[6].getText();
			num[6] = Integer.parseInt(str[6]);
		}
		if (e.getSource() == queRenButton) {
			if (house.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "房间号不能为空", "错误", JOptionPane.ERROR_MESSAGE);

			} else {

				if (drivera[1].isSelected() == true) {
					try {
						jdbcDao(1);
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				}
				if (drivera[2].isSelected() == true) {
					try {
						jdbcDao(2);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (drivera[3].isSelected() == true) {
					try {
						// System.out.println(3);
						jdbcDao(3);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (drivera[4].isSelected() == true) {
					try {
						jdbcDao(4);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (drivera[5].isSelected() == true) {
					try {
						jdbcDao(5);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (drivera[6].isSelected() == true) {
					try {
						jdbcDao(6);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(frame, "点菜成功", "消息", JOptionPane.DEFAULT_OPTION);
				house.setText("");
				for (int i = 1; i < 7; i++) {
					drivera[i].setSelected(false);
					driverd[i].setText("");
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
