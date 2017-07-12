package Dao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.mysql.jdbc.Statement;

import Jdbc.jdbcMysql;

public class foodChange implements ActionListener, ItemListener {

	private JFrame frame;
	private JTextField IDField;
	private JTextField comBoxField;

	public foodChange() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("管理员登录");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel headLabel = new JLabel("修改菜品信息");
		headLabel.setFont(new Font("楷体", Font.BOLD, 35));
		headLabel.setBounds(108, 10, 282, 41);
		frame.getContentPane().add(headLabel);

		JLabel IDLabel = new JLabel("编号");
		IDLabel.setBounds(108, 73, 88, 36);
		frame.getContentPane().add(IDLabel);

		IDField = new JTextField();
		IDField.setBounds(218, 81, 66, 21);
		frame.getContentPane().add(IDField);
		IDField.setColumns(10);

		QueRenButton = new JButton("确认");
		QueRenButton.setBounds(313, 81, 77, 21);
		frame.getContentPane().add(QueRenButton);

		JLabel informationLabel = new JLabel("请选择要修改的内容");
		informationLabel.setBounds(108, 112, 173, 21);
		frame.getContentPane().add(informationLabel);

		String[] str = {"下拉选择", "编号", "菜名", "每份金额" };

		comboBox = new JComboBox(str);
		comboBox.setBounds(105, 143, 95, 21);
		frame.getContentPane().add(comboBox);

		changeButton = new JButton("更改");
		changeButton.setBounds(313, 142, 77, 23);
		frame.getContentPane().add(changeButton);

		comBoxField = new JTextField();
		comBoxField.setBounds(218, 143, 66, 21);
		frame.getContentPane().add(comBoxField);
		comBoxField.setColumns(10);

		returnButton = new JButton("返回");
		returnButton.setBounds(172, 202, 93, 23);
		frame.getContentPane().add(returnButton);
		IDField.addActionListener(this);
		QueRenButton.addActionListener(this);
		changeButton.addActionListener(this);
		comBoxField.addActionListener(this);
		comboBox.addItemListener(this);
		returnButton.addActionListener(this);// 添加监视器
	}

	JButton QueRenButton;
	JButton changeButton;
	JButton returnButton;
	jdbcMysql jd = new jdbcMysql();
	int id;
	JComboBox comboBox;
	String str;

	public String getString1() {
		if (str.equals("编号")) {
			return "id";
		}
		if (str.equals("菜名")) {
			return "name";
		}
		if (str.equals("每份金额")) {
			return "price";
		} else {
			return "";
		}
	}

	public void itemStateChanged(ItemEvent e) {
		str = comboBox.getSelectedItem().toString();

	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == returnButton) {
			food s = new food();
			frame.dispose();
		}
		String ids = null;
		if (!IDField.getText().isEmpty()) {
			ids = IDField.getText();
		}
		String str = comBoxField.getText();
		String combo = null;
		if (e.getSource() == QueRenButton) {
			id = Integer.parseInt(ids);
		}
		if (e.getSource() == changeButton) {

			if (!IDField.getText().isEmpty()) {
				combo = getString1();
				int flag = 1;
				if (combo.equals("id") || combo.equals("price")) {
					flag = 0;
				}
				try {
					Connection conn = jd.getConn();
					Statement st = (Statement) conn.createStatement();
					String sql = null;
					if (flag == 1) {
						sql = "update menu set " + combo + " = '" + str + "' where id = " + id;
					} else {
						sql = "update menu set " + combo + " = " + str + " where id = " + id;
					}
					st.execute(sql);
					st.close();
					JOptionPane.showMessageDialog(frame, "更改成功", "消息", JOptionPane.DEFAULT_OPTION);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(frame, "编号不能为空", "消息", JOptionPane.DEFAULT_OPTION);
				food food = new food();
				frame.dispose();
			}
		}
	}
}
