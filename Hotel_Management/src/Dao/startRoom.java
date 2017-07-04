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

public class startRoom implements ActionListener, MenuListener {
	int id1;
	int num[] = new int[9];
	private JFrame frame;

	JMenu food, soup, driver;
	String[] str = new String[9];
	JMenuBar menuBar;

	JCheckBox fooda[] = new JCheckBox[8];
	JButton queRenButton, backButton;
	JTextField foodd[] = new JTextField[8];

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
		soup.addMenuListener(this);
		driver.addMenuListener(this);

		fooda[0] = new JCheckBox("香辣虾  90");
		fooda[0].setBounds(24, 66, 94, 34);
		frame.getContentPane().add(fooda[0]);

		foodd[0] = new JTextField();
		foodd[0].setBounds(136, 73, 39, 21);
		frame.getContentPane().add(foodd[0]);
		foodd[0].setColumns(10);

		fooda[1] = new JCheckBox("回锅肉  58");
		fooda[1].setBounds(24, 102, 94, 34);
		frame.getContentPane().add(fooda[1]);

		fooda[2] = new JCheckBox("老式肉片  38");
		fooda[2].setBounds(24, 138, 105, 34);
		frame.getContentPane().add(fooda[2]);

		fooda[3] = new JCheckBox("酸菜鱼  68");
		fooda[3].setBounds(24, 174, 104, 34);
		frame.getContentPane().add(fooda[3]);

		foodd[1] = new JTextField();
		foodd[1].setBounds(136, 109, 39, 21);
		frame.getContentPane().add(foodd[1]);
		foodd[1].setColumns(10);

		foodd[2] = new JTextField();
		foodd[2].setBounds(136, 145, 39, 21);
		foodd[2].setColumns(10);
		frame.getContentPane().add(foodd[2]);

		foodd[3] = new JTextField();
		foodd[3].setBounds(136, 181, 39, 21);
		foodd[3].setColumns(10);
		frame.getContentPane().add(foodd[3]);

		fooda[4] = new JCheckBox("红烧茄子  35");
		fooda[4].setBounds(197, 68, 121, 34);
		frame.getContentPane().add(fooda[4]);

		fooda[5] = new JCheckBox("酸辣土豆丝  25");
		fooda[5].setBounds(197, 102, 121, 34);
		frame.getContentPane().add(fooda[5]);

		fooda[6] = new JCheckBox("麻婆豆腐  30");
		fooda[6].setBounds(197, 138, 121, 34);
		frame.getContentPane().add(fooda[6]);

		fooda[7] = new JCheckBox("鱼香肉丝  60");
		fooda[7].setBounds(197, 174, 121, 34);
		frame.getContentPane().add(fooda[7]);

		foodd[4] = new JTextField();
		foodd[4].setBounds(332, 73, 39, 21);
		foodd[4].setColumns(10);
		frame.getContentPane().add(foodd[4]);

		foodd[5] = new JTextField();
		foodd[5].setBounds(332, 109, 39, 21);
		foodd[5].setColumns(10);
		frame.getContentPane().add(foodd[5]);

		foodd[6] = new JTextField();
		foodd[6].setBounds(332, 145, 39, 21);
		foodd[6].setColumns(10);
		frame.getContentPane().add(foodd[6]);

		foodd[7] = new JTextField();
		foodd[7].setBounds(332, 181, 39, 21);
		foodd[7].setColumns(10);
		frame.getContentPane().add(foodd[7]);

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
		foodd[0].addActionListener(this);
		foodd[1].addActionListener(this);
		foodd[2].addActionListener(this);
		foodd[3].addActionListener(this);
		foodd[4].addActionListener(this);
		foodd[5].addActionListener(this);
		foodd[6].addActionListener(this);
		foodd[7].addActionListener(this);

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
		String sql3 = "update houseanddesk set flag = 2, name = null where id =" + id1;
		statement.execute(sql3);
		ResultSet rs = statement.executeQuery(sql);
		String name = null;
		int price = 0;
		while (rs.next()) {
			name = rs.getString("name");
			price = rs.getInt("price");
		}
		// System.out.println(id1);
		// System.out.println(num[id]);
		String sql2 = "insert into menuin(id,name,price,flag,num) values(" + id1 + ",'" + name + "'," + price + "," + 1
				+ "," + num[id] + ")";
		statement.execute(sql2);
		statement.close();
		rs.close();
	}

	public void actionPerformed(ActionEvent e) {

		if (!house.getText().isEmpty()) {
			string = house.getText();
			// System.out.println(string);
			id1 = Integer.parseInt(string);
			if (deskManage.z == 1) {
				id1 = id1 + 5;
			}

		}
	
		if (e.getSource() == backButton) {
			if (deskManage.z == 2) {
				HouseManagement h = new HouseManagement();
				this.frame.dispose();
			}else{
				deskManage h = new deskManage();
				this.frame.dispose();
			}
		}
		if (!foodd[0].getText().isEmpty()) {
			str[1] = foodd[0].getText();
			// System.out.println(str[1]);
			num[1] = Integer.parseInt(str[1]);
			// System.out.println(num[1]);
		}
		if (!foodd[1].getText().isEmpty()) {
			str[2] = foodd[1].getText();
			num[2] = Integer.parseInt(str[2]);
		}
		if (!foodd[2].getText().isEmpty()) {
			str[3] = foodd[2].getText();
			num[3] = Integer.parseInt(str[3]);
		}
		if (!foodd[3].getText().isEmpty()) {
			str[4] = foodd[3].getText();
			num[4] = Integer.parseInt(str[4]);
		}
		if (!foodd[4].getText().isEmpty()) {
			str[5] = foodd[4].getText();
			num[5] = Integer.parseInt(str[5]);
		}
		if (!foodd[5].getText().isEmpty()) {
			str[6] = foodd[5].getText();
			num[6] = Integer.parseInt(str[6]);
		}
		if (!foodd[6].getText().isEmpty()) {
			str[7] = foodd[6].getText();
			num[7] = Integer.parseInt(str[7]);
		}
		if (!foodd[7].getText().isEmpty()) {
			str[8] = foodd[7].getText();
			num[8] = Integer.parseInt(str[8]);
		}

		if (e.getSource() == queRenButton) {
			if (house.getText().isEmpty()) {
				JOptionPane.showMessageDialog(frame, "房间号不能为空", "错误", JOptionPane.ERROR_MESSAGE);

			} else {
				if (fooda[0].isSelected() == true) {
					try {
						jdbcDao(1);
					} catch (Exception e1) {

						e1.printStackTrace();
					}
				}
				if (fooda[1].isSelected() == true) {
					try {
						jdbcDao(2);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (fooda[2].isSelected() == true) {
					try {
						// System.out.println(3);
						jdbcDao(3);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (fooda[3].isSelected() == true) {
					try {
						jdbcDao(4);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (fooda[4].isSelected() == true) {
					try {
						jdbcDao(5);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (fooda[5].isSelected() == true) {
					try {
						jdbcDao(6);
					} catch (Exception e1) {
						e1.printStackTrace();
					}

				}
				if (fooda[6].isSelected() == true) {
					try {
						jdbcDao(7);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				if (fooda[7].isSelected() == true) {
					try {
						jdbcDao(8);
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				JOptionPane.showMessageDialog(frame, "点菜成功", "消息", JOptionPane.DEFAULT_OPTION);
				house.setText("");
				for (int i = 0; i < 8; i++) {
					fooda[i].setSelected(false);
					foodd[i].setText("");
				}
			}
		}
	}

	public void menuSelected(MenuEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == driver) {
			startRoomDriver s = new startRoomDriver();
			frame.dispose();
		}
		if (e.getSource() == soup) {
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
