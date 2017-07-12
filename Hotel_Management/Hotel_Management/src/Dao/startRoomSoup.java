
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
	private JTextField house;
	private JTextField soupd[] = new JTextField[7];
	JMenuBar menuBar;
	JMenu food, soup, driver;

	public startRoomSoup() {
		initialize();
		frame.setVisible(true);
	}

	JCheckBox soupa[] = new JCheckBox[7];

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("闲居阁");
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
		soupa[1] = new JCheckBox("三鲜汤 40");
		soupa[1].setBounds(9, 66, 94, 34);
		frame.getContentPane().add(soupa[1]);

		soupd[1] = new JTextField();
		soupd[1].setBounds(136, 73, 39, 21);
		frame.getContentPane().add(soupd[1]);
		soupd[1].setColumns(10);

		soupa[2] = new JCheckBox("青菜豆腐汤 20");
		soupa[2].setBounds(9, 119, 119, 34);
		frame.getContentPane().add(soupa[2]);

		soupa[3] = new JCheckBox("酸菜粉丝汤 30");
		soupa[3].setBounds(11, 174, 117, 34);
		frame.getContentPane().add(soupa[3]);

		soupd[2] = new JTextField();
		soupd[2].setBounds(136, 126, 39, 21);
		frame.getContentPane().add(soupd[2]);
		soupd[2].setColumns(10);

		soupd[3] = new JTextField();
		soupd[3].setColumns(10);
		soupd[3].setBounds(136, 181, 39, 21);
		frame.getContentPane().add(soupd[3]);

		soupa[4] = new JCheckBox("紫菜蛋花汤 50");
		soupa[4].setBounds(199, 66, 132, 34);
		frame.getContentPane().add(soupa[4]);

		soupa[5] = new JCheckBox("西红柿鸡蛋汤 20");
		soupa[5].setBounds(199, 119, 132, 34);
		frame.getContentPane().add(soupa[5]);

		soupa[6] = new JCheckBox("凤凰玉米羹 60");
		soupa[6].setBounds(199, 174, 132, 34);
		frame.getContentPane().add(soupa[6]);

		soupd[4] = new JTextField();
		soupd[4].setColumns(10);
		soupd[4].setBounds(332, 73, 39, 21);
		frame.getContentPane().add(soupd[4]);

		soupd[5] = new JTextField();
		soupd[5].setColumns(10);
		soupd[5].setBounds(332, 126, 39, 21);
		frame.getContentPane().add(soupd[5]);

		soupd[6] = new JTextField();
		soupd[6].setColumns(10);
		soupd[6].setBounds(332, 181, 39, 21);
		frame.getContentPane().add(soupd[6]);

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
		soupd[1].addActionListener(this);
		soupd[2].addActionListener(this);
		soupd[3].addActionListener(this);
		soupd[4].addActionListener(this);
		soupd[5].addActionListener(this);
		soupd[6].addActionListener(this);

		queRenButton.addActionListener(this);
		
	}

	JButton queRenButton, backButton;
	jdbcMysql jd = new jdbcMysql();

	public void jdbcDao(int id) throws Exception {
		Connection conn = (Connection) jd.getConn();
		Statement statement = (Statement) conn.createStatement();
		int s = id + 8;
		String sql = "select name,price from menu where id = " + s;
		ResultSet rs = statement.executeQuery(sql);
		String name = null;
		int price = 0;
		while (rs.next()) {
			name = rs.getString("name");
			price = rs.getInt("price");
		}
		String sql2 = "insert into menuin(id,name,price,flag,num) values(" + id1 + " , '" + name + " ', " + price + "," + 1
			+	","+ num[id] + ")";
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
			if (deskManage.z == 1) {
				id1 = id1 + 5;
			}
		}
		if (!soupd[1].getText().isEmpty()) {
			str[1] = soupd[1].getText();
			// System.out.println(str[1]);
			num[1] = Integer.parseInt(str[1]);
			// System.out.println(num[1]);
		}
		if (!soupd[2].getText().isEmpty()) {
			str[2] = soupd[2].getText();
			num[2] = Integer.parseInt(str[2]);
		}
		if (!soupd[3].getText().isEmpty()) {
			str[3] = soupd[3].getText();
			num[3] = Integer.parseInt(str[3]);
		}
		if (!soupd[4].getText().isEmpty()) {
			str[4] = soupd[4].getText();
			num[4] = Integer.parseInt(str[4]);
		}
		if (!soupd[5].getText().isEmpty()) {
			str[5] = soupd[5].getText();
			num[5] = Integer.parseInt(str[5]);
		}
		if (!soupd[6].getText().isEmpty()) {
			str[6] = soupd[6].getText();
			num[6] = Integer.parseInt(str[6]);
		}
		if (e.getSource() == queRenButton) {

			if (house.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "房间号不能为空", "错误", JOptionPane.ERROR_MESSAGE);

			} else {
				if (soupa[1].isSelected() == true) {

					try {
						jdbcDao(1);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soupa[2].isSelected() == true) {
					try {
						jdbcDao(2);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soupa[3].isSelected() == true) {
					try {
						// System.out.println(3);
						jdbcDao(3);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soupa[4].isSelected() == true) {
					try {
						jdbcDao(4);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soupa[5].isSelected() == true) {
					try {
						jdbcDao(5);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (soupa[6].isSelected() == true) {
					try {
						jdbcDao(6);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(frame, "点菜成功", "消息", JOptionPane.DEFAULT_OPTION);
				house.setText("");
				for (int i = 1; i < 7; i++) {
					soupa[i].setSelected(false);
					soupd[i].setText("");
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
